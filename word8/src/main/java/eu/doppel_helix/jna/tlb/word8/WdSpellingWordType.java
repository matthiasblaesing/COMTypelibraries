
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({38D365EE-71C2-3B51-9BD2-EC09E5875C59})</p>
 */
public enum WdSpellingWordType implements IComEnum {
    
    /**
     * (0)
     */
    wdSpellword(0),
    
    /**
     * (1)
     */
    wdWildcard(1),
    
    /**
     * (2)
     */
    wdAnagram(2),
    ;

    private WdSpellingWordType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}