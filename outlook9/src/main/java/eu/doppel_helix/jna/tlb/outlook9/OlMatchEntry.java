
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({73628D00-B812-419F-8212-3D62079E22DB})</p>
 */
public enum OlMatchEntry implements IComEnum {
    
    /**
     * FirstLetter (0)
     */
    olMatchEntryFirstLetter(0),
    
    /**
     * Complete (1)
     */
    olMatchEntryComplete(1),
    
    /**
     * None (2)
     */
    olMatchEntryNone(2),
    ;

    private OlMatchEntry(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}