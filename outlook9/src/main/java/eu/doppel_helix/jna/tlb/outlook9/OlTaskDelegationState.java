
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlTaskDelegationState implements IComEnum {
    
    /**
     * (0)
     */
    olTaskNotDelegated(0),
    
    /**
     * (1)
     */
    olTaskDelegationUnknown(1),
    
    /**
     * (2)
     */
    olTaskDelegationAccepted(2),
    
    /**
     * (3)
     */
    olTaskDelegationDeclined(3),
    ;

    private OlTaskDelegationState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}