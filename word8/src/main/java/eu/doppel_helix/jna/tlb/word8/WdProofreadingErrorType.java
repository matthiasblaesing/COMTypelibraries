
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({CA88E198-7D52-30F9-B8F9-F2CBC7A83370})</p>
 */
public enum WdProofreadingErrorType implements IComEnum {
    
    /**
     * (0)
     */
    wdSpellingError(0),
    
    /**
     * (1)
     */
    wdGrammaticalError(1),
    ;

    private WdProofreadingErrorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}