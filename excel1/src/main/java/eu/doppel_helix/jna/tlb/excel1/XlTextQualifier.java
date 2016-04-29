
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTextQualifier implements IComEnum {
    
    /**
     * (1)
     */
    xlTextQualifierDoubleQuote(1),
    
    /**
     * (-4142)
     */
    xlTextQualifierNone(-4142),
    
    /**
     * (2)
     */
    xlTextQualifierSingleQuote(2),
    ;

    private XlTextQualifier(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}