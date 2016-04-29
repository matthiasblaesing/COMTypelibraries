
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSpecialFolders implements IComEnum {
    
    /**
     * (0)
     */
    olSpecialFolderAllTasks(0),
    
    /**
     * (1)
     */
    olSpecialFolderReminders(1),
    ;

    private OlSpecialFolders(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}