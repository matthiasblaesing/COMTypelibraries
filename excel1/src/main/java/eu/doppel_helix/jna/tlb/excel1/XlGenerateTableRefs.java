
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlGenerateTableRefs implements IComEnum {
    
    /**
     * (0)
     */
    xlGenerateTableRefA1(0),
    
    /**
     * (1)
     */
    xlGenerateTableRefStruct(1),
    ;

    private XlGenerateTableRefs(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}