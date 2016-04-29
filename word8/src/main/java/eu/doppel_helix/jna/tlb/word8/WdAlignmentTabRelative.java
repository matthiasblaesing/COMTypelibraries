
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F789D0A8-3325-3E36-B6CE-87657A7F4E4E})</p>
 */
public enum WdAlignmentTabRelative implements IComEnum {
    
    /**
     * (0)
     */
    wdMargin(0),
    
    /**
     * (1)
     */
    wdIndent(1),
    ;

    private WdAlignmentTabRelative(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}