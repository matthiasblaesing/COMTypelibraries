
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlWindowState implements IComEnum {
    
    /**
     * (-4137)
     */
    xlMaximized(-4137),
    
    /**
     * (-4140)
     */
    xlMinimized(-4140),
    
    /**
     * (-4143)
     */
    xlNormal(-4143),
    ;

    private XlWindowState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}