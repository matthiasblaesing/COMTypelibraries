
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2921EC67-F28A-3ED8-932E-8B5512310330})</p>
 */
public enum WdXMLSelectionChangeReason implements IComEnum {
    
    /**
     * (0)
     */
    wdXMLSelectionChangeReasonMove(0),
    
    /**
     * (1)
     */
    wdXMLSelectionChangeReasonInsert(1),
    
    /**
     * (2)
     */
    wdXMLSelectionChangeReasonDelete(2),
    ;

    private WdXMLSelectionChangeReason(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}