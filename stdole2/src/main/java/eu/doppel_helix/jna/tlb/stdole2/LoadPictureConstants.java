
package eu.doppel_helix.jna.tlb.stdole2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E6C8FA08-BD9F-11D0-985E-00C04FC29993})</p>
 */
public enum LoadPictureConstants implements IComEnum {
    
    /**
     * (0)
     */
    _Default(0),
    
    /**
     * (1)
     */
    Monochrome(1),
    
    /**
     * (2)
     */
    VgaColor(2),
    
    /**
     * (4)
     */
    Color(4),
    ;

    private LoadPictureConstants(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}