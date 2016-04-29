
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoIconType implements IComEnum {
    
    /**
     * (0)
     */
    msoIconNone(0),
    
    /**
     * (2)
     */
    msoIconAlert(2),
    
    /**
     * (3)
     */
    msoIconTip(3),
    
    /**
     * (4)
     */
    msoIconAlertInfo(4),
    
    /**
     * (5)
     */
    msoIconAlertWarning(5),
    
    /**
     * (6)
     */
    msoIconAlertQuery(6),
    
    /**
     * (7)
     */
    msoIconAlertCritical(7),
    ;

    private MsoIconType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}