
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Constants for WebBrowser CommandStateChange
 *
 * <p>uuid({34A226E0-DF30-11CF-89A9-00A0C9054129})</p>
 */
public enum CommandStateChangeConstants implements IComEnum {
    
    /**
     * Command Change (-1)
     */
    CSC_UPDATECOMMANDS(-1),
    
    /**
     * Navigate Forward (1)
     */
    CSC_NAVIGATEFORWARD(1),
    
    /**
     * Navigate Back (2)
     */
    CSC_NAVIGATEBACK(2),
    ;

    private CommandStateChangeConstants(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}