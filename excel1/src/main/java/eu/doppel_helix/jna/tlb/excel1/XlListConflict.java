
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlListConflict implements IComEnum {
    
    /**
     * (0)
     */
    xlListConflictDialog(0),
    
    /**
     * (1)
     */
    xlListConflictRetryAllConflicts(1),
    
    /**
     * (2)
     */
    xlListConflictDiscardAllConflicts(2),
    
    /**
     * (3)
     */
    xlListConflictError(3),
    ;

    private XlListConflict(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}