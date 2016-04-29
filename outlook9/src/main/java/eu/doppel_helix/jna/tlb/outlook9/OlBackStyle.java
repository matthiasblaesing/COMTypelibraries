
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AA3E840F-7079-4AA4-91A9-6F3546DA6A95})</p>
 */
public enum OlBackStyle implements IComEnum {
    
    /**
     * Transparent (0)
     */
    olBackStyleTransparent(0),
    
    /**
     * Opaque (1)
     */
    olBackStyleOpaque(1),
    ;

    private OlBackStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}