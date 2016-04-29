
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSharingProvider implements IComEnum {
    
    /**
     * (0)
     */
    olProviderUnknown(0),
    
    /**
     * (1)
     */
    olProviderExchange(1),
    
    /**
     * (2)
     */
    olProviderWebCal(2),
    
    /**
     * (3)
     */
    olProviderPubCal(3),
    
    /**
     * (4)
     */
    olProviderICal(4),
    
    /**
     * (5)
     */
    olProviderSharePoint(5),
    
    /**
     * (6)
     */
    olProviderRSS(6),
    
    /**
     * (7)
     */
    olProviderFederate(7),
    ;

    private OlSharingProvider(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}