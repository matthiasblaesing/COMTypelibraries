
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({458C4ACC-B973-3A1A-8E72-F3361D5D9F55})</p>
 */
public enum WdWindowState implements IComEnum {
    
    /**
     * (0)
     */
    wdWindowStateNormal(0),
    
    /**
     * (1)
     */
    wdWindowStateMaximize(1),
    
    /**
     * (2)
     */
    wdWindowStateMinimize(2),
    ;

    private WdWindowState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}