
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * The WiaImagePropertyType enumeration specifies the type of the value of an image property. Image properties can be found in the Properties collection of an ImageFile object.
 *
 * <p>uuid({9E6A0011-6F26-4904-BF25-0D6760DBFB58})</p>
 */
public enum WiaImagePropertyType implements IComEnum {
    
    /**
     * The value of the image property is undefined returned as a Byte. (1000)
     */
    UndefinedImagePropertyType(1000),
    
    /**
     * The value of the image property is a Byte. (1001)
     */
    ByteImagePropertyType(1001),
    
    /**
     * The value of the image property is a String. (1002)
     */
    StringImagePropertyType(1002),
    
    /**
     * The value of the image property is returned as a non-negative Integer. (1003)
     */
    UnsignedIntegerImagePropertyType(1003),
    
    /**
     * The value of the image property is a Long. (1004)
     */
    LongImagePropertyType(1004),
    
    /**
     * The value of the image property is returned as a non-negative Long. (1005)
     */
    UnsignedLongImagePropertyType(1005),
    
    /**
     * The value of the image property is returned as a Rational Object. (1006)
     */
    RationalImagePropertyType(1006),
    
    /**
     * The value of the image property is returned as a Rational Object. (1007)
     */
    UnsignedRationalImagePropertyType(1007),
    
    /**
     * The value of the image property is returned as a Vector object containing Byte elements. (1100)
     */
    VectorOfUndefinedImagePropertyType(1100),
    
    /**
     * The value of the image property is a Vector object containing Byte elements. (1101)
     */
    VectorOfBytesImagePropertyType(1101),
    
    /**
     * The value of the image property is returned as a Vector object containing Integer elements. (1102)
     */
    VectorOfUnsignedIntegersImagePropertyType(1102),
    
    /**
     * The value of the image property is a Vector object containing Long elements. (1103)
     */
    VectorOfLongsImagePropertyType(1103),
    
    /**
     * The value of the image property is returned as a Vector object containing Long elements. (1104)
     */
    VectorOfUnsignedLongsImagePropertyType(1104),
    
    /**
     * The value of the image property is returned as a Vector object containing Rational object elements. (1105)
     */
    VectorOfRationalsImagePropertyType(1105),
    
    /**
     * The value of the image property is returned as a Vector object containing Rational object elements. (1106)
     */
    VectorOfUnsignedRationalsImagePropertyType(1106),
    ;

    private WiaImagePropertyType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}