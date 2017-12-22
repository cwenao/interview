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
 * @version $Id ScatterAndGather.java, v 0.1 2017-12-14 17:01 cwenao Exp $$
 */
public class ScatterAndGather {

    /**
     * 使用sactter 从一个Channel往多个 ByteBuffer里面写数据
     * Gather 从多个ByteBuffer里取数据往一个Channel写
     * @param path
     */
    public static void scatterAndGather(String path) {

        try {
            RandomAccessFile accessFile = new RandomAccessFile(path, "rw");
            ByteBuffer header = ByteBuffer.allocate(64);
            ByteBuffer body = ByteBuffer.allocate(256);

            ByteBuffer[] message = {header, body};

            FileChannel fileChannel = accessFile.getChannel();

            while (fileChannel.read(message) !=-1) {
                header.flip();
                while (header.hasRemaining()) {
                    System.out.println(" this is the header message: " + (char) header.get());
                }
                body.flip();
                while (body.hasRemaining()) {
                    System.out.println(" this is the body message: " + (char) body.get());
                }
                header.clear();
                body.clear();
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
        scatterAndGather(path);
    }

}
