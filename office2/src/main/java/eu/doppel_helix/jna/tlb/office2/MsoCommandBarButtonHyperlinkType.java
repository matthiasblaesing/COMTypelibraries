
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCommandBarButtonHyperlinkType implements IComEnum {
    
    /**
     * (0)
     */
    msoCommandBarButtonHyperlinkNone(0),
    
    /**
     * (1)
     */
    msoCommandBarButtonHyperlinkOpen(1),
    
    /**
     * (2)
     */
    msoCommandBarButtonHyperlinkInsertPicture(2),
    ;

    private MsoCommandBarButtonHyperlinkType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}