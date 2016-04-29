
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPTSelectionMode implements IComEnum {
    
    /**
     * (1)
     */
    xlLabelOnly(1),
    
    /**
     * (0)
     */
    xlDataAndLabel(0),
    
    /**
     * (2)
     */
    xlDataOnly(2),
    
    /**
     * (3)
     */
    xlOrigin(3),
    
    /**
     * (15)
     */
    xlButton(15),
    
    /**
     * (4)
     */
    xlBlanks(4),
    
    /**
     * (256)
     */
    xlFirstRow(256),
    ;

    private XlPTSelectionMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}