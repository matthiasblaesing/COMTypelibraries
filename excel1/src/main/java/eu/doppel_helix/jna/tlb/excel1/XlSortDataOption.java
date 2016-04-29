
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSortDataOption implements IComEnum {
    
    /**
     * (0)
     */
    xlSortNormal(0),
    
    /**
     * (1)
     */
    xlSortTextAsNumbers(1),
    ;

    private XlSortDataOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}