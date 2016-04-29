
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({310803CD-C69D-4371-98C9-40CE4E9BFD5A})</p>
 */
public enum MsoContactCardType implements IComEnum {
    
    /**
     * (0)
     */
    msoContactCardTypeEnterpriseContact(0),
    
    /**
     * (1)
     */
    msoContactCardTypePersonalContact(1),
    
    /**
     * (2)
     */
    msoContactCardTypeUnknownContact(2),
    
    /**
     * (3)
     */
    msoContactCardTypeEnterpriseGroup(3),
    
    /**
     * (4)
     */
    msoContactCardTypePersonalDistributionList(4),
    ;

    private MsoContactCardType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}