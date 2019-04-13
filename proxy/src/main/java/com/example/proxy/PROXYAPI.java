package com.example.proxy;

import com.google.gson.Gson;
import proxy.PROXYLIB;

public class PROXYAPI {
    private static Response Str2Res(String resStr) {
        Gson gson = new Gson();
        Response response = gson.fromJson(resStr, Response.class);

        return response;
    }

    public static Response Init(String bootStrap, String libp2pAddr, String proxyAddr, String magSevrAddr, String cfgPath) {
        String resStr = PROXYLIB.Init(bootStrap, libp2pAddr, proxyAddr, magSevrAddr, cfgPath);
        return Str2Res(resStr);
    }

    public static Response StartDaemon(String cfgPath) {
        String resStr = PROXYLIB.StartDaemon(cfgPath);
        return Str2Res(resStr);
    }

    public static void StopDaemon() {
        PROXYLIB.StopDaemon();
    }
}
