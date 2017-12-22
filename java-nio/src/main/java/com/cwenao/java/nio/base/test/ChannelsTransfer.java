/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

/**
 * @author cwenao
 * @version $Id ChannelsTransfer.java, v 0.1 2017-12-14 17:27 cwenao Exp $$
 */
public class ChannelsTransfer {

    /**
     * 从当前Channel直接传输到另外一个Channel
     * @param fromPath
     * @param toPath
     */
    public static void transferToAnother(String fromPath, String toPath) {
        try {
            RandomAccessFile accessFile = new RandomAccessFile(fromPath, "rw");
            FileChannel fileChannelFrom = accessFile.getChannel();
            RandomAccessFile toAccessFile = new RandomAccessFile(toPath, "rw");
            FileChannel fileChannelTo = toAccessFile.getChannel();

            long position = 0;
            long limit = fileChannelFrom.size();
            // transferTo、transferFrom
            fileChannelFrom.transferTo(0, limit, fileChannelTo);

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            while (fileChannelTo.read(byteBuffer) != -1) {
                byteBuffer.flip();
                fileChannelTo.write(byteBuffer);
                byteBuffer.clear();
            }
            accessFile.close();
            toAccessFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fromPath = "/Users/cwenao/hexo_github_id_rsa";
        String toPath = "/Users/cwenao/hexo_github_id_rsa_to";
        transferToAnother(fromPath,toPath);
    }

}
