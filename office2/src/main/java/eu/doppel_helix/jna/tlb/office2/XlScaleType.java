
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6A0D7E5C-F9AD-4927-A850-5638891724B2})</p>
 */
public enum XlScaleType implements IComEnum {
    
    /**
     * (-4132)
     */
    xlScaleLinear(-4132),
    
    /**
     * (-4133)
     */
    xlScaleLogarithmic(-4133),
    ;

    private XlScaleType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}