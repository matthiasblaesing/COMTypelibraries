
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSmartArtNodeType implements IComEnum {
    
    /**
     * (1)
     */
    msoSmartArtNodeTypeDefault(1),
    
    /**
     * (2)
     */
    msoSmartArtNodeTypeAssistant(2),
    ;

    private MsoSmartArtNodeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}