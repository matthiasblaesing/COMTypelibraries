
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B1F5A6AB-437D-319F-8B38-0E087D112FEA})</p>
 */
public enum WdColorIndex implements IComEnum {
    
    /**
     * (0)
     */
    wdAuto(0),
    
    /**
     * (1)
     */
    wdBlack(1),
    
    /**
     * (2)
     */
    wdBlue(2),
    
    /**
     * (3)
     */
    wdTurquoise(3),
    
    /**
     * (4)
     */
    wdBrightGreen(4),
    
    /**
     * (5)
     */
    wdPink(5),
    
    /**
     * (6)
     */
    wdRed(6),
    
    /**
     * (7)
     */
    wdYellow(7),
    
    /**
     * (8)
     */
    wdWhite(8),
    
    /**
     * (9)
     */
    wdDarkBlue(9),
    
    /**
     * (10)
     */
    wdTeal(10),
    
    /**
     * (11)
     */
    wdGreen(11),
    
    /**
     * (12)
     */
    wdViolet(12),
    
    /**
     * (13)
     */
    wdDarkRed(13),
    
    /**
     * (14)
     */
    wdDarkYellow(14),
    
    /**
     * (15)
     */
    wdGray50(15),
    
    /**
     * (16)
     */
    wdGray25(16),
    
    /**
     * (-1)
     */
    wdByAuthor(-1),
    
    /**
     * (0)
     */
    wdNoHighlight(0),
    ;

    private WdColorIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}