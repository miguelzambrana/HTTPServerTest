package com.miki.fhttp;

import org.rapidoid.buffer.Buf;
import org.rapidoid.http.AbstractHttpServer;
import org.rapidoid.http.HttpStatus;
import org.rapidoid.http.MediaType;
import org.rapidoid.net.abstracts.Channel;
import org.rapidoid.net.impl.RapidoidHelper;

/**
 * Created by miki on 24/01/17.
 */
public class FastRapidoid extends AbstractHttpServer
{
    private static final byte[] URI_PLAINTEXT = "/getData".getBytes();

    public static void main( String[] args )
    {
        new FastRapidoid().listen(8080);
        //On.get("/getData").xml("<?xml version='1.0' encoding='UTF-8'?><q><h>nqs-nl-c5.youboranqs01.com</h><t></t><pt>10</pt><c>U_506_9rwgba6w4hpa3p71</c><tc/><b>0</b></q>".getBytes());
    }

    protected HttpStatus handle( Channel ctx, Buf buf, RapidoidHelper req)
    {
        if (req.isGet.value)
        {
            if (matches(buf, req.path, URI_PLAINTEXT))
            {
                return ok(ctx, req.isKeepAlive.value, "<?xml version='1.0' encoding='UTF-8'?><q><h>nqs-nl-c5.youboranqs01.com</h><t></t><pt>10</pt><c>U_506_9rwgba6w4hpa3p71</c><tc/><b>0</b></q>".getBytes(), MediaType.APPLICATION_ATOM_XML_UTF8);
            }
        }
        return HttpStatus.NOT_FOUND;
    }

}
