
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({49730545-588C-3E74-9C40-988F149B01CC})</p>
 */
public enum WdMailMergeMainDocType implements IComEnum {
    
    /**
     * (-1)
     */
    wdNotAMergeDocument(-1),
    
    /**
     * (0)
     */
    wdFormLetters(0),
    
    /**
     * (1)
     */
    wdMailingLabels(1),
    
    /**
     * (2)
     */
    wdEnvelopes(2),
    
    /**
     * (3)
     */
    wdCatalog(3),
    
    /**
     * (4)
     */
    wdEMail(4),
    
    /**
     * (5)
     */
    wdFax(5),
    
    /**
     * (3)
     */
    wdDirectory(3),
    ;

    private WdMailMergeMainDocType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}