
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlIMEMode implements IComEnum {
    
    /**
     * (0)
     */
    xlIMEModeNoControl(0),
    
    /**
     * (1)
     */
    xlIMEModeOn(1),
    
    /**
     * (2)
     */
    xlIMEModeOff(2),
    
    /**
     * (3)
     */
    xlIMEModeDisable(3),
    
    /**
     * (4)
     */
    xlIMEModeHiragana(4),
    
    /**
     * (5)
     */
    xlIMEModeKatakana(5),
    
    /**
     * (6)
     */
    xlIMEModeKatakanaHalf(6),
    
    /**
     * (7)
     */
    xlIMEModeAlphaFull(7),
    
    /**
     * (8)
     */
    xlIMEModeAlpha(8),
    
    /**
     * (9)
     */
    xlIMEModeHangulFull(9),
    
    /**
     * (10)
     */
    xlIMEModeHangul(10),
    ;

    private XlIMEMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}