
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({09F8044D-E368-3787-A29E-3A82026CE73F})</p>
 */
public enum WdXMLNodeType implements IComEnum {
    
    /**
     * (1)
     */
    wdXMLNodeElement(1),
    
    /**
     * (2)
     */
    wdXMLNodeAttribute(2),
    ;

    private WdXMLNodeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}