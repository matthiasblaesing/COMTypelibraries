
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDisplayDrawingObjects implements IComEnum {
    
    /**
     * (-4104)
     */
    xlDisplayShapes(-4104),
    
    /**
     * (3)
     */
    xlHide(3),
    
    /**
     * (2)
     */
    xlPlaceholders(2),
    ;

    private XlDisplayDrawingObjects(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}