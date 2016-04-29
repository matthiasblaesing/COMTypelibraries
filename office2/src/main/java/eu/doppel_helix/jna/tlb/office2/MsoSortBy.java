
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSortBy implements IComEnum {
    
    /**
     * (1)
     */
    msoSortByFileName(1),
    
    /**
     * (2)
     */
    msoSortBySize(2),
    
    /**
     * (3)
     */
    msoSortByFileType(3),
    
    /**
     * (4)
     */
    msoSortByLastModified(4),
    
    /**
     * (5)
     */
    msoSortByNone(5),
    ;

    private MsoSortBy(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}