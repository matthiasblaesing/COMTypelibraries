
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAutoSize implements IComEnum {
    
    /**
     * (-2)
     */
    msoAutoSizeMixed(-2),
    
    /**
     * (0)
     */
    msoAutoSizeNone(0),
    
    /**
     * (1)
     */
    msoAutoSizeShapeToFitText(1),
    
    /**
     * (2)
     */
    msoAutoSizeTextToFitShape(2),
    ;

    private MsoAutoSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}