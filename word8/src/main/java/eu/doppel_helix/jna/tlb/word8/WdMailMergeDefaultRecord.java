
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({928E425A-4170-3FAC-BACF-D7BD27641BAC})</p>
 */
public enum WdMailMergeDefaultRecord implements IComEnum {
    
    /**
     * (1)
     */
    wdDefaultFirstRecord(1),
    
    /**
     * (-16)
     */
    wdDefaultLastRecord(-16),
    ;

    private WdMailMergeDefaultRecord(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}