
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2FDDCDF6-144E-3F5C-AB71-5F689C31A753})</p>
 */
public enum WdSortSeparator implements IComEnum {
    
    /**
     * (0)
     */
    wdSortSeparateByTabs(0),
    
    /**
     * (1)
     */
    wdSortSeparateByCommas(1),
    
    /**
     * (2)
     */
    wdSortSeparateByDefaultTableSeparator(2),
    ;

    private WdSortSeparator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}