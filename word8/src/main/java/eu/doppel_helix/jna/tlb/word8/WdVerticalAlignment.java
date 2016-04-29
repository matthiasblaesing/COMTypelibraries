
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({750E1523-2AB0-3E82-9C10-65EE8ED77692})</p>
 */
public enum WdVerticalAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdAlignVerticalTop(0),
    
    /**
     * (1)
     */
    wdAlignVerticalCenter(1),
    
    /**
     * (2)
     */
    wdAlignVerticalJustify(2),
    
    /**
     * (3)
     */
    wdAlignVerticalBottom(3),
    ;

    private WdVerticalAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}