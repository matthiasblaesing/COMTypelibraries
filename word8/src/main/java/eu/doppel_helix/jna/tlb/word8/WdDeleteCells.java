
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({01F6710A-249D-3A35-A3B4-FCBF42BF72FA})</p>
 */
public enum WdDeleteCells implements IComEnum {
    
    /**
     * (0)
     */
    wdDeleteCellsShiftLeft(0),
    
    /**
     * (1)
     */
    wdDeleteCellsShiftUp(1),
    
    /**
     * (2)
     */
    wdDeleteCellsEntireRow(2),
    
    /**
     * (3)
     */
    wdDeleteCellsEntireColumn(3),
    ;

    private WdDeleteCells(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}