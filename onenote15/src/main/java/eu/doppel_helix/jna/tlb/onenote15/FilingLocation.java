
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({452D048E-7F61-4258-94B9-A39E19C290DA})</p>
 */
public enum FilingLocation implements IComEnum {
    
    /**
     * (0)
     */
    flEMail(0),
    
    /**
     * (1)
     */
    flContacts(1),
    
    /**
     * (2)
     */
    flTasks(2),
    
    /**
     * (3)
     */
    flMeetings(3),
    
    /**
     * (4)
     */
    flWebContent(4),
    
    /**
     * (5)
     */
    flPrintOuts(5),
    ;

    private FilingLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}