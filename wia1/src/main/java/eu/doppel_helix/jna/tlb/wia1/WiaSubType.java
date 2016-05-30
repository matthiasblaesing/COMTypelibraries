
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * The WiaSubType enumeration specifies more detail about the property value. Use the SubType property on the Property object to obtain these values for the property.
 *
 * <p>uuid({A5EDDA89-E79A-44A7-BBE1-42397D62FE79})</p>
 */
public enum WiaSubType implements IComEnum {
    
    /**
     * This property has no subtype. (0)
     */
    UnspecifiedSubType(0),
    
    /**
     * This property takes a range of values from SubTypeMin to SubTypeMax in SubTypeStep increments. (1)
     */
    RangeSubType(1),
    
    /**
     * This property takes one of a list of values from SubTypeValues. (2)
     */
    ListSubType(2),
    
    /**
     * This property takes a flag composed of bits listed in SubTypeValues. Flag values are combined using the OR operation. (3)
     */
    FlagSubType(3),
    ;

    private WiaSubType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}