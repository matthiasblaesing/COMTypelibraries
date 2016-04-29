
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B7721110-1D37-39DE-9890-E292845D2A25})</p>
 */
public enum WdBorderDistanceFrom implements IComEnum {
    
    /**
     * (0)
     */
    wdBorderDistanceFromText(0),
    
    /**
     * (1)
     */
    wdBorderDistanceFromPageEdge(1),
    ;

    private WdBorderDistanceFrom(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}