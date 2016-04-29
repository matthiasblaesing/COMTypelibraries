
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F6BA0ED9-B530-466E-83D5-325653CC1068})</p>
 */
public enum XlColorIndex implements IComEnum {
    
    /**
     * (-4105)
     */
    xlColorIndexAutomatic(-4105),
    
    /**
     * (-4142)
     */
    xlColorIndexNone(-4142),
    ;

    private XlColorIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}