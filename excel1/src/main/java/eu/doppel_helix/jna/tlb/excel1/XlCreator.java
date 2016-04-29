
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCreator implements IComEnum {
    
    /**
     * (1480803660)
     */
    xlCreatorCode(1480803660),
    ;

    private XlCreator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}