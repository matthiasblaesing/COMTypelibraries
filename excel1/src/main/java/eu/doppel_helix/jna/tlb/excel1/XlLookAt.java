
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLookAt implements IComEnum {
    
    /**
     * (2)
     */
    xlPart(2),
    
    /**
     * (1)
     */
    xlWhole(1),
    ;

    private XlLookAt(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}