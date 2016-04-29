
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAlertButtonType implements IComEnum {
    
    /**
     * (0)
     */
    msoAlertButtonOK(0),
    
    /**
     * (1)
     */
    msoAlertButtonOKCancel(1),
    
    /**
     * (2)
     */
    msoAlertButtonAbortRetryIgnore(2),
    
    /**
     * (3)
     */
    msoAlertButtonYesNoCancel(3),
    
    /**
     * (4)
     */
    msoAlertButtonYesNo(4),
    
    /**
     * (5)
     */
    msoAlertButtonRetryCancel(5),
    
    /**
     * (6)
     */
    msoAlertButtonYesAllNoCancel(6),
    ;

    private MsoAlertButtonType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}