
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoParagraphAlignment implements IComEnum {
    
    /**
     * (-2)
     */
    msoAlignMixed(-2),
    
    /**
     * (1)
     */
    msoAlignLeft(1),
    
    /**
     * (2)
     */
    msoAlignCenter(2),
    
    /**
     * (3)
     */
    msoAlignRight(3),
    
    /**
     * (4)
     */
    msoAlignJustify(4),
    
    /**
     * (5)
     */
    msoAlignDistribute(5),
    
    /**
     * (6)
     */
    msoAlignThaiDistribute(6),
    
    /**
     * (7)
     */
    msoAlignJustifyLow(7),
    ;

    private MsoParagraphAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}