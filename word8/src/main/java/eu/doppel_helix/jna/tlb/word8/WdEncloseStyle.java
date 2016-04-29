
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0F05520A-75C5-378A-A3B8-E7B89539F932})</p>
 */
public enum WdEncloseStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdEncloseStyleNone(0),
    
    /**
     * (1)
     */
    wdEncloseStyleSmall(1),
    
    /**
     * (2)
     */
    wdEncloseStyleLarge(2),
    ;

    private WdEncloseStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}