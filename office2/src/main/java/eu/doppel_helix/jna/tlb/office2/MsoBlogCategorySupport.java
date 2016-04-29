
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBlogCategorySupport implements IComEnum {
    
    /**
     * (0)
     */
    msoBlogNoCategories(0),
    
    /**
     * (1)
     */
    msoBlogOneCategory(1),
    
    /**
     * (2)
     */
    msoBlogMultipleCategories(2),
    ;

    private MsoBlogCategorySupport(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}