
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlXmlImportResult implements IComEnum {
    
    /**
     * (0)
     */
    xlXmlImportSuccess(0),
    
    /**
     * (1)
     */
    xlXmlImportElementsTruncated(1),
    
    /**
     * (2)
     */
    xlXmlImportValidationFailed(2),
    ;

    private XlXmlImportResult(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}