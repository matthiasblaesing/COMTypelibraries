
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlXmlExportResult implements IComEnum {
    
    /**
     * (0)
     */
    xlXmlExportSuccess(0),
    
    /**
     * (1)
     */
    xlXmlExportValidationFailed(1),
    ;

    private XlXmlExportResult(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}