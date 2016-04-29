
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFilterAction implements IComEnum {
    
    /**
     * (2)
     */
    xlFilterCopy(2),
    
    /**
     * (1)
     */
    xlFilterInPlace(1),
    ;

    private XlFilterAction(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}