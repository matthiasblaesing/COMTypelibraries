
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OLECMDEXECOPT implements IComEnum {
    
    /**
     * (0)
     */
    OLECMDEXECOPT_DODEFAULT(0),
    
    /**
     * (1)
     */
    OLECMDEXECOPT_PROMPTUSER(1),
    
    /**
     * (2)
     */
    OLECMDEXECOPT_DONTPROMPTUSER(2),
    
    /**
     * (3)
     */
    OLECMDEXECOPT_SHOWHELP(3),
    ;

    private OLECMDEXECOPT(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}