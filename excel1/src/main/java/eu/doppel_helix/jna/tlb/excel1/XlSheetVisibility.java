
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSheetVisibility implements IComEnum {
    
    /**
     * (-1)
     */
    xlSheetVisible(-1),
    
    /**
     * (0)
     */
    xlSheetHidden(0),
    
    /**
     * (2)
     */
    xlSheetVeryHidden(2),
    ;

    private XlSheetVisibility(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}