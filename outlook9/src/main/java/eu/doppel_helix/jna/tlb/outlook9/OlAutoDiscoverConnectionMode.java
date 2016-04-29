
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAutoDiscoverConnectionMode implements IComEnum {
    
    /**
     * (0)
     */
    olAutoDiscoverConnectionUnknown(0),
    
    /**
     * (1)
     */
    olAutoDiscoverConnectionExternal(1),
    
    /**
     * (2)
     */
    olAutoDiscoverConnectionInternal(2),
    
    /**
     * (3)
     */
    olAutoDiscoverConnectionInternalDomain(3),
    ;

    private OlAutoDiscoverConnectionMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}