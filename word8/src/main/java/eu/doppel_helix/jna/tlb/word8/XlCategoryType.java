
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCategoryType implements IComEnum {
    
    /**
     * (2)
     */
    xlCategoryScale(2),
    
    /**
     * (3)
     */
    xlTimeScale(3),
    
    /**
     * (-4105)
     */
    xlAutomaticScale(-4105),
    ;

    private XlCategoryType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}