
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlApplyNamesOrder implements IComEnum {
    
    /**
     * (2)
     */
    xlColumnThenRow(2),
    
    /**
     * (1)
     */
    xlRowThenColumn(1),
    ;

    private XlApplyNamesOrder(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}