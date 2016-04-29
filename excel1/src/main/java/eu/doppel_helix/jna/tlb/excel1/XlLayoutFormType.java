
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLayoutFormType implements IComEnum {
    
    /**
     * (0)
     */
    xlTabular(0),
    
    /**
     * (1)
     */
    xlOutline(1),
    ;

    private XlLayoutFormType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}