
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlHighlightChangesTime implements IComEnum {
    
    /**
     * (1)
     */
    xlSinceMyLastSave(1),
    
    /**
     * (2)
     */
    xlAllChanges(2),
    
    /**
     * (3)
     */
    xlNotYetReviewed(3),
    ;

    private XlHighlightChangesTime(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}