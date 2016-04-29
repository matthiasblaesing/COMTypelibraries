
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({898E892B-FEAA-4C75-AB24-CCE8E6F123ED})</p>
 */
public enum WdColumnWidth implements IComEnum {
    
    /**
     * (1)
     */
    wdColumnWidthNarrow(1),
    
    /**
     * (2)
     */
    wdColumnWidthDefault(2),
    
    /**
     * (3)
     */
    wdColumnWidthWide(3),
    ;

    private WdColumnWidth(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}