
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines object text formats
 *
 * <p>uuid({09FF1992-EA0E-11D3-B391-00105A1F473A})</p>
 */
public enum WbemObjectTextFormatEnum implements IComEnum {
    
    /**
     * (1)
     */
    wbemObjectTextFormatCIMDTD20(1),
    
    /**
     * (2)
     */
    wbemObjectTextFormatWMIDTD20(2),
    ;

    private WbemObjectTextFormatEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}