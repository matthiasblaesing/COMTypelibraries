
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1D81C8D5-149B-481D-B4AF-7605E0942FAF})</p>
 */
public enum WdContentControlAppearance implements IComEnum {
    
    /**
     * (0)
     */
    wdContentControlBoundingBox(0),
    
    /**
     * (1)
     */
    wdContentControlTags(1),
    
    /**
     * (2)
     */
    wdContentControlHidden(2),
    ;

    private WdContentControlAppearance(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}