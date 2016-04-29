
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlItemType implements IComEnum {
    
    /**
     * (0)
     */
    olMailItem(0),
    
    /**
     * (1)
     */
    olAppointmentItem(1),
    
    /**
     * (2)
     */
    olContactItem(2),
    
    /**
     * (3)
     */
    olTaskItem(3),
    
    /**
     * (4)
     */
    olJournalItem(4),
    
    /**
     * (5)
     */
    olNoteItem(5),
    
    /**
     * (6)
     */
    olPostItem(6),
    
    /**
     * (7)
     */
    olDistributionListItem(7),
    
    /**
     * (11)
     */
    olMobileItemSMS(11),
    
    /**
     * (12)
     */
    olMobileItemMMS(12),
    ;

    private OlItemType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}