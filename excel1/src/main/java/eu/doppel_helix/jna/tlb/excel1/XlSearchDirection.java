
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSearchDirection implements IComEnum {
    
    /**
     * (1)
     */
    xlNext(1),
    
    /**
     * (2)
     */
    xlPrevious(2),
    ;

    private XlSearchDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}