
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2F972E43-BB76-3DBB-969F-665D859F3D52})</p>
 */
public enum WdOLEPlacement implements IComEnum {
    
    /**
     * (0)
     */
    wdInLine(0),
    
    /**
     * (1)
     */
    wdFloatOverText(1),
    ;

    private WdOLEPlacement(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}