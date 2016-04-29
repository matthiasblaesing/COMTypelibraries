
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPlatform implements IComEnum {
    
    /**
     * (1)
     */
    xlMacintosh(1),
    
    /**
     * (3)
     */
    xlMSDOS(3),
    
    /**
     * (2)
     */
    xlWindows(2),
    ;

    private XlPlatform(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}