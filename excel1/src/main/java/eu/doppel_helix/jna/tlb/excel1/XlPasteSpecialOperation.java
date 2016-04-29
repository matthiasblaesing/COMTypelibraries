
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPasteSpecialOperation implements IComEnum {
    
    /**
     * (2)
     */
    xlPasteSpecialOperationAdd(2),
    
    /**
     * (5)
     */
    xlPasteSpecialOperationDivide(5),
    
    /**
     * (4)
     */
    xlPasteSpecialOperationMultiply(4),
    
    /**
     * (-4142)
     */
    xlPasteSpecialOperationNone(-4142),
    
    /**
     * (3)
     */
    xlPasteSpecialOperationSubtract(3),
    ;

    private XlPasteSpecialOperation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}