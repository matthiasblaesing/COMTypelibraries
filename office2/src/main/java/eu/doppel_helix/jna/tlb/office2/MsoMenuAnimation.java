
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoMenuAnimation implements IComEnum {
    
    /**
     * (0)
     */
    msoMenuAnimationNone(0),
    
    /**
     * (1)
     */
    msoMenuAnimationRandom(1),
    
    /**
     * (2)
     */
    msoMenuAnimationUnfold(2),
    
    /**
     * (3)
     */
    msoMenuAnimationSlide(3),
    ;

    private MsoMenuAnimation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}