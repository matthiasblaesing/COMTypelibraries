
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({79490EA3-7A77-3A2D-8D1A-A15E6B216CBE})</p>
 */
public enum WdTextFormFieldType implements IComEnum {
    
    /**
     * (0)
     */
    wdRegularText(0),
    
    /**
     * (1)
     */
    wdNumberText(1),
    
    /**
     * (2)
     */
    wdDateText(2),
    
    /**
     * (3)
     */
    wdCurrentDateText(3),
    
    /**
     * (4)
     */
    wdCurrentTimeText(4),
    
    /**
     * (5)
     */
    wdCalculationText(5),
    ;

    private WdTextFormFieldType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}