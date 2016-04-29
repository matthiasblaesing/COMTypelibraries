
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatKeywords implements IComEnum {
    
    /**
     * (1)
     */
    olFormatKeywordsText(1),
    ;

    private OlFormatKeywords(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}