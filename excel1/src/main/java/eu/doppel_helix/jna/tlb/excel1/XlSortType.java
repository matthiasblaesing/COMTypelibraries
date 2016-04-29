
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSortType implements IComEnum {
    
    /**
     * (2)
     */
    xlSortLabels(2),
    
    /**
     * (1)
     */
    xlSortValues(1),
    ;

    private XlSortType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}