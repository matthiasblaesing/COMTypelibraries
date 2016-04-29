
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlReferenceType implements IComEnum {
    
    /**
     * (1)
     */
    xlAbsolute(1),
    
    /**
     * (2)
     */
    xlAbsRowRelColumn(2),
    
    /**
     * (4)
     */
    xlRelative(4),
    
    /**
     * (3)
     */
    xlRelRowAbsColumn(3),
    ;

    private XlReferenceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}