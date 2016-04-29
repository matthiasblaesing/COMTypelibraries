
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({89A572CD-0865-35D2-B6BA-4D43B64E123E})</p>
 */
public enum WdAlignmentTabAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdLeft(0),
    
    /**
     * (1)
     */
    wdCenter(1),
    
    /**
     * (2)
     */
    wdRight(2),
    ;

    private WdAlignmentTabAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}