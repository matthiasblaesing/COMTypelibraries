
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum DocProperties implements IComEnum {
    
    /**
     * (1)
     */
    offPropertyTypeNumber(1),
    
    /**
     * (2)
     */
    offPropertyTypeBoolean(2),
    
    /**
     * (3)
     */
    offPropertyTypeDate(3),
    
    /**
     * (4)
     */
    offPropertyTypeString(4),
    
    /**
     * (5)
     */
    offPropertyTypeFloat(5),
    ;

    private DocProperties(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}