/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author cwenao
 * @version $Id FileChannelTest.java, v 0.1 2017-12-14 15:31 cwenao Exp $$
 */
public class FileChannelTest {

    /**
     * 从FileChannel 读取数据到 ByteBuffer
     * @param path
     */
    public static void fileChannel(String path) {
        try {
            RandomAccessFile accessFile = new RandomAccessFile(path, "rw");
            FileChannel fileChannel = accessFile.getChannel();

            //Defined the ByteBuffer capacity
            ByteBuffer byteBuffer = ByteBuffer.allocate(48);

            int bytesRead = fileChannel.read(byteBuffer);
            while (bytesRead != -1) {
                System.out.println("Read the data to byte buffer: " + bytesRead);
                byteBuffer.flip();

                while (byteBuffer.hasRemaining()) {
                    System.out.println(" the remaining data: " + (char)byteBuffer.get());
                }
                byteBuffer.clear();
                bytesRead = fileChannel.read(byteBuffer);
                System.out.println(" the last bytesRead: " + fileChannel.read(byteBuffer));
            }
            accessFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        String path = "/Users/cwenao/hexo_github_id_rsa";
        fileChannel(path);
    }



}
