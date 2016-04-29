
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAddressEntryUserType implements IComEnum {
    
    /**
     * (0)
     */
    olExchangeUserAddressEntry(0),
    
    /**
     * (1)
     */
    olExchangeDistributionListAddressEntry(1),
    
    /**
     * (2)
     */
    olExchangePublicFolderAddressEntry(2),
    
    /**
     * (3)
     */
    olExchangeAgentAddressEntry(3),
    
    /**
     * (4)
     */
    olExchangeOrganizationAddressEntry(4),
    
    /**
     * (5)
     */
    olExchangeRemoteUserAddressEntry(5),
    
    /**
     * (10)
     */
    olOutlookContactAddressEntry(10),
    
    /**
     * (11)
     */
    olOutlookDistributionListAddressEntry(11),
    
    /**
     * (20)
     */
    olLdapAddressEntry(20),
    
    /**
     * (30)
     */
    olSmtpAddressEntry(30),
    
    /**
     * (40)
     */
    olOtherAddressEntry(40),
    ;

    private OlAddressEntryUserType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}