
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({992D8289-31EF-3821-87EE-F4994C1C6F55})</p>
 */
public enum WdProtectionType implements IComEnum {
    
    /**
     * (-1)
     */
    wdNoProtection(-1),
    
    /**
     * (0)
     */
    wdAllowOnlyRevisions(0),
    
    /**
     * (1)
     */
    wdAllowOnlyComments(1),
    
    /**
     * (2)
     */
    wdAllowOnlyFormFields(2),
    
    /**
     * (3)
     */
    wdAllowOnlyReading(3),
    ;

    private WdProtectionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}