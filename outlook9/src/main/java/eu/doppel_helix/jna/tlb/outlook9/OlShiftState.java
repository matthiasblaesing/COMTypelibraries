
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B791AC59-1E79-4007-A6A1-4A4FE62F8D03})</p>
 */
public enum OlShiftState implements IComEnum {
    
    /**
     * ShiftMask (1)
     */
    olShiftStateShiftMask(1),
    
    /**
     * CtrlMask (2)
     */
    olShiftStateCtrlMask(2),
    
    /**
     * AltMask (4)
     */
    olShiftStateAltMask(4),
    ;

    private OlShiftState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}