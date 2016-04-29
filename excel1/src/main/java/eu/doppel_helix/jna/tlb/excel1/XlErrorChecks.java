
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlErrorChecks implements IComEnum {
    
    /**
     * (1)
     */
    xlEvaluateToError(1),
    
    /**
     * (2)
     */
    xlTextDate(2),
    
    /**
     * (3)
     */
    xlNumberAsText(3),
    
    /**
     * (4)
     */
    xlInconsistentFormula(4),
    
    /**
     * (5)
     */
    xlOmittedCells(5),
    
    /**
     * (6)
     */
    xlUnlockedFormulaCells(6),
    
    /**
     * (7)
     */
    xlEmptyCellReferences(7),
    
    /**
     * (8)
     */
    xlListDataValidation(8),
    
    /**
     * (9)
     */
    xlInconsistentListFormula(9),
    ;

    private XlErrorChecks(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}