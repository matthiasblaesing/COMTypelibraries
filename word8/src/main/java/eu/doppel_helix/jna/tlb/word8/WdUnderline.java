
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({DA77B198-31E3-312B-83EB-A0CFD52B0085})</p>
 */
public enum WdUnderline implements IComEnum {
    
    /**
     * (0)
     */
    wdUnderlineNone(0),
    
    /**
     * (1)
     */
    wdUnderlineSingle(1),
    
    /**
     * (2)
     */
    wdUnderlineWords(2),
    
    /**
     * (3)
     */
    wdUnderlineDouble(3),
    
    /**
     * (4)
     */
    wdUnderlineDotted(4),
    
    /**
     * (6)
     */
    wdUnderlineThick(6),
    
    /**
     * (7)
     */
    wdUnderlineDash(7),
    
    /**
     * (9)
     */
    wdUnderlineDotDash(9),
    
    /**
     * (10)
     */
    wdUnderlineDotDotDash(10),
    
    /**
     * (11)
     */
    wdUnderlineWavy(11),
    
    /**
     * (27)
     */
    wdUnderlineWavyHeavy(27),
    
    /**
     * (20)
     */
    wdUnderlineDottedHeavy(20),
    
    /**
     * (23)
     */
    wdUnderlineDashHeavy(23),
    
    /**
     * (25)
     */
    wdUnderlineDotDashHeavy(25),
    
    /**
     * (26)
     */
    wdUnderlineDotDotDashHeavy(26),
    
    /**
     * (39)
     */
    wdUnderlineDashLong(39),
    
    /**
     * (55)
     */
    wdUnderlineDashLongHeavy(55),
    
    /**
     * (43)
     */
    wdUnderlineWavyDouble(43),
    ;

    private WdUnderline(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}