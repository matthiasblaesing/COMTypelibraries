
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLink implements IComEnum {
    
    /**
     * (1)
     */
    xlExcelLinks(1),
    
    /**
     * (2)
     */
    xlOLELinks(2),
    
    /**
     * (5)
     */
    xlPublishers(5),
    
    /**
     * (6)
     */
    xlSubscribers(6),
    ;

    private XlLink(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}