
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({452A1AEC-5665-36CB-8E14-9C39286E8216})</p>
 */
public enum WdPhoneticGuideAlignmentType implements IComEnum {
    
    /**
     * (0)
     */
    wdPhoneticGuideAlignmentCenter(0),
    
    /**
     * (1)
     */
    wdPhoneticGuideAlignmentZeroOneZero(1),
    
    /**
     * (2)
     */
    wdPhoneticGuideAlignmentOneTwoOne(2),
    
    /**
     * (3)
     */
    wdPhoneticGuideAlignmentLeft(3),
    
    /**
     * (4)
     */
    wdPhoneticGuideAlignmentRight(4),
    
    /**
     * (5)
     */
    wdPhoneticGuideAlignmentRightVertical(5),
    ;

    private WdPhoneticGuideAlignmentType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}