
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSelectionLocation implements IComEnum {
    
    /**
     * (0)
     */
    olViewList(0),
    
    /**
     * (1)
     */
    olToDoBarTaskList(1),
    
    /**
     * (2)
     */
    olToDoBarAppointmentList(2),
    
    /**
     * (3)
     */
    olDailyTaskList(3),
    
    /**
     * (4)
     */
    olAttachmentWell(4),
    ;

    private OlSelectionLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}