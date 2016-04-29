
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetTextEffect implements IComEnum {
    
    /**
     * (-2)
     */
    msoTextEffectMixed(-2),
    
    /**
     * (0)
     */
    msoTextEffect1(0),
    
    /**
     * (1)
     */
    msoTextEffect2(1),
    
    /**
     * (2)
     */
    msoTextEffect3(2),
    
    /**
     * (3)
     */
    msoTextEffect4(3),
    
    /**
     * (4)
     */
    msoTextEffect5(4),
    
    /**
     * (5)
     */
    msoTextEffect6(5),
    
    /**
     * (6)
     */
    msoTextEffect7(6),
    
    /**
     * (7)
     */
    msoTextEffect8(7),
    
    /**
     * (8)
     */
    msoTextEffect9(8),
    
    /**
     * (9)
     */
    msoTextEffect10(9),
    
    /**
     * (10)
     */
    msoTextEffect11(10),
    
    /**
     * (11)
     */
    msoTextEffect12(11),
    
    /**
     * (12)
     */
    msoTextEffect13(12),
    
    /**
     * (13)
     */
    msoTextEffect14(13),
    
    /**
     * (14)
     */
    msoTextEffect15(14),
    
    /**
     * (15)
     */
    msoTextEffect16(15),
    
    /**
     * (16)
     */
    msoTextEffect17(16),
    
    /**
     * (17)
     */
    msoTextEffect18(17),
    
    /**
     * (18)
     */
    msoTextEffect19(18),
    
    /**
     * (19)
     */
    msoTextEffect20(19),
    
    /**
     * (20)
     */
    msoTextEffect21(20),
    
    /**
     * (21)
     */
    msoTextEffect22(21),
    
    /**
     * (22)
     */
    msoTextEffect23(22),
    
    /**
     * (23)
     */
    msoTextEffect24(23),
    
    /**
     * (24)
     */
    msoTextEffect25(24),
    
    /**
     * (25)
     */
    msoTextEffect26(25),
    
    /**
     * (26)
     */
    msoTextEffect27(26),
    
    /**
     * (27)
     */
    msoTextEffect28(27),
    
    /**
     * (28)
     */
    msoTextEffect29(28),
    
    /**
     * (29)
     */
    msoTextEffect30(29),
    
    /**
     * (30)
     */
    msoTextEffect31(30),
    
    /**
     * (31)
     */
    msoTextEffect32(31),
    
    /**
     * (32)
     */
    msoTextEffect33(32),
    
    /**
     * (33)
     */
    msoTextEffect34(33),
    
    /**
     * (34)
     */
    msoTextEffect35(34),
    
    /**
     * (35)
     */
    msoTextEffect36(35),
    
    /**
     * (36)
     */
    msoTextEffect37(36),
    
    /**
     * (37)
     */
    msoTextEffect38(37),
    
    /**
     * (38)
     */
    msoTextEffect39(38),
    
    /**
     * (39)
     */
    msoTextEffect40(39),
    
    /**
     * (40)
     */
    msoTextEffect41(40),
    
    /**
     * (41)
     */
    msoTextEffect42(41),
    
    /**
     * (42)
     */
    msoTextEffect43(42),
    
    /**
     * (43)
     */
    msoTextEffect44(43),
    
    /**
     * (44)
     */
    msoTextEffect45(44),
    
    /**
     * (45)
     */
    msoTextEffect46(45),
    
    /**
     * (46)
     */
    msoTextEffect47(46),
    
    /**
     * (47)
     */
    msoTextEffect48(47),
    
    /**
     * (48)
     */
    msoTextEffect49(48),
    
    /**
     * (49)
     */
    msoTextEffect50(49),
    ;

    private MsoPresetTextEffect(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}