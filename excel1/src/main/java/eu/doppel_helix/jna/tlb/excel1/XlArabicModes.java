
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlArabicModes implements IComEnum {
    
    /**
     * (0)
     */
    xlArabicNone(0),
    
    /**
     * (1)
     */
    xlArabicStrictAlefHamza(1),
    
    /**
     * (2)
     */
    xlArabicStrictFinalYaa(2),
    
    /**
     * (3)
     */
    xlArabicBothStrict(3),
    ;

    private XlArabicModes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}