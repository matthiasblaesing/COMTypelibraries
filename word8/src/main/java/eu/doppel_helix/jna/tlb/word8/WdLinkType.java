
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4179EEDA-0598-3CC3-85A8-2FC201D18FC6})</p>
 */
public enum WdLinkType implements IComEnum {
    
    /**
     * (0)
     */
    wdLinkTypeOLE(0),
    
    /**
     * (1)
     */
    wdLinkTypePicture(1),
    
    /**
     * (2)
     */
    wdLinkTypeText(2),
    
    /**
     * (3)
     */
    wdLinkTypeReference(3),
    
    /**
     * (4)
     */
    wdLinkTypeInclude(4),
    
    /**
     * (5)
     */
    wdLinkTypeImport(5),
    
    /**
     * (6)
     */
    wdLinkTypeDDE(6),
    
    /**
     * (7)
     */
    wdLinkTypeDDEAuto(7),
    
    /**
     * (8)
     */
    wdLinkTypeChart(8),
    ;

    private WdLinkType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}