
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlConnectionType implements IComEnum {
    
    /**
     * (1)
     */
    xlConnectionTypeOLEDB(1),
    
    /**
     * (2)
     */
    xlConnectionTypeODBC(2),
    
    /**
     * (3)
     */
    xlConnectionTypeXMLMAP(3),
    
    /**
     * (4)
     */
    xlConnectionTypeTEXT(4),
    
    /**
     * (5)
     */
    xlConnectionTypeWEB(5),
    
    /**
     * (6)
     */
    xlConnectionTypeDATAFEED(6),
    
    /**
     * (7)
     */
    xlConnectionTypeMODEL(7),
    
    /**
     * (8)
     */
    xlConnectionTypeWORKSHEET(8),
    
    /**
     * (9)
     */
    xlConnectionTypeNOSOURCE(9),
    ;

    private XlConnectionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}