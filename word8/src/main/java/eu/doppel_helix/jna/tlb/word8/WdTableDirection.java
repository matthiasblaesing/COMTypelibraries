
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5D6DAAA5-69B8-33EC-B902-21218FFC16C1})</p>
 */
public enum WdTableDirection implements IComEnum {
    
    /**
     * (0)
     */
    wdTableDirectionRtl(0),
    
    /**
     * (1)
     */
    wdTableDirectionLtr(1),
    ;

    private WdTableDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}