
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines content of generated object text
 *
 * <p>uuid({4A249B78-FC9A-11D1-8B1E-00600806D9B6})</p>
 */
public enum WbemTextFlagEnum implements IComEnum {
    
    /**
     * (1)
     */
    wbemTextFlagNoFlavors(1),
    ;

    private WbemTextFlagEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}