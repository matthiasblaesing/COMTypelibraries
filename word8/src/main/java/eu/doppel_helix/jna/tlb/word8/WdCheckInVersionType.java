
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({33DAFB9D-0D41-3FC4-9553-2A17994D3E14})</p>
 */
public enum WdCheckInVersionType implements IComEnum {
    
    /**
     * (0)
     */
    wdCheckInMinorVersion(0),
    
    /**
     * (1)
     */
    wdCheckInMajorVersion(1),
    
    /**
     * (2)
     */
    wdCheckInOverwriteVersion(2),
    ;

    private WdCheckInVersionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}