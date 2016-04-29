
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7CC8C2D6-8F8A-490B-B6F8-3C410554F9E4})</p>
 */
public enum XlMarkerStyle implements IComEnum {
    
    /**
     * (-4105)
     */
    xlMarkerStyleAutomatic(-4105),
    
    /**
     * (8)
     */
    xlMarkerStyleCircle(8),
    
    /**
     * (-4115)
     */
    xlMarkerStyleDash(-4115),
    
    /**
     * (2)
     */
    xlMarkerStyleDiamond(2),
    
    /**
     * (-4118)
     */
    xlMarkerStyleDot(-4118),
    
    /**
     * (-4142)
     */
    xlMarkerStyleNone(-4142),
    
    /**
     * (-4147)
     */
    xlMarkerStylePicture(-4147),
    
    /**
     * (9)
     */
    xlMarkerStylePlus(9),
    
    /**
     * (1)
     */
    xlMarkerStyleSquare(1),
    
    /**
     * (5)
     */
    xlMarkerStyleStar(5),
    
    /**
     * (3)
     */
    xlMarkerStyleTriangle(3),
    
    /**
     * (-4168)
     */
    xlMarkerStyleX(-4168),
    ;

    private XlMarkerStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}