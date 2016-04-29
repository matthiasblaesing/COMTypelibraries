
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D30C2DB8-0EE9-40F9-AB5A-5DF15F3CF2EB})</p>
 */
public enum WdPageColor implements IComEnum {
    
    /**
     * (0)
     */
    wdPageColorNone(0),
    
    /**
     * (1)
     */
    wdPageColorSepia(1),
    
    /**
     * (2)
     */
    wdPageColorInverse(2),
    ;

    private WdPageColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}