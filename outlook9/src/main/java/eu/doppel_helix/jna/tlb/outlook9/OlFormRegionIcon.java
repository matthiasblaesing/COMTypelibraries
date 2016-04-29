
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormRegionIcon implements IComEnum {
    
    /**
     * (1)
     */
    olFormRegionIconDefault(1),
    
    /**
     * (2)
     */
    olFormRegionIconUnread(2),
    
    /**
     * (3)
     */
    olFormRegionIconRead(3),
    
    /**
     * (4)
     */
    olFormRegionIconReplied(4),
    
    /**
     * (5)
     */
    olFormRegionIconForwarded(5),
    
    /**
     * (6)
     */
    olFormRegionIconUnsent(6),
    
    /**
     * (7)
     */
    olFormRegionIconSubmitted(7),
    
    /**
     * (8)
     */
    olFormRegionIconSigned(8),
    
    /**
     * (9)
     */
    olFormRegionIconEncrypted(9),
    
    /**
     * (10)
     */
    olFormRegionIconWindow(10),
    
    /**
     * (11)
     */
    olFormRegionIconPage(11),
    
    /**
     * (12)
     */
    olFormRegionIconRecurring(12),
    ;

    private OlFormRegionIcon(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}