
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlListObjectSourceType implements IComEnum {
    
    /**
     * (0)
     */
    xlSrcExternal(0),
    
    /**
     * (1)
     */
    xlSrcRange(1),
    
    /**
     * (2)
     */
    xlSrcXml(2),
    
    /**
     * (3)
     */
    xlSrcQuery(3),
    
    /**
     * (4)
     */
    xlSrcModel(4),
    ;

    private XlListObjectSourceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}