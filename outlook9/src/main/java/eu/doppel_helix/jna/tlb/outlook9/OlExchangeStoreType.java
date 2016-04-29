
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlExchangeStoreType implements IComEnum {
    
    /**
     * (0)
     */
    olPrimaryExchangeMailbox(0),
    
    /**
     * (1)
     */
    olExchangeMailbox(1),
    
    /**
     * (2)
     */
    olExchangePublicFolder(2),
    
    /**
     * (3)
     */
    olNotExchange(3),
    
    /**
     * (4)
     */
    olAdditionalExchangeMailbox(4),
    ;

    private OlExchangeStoreType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}