/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.commandpattern;

import java.io.*;
import java.util.List;

/**
 * @author cwenao
 * @version $Id FileUtil.java, v 0.1 2017-12-14 06:20 cwenao Exp $$
 */
public class FileUtil {
    public static void writeCommand(List<CommandPattern> commandPatternList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("config.log");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(fileOutputStream));
            objectOutputStream.writeObject(commandPatternList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<CommandPattern> readerCommand() {
        try {
            FileInputStream fileInputStream = new FileInputStream("config.log");
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream));
            List<CommandPattern> commandPatterns = (List<CommandPattern>) objectInputStream.readObject();

            objectInputStream.close();

            return commandPatterns;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
