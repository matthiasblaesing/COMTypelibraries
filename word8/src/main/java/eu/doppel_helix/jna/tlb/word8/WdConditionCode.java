
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1D415254-6D7E-315C-86CC-90A641A57703})</p>
 */
public enum WdConditionCode implements IComEnum {
    
    /**
     * (0)
     */
    wdFirstRow(0),
    
    /**
     * (1)
     */
    wdLastRow(1),
    
    /**
     * (2)
     */
    wdOddRowBanding(2),
    
    /**
     * (3)
     */
    wdEvenRowBanding(3),
    
    /**
     * (4)
     */
    wdFirstColumn(4),
    
    /**
     * (5)
     */
    wdLastColumn(5),
    
    /**
     * (6)
     */
    wdOddColumnBanding(6),
    
    /**
     * (7)
     */
    wdEvenColumnBanding(7),
    
    /**
     * (8)
     */
    wdNECell(8),
    
    /**
     * (9)
     */
    wdNWCell(9),
    
    /**
     * (10)
     */
    wdSECell(10),
    
    /**
     * (11)
     */
    wdSWCell(11),
    ;

    private WdConditionCode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}