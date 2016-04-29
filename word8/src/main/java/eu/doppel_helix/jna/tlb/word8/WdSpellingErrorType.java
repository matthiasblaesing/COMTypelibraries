
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3F83F6C0-D880-32CE-97A9-D13517AA8F3F})</p>
 */
public enum WdSpellingErrorType implements IComEnum {
    
    /**
     * (0)
     */
    wdSpellingCorrect(0),
    
    /**
     * (1)
     */
    wdSpellingNotInDictionary(1),
    
    /**
     * (2)
     */
    wdSpellingCapitalization(2),
    ;

    private WdSpellingErrorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}