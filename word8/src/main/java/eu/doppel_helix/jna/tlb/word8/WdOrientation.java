
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({35023E17-F1A4-3D19-A3C9-B28D30158769})</p>
 */
public enum WdOrientation implements IComEnum {
    
    /**
     * (0)
     */
    wdOrientPortrait(0),
    
    /**
     * (1)
     */
    wdOrientLandscape(1),
    ;

    private WdOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}