
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlBusyStatus implements IComEnum {
    
    /**
     * (0)
     */
    olFree(0),
    
    /**
     * (1)
     */
    olTentative(1),
    
    /**
     * (2)
     */
    olBusy(2),
    
    /**
     * (3)
     */
    olOutOfOffice(3),
    
    /**
     * (4)
     */
    olWorkingElsewhere(4),
    ;

    private OlBusyStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}