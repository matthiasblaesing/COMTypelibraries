
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSignatureSubset implements IComEnum {
    
    /**
     * (0)
     */
    msoSignatureSubsetSignaturesAllSigs(0),
    
    /**
     * (1)
     */
    msoSignatureSubsetSignaturesNonVisible(1),
    
    /**
     * (2)
     */
    msoSignatureSubsetSignatureLines(2),
    
    /**
     * (3)
     */
    msoSignatureSubsetSignatureLinesSigned(3),
    
    /**
     * (4)
     */
    msoSignatureSubsetSignatureLinesUnsigned(4),
    
    /**
     * (5)
     */
    msoSignatureSubsetAll(5),
    ;

    private MsoSignatureSubset(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}