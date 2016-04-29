
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileFindSortBy implements IComEnum {
    
    /**
     * (1)
     */
    msoFileFindSortbyAuthor(1),
    
    /**
     * (2)
     */
    msoFileFindSortbyDateCreated(2),
    
    /**
     * (3)
     */
    msoFileFindSortbyLastSavedBy(3),
    
    /**
     * (4)
     */
    msoFileFindSortbyDateSaved(4),
    
    /**
     * (5)
     */
    msoFileFindSortbyFileName(5),
    
    /**
     * (6)
     */
    msoFileFindSortbySize(6),
    
    /**
     * (7)
     */
    msoFileFindSortbyTitle(7),
    ;

    private MsoFileFindSortBy(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}