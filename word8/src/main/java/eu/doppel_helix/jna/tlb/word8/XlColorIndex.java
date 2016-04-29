
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

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