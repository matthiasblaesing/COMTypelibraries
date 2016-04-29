
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLineCapStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoLineCapMixed(-2),
    
    /**
     * (1)
     */
    msoLineCapSquare(1),
    
    /**
     * (2)
     */
    msoLineCapRound(2),
    
    /**
     * (3)
     */
    msoLineCapFlat(3),
    ;

    private MsoLineCapStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}