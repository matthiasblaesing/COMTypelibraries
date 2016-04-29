
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdProtectedViewCloseReason implements IComEnum {
    
    /**
     * (0)
     */
    wdProtectedViewCloseNormal(0),
    
    /**
     * (1)
     */
    wdProtectedViewCloseEdit(1),
    
    /**
     * (2)
     */
    wdProtectedViewCloseForced(2),
    ;

    private WdProtectedViewCloseReason(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}