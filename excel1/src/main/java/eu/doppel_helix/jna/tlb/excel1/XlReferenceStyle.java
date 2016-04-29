
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlReferenceStyle implements IComEnum {
    
    /**
     * (1)
     */
    xlA1(1),
    
    /**
     * (-4150)
     */
    xlR1C1(-4150),
    ;

    private XlReferenceStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}