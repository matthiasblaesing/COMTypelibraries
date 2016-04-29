
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlContainsOperator implements IComEnum {
    
    /**
     * (0)
     */
    xlContains(0),
    
    /**
     * (1)
     */
    xlDoesNotContain(1),
    
    /**
     * (2)
     */
    xlBeginsWith(2),
    
    /**
     * (3)
     */
    xlEndsWith(3),
    ;

    private XlContainsOperator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}