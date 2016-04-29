
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B1E1E568-A954-370D-BDDE-1DEE3FE965D7})</p>
 */
public enum WdOLEVerb implements IComEnum {
    
    /**
     * (0)
     */
    wdOLEVerbPrimary(0),
    
    /**
     * (-1)
     */
    wdOLEVerbShow(-1),
    
    /**
     * (-2)
     */
    wdOLEVerbOpen(-2),
    
    /**
     * (-3)
     */
    wdOLEVerbHide(-3),
    
    /**
     * (-4)
     */
    wdOLEVerbUIActivate(-4),
    
    /**
     * (-5)
     */
    wdOLEVerbInPlaceActivate(-5),
    
    /**
     * (-6)
     */
    wdOLEVerbDiscardUndoState(-6),
    ;

    private WdOLEVerb(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}