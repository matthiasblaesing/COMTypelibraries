
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoDistributeCmd implements IComEnum {
    
    /**
     * (0)
     */
    msoDistributeHorizontally(0),
    
    /**
     * (1)
     */
    msoDistributeVertically(1),
    ;

    private MsoDistributeCmd(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}