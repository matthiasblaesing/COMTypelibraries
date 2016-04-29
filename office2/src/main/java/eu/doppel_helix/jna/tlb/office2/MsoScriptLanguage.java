
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoScriptLanguage implements IComEnum {
    
    /**
     * (1)
     */
    msoScriptLanguageJava(1),
    
    /**
     * (2)
     */
    msoScriptLanguageVisualBasic(2),
    
    /**
     * (3)
     */
    msoScriptLanguageASP(3),
    
    /**
     * (4)
     */
    msoScriptLanguageOther(4),
    ;

    private MsoScriptLanguage(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}