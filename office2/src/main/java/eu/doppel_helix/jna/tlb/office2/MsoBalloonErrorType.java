
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBalloonErrorType implements IComEnum {
    
    /**
     * (0)
     */
    msoBalloonErrorNone(0),
    
    /**
     * (1)
     */
    msoBalloonErrorOther(1),
    
    /**
     * (2)
     */
    msoBalloonErrorTooBig(2),
    
    /**
     * (3)
     */
    msoBalloonErrorOutOfMemory(3),
    
    /**
     * (4)
     */
    msoBalloonErrorBadPictureRef(4),
    
    /**
     * (5)
     */
    msoBalloonErrorBadReference(5),
    
    /**
     * (6)
     */
    msoBalloonErrorButtonlessModal(6),
    
    /**
     * (7)
     */
    msoBalloonErrorButtonModeless(7),
    
    /**
     * (8)
     */
    msoBalloonErrorBadCharacter(8),
    
    /**
     * (9)
     */
    msoBalloonErrorCOMFailure(9),
    
    /**
     * (10)
     */
    msoBalloonErrorCharNotTopmostForModal(10),
    
    /**
     * (11)
     */
    msoBalloonErrorTooManyControls(11),
    ;

    private MsoBalloonErrorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}