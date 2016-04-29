
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({CA59C2ED-82CC-31EB-9817-0158DCD475E4})</p>
 */
public enum WdCharacterWidth implements IComEnum {
    
    /**
     * (6)
     */
    wdWidthHalfWidth(6),
    
    /**
     * (7)
     */
    wdWidthFullWidth(7),
    ;

    private WdCharacterWidth(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}