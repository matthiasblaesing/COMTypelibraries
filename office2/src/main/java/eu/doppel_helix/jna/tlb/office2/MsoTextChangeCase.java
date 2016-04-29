
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextChangeCase implements IComEnum {
    
    /**
     * (1)
     */
    msoCaseSentence(1),
    
    /**
     * (2)
     */
    msoCaseLower(2),
    
    /**
     * (3)
     */
    msoCaseUpper(3),
    
    /**
     * (4)
     */
    msoCaseTitle(4),
    
    /**
     * (5)
     */
    msoCaseToggle(5),
    ;

    private MsoTextChangeCase(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}