
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoHyperlinkType implements IComEnum {
    
    /**
     * (0)
     */
    msoHyperlinkRange(0),
    
    /**
     * (1)
     */
    msoHyperlinkShape(1),
    
    /**
     * (2)
     */
    msoHyperlinkInlineShape(2),
    ;

    private MsoHyperlinkType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}