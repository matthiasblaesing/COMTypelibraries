
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlXLMMacroType implements IComEnum {
    
    /**
     * (2)
     */
    xlCommand(2),
    
    /**
     * (1)
     */
    xlFunction(1),
    
    /**
     * (3)
     */
    xlNotXLM(3),
    ;

    private XlXLMMacroType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}