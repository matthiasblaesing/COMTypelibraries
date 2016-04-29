
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCubeFieldType implements IComEnum {
    
    /**
     * (1)
     */
    xlHierarchy(1),
    
    /**
     * (2)
     */
    xlMeasure(2),
    
    /**
     * (3)
     */
    xlSet(3),
    ;

    private XlCubeFieldType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}