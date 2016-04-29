
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextCharWrap implements IComEnum {
    
    /**
     * (-2)
     */
    msoCharWrapMixed(-2),
    
    /**
     * (0)
     */
    msoNoCharWrap(0),
    
    /**
     * (1)
     */
    msoStandardCharWrap(1),
    
    /**
     * (2)
     */
    msoStrictCharWrap(2),
    
    /**
     * (3)
     */
    msoCustomCharWrap(3),
    ;

    private MsoTextCharWrap(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}