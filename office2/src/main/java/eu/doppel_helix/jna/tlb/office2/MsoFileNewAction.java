
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileNewAction implements IComEnum {
    
    /**
     * (0)
     */
    msoEditFile(0),
    
    /**
     * (1)
     */
    msoCreateNewFile(1),
    
    /**
     * (2)
     */
    msoOpenFile(2),
    ;

    private MsoFileNewAction(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}