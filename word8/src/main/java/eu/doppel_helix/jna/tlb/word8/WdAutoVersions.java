
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2745DBFE-9993-3DAF-96CD-AA9827F23217})</p>
 */
public enum WdAutoVersions implements IComEnum {
    
    /**
     * (0)
     */
    wdAutoVersionOff(0),
    
    /**
     * (1)
     */
    wdAutoVersionOnClose(1),
    ;

    private WdAutoVersions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}