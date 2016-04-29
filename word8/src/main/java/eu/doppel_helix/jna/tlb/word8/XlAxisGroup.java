
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlAxisGroup implements IComEnum {
    
    /**
     * (1)
     */
    xlPrimary(1),
    
    /**
     * (2)
     */
    xlSecondary(2),
    ;

    private XlAxisGroup(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}