
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlToolbarProtection implements IComEnum {
    
    /**
     * (1)
     */
    xlNoButtonChanges(1),
    
    /**
     * (4)
     */
    xlNoChanges(4),
    
    /**
     * (3)
     */
    xlNoDockingChanges(3),
    
    /**
     * (-4143)
     */
    xlToolbarProtectionNone(-4143),
    
    /**
     * (2)
     */
    xlNoShapeChanges(2),
    ;

    private XlToolbarProtection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}