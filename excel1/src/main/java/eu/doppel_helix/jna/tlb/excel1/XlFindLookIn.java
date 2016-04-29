
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFindLookIn implements IComEnum {
    
    /**
     * (-4123)
     */
    xlFormulas(-4123),
    
    /**
     * (-4144)
     */
    xlComments(-4144),
    
    /**
     * (-4163)
     */
    xlValues(-4163),
    ;

    private XlFindLookIn(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}