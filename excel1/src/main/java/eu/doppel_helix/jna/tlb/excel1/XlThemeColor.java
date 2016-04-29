
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlThemeColor implements IComEnum {
    
    /**
     * (1)
     */
    xlThemeColorDark1(1),
    
    /**
     * (2)
     */
    xlThemeColorLight1(2),
    
    /**
     * (3)
     */
    xlThemeColorDark2(3),
    
    /**
     * (4)
     */
    xlThemeColorLight2(4),
    
    /**
     * (5)
     */
    xlThemeColorAccent1(5),
    
    /**
     * (6)
     */
    xlThemeColorAccent2(6),
    
    /**
     * (7)
     */
    xlThemeColorAccent3(7),
    
    /**
     * (8)
     */
    xlThemeColorAccent4(8),
    
    /**
     * (9)
     */
    xlThemeColorAccent5(9),
    
    /**
     * (10)
     */
    xlThemeColorAccent6(10),
    
    /**
     * (11)
     */
    xlThemeColorHyperlink(11),
    
    /**
     * (12)
     */
    xlThemeColorFollowedHyperlink(12),
    ;

    private XlThemeColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}