
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlMousePointer implements IComEnum {
    
    /**
     * (3)
     */
    xlIBeam(3),
    
    /**
     * (-4143)
     */
    xlDefault(-4143),
    
    /**
     * (1)
     */
    xlNorthwestArrow(1),
    
    /**
     * (2)
     */
    xlWait(2),
    ;

    private XlMousePointer(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}