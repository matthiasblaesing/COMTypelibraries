
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlColor implements IComEnum {
    
    /**
     * (0)
     */
    olAutoColor(0),
    
    /**
     * (1)
     */
    olColorBlack(1),
    
    /**
     * (2)
     */
    olColorMaroon(2),
    
    /**
     * (3)
     */
    olColorGreen(3),
    
    /**
     * (4)
     */
    olColorOlive(4),
    
    /**
     * (5)
     */
    olColorNavy(5),
    
    /**
     * (6)
     */
    olColorPurple(6),
    
    /**
     * (7)
     */
    olColorTeal(7),
    
    /**
     * (8)
     */
    olColorGray(8),
    
    /**
     * (9)
     */
    olColorSilver(9),
    
    /**
     * (10)
     */
    olColorRed(10),
    
    /**
     * (11)
     */
    olColorLime(11),
    
    /**
     * (12)
     */
    olColorYellow(12),
    
    /**
     * (13)
     */
    olColorBlue(13),
    
    /**
     * (14)
     */
    olColorFuchsia(14),
    
    /**
     * (15)
     */
    olColorAqua(15),
    
    /**
     * (16)
     */
    olColorWhite(16),
    ;

    private OlColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}