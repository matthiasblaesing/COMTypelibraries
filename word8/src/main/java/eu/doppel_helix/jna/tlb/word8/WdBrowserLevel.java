
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({417EC967-ACF1-3B68-9743-D9D104681FB3})</p>
 */
public enum WdBrowserLevel implements IComEnum {
    
    /**
     * (0)
     */
    wdBrowserLevelV4(0),
    
    /**
     * (1)
     */
    wdBrowserLevelMicrosoftInternetExplorer5(1),
    
    /**
     * (2)
     */
    wdBrowserLevelMicrosoftInternetExplorer6(2),
    ;

    private WdBrowserLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}