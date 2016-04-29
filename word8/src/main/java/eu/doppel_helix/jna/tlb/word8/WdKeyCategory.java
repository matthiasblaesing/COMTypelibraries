
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({13125B67-CC0F-313B-A28D-E4C74F81E126})</p>
 */
public enum WdKeyCategory implements IComEnum {
    
    /**
     * (-1)
     */
    wdKeyCategoryNil(-1),
    
    /**
     * (0)
     */
    wdKeyCategoryDisable(0),
    
    /**
     * (1)
     */
    wdKeyCategoryCommand(1),
    
    /**
     * (2)
     */
    wdKeyCategoryMacro(2),
    
    /**
     * (3)
     */
    wdKeyCategoryFont(3),
    
    /**
     * (4)
     */
    wdKeyCategoryAutoText(4),
    
    /**
     * (5)
     */
    wdKeyCategoryStyle(5),
    
    /**
     * (6)
     */
    wdKeyCategorySymbol(6),
    
    /**
     * (7)
     */
    wdKeyCategoryPrefix(7),
    ;

    private WdKeyCategory(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}