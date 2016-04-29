
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

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