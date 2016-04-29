
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BC173C05-2DF7-314F-8087-7CF97F5BE921})</p>
 */
public enum WdFramesetSizeType implements IComEnum {
    
    /**
     * (0)
     */
    wdFramesetSizeTypePercent(0),
    
    /**
     * (1)
     */
    wdFramesetSizeTypeFixed(1),
    
    /**
     * (2)
     */
    wdFramesetSizeTypeRelative(2),
    ;

    private WdFramesetSizeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}