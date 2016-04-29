
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlEditionFormat implements IComEnum {
    
    /**
     * (2)
     */
    xlBIFF(2),
    
    /**
     * (1)
     */
    xlPICT(1),
    
    /**
     * (4)
     */
    xlRTF(4),
    
    /**
     * (8)
     */
    xlVALU(8),
    ;

    private XlEditionFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}