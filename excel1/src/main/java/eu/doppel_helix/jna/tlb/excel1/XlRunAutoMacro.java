
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlRunAutoMacro implements IComEnum {
    
    /**
     * (3)
     */
    xlAutoActivate(3),
    
    /**
     * (2)
     */
    xlAutoClose(2),
    
    /**
     * (4)
     */
    xlAutoDeactivate(4),
    
    /**
     * (1)
     */
    xlAutoOpen(1),
    ;

    private XlRunAutoMacro(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}