
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EC67AF3B-F2DF-4A52-9B85-E06A7FF28DB7})</p>
 */
public enum MsoContactCardAddressType implements IComEnum {
    
    /**
     * (0)
     */
    msoContactCardAddressTypeUnknown(0),
    
    /**
     * (1)
     */
    msoContactCardAddressTypeOutlook(1),
    
    /**
     * (2)
     */
    msoContactCardAddressTypeSMTP(2),
    
    /**
     * (3)
     */
    msoContactCardAddressTypeIM(3),
    ;

    private MsoContactCardAddressType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}