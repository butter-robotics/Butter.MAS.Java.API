package com.butter.mas.clients;

import com.butter.mas.TestEnvironment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClientHttpTest {
    private static ClientHttp mHttpClient;

    @BeforeAll
    public static void init() {
        mHttpClient = new ClientHttp(TestEnvironment.DEVICE_IP);
        mHttpClient.setTimeout(TestEnvironment.TIMEOUT);
    }

    @AfterAll
    public static void teardown() {
        mHttpClient = null;
    }

    @Test
    public void getAvailableAnimationsTest() {
        var response = mHttpClient.getAvailableAnimations(false);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(response.getStatusText(), "OK");
    }

    @Test
    public void getAvailableHandlersTest() {
        var response = mHttpClient.getAvailableHandlers();
        Assertions.assertNotNull(response);
        Assertions.assertEquals(response.getStatusText(), "OK");
    }
}