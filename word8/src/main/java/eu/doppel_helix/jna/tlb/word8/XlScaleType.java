
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

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