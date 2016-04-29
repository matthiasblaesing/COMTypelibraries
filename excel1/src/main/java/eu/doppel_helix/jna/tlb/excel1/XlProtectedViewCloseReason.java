
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlProtectedViewCloseReason implements IComEnum {
    
    /**
     * (0)
     */
    xlProtectedViewCloseNormal(0),
    
    /**
     * (1)
     */
    xlProtectedViewCloseEdit(1),
    
    /**
     * (2)
     */
    xlProtectedViewCloseForced(2),
    ;

    private XlProtectedViewCloseReason(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}