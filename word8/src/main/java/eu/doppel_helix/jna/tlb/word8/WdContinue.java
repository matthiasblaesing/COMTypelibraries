
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({737849E0-892D-320B-A3FD-9121557D4C3C})</p>
 */
public enum WdContinue implements IComEnum {
    
    /**
     * (0)
     */
    wdContinueDisabled(0),
    
    /**
     * (1)
     */
    wdResetList(1),
    
    /**
     * (2)
     */
    wdContinueList(2),
    ;

    private WdContinue(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}