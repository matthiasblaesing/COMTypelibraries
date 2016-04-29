
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1410BEF9-CE35-3B3A-8830-B9D445CD0905})</p>
 */
public enum WdKana implements IComEnum {
    
    /**
     * (8)
     */
    wdKanaKatakana(8),
    
    /**
     * (9)
     */
    wdKanaHiragana(9),
    ;

    private WdKana(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}