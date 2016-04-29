
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlCategoryShortcutKey implements IComEnum {
    
    /**
     * (0)
     */
    olCategoryShortcutKeyNone(0),
    
    /**
     * (1)
     */
    olCategoryShortcutKeyCtrlF2(1),
    
    /**
     * (2)
     */
    olCategoryShortcutKeyCtrlF3(2),
    
    /**
     * (3)
     */
    olCategoryShortcutKeyCtrlF4(3),
    
    /**
     * (4)
     */
    olCategoryShortcutKeyCtrlF5(4),
    
    /**
     * (5)
     */
    olCategoryShortcutKeyCtrlF6(5),
    
    /**
     * (6)
     */
    olCategoryShortcutKeyCtrlF7(6),
    
    /**
     * (7)
     */
    olCategoryShortcutKeyCtrlF8(7),
    
    /**
     * (8)
     */
    olCategoryShortcutKeyCtrlF9(8),
    
    /**
     * (9)
     */
    olCategoryShortcutKeyCtrlF10(9),
    
    /**
     * (10)
     */
    olCategoryShortcutKeyCtrlF11(10),
    
    /**
     * (11)
     */
    olCategoryShortcutKeyCtrlF12(11),
    ;

    private OlCategoryShortcutKey(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}