
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlBorderWeight implements IComEnum {
    
    /**
     * (1)
     */
    xlHairline(1),
    
    /**
     * (-4138)
     */
    xlMedium(-4138),
    
    /**
     * (4)
     */
    xlThick(4),
    
    /**
     * (2)
     */
    xlThin(2),
    ;

    private XlBorderWeight(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}