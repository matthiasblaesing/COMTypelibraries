
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({670A5813-DB2F-3ACE-874D-C5BB2053D1EA})</p>
 */
public enum WdArrangeStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdTiled(0),
    
    /**
     * (1)
     */
    wdIcons(1),
    ;

    private WdArrangeStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}