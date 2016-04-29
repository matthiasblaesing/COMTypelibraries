
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7FBA9601-95D8-3525-8834-A1BB7BB5BB0D})</p>
 */
public enum WdOLEType implements IComEnum {
    
    /**
     * (0)
     */
    wdOLELink(0),
    
    /**
     * (1)
     */
    wdOLEEmbed(1),
    
    /**
     * (2)
     */
    wdOLEControl(2),
    ;

    private WdOLEType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}