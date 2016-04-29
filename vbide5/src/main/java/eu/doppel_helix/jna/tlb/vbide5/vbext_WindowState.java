
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BE39F3DC-1B13-11D0-887F-00A0C90F2744})</p>
 */
public enum vbext_WindowState implements IComEnum {
    
    /**
     * (0)
     */
    vbext_ws_Normal(0),
    
    /**
     * (1)
     */
    vbext_ws_Minimize(1),
    
    /**
     * (2)
     */
    vbext_ws_Maximize(2),
    ;

    private vbext_WindowState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}