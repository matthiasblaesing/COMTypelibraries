
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoDiagramType implements IComEnum {
    
    /**
     * (-2)
     */
    msoDiagramMixed(-2),
    
    /**
     * (1)
     */
    msoDiagramOrgChart(1),
    
    /**
     * (2)
     */
    msoDiagramCycle(2),
    
    /**
     * (3)
     */
    msoDiagramRadial(3),
    
    /**
     * (4)
     */
    msoDiagramPyramid(4),
    
    /**
     * (5)
     */
    msoDiagramVenn(5),
    
    /**
     * (6)
     */
    msoDiagramTarget(6),
    ;

    private MsoDiagramType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}