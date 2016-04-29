
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({FCFEF17F-A1D7-396E-907E-C822026DE484})</p>
 */
public enum WdAnimation implements IComEnum {
    
    /**
     * (0)
     */
    wdAnimationNone(0),
    
    /**
     * (1)
     */
    wdAnimationLasVegasLights(1),
    
    /**
     * (2)
     */
    wdAnimationBlinkingBackground(2),
    
    /**
     * (3)
     */
    wdAnimationSparkleText(3),
    
    /**
     * (4)
     */
    wdAnimationMarchingBlackAnts(4),
    
    /**
     * (5)
     */
    wdAnimationMarchingRedAnts(5),
    
    /**
     * (6)
     */
    wdAnimationShimmer(6),
    ;

    private WdAnimation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}