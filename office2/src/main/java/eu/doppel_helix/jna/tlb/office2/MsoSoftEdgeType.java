
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSoftEdgeType implements IComEnum {
    
    /**
     * (-2)
     */
    msoSoftEdgeTypeMixed(-2),
    
    /**
     * (0)
     */
    msoSoftEdgeTypeNone(0),
    
    /**
     * (1)
     */
    msoSoftEdgeType1(1),
    
    /**
     * (2)
     */
    msoSoftEdgeType2(2),
    
    /**
     * (3)
     */
    msoSoftEdgeType3(3),
    
    /**
     * (4)
     */
    msoSoftEdgeType4(4),
    
    /**
     * (5)
     */
    msoSoftEdgeType5(5),
    
    /**
     * (6)
     */
    msoSoftEdgeType6(6),
    ;

    private MsoSoftEdgeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}