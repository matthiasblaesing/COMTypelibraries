
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCellChangedState implements IComEnum {
    
    /**
     * (1)
     */
    xlCellNotChanged(1),
    
    /**
     * (2)
     */
    xlCellChanged(2),
    
    /**
     * (3)
     */
    xlCellChangeApplied(3),
    ;

    private XlCellChangedState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}