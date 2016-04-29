
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8180C4A6-20CC-3CD4-9DE0-A1D1384513E5})</p>
 */
public enum WdOMathVertAlignType implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathVertAlignCenter(0),
    
    /**
     * (1)
     */
    wdOMathVertAlignTop(1),
    
    /**
     * (2)
     */
    wdOMathVertAlignBottom(2),
    ;

    private WdOMathVertAlignType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}