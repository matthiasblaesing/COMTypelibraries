
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPathFormat implements IComEnum {
    
    /**
     * (-2)
     */
    msoPathTypeMixed(-2),
    
    /**
     * (0)
     */
    msoPathTypeNone(0),
    
    /**
     * (1)
     */
    msoPathType1(1),
    
    /**
     * (2)
     */
    msoPathType2(2),
    
    /**
     * (3)
     */
    msoPathType3(3),
    
    /**
     * (4)
     */
    msoPathType4(4),
    ;

    private MsoPathFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}