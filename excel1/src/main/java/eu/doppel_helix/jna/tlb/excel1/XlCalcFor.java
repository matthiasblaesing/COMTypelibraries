
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCalcFor implements IComEnum {
    
    /**
     * (0)
     */
    xlAllValues(0),
    
    /**
     * (1)
     */
    xlRowGroups(1),
    
    /**
     * (2)
     */
    xlColGroups(2),
    ;

    private XlCalcFor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}