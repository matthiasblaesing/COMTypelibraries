
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1CCEE46E-16CC-3685-80A3-B19C6006398C})</p>
 */
public enum WdUseFormattingFrom implements IComEnum {
    
    /**
     * (0)
     */
    wdFormattingFromCurrent(0),
    
    /**
     * (1)
     */
    wdFormattingFromSelected(1),
    
    /**
     * (2)
     */
    wdFormattingFromPrompt(2),
    ;

    private WdUseFormattingFrom(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}