
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSparkType implements IComEnum {
    
    /**
     * (1)
     */
    xlSparkLine(1),
    
    /**
     * (2)
     */
    xlSparkColumn(2),
    
    /**
     * (3)
     */
    xlSparkColumnStacked100(3),
    ;

    private XlSparkType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}