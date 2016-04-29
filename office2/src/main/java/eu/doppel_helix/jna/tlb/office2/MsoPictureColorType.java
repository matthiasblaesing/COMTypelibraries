
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPictureColorType implements IComEnum {
    
    /**
     * (-2)
     */
    msoPictureMixed(-2),
    
    /**
     * (1)
     */
    msoPictureAutomatic(1),
    
    /**
     * (2)
     */
    msoPictureGrayscale(2),
    
    /**
     * (3)
     */
    msoPictureBlackAndWhite(3),
    
    /**
     * (4)
     */
    msoPictureWatermark(4),
    ;

    private MsoPictureColorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}