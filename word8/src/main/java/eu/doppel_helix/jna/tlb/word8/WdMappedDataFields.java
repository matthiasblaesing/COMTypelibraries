
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0785E3D2-6965-3DD2-A870-81BBA8A8547F})</p>
 */
public enum WdMappedDataFields implements IComEnum {
    
    /**
     * (1)
     */
    wdUniqueIdentifier(1),
    
    /**
     * (2)
     */
    wdCourtesyTitle(2),
    
    /**
     * (3)
     */
    wdFirstName(3),
    
    /**
     * (4)
     */
    wdMiddleName(4),
    
    /**
     * (5)
     */
    wdLastName(5),
    
    /**
     * (6)
     */
    wdSuffix(6),
    
    /**
     * (7)
     */
    wdNickname(7),
    
    /**
     * (8)
     */
    wdJobTitle(8),
    
    /**
     * (9)
     */
    wdCompany(9),
    
    /**
     * (10)
     */
    wdAddress1(10),
    
    /**
     * (11)
     */
    wdAddress2(11),
    
    /**
     * (12)
     */
    wdCity(12),
    
    /**
     * (13)
     */
    wdState(13),
    
    /**
     * (14)
     */
    wdPostalCode(14),
    
    /**
     * (15)
     */
    wdCountryRegion(15),
    
    /**
     * (16)
     */
    wdBusinessPhone(16),
    
    /**
     * (17)
     */
    wdBusinessFax(17),
    
    /**
     * (18)
     */
    wdHomePhone(18),
    
    /**
     * (19)
     */
    wdHomeFax(19),
    
    /**
     * (20)
     */
    wdEmailAddress(20),
    
    /**
     * (21)
     */
    wdWebPageURL(21),
    
    /**
     * (22)
     */
    wdSpouseCourtesyTitle(22),
    
    /**
     * (23)
     */
    wdSpouseFirstName(23),
    
    /**
     * (24)
     */
    wdSpouseMiddleName(24),
    
    /**
     * (25)
     */
    wdSpouseLastName(25),
    
    /**
     * (26)
     */
    wdSpouseNickname(26),
    
    /**
     * (27)
     */
    wdRubyFirstName(27),
    
    /**
     * (28)
     */
    wdRubyLastName(28),
    
    /**
     * (29)
     */
    wdAddress3(29),
    
    /**
     * (30)
     */
    wdDepartment(30),
    ;

    private WdMappedDataFields(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}