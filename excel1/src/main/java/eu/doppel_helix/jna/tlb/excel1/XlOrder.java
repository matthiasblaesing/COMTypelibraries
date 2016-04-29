
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlOrder implements IComEnum {
    
    /**
     * (1)
     */
    xlDownThenOver(1),
    
    /**
     * (2)
     */
    xlOverThenDown(2),
    ;

    private XlOrder(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}