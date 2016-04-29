
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLinkType implements IComEnum {
    
    /**
     * (1)
     */
    xlLinkTypeExcelLinks(1),
    
    /**
     * (2)
     */
    xlLinkTypeOLELinks(2),
    ;

    private XlLinkType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}