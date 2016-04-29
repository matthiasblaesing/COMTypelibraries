
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlQueryType implements IComEnum {
    
    /**
     * (1)
     */
    xlODBCQuery(1),
    
    /**
     * (2)
     */
    xlDAORecordset(2),
    
    /**
     * (4)
     */
    xlWebQuery(4),
    
    /**
     * (5)
     */
    xlOLEDBQuery(5),
    
    /**
     * (6)
     */
    xlTextImport(6),
    
    /**
     * (7)
     */
    xlADORecordset(7),
    ;

    private XlQueryType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}