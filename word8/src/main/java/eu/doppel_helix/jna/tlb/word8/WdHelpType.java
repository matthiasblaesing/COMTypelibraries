
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2253A7C8-C563-386D-BDC6-B55E72015C02})</p>
 */
public enum WdHelpType implements IComEnum {
    
    /**
     * (0)
     */
    wdHelp(0),
    
    /**
     * (1)
     */
    wdHelpAbout(1),
    
    /**
     * (2)
     */
    wdHelpActiveWindow(2),
    
    /**
     * (3)
     */
    wdHelpContents(3),
    
    /**
     * (4)
     */
    wdHelpExamplesAndDemos(4),
    
    /**
     * (5)
     */
    wdHelpIndex(5),
    
    /**
     * (6)
     */
    wdHelpKeyboard(6),
    
    /**
     * (7)
     */
    wdHelpPSSHelp(7),
    
    /**
     * (8)
     */
    wdHelpQuickPreview(8),
    
    /**
     * (9)
     */
    wdHelpSearch(9),
    
    /**
     * (10)
     */
    wdHelpUsingHelp(10),
    
    /**
     * (11)
     */
    wdHelpIchitaro(11),
    
    /**
     * (12)
     */
    wdHelpPE2(12),
    
    /**
     * (13)
     */
    wdHelpHWP(13),
    ;

    private WdHelpType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}