
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSparkScale implements IComEnum {
    
    /**
     * (1)
     */
    xlSparkScaleGroup(1),
    
    /**
     * (2)
     */
    xlSparkScaleSingle(2),
    
    /**
     * (3)
     */
    xlSparkScaleCustom(3),
    ;

    private XlSparkScale(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}