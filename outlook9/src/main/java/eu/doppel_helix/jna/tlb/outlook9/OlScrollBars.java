
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D1788312-EDEE-4673-AE33-B3C3BC0753EA})</p>
 */
public enum OlScrollBars implements IComEnum {
    
    /**
     * None (0)
     */
    olScrollBarsNone(0),
    
    /**
     * Horizontal (1)
     */
    olScrollBarsHorizontal(1),
    
    /**
     * Vertical (2)
     */
    olScrollBarsVertical(2),
    
    /**
     * Both (3)
     */
    olScrollBarsBoth(3),
    ;

    private OlScrollBars(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}