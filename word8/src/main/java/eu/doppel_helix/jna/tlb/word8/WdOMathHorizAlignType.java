
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AFB1EEB5-369E-3C8D-BEE1-0CFF86414481})</p>
 */
public enum WdOMathHorizAlignType implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathHorizAlignCenter(0),
    
    /**
     * (1)
     */
    wdOMathHorizAlignLeft(1),
    
    /**
     * (2)
     */
    wdOMathHorizAlignRight(2),
    ;

    private WdOMathHorizAlignType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}