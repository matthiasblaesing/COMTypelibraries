
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlInspectorClose implements IComEnum {
    
    /**
     * (0)
     */
    olSave(0),
    
    /**
     * (1)
     */
    olDiscard(1),
    
    /**
     * (2)
     */
    olPromptForSave(2),
    ;

    private OlInspectorClose(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}