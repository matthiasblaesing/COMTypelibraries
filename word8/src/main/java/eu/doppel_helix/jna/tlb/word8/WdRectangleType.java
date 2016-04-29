
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2C21A8CF-AB68-3F7E-92F9-B745177DF535})</p>
 */
public enum WdRectangleType implements IComEnum {
    
    /**
     * (0)
     */
    wdTextRectangle(0),
    
    /**
     * (1)
     */
    wdShapeRectangle(1),
    
    /**
     * (2)
     */
    wdMarkupRectangle(2),
    
    /**
     * (3)
     */
    wdMarkupRectangleButton(3),
    
    /**
     * (4)
     */
    wdPageBorderRectangle(4),
    
    /**
     * (5)
     */
    wdLineBetweenColumnRectangle(5),
    
    /**
     * (6)
     */
    wdSelection(6),
    
    /**
     * (7)
     */
    wdSystem(7),
    
    /**
     * (8)
     */
    wdMarkupRectangleArea(8),
    
    /**
     * (9)
     */
    wdReadingModeNavigation(9),
    
    /**
     * (10)
     */
    wdMarkupRectangleMoveMatch(10),
    
    /**
     * (11)
     */
    wdReadingModePanningArea(11),
    
    /**
     * (12)
     */
    wdMailNavArea(12),
    
    /**
     * (13)
     */
    wdDocumentControlRectangle(13),
    ;

    private WdRectangleType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}