
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlContextMenu implements IComEnum {
    
    /**
     * (0)
     */
    olItemContextMenu(0),
    
    /**
     * (1)
     */
    olViewContextMenu(1),
    
    /**
     * (2)
     */
    olFolderContextMenu(2),
    
    /**
     * (3)
     */
    olAttachmentContextMenu(3),
    
    /**
     * (4)
     */
    olStoreContextMenu(4),
    
    /**
     * (5)
     */
    olShortcutContextMenu(5),
    ;

    private OlContextMenu(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}