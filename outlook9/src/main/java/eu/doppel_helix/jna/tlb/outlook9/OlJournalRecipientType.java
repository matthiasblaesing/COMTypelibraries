
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlJournalRecipientType implements IComEnum {
    
    /**
     * (1)
     */
    olAssociatedContact(1),
    ;

    private OlJournalRecipientType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}