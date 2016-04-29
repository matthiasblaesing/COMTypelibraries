
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAutomationSecurity implements IComEnum {
    
    /**
     * (1)
     */
    msoAutomationSecurityLow(1),
    
    /**
     * (2)
     */
    msoAutomationSecurityByUI(2),
    
    /**
     * (3)
     */
    msoAutomationSecurityForceDisable(3),
    ;

    private MsoAutomationSecurity(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}