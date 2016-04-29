
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlPane implements IComEnum {
    
    /**
     * (1)
     */
    olOutlookBar(1),
    
    /**
     * (2)
     */
    olFolderList(2),
    
    /**
     * (3)
     */
    olPreview(3),
    
    /**
     * (4)
     */
    olNavigationPane(4),
    
    /**
     * (5)
     */
    olToDoBar(5),
    ;

    private OlPane(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}