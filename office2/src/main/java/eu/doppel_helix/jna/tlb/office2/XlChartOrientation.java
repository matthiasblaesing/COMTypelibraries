
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({94E08815-49E8-45BB-9BC2-8972405756CF})</p>
 */
public enum XlChartOrientation implements IComEnum {
    
    /**
     * (-4170)
     */
    xlDownward(-4170),
    
    /**
     * (-4128)
     */
    xlHorizontal(-4128),
    
    /**
     * (-4171)
     */
    xlUpward(-4171),
    
    /**
     * (-4166)
     */
    xlVertical(-4166),
    ;

    private XlChartOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}