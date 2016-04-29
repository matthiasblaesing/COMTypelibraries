
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B116B479-488C-3D69-BFBE-A64DD14F3BB9})</p>
 */
public enum WdCustomLabelPageSize implements IComEnum {
    
    /**
     * (0)
     */
    wdCustomLabelLetter(0),
    
    /**
     * (1)
     */
    wdCustomLabelLetterLS(1),
    
    /**
     * (2)
     */
    wdCustomLabelA4(2),
    
    /**
     * (3)
     */
    wdCustomLabelA4LS(3),
    
    /**
     * (4)
     */
    wdCustomLabelA5(4),
    
    /**
     * (5)
     */
    wdCustomLabelA5LS(5),
    
    /**
     * (6)
     */
    wdCustomLabelB5(6),
    
    /**
     * (7)
     */
    wdCustomLabelMini(7),
    
    /**
     * (8)
     */
    wdCustomLabelFanfold(8),
    
    /**
     * (9)
     */
    wdCustomLabelVertHalfSheet(9),
    
    /**
     * (10)
     */
    wdCustomLabelVertHalfSheetLS(10),
    
    /**
     * (11)
     */
    wdCustomLabelHigaki(11),
    
    /**
     * (12)
     */
    wdCustomLabelHigakiLS(12),
    
    /**
     * (13)
     */
    wdCustomLabelB4JIS(13),
    ;

    private WdCustomLabelPageSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}