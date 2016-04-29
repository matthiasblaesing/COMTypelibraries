
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6AF6E882-A139-3B8E-9B1C-3315A1AF366D})</p>
 */
public enum WdPartOfSpeech implements IComEnum {
    
    /**
     * (0)
     */
    wdAdjective(0),
    
    /**
     * (1)
     */
    wdNoun(1),
    
    /**
     * (2)
     */
    wdAdverb(2),
    
    /**
     * (3)
     */
    wdVerb(3),
    
    /**
     * (4)
     */
    wdPronoun(4),
    
    /**
     * (5)
     */
    wdConjunction(5),
    
    /**
     * (6)
     */
    wdPreposition(6),
    
    /**
     * (7)
     */
    wdInterjection(7),
    
    /**
     * (8)
     */
    wdIdiom(8),
    
    /**
     * (9)
     */
    wdOther(9),
    ;

    private WdPartOfSpeech(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}