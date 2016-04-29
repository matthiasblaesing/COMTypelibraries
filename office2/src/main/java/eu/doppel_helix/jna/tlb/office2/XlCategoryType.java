
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({78F07E6C-4BC5-41B8-8FE1-F1643184BA3F})</p>
 */
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