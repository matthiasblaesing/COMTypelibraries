
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MailFormat implements IComEnum {
    
    /**
     * (1)
     */
    mfPlainText(1),
    
    /**
     * (2)
     */
    mfHTML(2),
    
    /**
     * (3)
     */
    mfRTF(3),
    ;

    private MailFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}