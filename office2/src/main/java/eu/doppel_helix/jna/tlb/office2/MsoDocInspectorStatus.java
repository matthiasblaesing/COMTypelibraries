
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoDocInspectorStatus implements IComEnum {
    
    /**
     * (0)
     */
    msoDocInspectorStatusDocOk(0),
    
    /**
     * (1)
     */
    msoDocInspectorStatusIssueFound(1),
    
    /**
     * (2)
     */
    msoDocInspectorStatusError(2),
    ;

    private MsoDocInspectorStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}