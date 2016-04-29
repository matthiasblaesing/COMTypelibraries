
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({49EC47C3-4535-3DFE-9A5C-D01F1C1BF4A4})</p>
 */
public enum WdListGalleryType implements IComEnum {
    
    /**
     * (1)
     */
    wdBulletGallery(1),
    
    /**
     * (2)
     */
    wdNumberGallery(2),
    
    /**
     * (3)
     */
    wdOutlineNumberGallery(3),
    ;

    private WdListGalleryType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}