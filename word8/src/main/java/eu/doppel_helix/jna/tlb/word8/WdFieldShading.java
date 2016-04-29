
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4165CD13-DD2A-354B-9992-F5B446F34D40})</p>
 */
public enum WdFieldShading implements IComEnum {
    
    /**
     * (0)
     */
    wdFieldShadingNever(0),
    
    /**
     * (1)
     */
    wdFieldShadingAlways(1),
    
    /**
     * (2)
     */
    wdFieldShadingWhenSelected(2),
    ;

    private WdFieldShading(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}