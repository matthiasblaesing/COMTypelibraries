
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoMetaPropertyType implements IComEnum {
    
    /**
     * (0)
     */
    msoMetaPropertyTypeUnknown(0),
    
    /**
     * (1)
     */
    msoMetaPropertyTypeBoolean(1),
    
    /**
     * (2)
     */
    msoMetaPropertyTypeChoice(2),
    
    /**
     * (3)
     */
    msoMetaPropertyTypeCalculated(3),
    
    /**
     * (4)
     */
    msoMetaPropertyTypeComputed(4),
    
    /**
     * (5)
     */
    msoMetaPropertyTypeCurrency(5),
    
    /**
     * (6)
     */
    msoMetaPropertyTypeDateTime(6),
    
    /**
     * (7)
     */
    msoMetaPropertyTypeFillInChoice(7),
    
    /**
     * (8)
     */
    msoMetaPropertyTypeGuid(8),
    
    /**
     * (9)
     */
    msoMetaPropertyTypeInteger(9),
    
    /**
     * (10)
     */
    msoMetaPropertyTypeLookup(10),
    
    /**
     * (11)
     */
    msoMetaPropertyTypeMultiChoiceLookup(11),
    
    /**
     * (12)
     */
    msoMetaPropertyTypeMultiChoice(12),
    
    /**
     * (13)
     */
    msoMetaPropertyTypeMultiChoiceFillIn(13),
    
    /**
     * (14)
     */
    msoMetaPropertyTypeNote(14),
    
    /**
     * (15)
     */
    msoMetaPropertyTypeNumber(15),
    
    /**
     * (16)
     */
    msoMetaPropertyTypeText(16),
    
    /**
     * (17)
     */
    msoMetaPropertyTypeUrl(17),
    
    /**
     * (18)
     */
    msoMetaPropertyTypeUser(18),
    
    /**
     * (19)
     */
    msoMetaPropertyTypeUserMulti(19),
    
    /**
     * (20)
     */
    msoMetaPropertyTypeBusinessData(20),
    
    /**
     * (21)
     */
    msoMetaPropertyTypeBusinessDataSecondary(21),
    
    /**
     * (22)
     */
    msoMetaPropertyTypeMax(22),
    ;

    private MsoMetaPropertyType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}