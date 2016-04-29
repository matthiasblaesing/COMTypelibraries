
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlArrowHeadWidth implements IComEnum {
    
    /**
     * (-4138)
     */
    xlArrowHeadWidthMedium(-4138),
    
    /**
     * (1)
     */
    xlArrowHeadWidthNarrow(1),
    
    /**
     * (3)
     */
    xlArrowHeadWidthWide(3),
    ;

    private XlArrowHeadWidth(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}