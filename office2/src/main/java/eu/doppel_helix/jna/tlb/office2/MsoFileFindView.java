
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileFindView implements IComEnum {
    
    /**
     * (1)
     */
    msoViewFileInfo(1),
    
    /**
     * (2)
     */
    msoViewPreview(2),
    
    /**
     * (3)
     */
    msoViewSummaryInfo(3),
    ;

    private MsoFileFindView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}