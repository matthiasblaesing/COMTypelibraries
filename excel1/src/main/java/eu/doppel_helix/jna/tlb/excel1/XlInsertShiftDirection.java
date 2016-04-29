
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlInsertShiftDirection implements IComEnum {
    
    /**
     * (-4121)
     */
    xlShiftDown(-4121),
    
    /**
     * (-4161)
     */
    xlShiftToRight(-4161),
    ;

    private XlInsertShiftDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}