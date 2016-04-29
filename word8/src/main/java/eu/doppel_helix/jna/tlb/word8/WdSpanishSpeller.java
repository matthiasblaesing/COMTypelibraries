
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdSpanishSpeller implements IComEnum {
    
    /**
     * (0)
     */
    wdSpanishTuteoOnly(0),
    
    /**
     * (1)
     */
    wdSpanishTuteoAndVoseo(1),
    
    /**
     * (2)
     */
    wdSpanishVoseoOnly(2),
    ;

    private WdSpanishSpeller(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}