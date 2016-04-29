
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoOrgChartOrientation implements IComEnum {
    
    /**
     * (-2)
     */
    msoOrgChartOrientationMixed(-2),
    
    /**
     * (1)
     */
    msoOrgChartOrientationVertical(1),
    ;

    private MsoOrgChartOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}