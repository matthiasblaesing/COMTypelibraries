
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlContactPhoneNumber implements IComEnum {
    
    /**
     * (0)
     */
    olContactPhoneAssistant(0),
    
    /**
     * (1)
     */
    olContactPhoneBusiness(1),
    
    /**
     * (2)
     */
    olContactPhoneBusiness2(2),
    
    /**
     * (3)
     */
    olContactPhoneBusinessFax(3),
    
    /**
     * (4)
     */
    olContactPhoneCallback(4),
    
    /**
     * (5)
     */
    olContactPhoneCar(5),
    
    /**
     * (6)
     */
    olContactPhoneCompany(6),
    
    /**
     * (7)
     */
    olContactPhoneHome(7),
    
    /**
     * (8)
     */
    olContactPhoneHome2(8),
    
    /**
     * (9)
     */
    olContactPhoneHomeFax(9),
    
    /**
     * (10)
     */
    olContactPhoneISDN(10),
    
    /**
     * (11)
     */
    olContactPhoneMobile(11),
    
    /**
     * (12)
     */
    olContactPhoneOther(12),
    
    /**
     * (13)
     */
    olContactPhoneOtherFax(13),
    
    /**
     * (14)
     */
    olContactPhonePager(14),
    
    /**
     * (15)
     */
    olContactPhonePrimary(15),
    
    /**
     * (16)
     */
    olContactPhoneRadio(16),
    
    /**
     * (17)
     */
    olContactPhoneTelex(17),
    
    /**
     * (18)
     */
    olContactPhoneTTYTTD(18),
    ;

    private OlContactPhoneNumber(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}