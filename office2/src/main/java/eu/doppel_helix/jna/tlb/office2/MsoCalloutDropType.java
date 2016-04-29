
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCalloutDropType implements IComEnum {
    
    /**
     * (-2)
     */
    msoCalloutDropMixed(-2),
    
    /**
     * (1)
     */
    msoCalloutDropCustom(1),
    
    /**
     * (2)
     */
    msoCalloutDropTop(2),
    
    /**
     * (3)
     */
    msoCalloutDropCenter(3),
    
    /**
     * (4)
     */
    msoCalloutDropBottom(4),
    ;

    private MsoCalloutDropType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}