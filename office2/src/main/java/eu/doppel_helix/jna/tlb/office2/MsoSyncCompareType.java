
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSyncCompareType implements IComEnum {
    
    /**
     * (0)
     */
    msoSyncCompareAndMerge(0),
    
    /**
     * (1)
     */
    msoSyncCompareSideBySide(1),
    ;

    private MsoSyncCompareType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}