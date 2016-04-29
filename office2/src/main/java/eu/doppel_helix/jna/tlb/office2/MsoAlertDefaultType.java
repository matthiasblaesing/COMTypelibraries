
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAlertDefaultType implements IComEnum {
    
    /**
     * (0)
     */
    msoAlertDefaultFirst(0),
    
    /**
     * (1)
     */
    msoAlertDefaultSecond(1),
    
    /**
     * (2)
     */
    msoAlertDefaultThird(2),
    
    /**
     * (3)
     */
    msoAlertDefaultFourth(3),
    
    /**
     * (4)
     */
    msoAlertDefaultFifth(4),
    ;

    private MsoAlertDefaultType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}