
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLocationInTable implements IComEnum {
    
    /**
     * (-4110)
     */
    xlColumnHeader(-4110),
    
    /**
     * (5)
     */
    xlColumnItem(5),
    
    /**
     * (3)
     */
    xlDataHeader(3),
    
    /**
     * (7)
     */
    xlDataItem(7),
    
    /**
     * (2)
     */
    xlPageHeader(2),
    
    /**
     * (6)
     */
    xlPageItem(6),
    
    /**
     * (-4153)
     */
    xlRowHeader(-4153),
    
    /**
     * (4)
     */
    xlRowItem(4),
    
    /**
     * (8)
     */
    xlTableBody(8),
    ;

    private XlLocationInTable(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}