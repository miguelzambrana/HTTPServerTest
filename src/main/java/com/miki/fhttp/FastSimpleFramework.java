package com.miki.fhttp;

import com.miki.fhttp.simpleframework.FastContainer;
import org.simpleframework.http.core.ContainerServer;
import org.simpleframework.transport.connect.SocketConnection;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by miki on 21/01/17.
 */
public class FastSimpleFramework {

    public static void init(int port, int poolSize)
    {
        if(port == -1)
            port = 8080;
        if(poolSize == -1)
            poolSize = 32;

        try {
            SocketConnection connection = new SocketConnection(new ContainerServer(new FastContainer(poolSize), poolSize));
            connection.connect(new InetSocketAddress(port));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void main(String[] arg) {
        try
        {
            int port = -1, poolSize = -1;
            if (arg.length > 0) {
                port = new Integer(arg[0]);

                if (arg.length > 1)
                    poolSize = Integer.parseInt(arg[1]);
            }

            // initialization
            init(port, poolSize);

            System.out.println("Fast Data Server ready and listening at port " + port);
        }
        catch(Throwable t){
            t.printStackTrace();
        }
    }



}
