
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A7DA9C5F-296D-3269-AAD9-8127DE331A0A})</p>
 */
public enum WdWindowType implements IComEnum {
    
    /**
     * (0)
     */
    wdWindowDocument(0),
    
    /**
     * (1)
     */
    wdWindowTemplate(1),
    ;

    private WdWindowType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}