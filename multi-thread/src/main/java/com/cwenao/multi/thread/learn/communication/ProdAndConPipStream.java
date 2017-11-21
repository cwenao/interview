/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.communication;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author cwenao
 * @version $Id ProdAndConPipStream.java, v 0.1 2017-11-21 17:01 cwenao Exp $$
 */
public class ProdAndConPipStream {

    public class WriteData {
        public void writeMethod(PipedOutputStream outputStream) {
            try {
                System.out.println("This is the write: ");
                int i = 0;
                while (i < 100) {
                    i = i + 1;
                    outputStream.write(("this is the write data: " + i).getBytes());
                }
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class ReadData {
        public void readMethod(PipedInputStream inputStream) {
            try {
                System.out.println("this is the read: ");
                byte[] buffer = new byte[20];
                int len = 0;
                while ((len = inputStream.read(buffer)) != -1) {
                    String data = new String(buffer, 0, len);
                    System.out.println("To read the buffer: "+ data);
                }
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class WriteThread extends Thread {
        private WriteData writeData;
        private PipedOutputStream pipedOutputStream;

        public WriteThread(WriteData writeData, PipedOutputStream pipedOutputStream) {
            this.writeData = writeData;
            this.pipedOutputStream = pipedOutputStream;
        }

        @Override
        public void run() {
            writeData.writeMethod(pipedOutputStream);
        }
    }

    public class ReadThread extends Thread {
        private ReadData readData;
        private PipedInputStream pipedInputStream;

        public ReadThread(ReadData readData, PipedInputStream pipedInputStream) {
            this.readData = readData;
            this.pipedInputStream = pipedInputStream;
        }

        @Override
        public void run() {
            readData.readMethod(pipedInputStream);
        }
    }

    public static void main(String[] args) {
        try {
            ProdAndConPipStream prodAndConPipStream = new ProdAndConPipStream();
            WriteData writeData = prodAndConPipStream.new WriteData();
            ReadData readData = prodAndConPipStream.new ReadData();

            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream();

            pipedOutputStream.connect(pipedInputStream);

            WriteThread writeThread = prodAndConPipStream.new WriteThread(writeData, pipedOutputStream);
            ReadThread readThread = prodAndConPipStream.new ReadThread(readData, pipedInputStream);

            readThread.start();
            Thread.sleep(1000);
            System.out.println("to write.....");
            writeThread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
