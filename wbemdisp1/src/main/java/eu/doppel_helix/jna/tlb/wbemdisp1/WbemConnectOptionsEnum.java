
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Used to define connection behavior
 *
 */
public enum WbemConnectOptionsEnum implements IComEnum {
    
    /**
     * (128)
     */
    wbemConnectFlagUseMaxWait(128),
    ;

    private WbemConnectOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}