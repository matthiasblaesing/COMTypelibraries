
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlOrientation implements IComEnum {
    
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

    private XlOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}