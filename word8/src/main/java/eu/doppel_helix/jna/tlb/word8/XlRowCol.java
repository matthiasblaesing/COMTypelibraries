
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlRowCol implements IComEnum {
    
    /**
     * (2)
     */
    xlColumns(2),
    
    /**
     * (1)
     */
    xlRows(1),
    ;

    private XlRowCol(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}