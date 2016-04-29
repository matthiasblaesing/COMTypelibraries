
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A952AF67-0B87-3F27-8647-F0D2BCE47722})</p>
 */
public enum WdGutterStyleOld implements IComEnum {
    
    /**
     * (-10)
     */
    wdGutterStyleLatin(-10),
    
    /**
     * (2)
     */
    wdGutterStyleBidi(2),
    ;

    private WdGutterStyleOld(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}