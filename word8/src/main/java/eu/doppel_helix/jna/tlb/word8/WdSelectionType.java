
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({475FDD97-B63F-3209-8EB6-7250FE13BCDF})</p>
 */
public enum WdSelectionType implements IComEnum {
    
    /**
     * (0)
     */
    wdNoSelection(0),
    
    /**
     * (1)
     */
    wdSelectionIP(1),
    
    /**
     * (2)
     */
    wdSelectionNormal(2),
    
    /**
     * (3)
     */
    wdSelectionFrame(3),
    
    /**
     * (4)
     */
    wdSelectionColumn(4),
    
    /**
     * (5)
     */
    wdSelectionRow(5),
    
    /**
     * (6)
     */
    wdSelectionBlock(6),
    
    /**
     * (7)
     */
    wdSelectionInlineShape(7),
    
    /**
     * (8)
     */
    wdSelectionShape(8),
    ;

    private WdSelectionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}