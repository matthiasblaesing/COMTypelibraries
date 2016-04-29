
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EF1C5FC6-1180-3B71-B879-33355000E318})</p>
 */
public enum WdMailMergeDestination implements IComEnum {
    
    /**
     * (0)
     */
    wdSendToNewDocument(0),
    
    /**
     * (1)
     */
    wdSendToPrinter(1),
    
    /**
     * (2)
     */
    wdSendToEmail(2),
    
    /**
     * (3)
     */
    wdSendToFax(3),
    ;

    private WdMailMergeDestination(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}