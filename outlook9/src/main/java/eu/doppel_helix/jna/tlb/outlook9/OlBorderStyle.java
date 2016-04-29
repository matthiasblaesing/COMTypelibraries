
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0B17239E-C724-444B-ACB1-579893197A3C})</p>
 */
public enum OlBorderStyle implements IComEnum {
    
    /**
     * None (0)
     */
    olBorderStyleNone(0),
    
    /**
     * Single (1)
     */
    olBorderStyleSingle(1),
    ;

    private OlBorderStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}