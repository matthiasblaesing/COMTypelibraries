
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlOfficeDocItemsType implements IComEnum {
    
    /**
     * (8)
     */
    olExcelWorkSheetItem(8),
    
    /**
     * (9)
     */
    olWordDocumentItem(9),
    
    /**
     * (10)
     */
    olPowerPointShowItem(10),
    ;

    private OlOfficeDocItemsType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}