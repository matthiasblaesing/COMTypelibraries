
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D1F7D404-FE34-32EA-8235-0FB8CAA2E73B})</p>
 */
public enum WdBaselineAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdBaselineAlignTop(0),
    
    /**
     * (1)
     */
    wdBaselineAlignCenter(1),
    
    /**
     * (2)
     */
    wdBaselineAlignBaseline(2),
    
    /**
     * (3)
     */
    wdBaselineAlignFarEast50(3),
    
    /**
     * (4)
     */
    wdBaselineAlignAuto(4),
    ;

    private WdBaselineAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}