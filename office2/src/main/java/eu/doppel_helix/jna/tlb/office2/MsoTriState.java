
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTriState implements IComEnum {
    
    /**
     * (-1)
     */
    msoTrue(-1),
    
    /**
     * (0)
     */
    msoFalse(0),
    
    /**
     * (1)
     */
    msoCTrue(1),
    
    /**
     * (-3)
     */
    msoTriStateToggle(-3),
    
    /**
     * (-2)
     */
    msoTriStateMixed(-2),
    ;

    private MsoTriState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}