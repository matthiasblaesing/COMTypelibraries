
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdConstants implements IComEnum {
    
    /**
     * (9999999)
     */
    wdUndefined(9999999),
    
    /**
     * (9999998)
     */
    wdToggle(9999998),
    
    /**
     * (1073741823)
     */
    wdForward(1073741823),
    
    /**
     * (-1073741823)
     */
    wdBackward(-1073741823),
    
    /**
     * (0)
     */
    wdAutoPosition(0),
    
    /**
     * (1)
     */
    wdFirst(1),
    
    /**
     * (1297307460)
     */
    wdCreatorCode(1297307460),
    ;

    private WdConstants(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}