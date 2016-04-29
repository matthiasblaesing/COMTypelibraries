
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlViewSaveOption implements IComEnum {
    
    /**
     * (0)
     */
    olViewSaveOptionThisFolderEveryone(0),
    
    /**
     * (1)
     */
    olViewSaveOptionThisFolderOnlyMe(1),
    
    /**
     * (2)
     */
    olViewSaveOptionAllFoldersOfType(2),
    ;

    private OlViewSaveOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}