
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCutCopyMode implements IComEnum {
    
    /**
     * (1)
     */
    xlCopy(1),
    
    /**
     * (2)
     */
    xlCut(2),
    ;

    private XlCutCopyMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}