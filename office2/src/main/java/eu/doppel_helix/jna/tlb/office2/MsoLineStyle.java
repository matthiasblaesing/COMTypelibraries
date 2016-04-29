
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLineStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoLineStyleMixed(-2),
    
    /**
     * (1)
     */
    msoLineSingle(1),
    
    /**
     * (2)
     */
    msoLineThinThin(2),
    
    /**
     * (3)
     */
    msoLineThinThick(3),
    
    /**
     * (4)
     */
    msoLineThickThin(4),
    
    /**
     * (5)
     */
    msoLineThickBetweenThin(5),
    ;

    private MsoLineStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}