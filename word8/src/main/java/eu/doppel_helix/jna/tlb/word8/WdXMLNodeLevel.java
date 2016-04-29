
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B1A148D3-3D83-38E9-A278-1631D204F8B3})</p>
 */
public enum WdXMLNodeLevel implements IComEnum {
    
    /**
     * (0)
     */
    wdXMLNodeLevelInline(0),
    
    /**
     * (1)
     */
    wdXMLNodeLevelParagraph(1),
    
    /**
     * (2)
     */
    wdXMLNodeLevelRow(2),
    
    /**
     * (3)
     */
    wdXMLNodeLevelCell(3),
    ;

    private WdXMLNodeLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}