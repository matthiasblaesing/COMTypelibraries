
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAddressListType implements IComEnum {
    
    /**
     * (0)
     */
    olExchangeGlobalAddressList(0),
    
    /**
     * (1)
     */
    olExchangeContainer(1),
    
    /**
     * (2)
     */
    olOutlookAddressList(2),
    
    /**
     * (3)
     */
    olOutlookLdapAddressList(3),
    
    /**
     * (4)
     */
    olCustomAddressList(4),
    ;

    private OlAddressListType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}