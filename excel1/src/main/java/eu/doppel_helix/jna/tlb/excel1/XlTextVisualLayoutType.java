
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTextVisualLayoutType implements IComEnum {
    
    /**
     * (1)
     */
    xlTextVisualLTR(1),
    
    /**
     * (2)
     */
    xlTextVisualRTL(2),
    ;

    private XlTextVisualLayoutType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}