
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E8408DCB-9426-3394-B017-F49092A37E32})</p>
 */
public enum WdRevisionsWrap implements IComEnum {
    
    /**
     * (0)
     */
    wdWrapNever(0),
    
    /**
     * (1)
     */
    wdWrapAlways(1),
    
    /**
     * (2)
     */
    wdWrapAsk(2),
    ;

    private WdRevisionsWrap(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}