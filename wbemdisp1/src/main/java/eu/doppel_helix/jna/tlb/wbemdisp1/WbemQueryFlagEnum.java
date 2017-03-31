
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines depth of enumeration or query
 *
 * <p>uuid({4A249B76-FC9A-11D1-8B1E-00600806D9B6})</p>
 */
public enum WbemQueryFlagEnum implements IComEnum {
    
    /**
     * (0)
     */
    wbemQueryFlagDeep(0),
    
    /**
     * (1)
     */
    wbemQueryFlagShallow(1),
    
    /**
     * (2)
     */
    wbemQueryFlagPrototype(2),
    ;

    private WbemQueryFlagEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}