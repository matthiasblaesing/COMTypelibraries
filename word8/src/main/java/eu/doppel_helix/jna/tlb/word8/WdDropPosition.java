
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B7E0677C-2BE6-3C25-8F71-A38E34A4E8BA})</p>
 */
public enum WdDropPosition implements IComEnum {
    
    /**
     * (0)
     */
    wdDropNone(0),
    
    /**
     * (1)
     */
    wdDropNormal(1),
    
    /**
     * (2)
     */
    wdDropMargin(2),
    ;

    private WdDropPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}