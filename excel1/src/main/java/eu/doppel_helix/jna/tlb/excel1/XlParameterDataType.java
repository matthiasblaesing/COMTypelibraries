
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlParameterDataType implements IComEnum {
    
    /**
     * (0)
     */
    xlParamTypeUnknown(0),
    
    /**
     * (1)
     */
    xlParamTypeChar(1),
    
    /**
     * (2)
     */
    xlParamTypeNumeric(2),
    
    /**
     * (3)
     */
    xlParamTypeDecimal(3),
    
    /**
     * (4)
     */
    xlParamTypeInteger(4),
    
    /**
     * (5)
     */
    xlParamTypeSmallInt(5),
    
    /**
     * (6)
     */
    xlParamTypeFloat(6),
    
    /**
     * (7)
     */
    xlParamTypeReal(7),
    
    /**
     * (8)
     */
    xlParamTypeDouble(8),
    
    /**
     * (12)
     */
    xlParamTypeVarChar(12),
    
    /**
     * (9)
     */
    xlParamTypeDate(9),
    
    /**
     * (10)
     */
    xlParamTypeTime(10),
    
    /**
     * (11)
     */
    xlParamTypeTimestamp(11),
    
    /**
     * (-1)
     */
    xlParamTypeLongVarChar(-1),
    
    /**
     * (-2)
     */
    xlParamTypeBinary(-2),
    
    /**
     * (-3)
     */
    xlParamTypeVarBinary(-3),
    
    /**
     * (-4)
     */
    xlParamTypeLongVarBinary(-4),
    
    /**
     * (-5)
     */
    xlParamTypeBigInt(-5),
    
    /**
     * (-6)
     */
    xlParamTypeTinyInt(-6),
    
    /**
     * (-7)
     */
    xlParamTypeBit(-7),
    
    /**
     * (-8)
     */
    xlParamTypeWChar(-8),
    ;

    private XlParameterDataType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}