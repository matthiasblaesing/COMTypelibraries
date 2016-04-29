
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlWindowState implements IComEnum {
    
    /**
     * (0)
     */
    olMaximized(0),
    
    /**
     * (1)
     */
    olMinimized(1),
    
    /**
     * (2)
     */
    olNormalWindow(2),
    ;

    private OlWindowState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}