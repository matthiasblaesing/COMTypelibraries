
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoZOrderCmd implements IComEnum {
    
    /**
     * (0)
     */
    msoBringToFront(0),
    
    /**
     * (1)
     */
    msoSendToBack(1),
    
    /**
     * (2)
     */
    msoBringForward(2),
    
    /**
     * (3)
     */
    msoSendBackward(3),
    
    /**
     * (4)
     */
    msoBringInFrontOfText(4),
    
    /**
     * (5)
     */
    msoSendBehindText(5),
    ;

    private MsoZOrderCmd(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}