
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EAF7129E-2874-33F2-9E44-7A0FE3E94992})</p>
 */
public enum WdBookmarkSortBy implements IComEnum {
    
    /**
     * (0)
     */
    wdSortByName(0),
    
    /**
     * (1)
     */
    wdSortByLocation(1),
    ;

    private WdBookmarkSortBy(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}