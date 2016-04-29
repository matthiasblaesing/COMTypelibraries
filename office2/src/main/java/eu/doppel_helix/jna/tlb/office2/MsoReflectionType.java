
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoReflectionType implements IComEnum {
    
    /**
     * (-2)
     */
    msoReflectionTypeMixed(-2),
    
    /**
     * (0)
     */
    msoReflectionTypeNone(0),
    
    /**
     * (1)
     */
    msoReflectionType1(1),
    
    /**
     * (2)
     */
    msoReflectionType2(2),
    
    /**
     * (3)
     */
    msoReflectionType3(3),
    
    /**
     * (4)
     */
    msoReflectionType4(4),
    
    /**
     * (5)
     */
    msoReflectionType5(5),
    
    /**
     * (6)
     */
    msoReflectionType6(6),
    
    /**
     * (7)
     */
    msoReflectionType7(7),
    
    /**
     * (8)
     */
    msoReflectionType8(8),
    
    /**
     * (9)
     */
    msoReflectionType9(9),
    ;

    private MsoReflectionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}