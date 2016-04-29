
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0C0568FC-FA89-3ACC-B9CD-B046D85723B6})</p>
 */
public enum WdSectionDirection implements IComEnum {
    
    /**
     * (0)
     */
    wdSectionDirectionRtl(0),
    
    /**
     * (1)
     */
    wdSectionDirectionLtr(1),
    ;

    private WdSectionDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}