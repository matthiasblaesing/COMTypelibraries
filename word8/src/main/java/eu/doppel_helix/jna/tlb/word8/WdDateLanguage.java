
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({78AABE7B-69ED-3039-A665-AAFD53268F74})</p>
 */
public enum WdDateLanguage implements IComEnum {
    
    /**
     * (10)
     */
    wdDateLanguageBidi(10),
    
    /**
     * (1033)
     */
    wdDateLanguageLatin(1033),
    ;

    private WdDateLanguage(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}