
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({06F6494C-22D0-33D8-83F3-F466584578A8})</p>
 */
public enum WdTemplateType implements IComEnum {
    
    /**
     * (0)
     */
    wdNormalTemplate(0),
    
    /**
     * (1)
     */
    wdGlobalTemplate(1),
    
    /**
     * (2)
     */
    wdAttachedTemplate(2),
    ;

    private WdTemplateType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}