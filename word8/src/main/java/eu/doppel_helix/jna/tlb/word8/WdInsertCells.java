
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({887C8129-94D1-3466-957E-664470F13D3F})</p>
 */
public enum WdInsertCells implements IComEnum {
    
    /**
     * (0)
     */
    wdInsertCellsShiftRight(0),
    
    /**
     * (1)
     */
    wdInsertCellsShiftDown(1),
    
    /**
     * (2)
     */
    wdInsertCellsEntireRow(2),
    
    /**
     * (3)
     */
    wdInsertCellsEntireColumn(3),
    ;

    private WdInsertCells(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}