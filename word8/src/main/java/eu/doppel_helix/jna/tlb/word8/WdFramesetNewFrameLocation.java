
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B2762291-75F1-39D6-9297-6B8F6DD6A271})</p>
 */
public enum WdFramesetNewFrameLocation implements IComEnum {
    
    /**
     * (0)
     */
    wdFramesetNewFrameAbove(0),
    
    /**
     * (1)
     */
    wdFramesetNewFrameBelow(1),
    
    /**
     * (2)
     */
    wdFramesetNewFrameRight(2),
    
    /**
     * (3)
     */
    wdFramesetNewFrameLeft(3),
    ;

    private WdFramesetNewFrameLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}