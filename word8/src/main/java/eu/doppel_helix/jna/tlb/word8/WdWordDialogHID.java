
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdWordDialogHID implements IComEnum {
    
    /**
     * (0)
     */
    emptyenum(0),
    ;

    private WdWordDialogHID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}