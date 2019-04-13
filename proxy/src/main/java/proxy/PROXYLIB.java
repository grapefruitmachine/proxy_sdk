package proxy;

public class PROXYLIB {
    public static native String Init(String bootStrap, String libp2pAddr, String proxyAddr, String magSevrAddr, String cfgPath);
    public static native String StartDaemon(String cfgPath);
    public static native void StopDaemon();

    static
    {
        System.loadLibrary("helper");
        System.loadLibrary("proxy");
    }
}
