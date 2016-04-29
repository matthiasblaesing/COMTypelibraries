
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlEditorType implements IComEnum {
    
    /**
     * (1)
     */
    olEditorText(1),
    
    /**
     * (2)
     */
    olEditorHTML(2),
    
    /**
     * (3)
     */
    olEditorRTF(3),
    
    /**
     * (4)
     */
    olEditorWord(4),
    ;

    private OlEditorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}