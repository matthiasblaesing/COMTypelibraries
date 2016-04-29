
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCalloutType implements IComEnum {
    
    /**
     * (-2)
     */
    msoCalloutMixed(-2),
    
    /**
     * (1)
     */
    msoCalloutOne(1),
    
    /**
     * (2)
     */
    msoCalloutTwo(2),
    
    /**
     * (3)
     */
    msoCalloutThree(3),
    
    /**
     * (4)
     */
    msoCalloutFour(4),
    ;

    private MsoCalloutType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}