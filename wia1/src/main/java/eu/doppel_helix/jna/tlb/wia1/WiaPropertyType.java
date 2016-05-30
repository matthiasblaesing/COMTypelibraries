
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * The WiaPropertyType enumeration specifies the type of the value of an item property. Item properties can be found in the Properties collection of a Device or Item object.
 *
 * <p>uuid({652C190A-EEFA-4B91-B0FF-632139BE9BBA})</p>
 */
public enum WiaPropertyType implements IComEnum {
    
    /**
     * The value of the property is an unsupported type. (0)
     */
    UnsupportedPropertyType(0),
    
    /**
     * The value of the property is a Boolean. (1)
     */
    BooleanPropertyType(1),
    
    /**
     * The value of the property is a Byte. (2)
     */
    BytePropertyType(2),
    
    /**
     * The value of the property is an Integer. (3)
     */
    IntegerPropertyType(3),
    
    /**
     * The value of the property is returned as a non-negative Integer. (4)
     */
    UnsignedIntegerPropertyType(4),
    
    /**
     * The value of the property is a Long. (5)
     */
    LongPropertyType(5),
    
    /**
     * The value of the property is returned as a non-negative Long. (6)
     */
    UnsignedLongPropertyType(6),
    
    /**
     * The value of the property is returned as a Long. (7)
     */
    ErrorCodePropertyType(7),
    
    /**
     * The value of the property is a Large Integer returned as a truncated Long. (8)
     */
    LargeIntegerPropertyType(8),
    
    /**
     * The value of the property is returned as a truncated non-negative Long. (9)
     */
    UnsignedLargeIntegerPropertyType(9),
    
    /**
     * The value of the property is a Single. (10)
     */
    SinglePropertyType(10),
    
    /**
     * The value of the property is a Double. (11)
     */
    DoublePropertyType(11),
    
    /**
     * The value of the property is a Currency. (12)
     */
    CurrencyPropertyType(12),
    
    /**
     * The value of the property is a Date. (13)
     */
    DatePropertyType(13),
    
    /**
     * The value of the property is returned as a Date. (14)
     */
    FileTimePropertyType(14),
    
    /**
     * The value of the property is returned as a String. (15)
     */
    ClassIDPropertyType(15),
    
    /**
     * The value of the property is a String. (16)
     */
    StringPropertyType(16),
    
    /**
     * The value of the property is an Object. (17)
     */
    ObjectPropertyType(17),
    
    /**
     * The value of the property is returned as a Variant. (18)
     */
    HandlePropertyType(18),
    
    /**
     * The value of the property is a Variant. (19)
     */
    VariantPropertyType(19),
    
    /**
     * The value of the property is a Vector object containing Boolean elements. (101)
     */
    VectorOfBooleansPropertyType(101),
    
    /**
     * The value of the property is a Vector object containing Byte elements. (102)
     */
    VectorOfBytesPropertyType(102),
    
    /**
     * The value of the property is a Vector object containing Integer elements. (103)
     */
    VectorOfIntegersPropertyType(103),
    
    /**
     * The value of the property is returned as a Vector object containing non-negative Integer elements. (104)
     */
    VectorOfUnsignedIntegersPropertyType(104),
    
    /**
     * The value of the property is a Vector object containing Long elements. (105)
     */
    VectorOfLongsPropertyType(105),
    
    /**
     * The value of the property is returned as a Vector object containing non-negative Long elements. (106)
     */
    VectorOfUnsignedLongsPropertyType(106),
    
    /**
     * The value of the property is returned as a Vector object containing Long elements. (107)
     */
    VectorOfErrorCodesPropertyType(107),
    
    /**
     * The value of the property is returned as a Vector object containing truncated Long elements. (108)
     */
    VectorOfLargeIntegersPropertyType(108),
    
    /**
     * The value of the property is returned as a Vector object containing truncated non-negative Long elements. (109)
     */
    VectorOfUnsignedLargeIntegersPropertyType(109),
    
    /**
     * The value of the property is a Vector object containing Single elements. (110)
     */
    VectorOfSinglesPropertyType(110),
    
    /**
     * The value of the property is a Vector object containing Double elements. (111)
     */
    VectorOfDoublesPropertyType(111),
    
    /**
     * The value of the property is a Vector object containing Currency elements. (112)
     */
    VectorOfCurrenciesPropertyType(112),
    
    /**
     * The value of the property is a Vector object containing Date elements. (113)
     */
    VectorOfDatesPropertyType(113),
    
    /**
     * The value of the property is returned as a Vector object containing Date elements. (114)
     */
    VectorOfFileTimesPropertyType(114),
    
    /**
     * The value of the property is returned as a Vector object containing String elements. (115)
     */
    VectorOfClassIDsPropertyType(115),
    
    /**
     * The value of the property is a Vector object containing String elements. (116)
     */
    VectorOfStringsPropertyType(116),
    
    /**
     * The value of the property is a Vector object containing Variant elements. (119)
     */
    VectorOfVariantsPropertyType(119),
    ;

    private WiaPropertyType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}