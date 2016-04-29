
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7DFA7A62-26A0-3CCE-ADFA-F12E721FB229})</p>
 */
public enum WdOrganizerObject implements IComEnum {
    
    /**
     * (0)
     */
    wdOrganizerObjectStyles(0),
    
    /**
     * (1)
     */
    wdOrganizerObjectAutoText(1),
    
    /**
     * (2)
     */
    wdOrganizerObjectCommandBars(2),
    
    /**
     * (3)
     */
    wdOrganizerObjectProjectItems(3),
    ;

    private WdOrganizerObject(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}