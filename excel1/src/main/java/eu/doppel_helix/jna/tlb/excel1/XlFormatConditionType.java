
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFormatConditionType implements IComEnum {
    
    /**
     * (1)
     */
    xlCellValue(1),
    
    /**
     * (2)
     */
    xlExpression(2),
    
    /**
     * (3)
     */
    xlColorScale(3),
    
    /**
     * (4)
     */
    xlDatabar(4),
    
    /**
     * (5)
     */
    xlTop10(5),
    
    /**
     * (6)
     */
    xlIconSets(6),
    
    /**
     * (8)
     */
    xlUniqueValues(8),
    
    /**
     * (9)
     */
    xlTextString(9),
    
    /**
     * (10)
     */
    xlBlanksCondition(10),
    
    /**
     * (11)
     */
    xlTimePeriod(11),
    
    /**
     * (12)
     */
    xlAboveAverageCondition(12),
    
    /**
     * (13)
     */
    xlNoBlanksCondition(13),
    
    /**
     * (16)
     */
    xlErrorsCondition(16),
    
    /**
     * (17)
     */
    xlNoErrorsCondition(17),
    ;

    private XlFormatConditionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}