
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9A947B78-450D-3757-B619-68CECCE5BCF5})</p>
 */
public enum WdAutoMacros implements IComEnum {
    
    /**
     * (0)
     */
    wdAutoExec(0),
    
    /**
     * (1)
     */
    wdAutoNew(1),
    
    /**
     * (2)
     */
    wdAutoOpen(2),
    
    /**
     * (3)
     */
    wdAutoClose(3),
    
    /**
     * (4)
     */
    wdAutoExit(4),
    
    /**
     * (5)
     */
    wdAutoSync(5),
    ;

    private WdAutoMacros(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}