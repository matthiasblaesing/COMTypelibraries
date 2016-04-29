
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataBarFillType implements IComEnum {
    
    /**
     * (0)
     */
    xlDataBarFillSolid(0),
    
    /**
     * (1)
     */
    xlDataBarFillGradient(1),
    ;

    private XlDataBarFillType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}