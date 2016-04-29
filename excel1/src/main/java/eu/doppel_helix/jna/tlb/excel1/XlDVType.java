
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDVType implements IComEnum {
    
    /**
     * (0)
     */
    xlValidateInputOnly(0),
    
    /**
     * (1)
     */
    xlValidateWholeNumber(1),
    
    /**
     * (2)
     */
    xlValidateDecimal(2),
    
    /**
     * (3)
     */
    xlValidateList(3),
    
    /**
     * (4)
     */
    xlValidateDate(4),
    
    /**
     * (5)
     */
    xlValidateTime(5),
    
    /**
     * (6)
     */
    xlValidateTextLength(6),
    
    /**
     * (7)
     */
    xlValidateCustom(7),
    ;

    private XlDVType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}