
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatYesNo implements IComEnum {
    
    /**
     * (1)
     */
    olFormatYesNoYesNo(1),
    
    /**
     * (2)
     */
    olFormatYesNoOnOff(2),
    
    /**
     * (3)
     */
    olFormatYesNoTrueFalse(3),
    
    /**
     * (4)
     */
    olFormatYesNoIcon(4),
    ;

    private OlFormatYesNo(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}