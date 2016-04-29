
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlAxisCrosses implements IComEnum {
    
    /**
     * (-4105)
     */
    xlAxisCrossesAutomatic(-4105),
    
    /**
     * (-4114)
     */
    xlAxisCrossesCustom(-4114),
    
    /**
     * (2)
     */
    xlAxisCrossesMaximum(2),
    
    /**
     * (4)
     */
    xlAxisCrossesMinimum(4),
    ;

    private XlAxisCrosses(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}