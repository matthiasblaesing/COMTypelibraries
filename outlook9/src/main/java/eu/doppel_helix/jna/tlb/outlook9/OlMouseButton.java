
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0DCB2F52-1065-4FD4-BC45-1C11E6D1B279})</p>
 */
public enum OlMouseButton implements IComEnum {
    
    /**
     * Left (1)
     */
    olMouseButtonLeft(1),
    
    /**
     * Right (2)
     */
    olMouseButtonRight(2),
    
    /**
     * Middle (4)
     */
    olMouseButtonMiddle(4),
    ;

    private OlMouseButton(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}