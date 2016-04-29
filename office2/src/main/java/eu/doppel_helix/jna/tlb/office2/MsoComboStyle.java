
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoComboStyle implements IComEnum {
    
    /**
     * (0)
     */
    msoComboNormal(0),
    
    /**
     * (1)
     */
    msoComboLabel(1),
    ;

    private MsoComboStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}