
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCubeFieldSubType implements IComEnum {
    
    /**
     * (1)
     */
    xlCubeHierarchy(1),
    
    /**
     * (2)
     */
    xlCubeMeasure(2),
    
    /**
     * (3)
     */
    xlCubeSet(3),
    
    /**
     * (4)
     */
    xlCubeAttribute(4),
    
    /**
     * (5)
     */
    xlCubeCalculatedMeasure(5),
    
    /**
     * (6)
     */
    xlCubeKPIValue(6),
    
    /**
     * (7)
     */
    xlCubeKPIGoal(7),
    
    /**
     * (8)
     */
    xlCubeKPIStatus(8),
    
    /**
     * (9)
     */
    xlCubeKPITrend(9),
    
    /**
     * (10)
     */
    xlCubeKPIWeight(10),
    
    /**
     * (11)
     */
    xlCubeImplicitMeasure(11),
    ;

    private XlCubeFieldSubType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}