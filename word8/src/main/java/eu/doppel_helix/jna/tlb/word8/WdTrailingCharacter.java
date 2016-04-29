
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6A35E992-C575-318D-90C2-8F54B40236D6})</p>
 */
public enum WdTrailingCharacter implements IComEnum {
    
    /**
     * (0)
     */
    wdTrailingTab(0),
    
    /**
     * (1)
     */
    wdTrailingSpace(1),
    
    /**
     * (2)
     */
    wdTrailingNone(2),
    ;

    private WdTrailingCharacter(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}