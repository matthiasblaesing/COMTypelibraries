
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPhoneticAlignment implements IComEnum {
    
    /**
     * (0)
     */
    xlPhoneticAlignNoControl(0),
    
    /**
     * (1)
     */
    xlPhoneticAlignLeft(1),
    
    /**
     * (2)
     */
    xlPhoneticAlignCenter(2),
    
    /**
     * (3)
     */
    xlPhoneticAlignDistributed(3),
    ;

    private XlPhoneticAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}