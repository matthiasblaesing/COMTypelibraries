
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlHAlign implements IComEnum {
    
    /**
     * (-4108)
     */
    xlHAlignCenter(-4108),
    
    /**
     * (7)
     */
    xlHAlignCenterAcrossSelection(7),
    
    /**
     * (-4117)
     */
    xlHAlignDistributed(-4117),
    
    /**
     * (5)
     */
    xlHAlignFill(5),
    
    /**
     * (1)
     */
    xlHAlignGeneral(1),
    
    /**
     * (-4130)
     */
    xlHAlignJustify(-4130),
    
    /**
     * (-4131)
     */
    xlHAlignLeft(-4131),
    
    /**
     * (-4152)
     */
    xlHAlignRight(-4152),
    ;

    private XlHAlign(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}