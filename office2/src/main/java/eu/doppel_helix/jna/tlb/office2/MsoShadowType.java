
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoShadowType implements IComEnum {
    
    /**
     * (-2)
     */
    msoShadowMixed(-2),
    
    /**
     * (1)
     */
    msoShadow1(1),
    
    /**
     * (2)
     */
    msoShadow2(2),
    
    /**
     * (3)
     */
    msoShadow3(3),
    
    /**
     * (4)
     */
    msoShadow4(4),
    
    /**
     * (5)
     */
    msoShadow5(5),
    
    /**
     * (6)
     */
    msoShadow6(6),
    
    /**
     * (7)
     */
    msoShadow7(7),
    
    /**
     * (8)
     */
    msoShadow8(8),
    
    /**
     * (9)
     */
    msoShadow9(9),
    
    /**
     * (10)
     */
    msoShadow10(10),
    
    /**
     * (11)
     */
    msoShadow11(11),
    
    /**
     * (12)
     */
    msoShadow12(12),
    
    /**
     * (13)
     */
    msoShadow13(13),
    
    /**
     * (14)
     */
    msoShadow14(14),
    
    /**
     * (15)
     */
    msoShadow15(15),
    
    /**
     * (16)
     */
    msoShadow16(16),
    
    /**
     * (17)
     */
    msoShadow17(17),
    
    /**
     * (18)
     */
    msoShadow18(18),
    
    /**
     * (19)
     */
    msoShadow19(19),
    
    /**
     * (20)
     */
    msoShadow20(20),
    
    /**
     * (21)
     */
    msoShadow21(21),
    
    /**
     * (22)
     */
    msoShadow22(22),
    
    /**
     * (23)
     */
    msoShadow23(23),
    
    /**
     * (24)
     */
    msoShadow24(24),
    
    /**
     * (25)
     */
    msoShadow25(25),
    
    /**
     * (26)
     */
    msoShadow26(26),
    
    /**
     * (27)
     */
    msoShadow27(27),
    
    /**
     * (28)
     */
    msoShadow28(28),
    
    /**
     * (29)
     */
    msoShadow29(29),
    
    /**
     * (30)
     */
    msoShadow30(30),
    
    /**
     * (31)
     */
    msoShadow31(31),
    
    /**
     * (32)
     */
    msoShadow32(32),
    
    /**
     * (33)
     */
    msoShadow33(33),
    
    /**
     * (34)
     */
    msoShadow34(34),
    
    /**
     * (35)
     */
    msoShadow35(35),
    
    /**
     * (36)
     */
    msoShadow36(36),
    
    /**
     * (37)
     */
    msoShadow37(37),
    
    /**
     * (38)
     */
    msoShadow38(38),
    
    /**
     * (39)
     */
    msoShadow39(39),
    
    /**
     * (40)
     */
    msoShadow40(40),
    
    /**
     * (41)
     */
    msoShadow41(41),
    
    /**
     * (42)
     */
    msoShadow42(42),
    
    /**
     * (43)
     */
    msoShadow43(43),
    ;

    private MsoShadowType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}