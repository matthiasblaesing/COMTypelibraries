
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextUnderlineType implements IComEnum {
    
    /**
     * (-2)
     */
    msoUnderlineMixed(-2),
    
    /**
     * (0)
     */
    msoNoUnderline(0),
    
    /**
     * (1)
     */
    msoUnderlineWords(1),
    
    /**
     * (2)
     */
    msoUnderlineSingleLine(2),
    
    /**
     * (3)
     */
    msoUnderlineDoubleLine(3),
    
    /**
     * (4)
     */
    msoUnderlineHeavyLine(4),
    
    /**
     * (5)
     */
    msoUnderlineDottedLine(5),
    
    /**
     * (6)
     */
    msoUnderlineDottedHeavyLine(6),
    
    /**
     * (7)
     */
    msoUnderlineDashLine(7),
    
    /**
     * (8)
     */
    msoUnderlineDashHeavyLine(8),
    
    /**
     * (9)
     */
    msoUnderlineDashLongLine(9),
    
    /**
     * (10)
     */
    msoUnderlineDashLongHeavyLine(10),
    
    /**
     * (11)
     */
    msoUnderlineDotDashLine(11),
    
    /**
     * (12)
     */
    msoUnderlineDotDashHeavyLine(12),
    
    /**
     * (13)
     */
    msoUnderlineDotDotDashLine(13),
    
    /**
     * (14)
     */
    msoUnderlineDotDotDashHeavyLine(14),
    
    /**
     * (15)
     */
    msoUnderlineWavyLine(15),
    
    /**
     * (16)
     */
    msoUnderlineWavyHeavyLine(16),
    
    /**
     * (17)
     */
    msoUnderlineWavyDoubleLine(17),
    ;

    private MsoTextUnderlineType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}