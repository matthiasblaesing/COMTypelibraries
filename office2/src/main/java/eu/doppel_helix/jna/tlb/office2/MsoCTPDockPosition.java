
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCTPDockPosition implements IComEnum {
    
    /**
     * (0)
     */
    msoCTPDockPositionLeft(0),
    
    /**
     * (1)
     */
    msoCTPDockPositionTop(1),
    
    /**
     * (2)
     */
    msoCTPDockPositionRight(2),
    
    /**
     * (3)
     */
    msoCTPDockPositionBottom(3),
    
    /**
     * (4)
     */
    msoCTPDockPositionFloating(4),
    ;

    private MsoCTPDockPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}