
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlEnableSelection implements IComEnum {
    
    /**
     * (0)
     */
    xlNoRestrictions(0),
    
    /**
     * (1)
     */
    xlUnlockedCells(1),
    
    /**
     * (-4142)
     */
    xlNoSelection(-4142),
    ;

    private XlEnableSelection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}