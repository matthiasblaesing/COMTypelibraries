
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E8606DE9-00F1-3086-BA72-CCDE4F6D93E2})</p>
 */
public enum WdMailMergeMailFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdMailFormatPlainText(0),
    
    /**
     * (1)
     */
    wdMailFormatHTML(1),
    ;

    private WdMailMergeMailFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}