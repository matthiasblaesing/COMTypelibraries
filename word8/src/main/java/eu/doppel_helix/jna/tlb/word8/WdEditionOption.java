
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({409FCE29-2640-3D59-90C8-8A808092DE16})</p>
 */
public enum WdEditionOption implements IComEnum {
    
    /**
     * (0)
     */
    wdCancelPublisher(0),
    
    /**
     * (1)
     */
    wdSendPublisher(1),
    
    /**
     * (2)
     */
    wdSelectPublisher(2),
    
    /**
     * (3)
     */
    wdAutomaticUpdate(3),
    
    /**
     * (4)
     */
    wdManualUpdate(4),
    
    /**
     * (5)
     */
    wdChangeAttributes(5),
    
    /**
     * (6)
     */
    wdUpdateSubscriber(6),
    
    /**
     * (7)
     */
    wdOpenSource(7),
    ;

    private WdEditionOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}