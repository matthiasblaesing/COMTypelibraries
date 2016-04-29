
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetThreeDFormat implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetThreeDFormatMixed(-2),
    
    /**
     * (1)
     */
    msoThreeD1(1),
    
    /**
     * (2)
     */
    msoThreeD2(2),
    
    /**
     * (3)
     */
    msoThreeD3(3),
    
    /**
     * (4)
     */
    msoThreeD4(4),
    
    /**
     * (5)
     */
    msoThreeD5(5),
    
    /**
     * (6)
     */
    msoThreeD6(6),
    
    /**
     * (7)
     */
    msoThreeD7(7),
    
    /**
     * (8)
     */
    msoThreeD8(8),
    
    /**
     * (9)
     */
    msoThreeD9(9),
    
    /**
     * (10)
     */
    msoThreeD10(10),
    
    /**
     * (11)
     */
    msoThreeD11(11),
    
    /**
     * (12)
     */
    msoThreeD12(12),
    
    /**
     * (13)
     */
    msoThreeD13(13),
    
    /**
     * (14)
     */
    msoThreeD14(14),
    
    /**
     * (15)
     */
    msoThreeD15(15),
    
    /**
     * (16)
     */
    msoThreeD16(16),
    
    /**
     * (17)
     */
    msoThreeD17(17),
    
    /**
     * (18)
     */
    msoThreeD18(18),
    
    /**
     * (19)
     */
    msoThreeD19(19),
    
    /**
     * (20)
     */
    msoThreeD20(20),
    ;

    private MsoPresetThreeDFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}