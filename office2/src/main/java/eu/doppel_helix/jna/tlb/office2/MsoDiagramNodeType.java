
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoDiagramNodeType implements IComEnum {
    
    /**
     * (1)
     */
    msoDiagramNode(1),
    
    /**
     * (2)
     */
    msoDiagramAssistant(2),
    ;

    private MsoDiagramNodeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}