
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Constants for WebBrowser NewProcess notification
 *
 * <p>uuid({A8317D46-03CB-4975-AE94-85E9F2E1D020})</p>
 */
public enum NewProcessCauseConstants implements IComEnum {
    
    /**
     * (1)
     */
    ProtectedModeRedirect(1),
    ;

    private NewProcessCauseConstants(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}