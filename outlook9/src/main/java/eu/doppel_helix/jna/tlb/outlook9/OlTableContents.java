
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlTableContents implements IComEnum {
    
    /**
     * (0)
     */
    olUserItems(0),
    
    /**
     * (1)
     */
    olHiddenItems(1),
    ;

    private OlTableContents(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}