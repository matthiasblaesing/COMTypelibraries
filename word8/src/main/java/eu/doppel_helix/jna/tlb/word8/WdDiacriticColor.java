
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5C417FBE-DCBA-3E9B-811D-42D0C974E938})</p>
 */
public enum WdDiacriticColor implements IComEnum {
    
    /**
     * (0)
     */
    wdDiacriticColorBidi(0),
    
    /**
     * (1)
     */
    wdDiacriticColorLatin(1),
    ;

    private WdDiacriticColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}