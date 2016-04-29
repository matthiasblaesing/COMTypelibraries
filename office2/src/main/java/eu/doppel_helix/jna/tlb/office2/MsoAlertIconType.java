
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAlertIconType implements IComEnum {
    
    /**
     * (0)
     */
    msoAlertIconNoIcon(0),
    
    /**
     * (1)
     */
    msoAlertIconCritical(1),
    
    /**
     * (2)
     */
    msoAlertIconQuery(2),
    
    /**
     * (3)
     */
    msoAlertIconWarning(3),
    
    /**
     * (4)
     */
    msoAlertIconInfo(4),
    ;

    private MsoAlertIconType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}