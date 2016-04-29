
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoWarpFormat implements IComEnum {
    
    /**
     * (-2)
     */
    msoWarpFormatMixed(-2),
    
    /**
     * (0)
     */
    msoWarpFormat1(0),
    
    /**
     * (1)
     */
    msoWarpFormat2(1),
    
    /**
     * (2)
     */
    msoWarpFormat3(2),
    
    /**
     * (3)
     */
    msoWarpFormat4(3),
    
    /**
     * (4)
     */
    msoWarpFormat5(4),
    
    /**
     * (5)
     */
    msoWarpFormat6(5),
    
    /**
     * (6)
     */
    msoWarpFormat7(6),
    
    /**
     * (7)
     */
    msoWarpFormat8(7),
    
    /**
     * (8)
     */
    msoWarpFormat9(8),
    
    /**
     * (9)
     */
    msoWarpFormat10(9),
    
    /**
     * (10)
     */
    msoWarpFormat11(10),
    
    /**
     * (11)
     */
    msoWarpFormat12(11),
    
    /**
     * (12)
     */
    msoWarpFormat13(12),
    
    /**
     * (13)
     */
    msoWarpFormat14(13),
    
    /**
     * (14)
     */
    msoWarpFormat15(14),
    
    /**
     * (15)
     */
    msoWarpFormat16(15),
    
    /**
     * (16)
     */
    msoWarpFormat17(16),
    
    /**
     * (17)
     */
    msoWarpFormat18(17),
    
    /**
     * (18)
     */
    msoWarpFormat19(18),
    
    /**
     * (19)
     */
    msoWarpFormat20(19),
    
    /**
     * (20)
     */
    msoWarpFormat21(20),
    
    /**
     * (21)
     */
    msoWarpFormat22(21),
    
    /**
     * (22)
     */
    msoWarpFormat23(22),
    
    /**
     * (23)
     */
    msoWarpFormat24(23),
    
    /**
     * (24)
     */
    msoWarpFormat25(24),
    
    /**
     * (25)
     */
    msoWarpFormat26(25),
    
    /**
     * (26)
     */
    msoWarpFormat27(26),
    
    /**
     * (27)
     */
    msoWarpFormat28(27),
    
    /**
     * (28)
     */
    msoWarpFormat29(28),
    
    /**
     * (29)
     */
    msoWarpFormat30(29),
    
    /**
     * (30)
     */
    msoWarpFormat31(30),
    
    /**
     * (31)
     */
    msoWarpFormat32(31),
    
    /**
     * (32)
     */
    msoWarpFormat33(32),
    
    /**
     * (33)
     */
    msoWarpFormat34(33),
    
    /**
     * (34)
     */
    msoWarpFormat35(34),
    
    /**
     * (35)
     */
    msoWarpFormat36(35),
    
    /**
     * (36)
     */
    msoWarpFormat37(36),
    ;

    private MsoWarpFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}