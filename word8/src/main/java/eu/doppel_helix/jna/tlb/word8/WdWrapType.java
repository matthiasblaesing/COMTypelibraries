
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C500DDD8-DC7F-30B8-8816-5D28D9F1DED1})</p>
 */
public enum WdWrapType implements IComEnum {
    
    /**
     * (0)
     */
    wdWrapSquare(0),
    
    /**
     * (1)
     */
    wdWrapTight(1),
    
    /**
     * (2)
     */
    wdWrapThrough(2),
    
    /**
     * (3)
     */
    wdWrapNone(3),
    
    /**
     * (4)
     */
    wdWrapTopBottom(4),
    
    /**
     * (5)
     */
    wdWrapBehind(5),
    
    /**
     * (3)
     */
    wdWrapFront(3),
    
    /**
     * (7)
     */
    wdWrapInline(7),
    ;

    private WdWrapType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}