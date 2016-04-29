
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoArrowheadStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoArrowheadStyleMixed(-2),
    
    /**
     * (1)
     */
    msoArrowheadNone(1),
    
    /**
     * (2)
     */
    msoArrowheadTriangle(2),
    
    /**
     * (3)
     */
    msoArrowheadOpen(3),
    
    /**
     * (4)
     */
    msoArrowheadStealth(4),
    
    /**
     * (5)
     */
    msoArrowheadDiamond(5),
    
    /**
     * (6)
     */
    msoArrowheadOval(6),
    ;

    private MsoArrowheadStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}