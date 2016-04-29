
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlMouseButton implements IComEnum {
    
    /**
     * (0)
     */
    xlNoButton(0),
    
    /**
     * (1)
     */
    xlPrimaryButton(1),
    
    /**
     * (2)
     */
    xlSecondaryButton(2),
    ;

    private XlMouseButton(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}