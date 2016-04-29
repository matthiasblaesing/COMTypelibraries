
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlListDataType implements IComEnum {
    
    /**
     * (0)
     */
    xlListDataTypeNone(0),
    
    /**
     * (1)
     */
    xlListDataTypeText(1),
    
    /**
     * (2)
     */
    xlListDataTypeMultiLineText(2),
    
    /**
     * (3)
     */
    xlListDataTypeNumber(3),
    
    /**
     * (4)
     */
    xlListDataTypeCurrency(4),
    
    /**
     * (5)
     */
    xlListDataTypeDateTime(5),
    
    /**
     * (6)
     */
    xlListDataTypeChoice(6),
    
    /**
     * (7)
     */
    xlListDataTypeChoiceMulti(7),
    
    /**
     * (8)
     */
    xlListDataTypeListLookup(8),
    
    /**
     * (9)
     */
    xlListDataTypeCheckbox(9),
    
    /**
     * (10)
     */
    xlListDataTypeHyperLink(10),
    
    /**
     * (11)
     */
    xlListDataTypeCounter(11),
    
    /**
     * (12)
     */
    xlListDataTypeMultiLineRichText(12),
    ;

    private XlListDataType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}