
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDeleteShiftDirection implements IComEnum {
    
    /**
     * (-4159)
     */
    xlShiftToLeft(-4159),
    
    /**
     * (-4162)
     */
    xlShiftUp(-4162),
    ;

    private XlDeleteShiftDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}