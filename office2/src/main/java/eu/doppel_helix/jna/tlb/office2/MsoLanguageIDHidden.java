
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLanguageIDHidden implements IComEnum {
    
    /**
     * (3076)
     */
    msoLanguageIDChineseHongKong(3076),
    
    /**
     * (5124)
     */
    msoLanguageIDChineseMacao(5124),
    
    /**
     * (11273)
     */
    msoLanguageIDEnglishTrinidad(11273),
    ;

    private MsoLanguageIDHidden(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}