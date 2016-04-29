
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSearchScope implements IComEnum {
    
    /**
     * (0)
     */
    olSearchScopeCurrentFolder(0),
    
    /**
     * (1)
     */
    olSearchScopeAllFolders(1),
    
    /**
     * (2)
     */
    olSearchScopeAllOutlookItems(2),
    
    /**
     * (3)
     */
    olSearchScopeSubfolders(3),
    
    /**
     * (4)
     */
    olSearchScopeCurrentStore(4),
    ;

    private OlSearchScope(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}