
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7BAF6C5F-E7D6-37DA-95F4-0864D1128E54})</p>
 */
public enum WdHebSpellStart implements IComEnum {
    
    /**
     * (0)
     */
    wdFullScript(0),
    
    /**
     * (1)
     */
    wdPartialScript(1),
    
    /**
     * (2)
     */
    wdMixedScript(2),
    
    /**
     * (3)
     */
    wdMixedAuthorizedScript(3),
    ;

    private WdHebSpellStart(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}