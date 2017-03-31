
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines the valid CIM Types of a Property value
 *
 * <p>uuid({4A249B7B-FC9A-11D1-8B1E-00600806D9B6})</p>
 */
public enum WbemCimtypeEnum implements IComEnum {
    
    /**
     * (16)
     */
    wbemCimtypeSint8(16),
    
    /**
     * (17)
     */
    wbemCimtypeUint8(17),
    
    /**
     * (2)
     */
    wbemCimtypeSint16(2),
    
    /**
     * (18)
     */
    wbemCimtypeUint16(18),
    
    /**
     * (3)
     */
    wbemCimtypeSint32(3),
    
    /**
     * (19)
     */
    wbemCimtypeUint32(19),
    
    /**
     * (20)
     */
    wbemCimtypeSint64(20),
    
    /**
     * (21)
     */
    wbemCimtypeUint64(21),
    
    /**
     * (4)
     */
    wbemCimtypeReal32(4),
    
    /**
     * (5)
     */
    wbemCimtypeReal64(5),
    
    /**
     * (11)
     */
    wbemCimtypeBoolean(11),
    
    /**
     * (8)
     */
    wbemCimtypeString(8),
    
    /**
     * (101)
     */
    wbemCimtypeDatetime(101),
    
    /**
     * (102)
     */
    wbemCimtypeReference(102),
    
    /**
     * (103)
     */
    wbemCimtypeChar16(103),
    
    /**
     * (13)
     */
    wbemCimtypeObject(13),
    ;

    private WbemCimtypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}