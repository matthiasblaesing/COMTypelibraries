
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCalloutAngleType implements IComEnum {
    
    /**
     * (-2)
     */
    msoCalloutAngleMixed(-2),
    
    /**
     * (1)
     */
    msoCalloutAngleAutomatic(1),
    
    /**
     * (2)
     */
    msoCalloutAngle30(2),
    
    /**
     * (3)
     */
    msoCalloutAngle45(3),
    
    /**
     * (4)
     */
    msoCalloutAngle60(4),
    
    /**
     * (5)
     */
    msoCalloutAngle90(5),
    ;

    private MsoCalloutAngleType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}