
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3A818B51-713A-3E63-91A4-287C06E75F3C})</p>
 */
public enum WdCellVerticalAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdCellAlignVerticalTop(0),
    
    /**
     * (1)
     */
    wdCellAlignVerticalCenter(1),
    
    /**
     * (3)
     */
    wdCellAlignVerticalBottom(3),
    ;

    private WdCellVerticalAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}