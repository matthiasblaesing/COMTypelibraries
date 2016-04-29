
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLookFor implements IComEnum {
    
    /**
     * (0)
     */
    xlLookForBlanks(0),
    
    /**
     * (1)
     */
    xlLookForErrors(1),
    
    /**
     * (2)
     */
    xlLookForFormulas(2),
    ;

    private XlLookFor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}