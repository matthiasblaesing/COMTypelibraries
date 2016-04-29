
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatInteger implements IComEnum {
    
    /**
     * (1)
     */
    olFormatIntegerPlain(1),
    
    /**
     * (2)
     */
    olFormatIntegerComputer1(2),
    
    /**
     * (3)
     */
    olFormatIntegerComputer2(3),
    
    /**
     * (4)
     */
    olFormatIntegerComputer3(4),
    ;

    private OlFormatInteger(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}