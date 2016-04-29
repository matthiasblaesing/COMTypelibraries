
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlBarShape implements IComEnum {
    
    /**
     * (0)
     */
    xlBox(0),
    
    /**
     * (1)
     */
    xlPyramidToPoint(1),
    
    /**
     * (2)
     */
    xlPyramidToMax(2),
    
    /**
     * (3)
     */
    xlCylinder(3),
    
    /**
     * (4)
     */
    xlConeToPoint(4),
    
    /**
     * (5)
     */
    xlConeToMax(5),
    ;

    private XlBarShape(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}