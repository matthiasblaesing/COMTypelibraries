
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLineJoinStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoLineJoinMixed(-2),
    
    /**
     * (1)
     */
    msoLineJoinRound(1),
    
    /**
     * (2)
     */
    msoLineJoinBevel(2),
    
    /**
     * (3)
     */
    msoLineJoinMiter(3),
    ;

    private MsoLineJoinStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}