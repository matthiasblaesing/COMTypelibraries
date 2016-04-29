
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0A4D5556-FEDB-329E-8EEE-04AB37C53B94})</p>
 */
public enum WdNumberingRule implements IComEnum {
    
    /**
     * (0)
     */
    wdRestartContinuous(0),
    
    /**
     * (1)
     */
    wdRestartSection(1),
    
    /**
     * (2)
     */
    wdRestartPage(2),
    ;

    private WdNumberingRule(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}