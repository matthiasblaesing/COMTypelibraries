
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlChartElementPosition implements IComEnum {
    
    /**
     * (-4105)
     */
    xlChartElementPositionAutomatic(-4105),
    
    /**
     * (-4114)
     */
    xlChartElementPositionCustom(-4114),
    ;

    private XlChartElementPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}