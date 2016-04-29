
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4C4F593A-9757-3A01-AC2D-D155B45AB080})</p>
 */
public enum WdHighAnsiText implements IComEnum {
    
    /**
     * (0)
     */
    wdHighAnsiIsFarEast(0),
    
    /**
     * (1)
     */
    wdHighAnsiIsHighAnsi(1),
    
    /**
     * (2)
     */
    wdAutoDetectHighAnsiFarEast(2),
    ;

    private WdHighAnsiText(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}