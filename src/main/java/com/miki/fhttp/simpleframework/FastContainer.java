package com.miki.fhttp.simpleframework;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;
import org.simpleframework.http.core.Container;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by miki on 21/01/17.
 */

public class FastContainer implements Container {

    private Executor executor = null;

    public FastContainer(int size) {
        executor = Executors.newFixedThreadPool(size);
    }

    @Override
    public void handle(Request rqst, Response rspns) {
        RequestTask task = new RequestTask(rqst, rspns);
        executor.execute(task);
    }
}
