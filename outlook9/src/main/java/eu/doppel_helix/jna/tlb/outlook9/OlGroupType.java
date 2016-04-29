
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlGroupType implements IComEnum {
    
    /**
     * (0)
     */
    olCustomFoldersGroup(0),
    
    /**
     * (1)
     */
    olMyFoldersGroup(1),
    
    /**
     * (2)
     */
    olPeopleFoldersGroup(2),
    
    /**
     * (3)
     */
    olOtherFoldersGroup(3),
    
    /**
     * (4)
     */
    olFavoriteFoldersGroup(4),
    
    /**
     * (5)
     */
    olRoomsGroup(5),
    
    /**
     * (6)
     */
    olReadOnlyGroup(6),
    ;

    private OlGroupType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}