
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlErrorBarDirection implements IComEnum {
    
    /**
     * (-4168)
     */
    xlX(-4168),
    
    /**
     * (1)
     */
    xlY(1),
    ;

    private XlErrorBarDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}