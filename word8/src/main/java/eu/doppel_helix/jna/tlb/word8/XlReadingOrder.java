
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlReadingOrder implements IComEnum {
    
    /**
     * (-5002)
     */
    xlContext(-5002),
    
    /**
     * (-5003)
     */
    xlLTR(-5003),
    
    /**
     * (-5004)
     */
    xlRTL(-5004),
    ;

    private XlReadingOrder(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}