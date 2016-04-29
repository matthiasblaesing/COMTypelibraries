
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataBarAxisPosition implements IComEnum {
    
    /**
     * (0)
     */
    xlDataBarAxisAutomatic(0),
    
    /**
     * (1)
     */
    xlDataBarAxisMidpoint(1),
    
    /**
     * (2)
     */
    xlDataBarAxisNone(2),
    ;

    private XlDataBarAxisPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}