package com.miki.fhttp;
import static spark.Spark.*;

/**
 * Created by miki on 24/01/17.
 */
public class FastSpark {

    public static void main(String[] arg) {
        port(8081);
        get("/fastdata", (req, res) -> {
            res.type("application/xml");
            return "<?xml version='1.0' encoding='UTF-8'?><q><h>nqs-nl-c5.youboranqs01.com</h><t></t><pt>10</pt><c>U_506_9rwgba6w4hpa3p71</c><tc/><b>0</b></q>";
        });
    }
}
