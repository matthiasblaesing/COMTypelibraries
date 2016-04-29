
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1BA5FCB6-05E9-4721-979D-3CE2C9084479})</p>
 */
public enum OlMousePointer implements IComEnum {
    
    /**
     * Default (0)
     */
    olMousePointerDefault(0),
    
    /**
     * Arrow (1)
     */
    olMousePointerArrow(1),
    
    /**
     * Cross (2)
     */
    olMousePointerCross(2),
    
    /**
     * IBeam (3)
     */
    olMousePointerIBeam(3),
    
    /**
     * SizeNESW (6)
     */
    olMousePointerSizeNESW(6),
    
    /**
     * SizeNS (7)
     */
    olMousePointerSizeNS(7),
    
    /**
     * SizeNWSE (8)
     */
    olMousePointerSizeNWSE(8),
    
    /**
     * SizeWE (9)
     */
    olMousePointerSizeWE(9),
    
    /**
     * UpArrow (10)
     */
    olMousePointerUpArrow(10),
    
    /**
     * HourGlass (11)
     */
    olMousePointerHourGlass(11),
    
    /**
     * NoDrop (12)
     */
    olMousePointerNoDrop(12),
    
    /**
     * AppStarting (13)
     */
    olMousePointerAppStarting(13),
    
    /**
     * Help (14)
     */
    olMousePointerHelp(14),
    
    /**
     * SizeAll (15)
     */
    olMousePointerSizeAll(15),
    
    /**
     * Custom (99)
     */
    olMousePointerCustom(99),
    ;

    private OlMousePointer(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}