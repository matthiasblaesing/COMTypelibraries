
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlIcon implements IComEnum {
    
    /**
     * (-1)
     */
    xlIconNoCellIcon(-1),
    
    /**
     * (1)
     */
    xlIconGreenUpArrow(1),
    
    /**
     * (2)
     */
    xlIconYellowSideArrow(2),
    
    /**
     * (3)
     */
    xlIconRedDownArrow(3),
    
    /**
     * (4)
     */
    xlIconGrayUpArrow(4),
    
    /**
     * (5)
     */
    xlIconGraySideArrow(5),
    
    /**
     * (6)
     */
    xlIconGrayDownArrow(6),
    
    /**
     * (7)
     */
    xlIconGreenFlag(7),
    
    /**
     * (8)
     */
    xlIconYellowFlag(8),
    
    /**
     * (9)
     */
    xlIconRedFlag(9),
    
    /**
     * (10)
     */
    xlIconGreenCircle(10),
    
    /**
     * (11)
     */
    xlIconYellowCircle(11),
    
    /**
     * (12)
     */
    xlIconRedCircleWithBorder(12),
    
    /**
     * (13)
     */
    xlIconBlackCircleWithBorder(13),
    
    /**
     * (14)
     */
    xlIconGreenTrafficLight(14),
    
    /**
     * (15)
     */
    xlIconYellowTrafficLight(15),
    
    /**
     * (16)
     */
    xlIconRedTrafficLight(16),
    
    /**
     * (17)
     */
    xlIconYellowTriangle(17),
    
    /**
     * (18)
     */
    xlIconRedDiamond(18),
    
    /**
     * (19)
     */
    xlIconGreenCheckSymbol(19),
    
    /**
     * (20)
     */
    xlIconYellowExclamationSymbol(20),
    
    /**
     * (21)
     */
    xlIconRedCrossSymbol(21),
    
    /**
     * (22)
     */
    xlIconGreenCheck(22),
    
    /**
     * (23)
     */
    xlIconYellowExclamation(23),
    
    /**
     * (24)
     */
    xlIconRedCross(24),
    
    /**
     * (25)
     */
    xlIconYellowUpInclineArrow(25),
    
    /**
     * (26)
     */
    xlIconYellowDownInclineArrow(26),
    
    /**
     * (27)
     */
    xlIconGrayUpInclineArrow(27),
    
    /**
     * (28)
     */
    xlIconGrayDownInclineArrow(28),
    
    /**
     * (29)
     */
    xlIconRedCircle(29),
    
    /**
     * (30)
     */
    xlIconPinkCircle(30),
    
    /**
     * (31)
     */
    xlIconGrayCircle(31),
    
    /**
     * (32)
     */
    xlIconBlackCircle(32),
    
    /**
     * (33)
     */
    xlIconCircleWithOneWhiteQuarter(33),
    
    /**
     * (34)
     */
    xlIconCircleWithTwoWhiteQuarters(34),
    
    /**
     * (35)
     */
    xlIconCircleWithThreeWhiteQuarters(35),
    
    /**
     * (36)
     */
    xlIconWhiteCircleAllWhiteQuarters(36),
    
    /**
     * (37)
     */
    xlIcon0Bars(37),
    
    /**
     * (38)
     */
    xlIcon1Bar(38),
    
    /**
     * (39)
     */
    xlIcon2Bars(39),
    
    /**
     * (40)
     */
    xlIcon3Bars(40),
    
    /**
     * (41)
     */
    xlIcon4Bars(41),
    
    /**
     * (42)
     */
    xlIconGoldStar(42),
    
    /**
     * (43)
     */
    xlIconHalfGoldStar(43),
    
    /**
     * (44)
     */
    xlIconSilverStar(44),
    
    /**
     * (45)
     */
    xlIconGreenUpTriangle(45),
    
    /**
     * (46)
     */
    xlIconYellowDash(46),
    
    /**
     * (47)
     */
    xlIconRedDownTriangle(47),
    
    /**
     * (48)
     */
    xlIcon4FilledBoxes(48),
    
    /**
     * (49)
     */
    xlIcon3FilledBoxes(49),
    
    /**
     * (50)
     */
    xlIcon2FilledBoxes(50),
    
    /**
     * (51)
     */
    xlIcon1FilledBox(51),
    
    /**
     * (52)
     */
    xlIcon0FilledBoxes(52),
    ;

    private XlIcon(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}