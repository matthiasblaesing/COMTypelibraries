
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({93914D16-797F-3747-8421-54B51590CEF1})</p>
 */
public enum WdAraSpeller implements IComEnum {
    
    /**
     * (0)
     */
    wdNone(0),
    
    /**
     * (1)
     */
    wdInitialAlef(1),
    
    /**
     * (2)
     */
    wdFinalYaa(2),
    
    /**
     * (3)
     */
    wdBoth(3),
    ;

    private WdAraSpeller(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}