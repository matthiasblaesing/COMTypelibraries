
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlRangeValueDataType implements IComEnum {
    
    /**
     * (10)
     */
    xlRangeValueDefault(10),
    
    /**
     * (11)
     */
    xlRangeValueXMLSpreadsheet(11),
    
    /**
     * (12)
     */
    xlRangeValueMSPersistXML(12),
    ;

    private XlRangeValueDataType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}