
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7330A015-09E0-3785-8822-6B47D821FA7E})</p>
 */
public enum WdXMLValidationStatus implements IComEnum {
    
    /**
     * (0)
     */
    wdXMLValidationStatusOK(0),
    
    /**
     * (-1072898048)
     */
    wdXMLValidationStatusCustom(-1072898048),
    ;

    private WdXMLValidationStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}