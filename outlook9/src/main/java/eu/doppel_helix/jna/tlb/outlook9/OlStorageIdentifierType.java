
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlStorageIdentifierType implements IComEnum {
    
    /**
     * (0)
     */
    olIdentifyBySubject(0),
    
    /**
     * (1)
     */
    olIdentifyByEntryID(1),
    
    /**
     * (2)
     */
    olIdentifyByMessageClass(2),
    ;

    private OlStorageIdentifierType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}