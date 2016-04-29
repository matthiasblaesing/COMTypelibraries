
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoShapeStyleIndex implements IComEnum {
    
    /**
     * (-2)
     */
    msoShapeStyleMixed(-2),
    
    /**
     * (0)
     */
    msoShapeStyleNotAPreset(0),
    
    /**
     * (1)
     */
    msoShapeStylePreset1(1),
    
    /**
     * (2)
     */
    msoShapeStylePreset2(2),
    
    /**
     * (3)
     */
    msoShapeStylePreset3(3),
    
    /**
     * (4)
     */
    msoShapeStylePreset4(4),
    
    /**
     * (5)
     */
    msoShapeStylePreset5(5),
    
    /**
     * (6)
     */
    msoShapeStylePreset6(6),
    
    /**
     * (7)
     */
    msoShapeStylePreset7(7),
    
    /**
     * (8)
     */
    msoShapeStylePreset8(8),
    
    /**
     * (9)
     */
    msoShapeStylePreset9(9),
    
    /**
     * (10)
     */
    msoShapeStylePreset10(10),
    
    /**
     * (11)
     */
    msoShapeStylePreset11(11),
    
    /**
     * (12)
     */
    msoShapeStylePreset12(12),
    
    /**
     * (13)
     */
    msoShapeStylePreset13(13),
    
    /**
     * (14)
     */
    msoShapeStylePreset14(14),
    
    /**
     * (15)
     */
    msoShapeStylePreset15(15),
    
    /**
     * (16)
     */
    msoShapeStylePreset16(16),
    
    /**
     * (17)
     */
    msoShapeStylePreset17(17),
    
    /**
     * (18)
     */
    msoShapeStylePreset18(18),
    
    /**
     * (19)
     */
    msoShapeStylePreset19(19),
    
    /**
     * (20)
     */
    msoShapeStylePreset20(20),
    
    /**
     * (21)
     */
    msoShapeStylePreset21(21),
    
    /**
     * (22)
     */
    msoShapeStylePreset22(22),
    
    /**
     * (23)
     */
    msoShapeStylePreset23(23),
    
    /**
     * (24)
     */
    msoShapeStylePreset24(24),
    
    /**
     * (25)
     */
    msoShapeStylePreset25(25),
    
    /**
     * (26)
     */
    msoShapeStylePreset26(26),
    
    /**
     * (27)
     */
    msoShapeStylePreset27(27),
    
    /**
     * (28)
     */
    msoShapeStylePreset28(28),
    
    /**
     * (29)
     */
    msoShapeStylePreset29(29),
    
    /**
     * (30)
     */
    msoShapeStylePreset30(30),
    
    /**
     * (31)
     */
    msoShapeStylePreset31(31),
    
    /**
     * (32)
     */
    msoShapeStylePreset32(32),
    
    /**
     * (33)
     */
    msoShapeStylePreset33(33),
    
    /**
     * (34)
     */
    msoShapeStylePreset34(34),
    
    /**
     * (35)
     */
    msoShapeStylePreset35(35),
    
    /**
     * (36)
     */
    msoShapeStylePreset36(36),
    
    /**
     * (37)
     */
    msoShapeStylePreset37(37),
    
    /**
     * (38)
     */
    msoShapeStylePreset38(38),
    
    /**
     * (39)
     */
    msoShapeStylePreset39(39),
    
    /**
     * (40)
     */
    msoShapeStylePreset40(40),
    
    /**
     * (41)
     */
    msoShapeStylePreset41(41),
    
    /**
     * (42)
     */
    msoShapeStylePreset42(42),
    
    /**
     * (10001)
     */
    msoLineStylePreset1(10001),
    
    /**
     * (10002)
     */
    msoLineStylePreset2(10002),
    
    /**
     * (10003)
     */
    msoLineStylePreset3(10003),
    
    /**
     * (10004)
     */
    msoLineStylePreset4(10004),
    
    /**
     * (10005)
     */
    msoLineStylePreset5(10005),
    
    /**
     * (10006)
     */
    msoLineStylePreset6(10006),
    
    /**
     * (10007)
     */
    msoLineStylePreset7(10007),
    
    /**
     * (10008)
     */
    msoLineStylePreset8(10008),
    
    /**
     * (10009)
     */
    msoLineStylePreset9(10009),
    
    /**
     * (10010)
     */
    msoLineStylePreset10(10010),
    
    /**
     * (10011)
     */
    msoLineStylePreset11(10011),
    
    /**
     * (10012)
     */
    msoLineStylePreset12(10012),
    
    /**
     * (10013)
     */
    msoLineStylePreset13(10013),
    
    /**
     * (10014)
     */
    msoLineStylePreset14(10014),
    
    /**
     * (10015)
     */
    msoLineStylePreset15(10015),
    
    /**
     * (10016)
     */
    msoLineStylePreset16(10016),
    
    /**
     * (10017)
     */
    msoLineStylePreset17(10017),
    
    /**
     * (10018)
     */
    msoLineStylePreset18(10018),
    
    /**
     * (10019)
     */
    msoLineStylePreset19(10019),
    
    /**
     * (10020)
     */
    msoLineStylePreset20(10020),
    
    /**
     * (10021)
     */
    msoLineStylePreset21(10021),
    ;

    private MsoShapeStyleIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}