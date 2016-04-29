
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTickLabelPosition implements IComEnum {
    
    /**
     * (-4127)
     */
    xlTickLabelPositionHigh(-4127),
    
    /**
     * (-4134)
     */
    xlTickLabelPositionLow(-4134),
    
    /**
     * (4)
     */
    xlTickLabelPositionNextToAxis(4),
    
    /**
     * (-4142)
     */
    xlTickLabelPositionNone(-4142),
    ;

    private XlTickLabelPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}