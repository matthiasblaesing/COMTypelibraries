
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A2D97AD7-404A-3459-870D-F8B99B52382F})</p>
 */
public enum WdFontBias implements IComEnum {
    
    /**
     * (255)
     */
    wdFontBiasDontCare(255),
    
    /**
     * (0)
     */
    wdFontBiasDefault(0),
    
    /**
     * (1)
     */
    wdFontBiasFareast(1),
    ;

    private WdFontBias(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}