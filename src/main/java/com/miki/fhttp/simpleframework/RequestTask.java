package com.miki.fhttp.simpleframework;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;

import java.io.PrintStream;

/**
 * Created by miki on 21/01/17.
 */
public class RequestTask implements Runnable {

    private Request request;
    private Response response;

    public RequestTask(Request request, Response response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public void run() {
        try (PrintStream body = response.getPrintStream())
        {
            body.print("<?xml version='1.0' encoding='UTF-8'?><q><h>nqs-nl-c5.youboranqs01.com</h><t></t><pt>10</pt><c>U_506_9rwgba6w4hpa3p71</c><tc/><b>0</b></q>");
        }
        catch (Exception e) {e.printStackTrace();}
    }
}
