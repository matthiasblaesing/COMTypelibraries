
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({315154AD-F287-33EE-AEDE-8781545C713F})</p>
 */
public enum WdStatistic implements IComEnum {
    
    /**
     * (0)
     */
    wdStatisticWords(0),
    
    /**
     * (1)
     */
    wdStatisticLines(1),
    
    /**
     * (2)
     */
    wdStatisticPages(2),
    
    /**
     * (3)
     */
    wdStatisticCharacters(3),
    
    /**
     * (4)
     */
    wdStatisticParagraphs(4),
    
    /**
     * (5)
     */
    wdStatisticCharactersWithSpaces(5),
    
    /**
     * (6)
     */
    wdStatisticFarEastCharacters(6),
    ;

    private WdStatistic(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}