
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3A6700B4-6BC6-4848-AAA4-D360573F448C})</p>
 */
public enum XlTickLabelOrientation implements IComEnum {
    
    /**
     * (-4105)
     */
    xlTickLabelOrientationAutomatic(-4105),
    
    /**
     * (-4170)
     */
    xlTickLabelOrientationDownward(-4170),
    
    /**
     * (-4128)
     */
    xlTickLabelOrientationHorizontal(-4128),
    
    /**
     * (-4171)
     */
    xlTickLabelOrientationUpward(-4171),
    
    /**
     * (-4166)
     */
    xlTickLabelOrientationVertical(-4166),
    ;

    private XlTickLabelOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}