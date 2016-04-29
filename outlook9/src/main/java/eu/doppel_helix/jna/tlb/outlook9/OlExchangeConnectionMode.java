
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlExchangeConnectionMode implements IComEnum {
    
    /**
     * (0)
     */
    olNoExchange(0),
    
    /**
     * (100)
     */
    olOffline(100),
    
    /**
     * (200)
     */
    olCachedOffline(200),
    
    /**
     * (300)
     */
    olDisconnected(300),
    
    /**
     * (400)
     */
    olCachedDisconnected(400),
    
    /**
     * (500)
     */
    olCachedConnectedHeaders(500),
    
    /**
     * (600)
     */
    olCachedConnectedDrizzle(600),
    
    /**
     * (700)
     */
    olCachedConnectedFull(700),
    
    /**
     * (800)
     */
    olOnline(800),
    ;

    private OlExchangeConnectionMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}