
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataLabelsType implements IComEnum {
    
    /**
     * (-4142)
     */
    xlDataLabelsShowNone(-4142),
    
    /**
     * (2)
     */
    xlDataLabelsShowValue(2),
    
    /**
     * (3)
     */
    xlDataLabelsShowPercent(3),
    
    /**
     * (4)
     */
    xlDataLabelsShowLabel(4),
    
    /**
     * (5)
     */
    xlDataLabelsShowLabelAndPercent(5),
    
    /**
     * (6)
     */
    xlDataLabelsShowBubbleSizes(6),
    ;

    private XlDataLabelsType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}