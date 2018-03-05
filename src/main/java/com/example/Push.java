/**
 * Copyright(c) 2004-2018 by qyer.com All rights reserved.
 */
package com.example;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.xiaomi.xmpush.server.Constants;
import com.xiaomi.xmpush.server.Message;
import com.xiaomi.xmpush.server.Result;
import com.xiaomi.xmpush.server.Sender;

/**
 * @author Tony
 * @date 2018-03-05
 * @version 1.0
 */
public class Push {

    private static final Sender SENDER = new Sender(
        com.example.Constants.APP_SECRET);

    public static Result push4Android(String title, String desc,
        String messagePayload) throws IOException, ParseException {
        // Constants.useSandbox();
        Constants.useOfficial();
        Message message = new Message.Builder().title(title).description(desc)
            .payload(messagePayload)
            .restrictedPackageName(com.example.Constants.PACKAGE_NAME).build();
        return SENDER.sendToUserAccount(message,
            com.example.Constants.USER_ACCOUNT, 3);
    }

    public static Result push4AndroidByTime(String title, String desc,
        String messagePayload, long time) throws IOException, ParseException {
        // Constants.useSandbox();
        Constants.useOfficial();
        Message message = new Message.Builder().title(title).description(desc)
            .payload(messagePayload)
            .restrictedPackageName(com.example.Constants.PACKAGE_NAME)
            .timeToSend(time).build();
        return SENDER.sendToUserAccount(message,
            com.example.Constants.USER_ACCOUNT, 3);
    }

}
