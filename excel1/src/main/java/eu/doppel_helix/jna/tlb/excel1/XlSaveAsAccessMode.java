
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSaveAsAccessMode implements IComEnum {
    
    /**
     * (3)
     */
    xlExclusive(3),
    
    /**
     * (1)
     */
    xlNoChange(1),
    
    /**
     * (2)
     */
    xlShared(2),
    ;

    private XlSaveAsAccessMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}