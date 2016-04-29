
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5489D1D3-5B21-36BE-AA09-34FB4AB52058})</p>
 */
public enum WdTableFieldSeparator implements IComEnum {
    
    /**
     * (0)
     */
    wdSeparateByParagraphs(0),
    
    /**
     * (1)
     */
    wdSeparateByTabs(1),
    
    /**
     * (2)
     */
    wdSeparateByCommas(2),
    
    /**
     * (3)
     */
    wdSeparateByDefaultListSeparator(3),
    ;

    private WdTableFieldSeparator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}