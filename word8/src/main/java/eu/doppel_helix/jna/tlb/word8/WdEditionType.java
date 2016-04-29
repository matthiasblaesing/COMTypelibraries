
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8D0DC233-B993-3557-8702-0B855D6ECB56})</p>
 */
public enum WdEditionType implements IComEnum {
    
    /**
     * (0)
     */
    wdPublisher(0),
    
    /**
     * (1)
     */
    wdSubscriber(1),
    ;

    private WdEditionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}