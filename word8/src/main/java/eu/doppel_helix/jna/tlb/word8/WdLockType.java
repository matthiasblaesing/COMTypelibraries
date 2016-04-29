
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdLockType implements IComEnum {
    
    /**
     * (0)
     */
    wdLockNone(0),
    
    /**
     * (1)
     */
    wdLockReservation(1),
    
    /**
     * (2)
     */
    wdLockEphemeral(2),
    
    /**
     * (3)
     */
    wdLockChanged(3),
    ;

    private WdLockType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}