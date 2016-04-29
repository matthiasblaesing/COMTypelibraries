
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum SignatureDetail implements IComEnum {
    
    /**
     * (0)
     */
    sigdetLocalSigningTime(0),
    
    /**
     * (1)
     */
    sigdetApplicationName(1),
    
    /**
     * (2)
     */
    sigdetApplicationVersion(2),
    
    /**
     * (3)
     */
    sigdetOfficeVersion(3),
    
    /**
     * (4)
     */
    sigdetWindowsVersion(4),
    
    /**
     * (5)
     */
    sigdetNumberOfMonitors(5),
    
    /**
     * (6)
     */
    sigdetHorizResolution(6),
    
    /**
     * (7)
     */
    sigdetVertResolution(7),
    
    /**
     * (8)
     */
    sigdetColorDepth(8),
    
    /**
     * (9)
     */
    sigdetSignedData(9),
    
    /**
     * (10)
     */
    sigdetDocPreviewImg(10),
    
    /**
     * (11)
     */
    sigdetIPFormHash(11),
    
    /**
     * (12)
     */
    sigdetIPCurrentView(12),
    
    /**
     * (13)
     */
    sigdetSignatureType(13),
    
    /**
     * (14)
     */
    sigdetHashAlgorithm(14),
    
    /**
     * (15)
     */
    sigdetShouldShowViewWarning(15),
    
    /**
     * (16)
     */
    sigdetDelSuggSigner(16),
    
    /**
     * (17)
     */
    sigdetDelSuggSignerSet(17),
    
    /**
     * (18)
     */
    sigdetDelSuggSignerLine2(18),
    
    /**
     * (19)
     */
    sigdetDelSuggSignerLine2Set(19),
    
    /**
     * (20)
     */
    sigdetDelSuggSignerEmail(20),
    
    /**
     * (21)
     */
    sigdetDelSuggSignerEmailSet(21),
    ;

    private SignatureDetail(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}