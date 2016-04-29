
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotFieldOrientation implements IComEnum {
    
    /**
     * (2)
     */
    xlColumnField(2),
    
    /**
     * (4)
     */
    xlDataField(4),
    
    /**
     * (0)
     */
    xlHidden(0),
    
    /**
     * (3)
     */
    xlPageField(3),
    
    /**
     * (1)
     */
    xlRowField(1),
    ;

    private XlPivotFieldOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}