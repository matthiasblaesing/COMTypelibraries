
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({97F81678-ACCD-3F4C-A9F2-52653F4431DE})</p>
 */
public enum WdContentControlDateStorageFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdContentControlDateStorageText(0),
    
    /**
     * (1)
     */
    wdContentControlDateStorageDate(1),
    
    /**
     * (2)
     */
    wdContentControlDateStorageDateTime(2),
    ;

    private WdContentControlDateStorageFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}