
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoDocProperties implements IComEnum {
    
    /**
     * (1)
     */
    msoPropertyTypeNumber(1),
    
    /**
     * (2)
     */
    msoPropertyTypeBoolean(2),
    
    /**
     * (3)
     */
    msoPropertyTypeDate(3),
    
    /**
     * (4)
     */
    msoPropertyTypeString(4),
    
    /**
     * (5)
     */
    msoPropertyTypeFloat(5),
    ;

    private MsoDocProperties(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}