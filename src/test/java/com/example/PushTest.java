/**
 * Copyright(c) 2004-2018 by qyer.com All rights reserved.
 */
package com.example;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.xiaomi.xmpush.server.Result;

/**
 * @author Tony
 * @date 2018-03-05
 * @version 1.0
 */
public class PushTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for
     * {@link com.example.Push#push4Android(java.lang.String, java.lang.String, java.lang.String)}.
     */
    @Test
    public void testPush4Android() {
        Result r;
        try {
            r = Push.push4Android("test title", "test desc", "test message");
            System.out.println(r.getErrorCode().getValue());
            System.out.println(r.getErrorCode().getFullDescription());
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test method for
     * {@link com.example.Push#push4AndroidByTime(java.lang.String, java.lang.String, java.lang.String, long)}.
     */
    @Test
    public void testPush4AndroidByTime() {
        Result r;
        try {
            r = Push.push4AndroidByTime("test time title", "test time desc",
                "test time message", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .parse("2018-03-05 23:10:00").getTime());
            System.out.println(r.getErrorCode().getValue());
            System.out.println(r.getErrorCode().getFullDescription());
        } catch (IOException | ParseException | java.text.ParseException e) {
            e.printStackTrace();
        }
    }

}
