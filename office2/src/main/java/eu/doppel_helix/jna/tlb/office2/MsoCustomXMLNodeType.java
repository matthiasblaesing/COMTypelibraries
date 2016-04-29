
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCustomXMLNodeType implements IComEnum {
    
    /**
     * (1)
     */
    msoCustomXMLNodeElement(1),
    
    /**
     * (2)
     */
    msoCustomXMLNodeAttribute(2),
    
    /**
     * (3)
     */
    msoCustomXMLNodeText(3),
    
    /**
     * (4)
     */
    msoCustomXMLNodeCData(4),
    
    /**
     * (7)
     */
    msoCustomXMLNodeProcessingInstruction(7),
    
    /**
     * (8)
     */
    msoCustomXMLNodeComment(8),
    
    /**
     * (9)
     */
    msoCustomXMLNodeDocument(9),
    ;

    private MsoCustomXMLNodeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}