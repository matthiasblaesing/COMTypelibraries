
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPattern implements IComEnum {
    
    /**
     * (-4105)
     */
    xlPatternAutomatic(-4105),
    
    /**
     * (9)
     */
    xlPatternChecker(9),
    
    /**
     * (16)
     */
    xlPatternCrissCross(16),
    
    /**
     * (-4121)
     */
    xlPatternDown(-4121),
    
    /**
     * (17)
     */
    xlPatternGray16(17),
    
    /**
     * (-4124)
     */
    xlPatternGray25(-4124),
    
    /**
     * (-4125)
     */
    xlPatternGray50(-4125),
    
    /**
     * (-4126)
     */
    xlPatternGray75(-4126),
    
    /**
     * (18)
     */
    xlPatternGray8(18),
    
    /**
     * (15)
     */
    xlPatternGrid(15),
    
    /**
     * (-4128)
     */
    xlPatternHorizontal(-4128),
    
    /**
     * (13)
     */
    xlPatternLightDown(13),
    
    /**
     * (11)
     */
    xlPatternLightHorizontal(11),
    
    /**
     * (14)
     */
    xlPatternLightUp(14),
    
    /**
     * (12)
     */
    xlPatternLightVertical(12),
    
    /**
     * (-4142)
     */
    xlPatternNone(-4142),
    
    /**
     * (10)
     */
    xlPatternSemiGray75(10),
    
    /**
     * (1)
     */
    xlPatternSolid(1),
    
    /**
     * (-4162)
     */
    xlPatternUp(-4162),
    
    /**
     * (-4166)
     */
    xlPatternVertical(-4166),
    
    /**
     * (4000)
     */
    xlPatternLinearGradient(4000),
    
    /**
     * (4001)
     */
    xlPatternRectangularGradient(4001),
    ;

    private XlPattern(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}