
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlErrorBarDirection implements IComEnum {
    
    /**
     * (-4168)
     */
    xlChartX(-4168),
    
    /**
     * (1)
     */
    xlChartY(1),
    ;

    private XlErrorBarDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}