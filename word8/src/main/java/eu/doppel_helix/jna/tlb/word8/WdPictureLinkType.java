
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8DC4FED3-F278-383D-AC02-46478C0B4076})</p>
 */
public enum WdPictureLinkType implements IComEnum {
    
    /**
     * (0)
     */
    wdLinkNone(0),
    
    /**
     * (1)
     */
    wdLinkDataInDoc(1),
    
    /**
     * (2)
     */
    wdLinkDataOnDisk(2),
    ;

    private WdPictureLinkType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}