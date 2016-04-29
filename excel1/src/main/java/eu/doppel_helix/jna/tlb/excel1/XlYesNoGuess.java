
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlYesNoGuess implements IComEnum {
    
    /**
     * (0)
     */
    xlGuess(0),
    
    /**
     * (2)
     */
    xlNo(2),
    
    /**
     * (1)
     */
    xlYes(1),
    ;

    private XlYesNoGuess(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}