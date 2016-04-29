
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPatternType implements IComEnum {
    
    /**
     * (-2)
     */
    msoPatternMixed(-2),
    
    /**
     * (1)
     */
    msoPattern5Percent(1),
    
    /**
     * (2)
     */
    msoPattern10Percent(2),
    
    /**
     * (3)
     */
    msoPattern20Percent(3),
    
    /**
     * (4)
     */
    msoPattern25Percent(4),
    
    /**
     * (5)
     */
    msoPattern30Percent(5),
    
    /**
     * (6)
     */
    msoPattern40Percent(6),
    
    /**
     * (7)
     */
    msoPattern50Percent(7),
    
    /**
     * (8)
     */
    msoPattern60Percent(8),
    
    /**
     * (9)
     */
    msoPattern70Percent(9),
    
    /**
     * (10)
     */
    msoPattern75Percent(10),
    
    /**
     * (11)
     */
    msoPattern80Percent(11),
    
    /**
     * (12)
     */
    msoPattern90Percent(12),
    
    /**
     * (13)
     */
    msoPatternDarkHorizontal(13),
    
    /**
     * (14)
     */
    msoPatternDarkVertical(14),
    
    /**
     * (15)
     */
    msoPatternDarkDownwardDiagonal(15),
    
    /**
     * (16)
     */
    msoPatternDarkUpwardDiagonal(16),
    
    /**
     * (17)
     */
    msoPatternSmallCheckerBoard(17),
    
    /**
     * (18)
     */
    msoPatternTrellis(18),
    
    /**
     * (19)
     */
    msoPatternLightHorizontal(19),
    
    /**
     * (20)
     */
    msoPatternLightVertical(20),
    
    /**
     * (21)
     */
    msoPatternLightDownwardDiagonal(21),
    
    /**
     * (22)
     */
    msoPatternLightUpwardDiagonal(22),
    
    /**
     * (23)
     */
    msoPatternSmallGrid(23),
    
    /**
     * (24)
     */
    msoPatternDottedDiamond(24),
    
    /**
     * (25)
     */
    msoPatternWideDownwardDiagonal(25),
    
    /**
     * (26)
     */
    msoPatternWideUpwardDiagonal(26),
    
    /**
     * (27)
     */
    msoPatternDashedUpwardDiagonal(27),
    
    /**
     * (28)
     */
    msoPatternDashedDownwardDiagonal(28),
    
    /**
     * (29)
     */
    msoPatternNarrowVertical(29),
    
    /**
     * (30)
     */
    msoPatternNarrowHorizontal(30),
    
    /**
     * (31)
     */
    msoPatternDashedVertical(31),
    
    /**
     * (32)
     */
    msoPatternDashedHorizontal(32),
    
    /**
     * (33)
     */
    msoPatternLargeConfetti(33),
    
    /**
     * (34)
     */
    msoPatternLargeGrid(34),
    
    /**
     * (35)
     */
    msoPatternHorizontalBrick(35),
    
    /**
     * (36)
     */
    msoPatternLargeCheckerBoard(36),
    
    /**
     * (37)
     */
    msoPatternSmallConfetti(37),
    
    /**
     * (38)
     */
    msoPatternZigZag(38),
    
    /**
     * (39)
     */
    msoPatternSolidDiamond(39),
    
    /**
     * (40)
     */
    msoPatternDiagonalBrick(40),
    
    /**
     * (41)
     */
    msoPatternOutlinedDiamond(41),
    
    /**
     * (42)
     */
    msoPatternPlaid(42),
    
    /**
     * (43)
     */
    msoPatternSphere(43),
    
    /**
     * (44)
     */
    msoPatternWeave(44),
    
    /**
     * (45)
     */
    msoPatternDottedGrid(45),
    
    /**
     * (46)
     */
    msoPatternDivot(46),
    
    /**
     * (47)
     */
    msoPatternShingle(47),
    
    /**
     * (48)
     */
    msoPatternWave(48),
    
    /**
     * (49)
     */
    msoPatternHorizontal(49),
    
    /**
     * (50)
     */
    msoPatternVertical(50),
    
    /**
     * (51)
     */
    msoPatternCross(51),
    
    /**
     * (52)
     */
    msoPatternDownwardDiagonal(52),
    
    /**
     * (53)
     */
    msoPatternUpwardDiagonal(53),
    
    /**
     * (54)
     */
    msoPatternDiagonalCross(54),
    ;

    private MsoPatternType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}