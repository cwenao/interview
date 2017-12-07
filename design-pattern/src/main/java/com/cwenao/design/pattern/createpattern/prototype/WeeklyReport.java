/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.prototype;

import java.io.*;

/**
 * @author cwenao
 * @version $Id WeeklyReport.java, v 0.1 2017-12-07 08:58 cwenao Exp $$
 */
public class WeeklyReport implements Serializable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    /**
     * 使用深clone：实现序列化将reference对象写入新的Object
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public WeeklyReport deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        return (WeeklyReport) objectInputStream.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
