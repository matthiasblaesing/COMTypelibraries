
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AEFC2198-0064-3CD7-9C78-EB0F67229F4A})</p>
 */
public enum WdStyleSort implements IComEnum {
    
    /**
     * (0)
     */
    wdStyleSortByName(0),
    
    /**
     * (1)
     */
    wdStyleSortRecommended(1),
    
    /**
     * (2)
     */
    wdStyleSortByFont(2),
    
    /**
     * (3)
     */
    wdStyleSortByBasedOn(3),
    
    /**
     * (4)
     */
    wdStyleSortByType(4),
    ;

    private WdStyleSort(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}