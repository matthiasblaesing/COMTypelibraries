
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({DB686EA6-1A50-3146-B8A0-868BC3C6F451})</p>
 */
public enum WdCharacterCase implements IComEnum {
    
    /**
     * (-1)
     */
    wdNextCase(-1),
    
    /**
     * (0)
     */
    wdLowerCase(0),
    
    /**
     * (1)
     */
    wdUpperCase(1),
    
    /**
     * (2)
     */
    wdTitleWord(2),
    
    /**
     * (4)
     */
    wdTitleSentence(4),
    
    /**
     * (5)
     */
    wdToggleCase(5),
    
    /**
     * (6)
     */
    wdHalfWidth(6),
    
    /**
     * (7)
     */
    wdFullWidth(7),
    
    /**
     * (8)
     */
    wdKatakana(8),
    
    /**
     * (9)
     */
    wdHiragana(9),
    ;

    private WdCharacterCase(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}