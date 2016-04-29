
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAppLanguageID implements IComEnum {
    
    /**
     * (1)
     */
    msoLanguageIDInstall(1),
    
    /**
     * (2)
     */
    msoLanguageIDUI(2),
    
    /**
     * (3)
     */
    msoLanguageIDHelp(3),
    
    /**
     * (4)
     */
    msoLanguageIDExeMode(4),
    
    /**
     * (5)
     */
    msoLanguageIDUIPrevious(5),
    ;

    private MsoAppLanguageID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}