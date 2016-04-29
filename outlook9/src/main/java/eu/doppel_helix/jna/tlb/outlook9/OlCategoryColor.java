
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlCategoryColor implements IComEnum {
    
    /**
     * (0)
     */
    olCategoryColorNone(0),
    
    /**
     * (1)
     */
    olCategoryColorRed(1),
    
    /**
     * (2)
     */
    olCategoryColorOrange(2),
    
    /**
     * (3)
     */
    olCategoryColorPeach(3),
    
    /**
     * (4)
     */
    olCategoryColorYellow(4),
    
    /**
     * (5)
     */
    olCategoryColorGreen(5),
    
    /**
     * (6)
     */
    olCategoryColorTeal(6),
    
    /**
     * (7)
     */
    olCategoryColorOlive(7),
    
    /**
     * (8)
     */
    olCategoryColorBlue(8),
    
    /**
     * (9)
     */
    olCategoryColorPurple(9),
    
    /**
     * (10)
     */
    olCategoryColorMaroon(10),
    
    /**
     * (11)
     */
    olCategoryColorSteel(11),
    
    /**
     * (12)
     */
    olCategoryColorDarkSteel(12),
    
    /**
     * (13)
     */
    olCategoryColorGray(13),
    
    /**
     * (14)
     */
    olCategoryColorDarkGray(14),
    
    /**
     * (15)
     */
    olCategoryColorBlack(15),
    
    /**
     * (16)
     */
    olCategoryColorDarkRed(16),
    
    /**
     * (17)
     */
    olCategoryColorDarkOrange(17),
    
    /**
     * (18)
     */
    olCategoryColorDarkPeach(18),
    
    /**
     * (19)
     */
    olCategoryColorDarkYellow(19),
    
    /**
     * (20)
     */
    olCategoryColorDarkGreen(20),
    
    /**
     * (21)
     */
    olCategoryColorDarkTeal(21),
    
    /**
     * (22)
     */
    olCategoryColorDarkOlive(22),
    
    /**
     * (23)
     */
    olCategoryColorDarkBlue(23),
    
    /**
     * (24)
     */
    olCategoryColorDarkPurple(24),
    
    /**
     * (25)
     */
    olCategoryColorDarkMaroon(25),
    ;

    private OlCategoryColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}