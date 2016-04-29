
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoMoveRow implements IComEnum {
    
    /**
     * (-4)
     */
    msoMoveRowFirst(-4),
    
    /**
     * (-3)
     */
    msoMoveRowPrev(-3),
    
    /**
     * (-2)
     */
    msoMoveRowNext(-2),
    
    /**
     * (-1)
     */
    msoMoveRowNbr(-1),
    ;

    private MsoMoveRow(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}