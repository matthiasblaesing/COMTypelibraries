
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSortMethod implements IComEnum {
    
    /**
     * (1)
     */
    xlPinYin(1),
    
    /**
     * (2)
     */
    xlStroke(2),
    ;

    private XlSortMethod(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}