
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDVAlertStyle implements IComEnum {
    
    /**
     * (1)
     */
    xlValidAlertStop(1),
    
    /**
     * (2)
     */
    xlValidAlertWarning(2),
    
    /**
     * (3)
     */
    xlValidAlertInformation(3),
    ;

    private XlDVAlertStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}