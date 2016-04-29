
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum tagREADYSTATE implements IComEnum {
    
    /**
     * (0)
     */
    READYSTATE_UNINITIALIZED(0),
    
    /**
     * (1)
     */
    READYSTATE_LOADING(1),
    
    /**
     * (2)
     */
    READYSTATE_LOADED(2),
    
    /**
     * (3)
     */
    READYSTATE_INTERACTIVE(3),
    
    /**
     * (4)
     */
    READYSTATE_COMPLETE(4),
    ;

    private tagREADYSTATE(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}