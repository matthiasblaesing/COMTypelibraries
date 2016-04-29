
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlVAlign implements IComEnum {
    
    /**
     * (-4107)
     */
    xlVAlignBottom(-4107),
    
    /**
     * (-4108)
     */
    xlVAlignCenter(-4108),
    
    /**
     * (-4117)
     */
    xlVAlignDistributed(-4117),
    
    /**
     * (-4130)
     */
    xlVAlignJustify(-4130),
    
    /**
     * (-4160)
     */
    xlVAlignTop(-4160),
    ;

    private XlVAlign(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}