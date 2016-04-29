
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D69495AF-8F32-39EE-BD96-D683D87D6A8E})</p>
 */
public enum WdDefaultTableBehavior implements IComEnum {
    
    /**
     * (0)
     */
    wdWord8TableBehavior(0),
    
    /**
     * (1)
     */
    wdWord9TableBehavior(1),
    ;

    private WdDefaultTableBehavior(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}