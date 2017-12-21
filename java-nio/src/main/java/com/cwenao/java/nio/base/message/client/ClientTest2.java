/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.message.client;

import java.io.IOException;

/**
 * @author cwenao
 * @version $Id ClientTest1.java, v 0.1 2017-12-21 10:29 cwenao Exp $$
 */
public class ClientTest2 {
    public static void main(String[] args) {
        Client client1 = new Client("nini", "cwenao");
        try {
            client1.start("localhost",9595);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
