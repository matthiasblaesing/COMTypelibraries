
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataBarBorderType implements IComEnum {
    
    /**
     * (0)
     */
    xlDataBarBorderNone(0),
    
    /**
     * (1)
     */
    xlDataBarBorderSolid(1),
    ;

    private XlDataBarBorderType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}