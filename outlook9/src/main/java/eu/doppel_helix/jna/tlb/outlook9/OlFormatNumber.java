
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatNumber implements IComEnum {
    
    /**
     * (1)
     */
    olFormatNumberAllDigits(1),
    
    /**
     * (2)
     */
    olFormatNumberTruncated(2),
    
    /**
     * (3)
     */
    olFormatNumber1Decimal(3),
    
    /**
     * (4)
     */
    olFormatNumber2Decimal(4),
    
    /**
     * (5)
     */
    olFormatNumberScientific(5),
    
    /**
     * (6)
     */
    olFormatNumberComputer1(6),
    
    /**
     * (7)
     */
    olFormatNumberComputer2(7),
    
    /**
     * (8)
     */
    olFormatNumberComputer3(8),
    
    /**
     * (9)
     */
    olFormatNumberRaw(9),
    ;

    private OlFormatNumber(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}