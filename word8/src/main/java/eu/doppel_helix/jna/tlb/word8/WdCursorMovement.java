
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({707EF034-24E7-3EDE-BB67-748FB000CC52})</p>
 */
public enum WdCursorMovement implements IComEnum {
    
    /**
     * (0)
     */
    wdCursorMovementLogical(0),
    
    /**
     * (1)
     */
    wdCursorMovementVisual(1),
    ;

    private WdCursorMovement(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}