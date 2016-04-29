
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoHTMLProjectOpen implements IComEnum {
    
    /**
     * (1)
     */
    msoHTMLProjectOpenSourceView(1),
    
    /**
     * (2)
     */
    msoHTMLProjectOpenTextView(2),
    ;

    private MsoHTMLProjectOpen(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}