
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlUserPropertyType implements IComEnum {
    
    /**
     * (0)
     */
    olOutlookInternal(0),
    
    /**
     * (1)
     */
    olText(1),
    
    /**
     * (3)
     */
    olNumber(3),
    
    /**
     * (5)
     */
    olDateTime(5),
    
    /**
     * (6)
     */
    olYesNo(6),
    
    /**
     * (7)
     */
    olDuration(7),
    
    /**
     * (11)
     */
    olKeywords(11),
    
    /**
     * (12)
     */
    olPercent(12),
    
    /**
     * (14)
     */
    olCurrency(14),
    
    /**
     * (18)
     */
    olFormula(18),
    
    /**
     * (19)
     */
    olCombination(19),
    
    /**
     * (20)
     */
    olInteger(20),
    
    /**
     * (21)
     */
    olEnumeration(21),
    
    /**
     * (22)
     */
    olSmartFrom(22),
    ;

    private OlUserPropertyType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}