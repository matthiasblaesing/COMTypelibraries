
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3439EA79-5069-4404-A6E3-8EE3A1B9BD0E})</p>
 */
public enum XlDisplayBlanksAs implements IComEnum {
    
    /**
     * (3)
     */
    xlInterpolated(3),
    
    /**
     * (1)
     */
    xlNotPlotted(1),
    
    /**
     * (2)
     */
    xlZero(2),
    ;

    private XlDisplayBlanksAs(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}