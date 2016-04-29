
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlConstants implements IComEnum {
    
    /**
     * (-4105)
     */
    xlAutomatic(-4105),
    
    /**
     * (-4111)
     */
    xlCombination(-4111),
    
    /**
     * (-4114)
     */
    xlCustom(-4114),
    
    /**
     * (2)
     */
    xlBar(2),
    
    /**
     * (3)
     */
    xlColumn(3),
    
    /**
     * (-4099)
     */
    xl3DBar(-4099),
    
    /**
     * (-4103)
     */
    xl3DSurface(-4103),
    
    /**
     * (-1)
     */
    xlDefaultAutoFormat(-1),
    
    /**
     * (-4142)
     */
    xlNone(-4142),
    
    /**
     * (0)
     */
    xlAbove(0),
    
    /**
     * (1)
     */
    xlBelow(1),
    
    /**
     * (1)
     */
    xlBoth(1),
    
    /**
     * (-4107)
     */
    xlBottom(-4107),
    
    /**
     * (-4108)
     */
    xlCenter(-4108),
    
    /**
     * (9)
     */
    xlChecker(9),
    
    /**
     * (8)
     */
    xlCircle(8),
    
    /**
     * (2)
     */
    xlCorner(2),
    
    /**
     * (16)
     */
    xlCrissCross(16),
    
    /**
     * (4)
     */
    xlCross(4),
    
    /**
     * (2)
     */
    xlDiamond(2),
    
    /**
     * (-4117)
     */
    xlDistributed(-4117),
    
    /**
     * (5)
     */
    xlFill(5),
    
    /**
     * (1)
     */
    xlFixedValue(1),
    
    /**
     * (1)
     */
    xlGeneral(1),
    
    /**
     * (17)
     */
    xlGray16(17),
    
    /**
     * (-4124)
     */
    xlGray25(-4124),
    
    /**
     * (-4125)
     */
    xlGray50(-4125),
    
    /**
     * (-4126)
     */
    xlGray75(-4126),
    
    /**
     * (18)
     */
    xlGray8(18),
    
    /**
     * (15)
     */
    xlGrid(15),
    
    /**
     * (-4127)
     */
    xlHigh(-4127),
    
    /**
     * (2)
     */
    xlInside(2),
    
    /**
     * (-4130)
     */
    xlJustify(-4130),
    
    /**
     * (-4131)
     */
    xlLeft(-4131),
    
    /**
     * (13)
     */
    xlLightDown(13),
    
    /**
     * (11)
     */
    xlLightHorizontal(11),
    
    /**
     * (14)
     */
    xlLightUp(14),
    
    /**
     * (12)
     */
    xlLightVertical(12),
    
    /**
     * (-4134)
     */
    xlLow(-4134),
    
    /**
     * (2)
     */
    xlMaximum(2),
    
    /**
     * (4)
     */
    xlMinimum(4),
    
    /**
     * (3)
     */
    xlMinusValues(3),
    
    /**
     * (4)
     */
    xlNextToAxis(4),
    
    /**
     * (3)
     */
    xlOpaque(3),
    
    /**
     * (3)
     */
    xlOutside(3),
    
    /**
     * (2)
     */
    xlPercent(2),
    
    /**
     * (9)
     */
    xlPlus(9),
    
    /**
     * (2)
     */
    xlPlusValues(2),
    
    /**
     * (-4152)
     */
    xlRight(-4152),
    
    /**
     * (3)
     */
    xlScale(3),
    
    /**
     * (10)
     */
    xlSemiGray75(10),
    
    /**
     * (4)
     */
    xlShowLabel(4),
    
    /**
     * (5)
     */
    xlShowLabelAndPercent(5),
    
    /**
     * (3)
     */
    xlShowPercent(3),
    
    /**
     * (2)
     */
    xlShowValue(2),
    
    /**
     * (2)
     */
    xlSingle(2),
    
    /**
     * (1)
     */
    xlSolid(1),
    
    /**
     * (1)
     */
    xlSquare(1),
    
    /**
     * (5)
     */
    xlStar(5),
    
    /**
     * (4)
     */
    xlStError(4),
    
    /**
     * (-4160)
     */
    xlTop(-4160),
    
    /**
     * (2)
     */
    xlTransparent(2),
    
    /**
     * (3)
     */
    xlTriangle(3),
    ;

    private XlConstants(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}