
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoButtonStyle implements IComEnum {
    
    /**
     * (0)
     */
    msoButtonAutomatic(0),
    
    /**
     * (1)
     */
    msoButtonIcon(1),
    
    /**
     * (2)
     */
    msoButtonCaption(2),
    
    /**
     * (3)
     */
    msoButtonIconAndCaption(3),
    
    /**
     * (7)
     */
    msoButtonIconAndWrapCaption(7),
    
    /**
     * (11)
     */
    msoButtonIconAndCaptionBelow(11),
    
    /**
     * (14)
     */
    msoButtonWrapCaption(14),
    
    /**
     * (15)
     */
    msoButtonIconAndWrapCaptionBelow(15),
    ;

    private MsoButtonStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}