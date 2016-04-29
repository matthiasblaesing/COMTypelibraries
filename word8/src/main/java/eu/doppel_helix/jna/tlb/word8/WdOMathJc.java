
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C7E4EAD4-16DE-3902-9330-5475CF1039D7})</p>
 */
public enum WdOMathJc implements IComEnum {
    
    /**
     * (1)
     */
    wdOMathJcCenterGroup(1),
    
    /**
     * (2)
     */
    wdOMathJcCenter(2),
    
    /**
     * (3)
     */
    wdOMathJcLeft(3),
    
    /**
     * (4)
     */
    wdOMathJcRight(4),
    
    /**
     * (7)
     */
    wdOMathJcInline(7),
    ;

    private WdOMathJc(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}