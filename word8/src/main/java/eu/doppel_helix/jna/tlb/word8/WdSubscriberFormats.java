
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2AA0788C-78E4-39B9-AE23-B2A18849B924})</p>
 */
public enum WdSubscriberFormats implements IComEnum {
    
    /**
     * (0)
     */
    wdSubscriberBestFormat(0),
    
    /**
     * (1)
     */
    wdSubscriberRTF(1),
    
    /**
     * (2)
     */
    wdSubscriberText(2),
    
    /**
     * (4)
     */
    wdSubscriberPict(4),
    ;

    private WdSubscriberFormats(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}