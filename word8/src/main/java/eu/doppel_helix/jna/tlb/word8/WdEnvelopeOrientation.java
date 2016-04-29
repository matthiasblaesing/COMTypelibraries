
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({07D962DD-B8BD-3B64-93B5-804E4692204E})</p>
 */
public enum WdEnvelopeOrientation implements IComEnum {
    
    /**
     * (0)
     */
    wdLeftPortrait(0),
    
    /**
     * (1)
     */
    wdCenterPortrait(1),
    
    /**
     * (2)
     */
    wdRightPortrait(2),
    
    /**
     * (3)
     */
    wdLeftLandscape(3),
    
    /**
     * (4)
     */
    wdCenterLandscape(4),
    
    /**
     * (5)
     */
    wdRightLandscape(5),
    
    /**
     * (6)
     */
    wdLeftClockwise(6),
    
    /**
     * (7)
     */
    wdCenterClockwise(7),
    
    /**
     * (8)
     */
    wdRightClockwise(8),
    ;

    private WdEnvelopeOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}