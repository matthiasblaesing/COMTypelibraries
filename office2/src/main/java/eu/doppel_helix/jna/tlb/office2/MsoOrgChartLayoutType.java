
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoOrgChartLayoutType implements IComEnum {
    
    /**
     * (-2)
     */
    msoOrgChartLayoutMixed(-2),
    
    /**
     * (1)
     */
    msoOrgChartLayoutStandard(1),
    
    /**
     * (2)
     */
    msoOrgChartLayoutBothHanging(2),
    
    /**
     * (3)
     */
    msoOrgChartLayoutLeftHanging(3),
    
    /**
     * (4)
     */
    msoOrgChartLayoutRightHanging(4),
    
    /**
     * (5)
     */
    msoOrgChartLayoutDefault(5),
    ;

    private MsoOrgChartLayoutType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}