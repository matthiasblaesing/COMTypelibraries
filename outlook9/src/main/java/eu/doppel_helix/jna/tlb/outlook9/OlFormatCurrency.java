
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatCurrency implements IComEnum {
    
    /**
     * (1)
     */
    olFormatCurrencyDecimal(1),
    
    /**
     * (2)
     */
    olFormatCurrencyNonDecimal(2),
    ;

    private OlFormatCurrency(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}