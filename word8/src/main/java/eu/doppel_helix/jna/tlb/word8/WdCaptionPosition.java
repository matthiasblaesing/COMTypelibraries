
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({946DB172-20CF-313F-961C-76112797145C})</p>
 */
public enum WdCaptionPosition implements IComEnum {
    
    /**
     * (0)
     */
    wdCaptionPositionAbove(0),
    
    /**
     * (1)
     */
    wdCaptionPositionBelow(1),
    ;

    private WdCaptionPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}