
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCalculation implements IComEnum {
    
    /**
     * (-4105)
     */
    xlCalculationAutomatic(-4105),
    
    /**
     * (-4135)
     */
    xlCalculationManual(-4135),
    
    /**
     * (2)
     */
    xlCalculationSemiautomatic(2),
    ;

    private XlCalculation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}