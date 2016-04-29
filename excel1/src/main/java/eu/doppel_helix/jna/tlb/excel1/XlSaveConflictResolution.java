
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSaveConflictResolution implements IComEnum {
    
    /**
     * (2)
     */
    xlLocalSessionChanges(2),
    
    /**
     * (3)
     */
    xlOtherSessionChanges(3),
    
    /**
     * (1)
     */
    xlUserResolution(1),
    ;

    private XlSaveConflictResolution(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}