
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoWizardActType implements IComEnum {
    
    /**
     * (0)
     */
    msoWizardActInactive(0),
    
    /**
     * (1)
     */
    msoWizardActActive(1),
    
    /**
     * (2)
     */
    msoWizardActSuspend(2),
    
    /**
     * (3)
     */
    msoWizardActResume(3),
    ;

    private MsoWizardActType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}