
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Options for ShellWindows FindWindow
 *
 * <p>uuid({7716A370-38CA-11D0-A48B-00A0C90A8F39})</p>
 */
public enum ShellWindowFindWindowOptions implements IComEnum {
    
    /**
     * Need Dispatch (1)
     */
    SWFO_NEEDDISPATCH(1),
    
    /**
     * Include Pending (2)
     */
    SWFO_INCLUDEPENDING(2),
    
    /**
     * Cookie Passed (4)
     */
    SWFO_COOKIEPASSED(4),
    ;

    private ShellWindowFindWindowOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}