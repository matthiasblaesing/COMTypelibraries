
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BF78D790-8DCF-4CF1-9CD4-4FCEB78EBE14})</p>
 */
public enum XlDisplayUnit implements IComEnum {
    
    /**
     * (-2)
     */
    xlHundreds(-2),
    
    /**
     * (-3)
     */
    xlThousands(-3),
    
    /**
     * (-4)
     */
    xlTenThousands(-4),
    
    /**
     * (-5)
     */
    xlHundredThousands(-5),
    
    /**
     * (-6)
     */
    xlMillions(-6),
    
    /**
     * (-7)
     */
    xlTenMillions(-7),
    
    /**
     * (-8)
     */
    xlHundredMillions(-8),
    
    /**
     * (-9)
     */
    xlThousandMillions(-9),
    
    /**
     * (-10)
     */
    xlMillionMillions(-10),
    
    /**
     * (-4114)
     */
    xlDisplayUnitCustom(-4114),
    
    /**
     * (-4142)
     */
    xlDisplayUnitNone(-4142),
    ;

    private XlDisplayUnit(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}