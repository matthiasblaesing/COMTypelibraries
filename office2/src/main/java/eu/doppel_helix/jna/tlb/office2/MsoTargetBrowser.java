
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTargetBrowser implements IComEnum {
    
    /**
     * (0)
     */
    msoTargetBrowserV3(0),
    
    /**
     * (1)
     */
    msoTargetBrowserV4(1),
    
    /**
     * (2)
     */
    msoTargetBrowserIE4(2),
    
    /**
     * (3)
     */
    msoTargetBrowserIE5(3),
    
    /**
     * (4)
     */
    msoTargetBrowserIE6(4),
    ;

    private MsoTargetBrowser(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}