
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAlertCancelType implements IComEnum {
    
    /**
     * (-1)
     */
    msoAlertCancelDefault(-1),
    
    /**
     * (0)
     */
    msoAlertCancelFirst(0),
    
    /**
     * (1)
     */
    msoAlertCancelSecond(1),
    
    /**
     * (2)
     */
    msoAlertCancelThird(2),
    
    /**
     * (3)
     */
    msoAlertCancelFourth(3),
    
    /**
     * (4)
     */
    msoAlertCancelFifth(4),
    ;

    private MsoAlertCancelType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}