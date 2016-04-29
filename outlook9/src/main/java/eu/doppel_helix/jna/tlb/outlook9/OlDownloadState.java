
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlDownloadState implements IComEnum {
    
    /**
     * (0)
     */
    olHeaderOnly(0),
    
    /**
     * (1)
     */
    olFullItem(1),
    ;

    private OlDownloadState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}