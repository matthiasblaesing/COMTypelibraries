
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlActionType implements IComEnum {
    
    /**
     * (1)
     */
    xlActionTypeUrl(1),
    
    /**
     * (16)
     */
    xlActionTypeRowset(16),
    
    /**
     * (128)
     */
    xlActionTypeReport(128),
    
    /**
     * (256)
     */
    xlActionTypeDrillthrough(256),
    ;

    private XlActionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}