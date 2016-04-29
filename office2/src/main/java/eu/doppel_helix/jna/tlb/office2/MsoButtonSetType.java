
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoButtonSetType implements IComEnum {
    
    /**
     * (0)
     */
    msoButtonSetNone(0),
    
    /**
     * (1)
     */
    msoButtonSetOK(1),
    
    /**
     * (2)
     */
    msoButtonSetCancel(2),
    
    /**
     * (3)
     */
    msoButtonSetOkCancel(3),
    
    /**
     * (4)
     */
    msoButtonSetYesNo(4),
    
    /**
     * (5)
     */
    msoButtonSetYesNoCancel(5),
    
    /**
     * (6)
     */
    msoButtonSetBackClose(6),
    
    /**
     * (7)
     */
    msoButtonSetNextClose(7),
    
    /**
     * (8)
     */
    msoButtonSetBackNextClose(8),
    
    /**
     * (9)
     */
    msoButtonSetRetryCancel(9),
    
    /**
     * (10)
     */
    msoButtonSetAbortRetryIgnore(10),
    
    /**
     * (11)
     */
    msoButtonSetSearchClose(11),
    
    /**
     * (12)
     */
    msoButtonSetBackNextSnooze(12),
    
    /**
     * (13)
     */
    msoButtonSetTipsOptionsClose(13),
    
    /**
     * (14)
     */
    msoButtonSetYesAllNoCancel(14),
    ;

    private MsoButtonSetType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}