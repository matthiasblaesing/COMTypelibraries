
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPriority implements IComEnum {
    
    /**
     * (-4127)
     */
    xlPriorityHigh(-4127),
    
    /**
     * (-4134)
     */
    xlPriorityLow(-4134),
    
    /**
     * (-4143)
     */
    xlPriorityNormal(-4143),
    ;

    private XlPriority(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}