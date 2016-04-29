
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({047ED75F-BCE6-33AF-834D-611873724A72})</p>
 */
public enum WdTCSCConverterDirection implements IComEnum {
    
    /**
     * (0)
     */
    wdTCSCConverterDirectionSCTC(0),
    
    /**
     * (1)
     */
    wdTCSCConverterDirectionTCSC(1),
    
    /**
     * (2)
     */
    wdTCSCConverterDirectionAuto(2),
    ;

    private WdTCSCConverterDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}