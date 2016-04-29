
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdLigatures implements IComEnum {
    
    /**
     * (0)
     */
    wdLigaturesNone(0),
    
    /**
     * (1)
     */
    wdLigaturesStandard(1),
    
    /**
     * (2)
     */
    wdLigaturesContextual(2),
    
    /**
     * (4)
     */
    wdLigaturesHistorical(4),
    
    /**
     * (8)
     */
    wdLigaturesDiscretional(8),
    
    /**
     * (3)
     */
    wdLigaturesStandardContextual(3),
    
    /**
     * (5)
     */
    wdLigaturesStandardHistorical(5),
    
    /**
     * (6)
     */
    wdLigaturesContextualHistorical(6),
    
    /**
     * (9)
     */
    wdLigaturesStandardDiscretional(9),
    
    /**
     * (10)
     */
    wdLigaturesContextualDiscretional(10),
    
    /**
     * (12)
     */
    wdLigaturesHistoricalDiscretional(12),
    
    /**
     * (7)
     */
    wdLigaturesStandardContextualHistorical(7),
    
    /**
     * (11)
     */
    wdLigaturesStandardContextualDiscretional(11),
    
    /**
     * (13)
     */
    wdLigaturesStandardHistoricalDiscretional(13),
    
    /**
     * (14)
     */
    wdLigaturesContextualHistoricalDiscretional(14),
    
    /**
     * (15)
     */
    wdLigaturesAll(15),
    ;

    private WdLigatures(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}