
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLinkStatus implements IComEnum {
    
    /**
     * (0)
     */
    xlLinkStatusOK(0),
    
    /**
     * (1)
     */
    xlLinkStatusMissingFile(1),
    
    /**
     * (2)
     */
    xlLinkStatusMissingSheet(2),
    
    /**
     * (3)
     */
    xlLinkStatusOld(3),
    
    /**
     * (4)
     */
    xlLinkStatusSourceNotCalculated(4),
    
    /**
     * (5)
     */
    xlLinkStatusIndeterminate(5),
    
    /**
     * (6)
     */
    xlLinkStatusNotStarted(6),
    
    /**
     * (7)
     */
    xlLinkStatusInvalidName(7),
    
    /**
     * (8)
     */
    xlLinkStatusSourceNotOpen(8),
    
    /**
     * (9)
     */
    xlLinkStatusSourceOpen(9),
    
    /**
     * (10)
     */
    xlLinkStatusCopiedValues(10),
    ;

    private XlLinkStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}