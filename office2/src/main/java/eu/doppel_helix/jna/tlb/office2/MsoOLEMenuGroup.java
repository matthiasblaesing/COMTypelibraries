
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoOLEMenuGroup implements IComEnum {
    
    /**
     * (-1)
     */
    msoOLEMenuGroupNone(-1),
    
    /**
     * (0)
     */
    msoOLEMenuGroupFile(0),
    
    /**
     * (1)
     */
    msoOLEMenuGroupEdit(1),
    
    /**
     * (2)
     */
    msoOLEMenuGroupContainer(2),
    
    /**
     * (3)
     */
    msoOLEMenuGroupObject(3),
    
    /**
     * (4)
     */
    msoOLEMenuGroupWindow(4),
    
    /**
     * (5)
     */
    msoOLEMenuGroupHelp(5),
    ;

    private MsoOLEMenuGroup(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}