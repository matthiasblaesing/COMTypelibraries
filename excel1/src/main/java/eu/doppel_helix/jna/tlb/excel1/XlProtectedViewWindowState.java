
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlProtectedViewWindowState implements IComEnum {
    
    /**
     * (0)
     */
    xlProtectedViewWindowNormal(0),
    
    /**
     * (1)
     */
    xlProtectedViewWindowMinimized(1),
    
    /**
     * (2)
     */
    xlProtectedViewWindowMaximized(2),
    ;

    private XlProtectedViewWindowState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}