
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({929F28B1-D115-39D0-BA39-2EA8425002F5})</p>
 */
public enum WdFrameSizeRule implements IComEnum {
    
    /**
     * (0)
     */
    wdFrameAuto(0),
    
    /**
     * (1)
     */
    wdFrameAtLeast(1),
    
    /**
     * (2)
     */
    wdFrameExact(2),
    ;

    private WdFrameSizeRule(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}