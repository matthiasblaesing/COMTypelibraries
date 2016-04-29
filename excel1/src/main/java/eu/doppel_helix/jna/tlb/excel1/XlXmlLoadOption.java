
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlXmlLoadOption implements IComEnum {
    
    /**
     * (0)
     */
    xlXmlLoadPromptUser(0),
    
    /**
     * (1)
     */
    xlXmlLoadOpenXml(1),
    
    /**
     * (2)
     */
    xlXmlLoadImportToList(2),
    
    /**
     * (3)
     */
    xlXmlLoadMapXml(3),
    ;

    private XlXmlLoadOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}