
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlNavigationModuleType implements IComEnum {
    
    /**
     * (0)
     */
    olModuleMail(0),
    
    /**
     * (1)
     */
    olModuleCalendar(1),
    
    /**
     * (2)
     */
    olModuleContacts(2),
    
    /**
     * (3)
     */
    olModuleTasks(3),
    
    /**
     * (4)
     */
    olModuleJournal(4),
    
    /**
     * (5)
     */
    olModuleNotes(5),
    
    /**
     * (6)
     */
    olModuleFolderList(6),
    
    /**
     * (7)
     */
    olModuleShortcuts(7),
    
    /**
     * (8)
     */
    olModuleSolutions(8),
    ;

    private OlNavigationModuleType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}