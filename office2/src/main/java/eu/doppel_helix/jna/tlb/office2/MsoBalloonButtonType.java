
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBalloonButtonType implements IComEnum {
    
    /**
     * (-15)
     */
    msoBalloonButtonYesToAll(-15),
    
    /**
     * (-14)
     */
    msoBalloonButtonOptions(-14),
    
    /**
     * (-13)
     */
    msoBalloonButtonTips(-13),
    
    /**
     * (-12)
     */
    msoBalloonButtonClose(-12),
    
    /**
     * (-11)
     */
    msoBalloonButtonSnooze(-11),
    
    /**
     * (-10)
     */
    msoBalloonButtonSearch(-10),
    
    /**
     * (-9)
     */
    msoBalloonButtonIgnore(-9),
    
    /**
     * (-8)
     */
    msoBalloonButtonAbort(-8),
    
    /**
     * (-7)
     */
    msoBalloonButtonRetry(-7),
    
    /**
     * (-6)
     */
    msoBalloonButtonNext(-6),
    
    /**
     * (-5)
     */
    msoBalloonButtonBack(-5),
    
    /**
     * (-4)
     */
    msoBalloonButtonNo(-4),
    
    /**
     * (-3)
     */
    msoBalloonButtonYes(-3),
    
    /**
     * (-2)
     */
    msoBalloonButtonCancel(-2),
    
    /**
     * (-1)
     */
    msoBalloonButtonOK(-1),
    
    /**
     * (0)
     */
    msoBalloonButtonNull(0),
    ;

    private MsoBalloonButtonType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}