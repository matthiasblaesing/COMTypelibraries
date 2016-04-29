
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotTableSourceType implements IComEnum {
    
    /**
     * (4)
     */
    xlScenario(4),
    
    /**
     * (3)
     */
    xlConsolidation(3),
    
    /**
     * (1)
     */
    xlDatabase(1),
    
    /**
     * (2)
     */
    xlExternal(2),
    
    /**
     * (-4148)
     */
    xlPivotTable(-4148),
    ;

    private XlPivotTableSourceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}