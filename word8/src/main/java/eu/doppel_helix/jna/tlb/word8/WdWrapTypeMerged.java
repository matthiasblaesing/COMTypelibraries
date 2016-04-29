
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A1A8CFC6-7D77-3CA4-98EF-A456D50B540D})</p>
 */
public enum WdWrapTypeMerged implements IComEnum {
    
    /**
     * (0)
     */
    wdWrapMergeInline(0),
    
    /**
     * (1)
     */
    wdWrapMergeSquare(1),
    
    /**
     * (2)
     */
    wdWrapMergeTight(2),
    
    /**
     * (3)
     */
    wdWrapMergeBehind(3),
    
    /**
     * (4)
     */
    wdWrapMergeFront(4),
    
    /**
     * (5)
     */
    wdWrapMergeThrough(5),
    
    /**
     * (6)
     */
    wdWrapMergeTopBottom(6),
    ;

    private WdWrapTypeMerged(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}