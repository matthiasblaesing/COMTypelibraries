
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({67AC5FF1-FD6C-31ED-A7ED-A11543D2D4FE})</p>
 */
public enum WdMailSystem implements IComEnum {
    
    /**
     * (0)
     */
    wdNoMailSystem(0),
    
    /**
     * (1)
     */
    wdMAPI(1),
    
    /**
     * (2)
     */
    wdPowerTalk(2),
    
    /**
     * (3)
     */
    wdMAPIandPowerTalk(3),
    ;

    private WdMailSystem(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}