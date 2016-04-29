
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5A7BBEA6-5356-39AB-A10C-F86DB4214C3F})</p>
 */
public enum WdApplyQuickStyleSets implements IComEnum {
    
    /**
     * (1)
     */
    wdSessionStartSet(1),
    
    /**
     * (2)
     */
    wdTemplateSet(2),
    ;

    private WdApplyQuickStyleSets(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}