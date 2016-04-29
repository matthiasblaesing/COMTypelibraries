
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTrendlineType implements IComEnum {
    
    /**
     * (5)
     */
    xlExponential(5),
    
    /**
     * (-4132)
     */
    xlLinear(-4132),
    
    /**
     * (-4133)
     */
    xlLogarithmic(-4133),
    
    /**
     * (6)
     */
    xlMovingAvg(6),
    
    /**
     * (3)
     */
    xlPolynomial(3),
    
    /**
     * (4)
     */
    xlPower(4),
    ;

    private XlTrendlineType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}