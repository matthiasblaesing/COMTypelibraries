
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoNumberedBulletStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoBulletStyleMixed(-2),
    
    /**
     * (0)
     */
    msoBulletAlphaLCPeriod(0),
    
    /**
     * (1)
     */
    msoBulletAlphaUCPeriod(1),
    
    /**
     * (2)
     */
    msoBulletArabicParenRight(2),
    
    /**
     * (3)
     */
    msoBulletArabicPeriod(3),
    
    /**
     * (4)
     */
    msoBulletRomanLCParenBoth(4),
    
    /**
     * (5)
     */
    msoBulletRomanLCParenRight(5),
    
    /**
     * (6)
     */
    msoBulletRomanLCPeriod(6),
    
    /**
     * (7)
     */
    msoBulletRomanUCPeriod(7),
    
    /**
     * (8)
     */
    msoBulletAlphaLCParenBoth(8),
    
    /**
     * (9)
     */
    msoBulletAlphaLCParenRight(9),
    
    /**
     * (10)
     */
    msoBulletAlphaUCParenBoth(10),
    
    /**
     * (11)
     */
    msoBulletAlphaUCParenRight(11),
    
    /**
     * (12)
     */
    msoBulletArabicParenBoth(12),
    
    /**
     * (13)
     */
    msoBulletArabicPlain(13),
    
    /**
     * (14)
     */
    msoBulletRomanUCParenBoth(14),
    
    /**
     * (15)
     */
    msoBulletRomanUCParenRight(15),
    
    /**
     * (16)
     */
    msoBulletSimpChinPlain(16),
    
    /**
     * (17)
     */
    msoBulletSimpChinPeriod(17),
    
    /**
     * (18)
     */
    msoBulletCircleNumDBPlain(18),
    
    /**
     * (19)
     */
    msoBulletCircleNumWDWhitePlain(19),
    
    /**
     * (20)
     */
    msoBulletCircleNumWDBlackPlain(20),
    
    /**
     * (21)
     */
    msoBulletTradChinPlain(21),
    
    /**
     * (22)
     */
    msoBulletTradChinPeriod(22),
    
    /**
     * (23)
     */
    msoBulletArabicAlphaDash(23),
    
    /**
     * (24)
     */
    msoBulletArabicAbjadDash(24),
    
    /**
     * (25)
     */
    msoBulletHebrewAlphaDash(25),
    
    /**
     * (26)
     */
    msoBulletKanjiKoreanPlain(26),
    
    /**
     * (27)
     */
    msoBulletKanjiKoreanPeriod(27),
    
    /**
     * (28)
     */
    msoBulletArabicDBPlain(28),
    
    /**
     * (29)
     */
    msoBulletArabicDBPeriod(29),
    
    /**
     * (30)
     */
    msoBulletThaiAlphaPeriod(30),
    
    /**
     * (31)
     */
    msoBulletThaiAlphaParenRight(31),
    
    /**
     * (32)
     */
    msoBulletThaiAlphaParenBoth(32),
    
    /**
     * (33)
     */
    msoBulletThaiNumPeriod(33),
    
    /**
     * (34)
     */
    msoBulletThaiNumParenRight(34),
    
    /**
     * (35)
     */
    msoBulletThaiNumParenBoth(35),
    
    /**
     * (36)
     */
    msoBulletHindiAlphaPeriod(36),
    
    /**
     * (37)
     */
    msoBulletHindiNumPeriod(37),
    
    /**
     * (38)
     */
    msoBulletKanjiSimpChinDBPeriod(38),
    
    /**
     * (39)
     */
    msoBulletHindiNumParenRight(39),
    
    /**
     * (40)
     */
    msoBulletHindiAlpha1Period(40),
    ;

    private MsoNumberedBulletStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}