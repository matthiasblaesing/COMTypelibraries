
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoButtonState implements IComEnum {
    
    /**
     * (0)
     */
    msoButtonUp(0),
    
    /**
     * (-1)
     */
    msoButtonDown(-1),
    
    /**
     * (2)
     */
    msoButtonMixed(2),
    ;

    private MsoButtonState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}