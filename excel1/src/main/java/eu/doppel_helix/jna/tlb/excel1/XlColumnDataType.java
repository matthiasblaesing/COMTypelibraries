
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlColumnDataType implements IComEnum {
    
    /**
     * (1)
     */
    xlGeneralFormat(1),
    
    /**
     * (2)
     */
    xlTextFormat(2),
    
    /**
     * (3)
     */
    xlMDYFormat(3),
    
    /**
     * (4)
     */
    xlDMYFormat(4),
    
    /**
     * (5)
     */
    xlYMDFormat(5),
    
    /**
     * (6)
     */
    xlMYDFormat(6),
    
    /**
     * (7)
     */
    xlDYMFormat(7),
    
    /**
     * (8)
     */
    xlYDMFormat(8),
    
    /**
     * (9)
     */
    xlSkipColumn(9),
    
    /**
     * (10)
     */
    xlEMDFormat(10),
    ;

    private XlColumnDataType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}