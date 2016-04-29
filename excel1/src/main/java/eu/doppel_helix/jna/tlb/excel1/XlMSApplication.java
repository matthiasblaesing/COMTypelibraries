
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlMSApplication implements IComEnum {
    
    /**
     * (4)
     */
    xlMicrosoftAccess(4),
    
    /**
     * (5)
     */
    xlMicrosoftFoxPro(5),
    
    /**
     * (3)
     */
    xlMicrosoftMail(3),
    
    /**
     * (2)
     */
    xlMicrosoftPowerPoint(2),
    
    /**
     * (6)
     */
    xlMicrosoftProject(6),
    
    /**
     * (7)
     */
    xlMicrosoftSchedulePlus(7),
    
    /**
     * (1)
     */
    xlMicrosoftWord(1),
    ;

    private XlMSApplication(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}