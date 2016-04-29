
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Constants for ShellWindows registration
 *
 * <p>uuid({F41E6981-28E5-11D0-82B4-00A0C90C29C5})</p>
 */
public enum ShellWindowTypeConstants implements IComEnum {
    
    /**
     * Explorer (0)
     */
    SWC_EXPLORER(0),
    
    /**
     * Various Browsing Windows (1)
     */
    SWC_BROWSER(1),
    
    /**
     * 3rd Party Browsers (2)
     */
    SWC_3RDPARTY(2),
    
    /**
     * Creation Callback (4)
     */
    SWC_CALLBACK(4),
    
    /**
     * The Windows Desktop (8)
     */
    SWC_DESKTOP(8),
    ;

    private ShellWindowTypeConstants(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}