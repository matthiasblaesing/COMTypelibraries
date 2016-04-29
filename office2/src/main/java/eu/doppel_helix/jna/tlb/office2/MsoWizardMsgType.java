
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoWizardMsgType implements IComEnum {
    
    /**
     * (1)
     */
    msoWizardMsgLocalStateOn(1),
    
    /**
     * (2)
     */
    msoWizardMsgLocalStateOff(2),
    
    /**
     * (3)
     */
    msoWizardMsgShowHelp(3),
    
    /**
     * (4)
     */
    msoWizardMsgSuspending(4),
    
    /**
     * (5)
     */
    msoWizardMsgResuming(5),
    ;

    private MsoWizardMsgType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}