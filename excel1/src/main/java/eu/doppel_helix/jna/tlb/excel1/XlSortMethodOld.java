
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSortMethodOld implements IComEnum {
    
    /**
     * (2)
     */
    xlCodePage(2),
    
    /**
     * (1)
     */
    xlSyllabary(1),
    ;

    private XlSortMethodOld(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}