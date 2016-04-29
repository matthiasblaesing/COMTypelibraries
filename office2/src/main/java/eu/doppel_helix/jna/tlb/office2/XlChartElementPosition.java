
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({05B0478C-9CD6-4F60-B113-A55E6A6CB1DC})</p>
 */
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