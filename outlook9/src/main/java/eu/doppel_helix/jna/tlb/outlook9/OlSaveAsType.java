
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSaveAsType implements IComEnum {
    
    /**
     * (0)
     */
    olTXT(0),
    
    /**
     * (1)
     */
    olRTF(1),
    
    /**
     * (2)
     */
    olTemplate(2),
    
    /**
     * (3)
     */
    olMSG(3),
    
    /**
     * (4)
     */
    olDoc(4),
    
    /**
     * (5)
     */
    olHTML(5),
    
    /**
     * (6)
     */
    olVCard(6),
    
    /**
     * (7)
     */
    olVCal(7),
    
    /**
     * (8)
     */
    olICal(8),
    
    /**
     * (9)
     */
    olMSGUnicode(9),
    
    /**
     * (10)
     */
    olMHTML(10),
    ;

    private OlSaveAsType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}