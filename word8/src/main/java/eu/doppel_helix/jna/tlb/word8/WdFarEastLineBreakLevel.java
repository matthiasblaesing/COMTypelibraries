
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({25E17C0C-411C-325C-8596-29DF87921D53})</p>
 */
public enum WdFarEastLineBreakLevel implements IComEnum {
    
    /**
     * (0)
     */
    wdFarEastLineBreakLevelNormal(0),
    
    /**
     * (1)
     */
    wdFarEastLineBreakLevelStrict(1),
    
    /**
     * (2)
     */
    wdFarEastLineBreakLevelCustom(2),
    ;

    private WdFarEastLineBreakLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}