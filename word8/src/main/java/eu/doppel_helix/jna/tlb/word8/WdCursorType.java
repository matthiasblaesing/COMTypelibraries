
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({149777A8-D40C-3468-B27C-D7AEA2CAA817})</p>
 */
public enum WdCursorType implements IComEnum {
    
    /**
     * (0)
     */
    wdCursorWait(0),
    
    /**
     * (1)
     */
    wdCursorIBeam(1),
    
    /**
     * (2)
     */
    wdCursorNormal(2),
    
    /**
     * (3)
     */
    wdCursorNorthwestArrow(3),
    ;

    private WdCursorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}