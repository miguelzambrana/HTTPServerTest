package com.miki.fhttp;

import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

/**
 * Created by miki on 24/01/17.
 */
public class FastUndertowIO {

    public static void main(final String[] args) {
        Undertow server = Undertow.builder()
                .addHttpListener(8082, "localhost")
                .setIoThreads(8)
                .setWorkerThreads(16)
                .setHandler(new HttpHandler() {
                    @Override
                    public void handleRequest(final HttpServerExchange exchange) throws Exception {
                        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/xml");
                        exchange.getResponseSender().send("<?xml version='1.0' encoding='UTF-8'?><q><h>nqs-nl-c5.youboranqs01.com</h><t></t><pt>10</pt><c>U_506_9rwgba6w4hpa3p71</c><tc/><b>0</b></q>");
                    }
                }).build();
        server.start();
    }

}
