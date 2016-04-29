
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileNewSection implements IComEnum {
    
    /**
     * (0)
     */
    msoOpenDocument(0),
    
    /**
     * (1)
     */
    msoNew(1),
    
    /**
     * (2)
     */
    msoNewfromExistingFile(2),
    
    /**
     * (3)
     */
    msoNewfromTemplate(3),
    
    /**
     * (4)
     */
    msoBottomSection(4),
    ;

    private MsoFileNewSection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}