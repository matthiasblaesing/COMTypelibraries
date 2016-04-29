
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotTableMissingItems implements IComEnum {
    
    /**
     * (-1)
     */
    xlMissingItemsDefault(-1),
    
    /**
     * (0)
     */
    xlMissingItemsNone(0),
    
    /**
     * (32500)
     */
    xlMissingItemsMax(32500),
    
    /**
     * (1048576)
     */
    xlMissingItemsMax2(1048576),
    ;

    private XlPivotTableMissingItems(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}