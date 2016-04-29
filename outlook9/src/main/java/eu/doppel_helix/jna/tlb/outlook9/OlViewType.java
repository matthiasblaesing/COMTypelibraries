
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlViewType implements IComEnum {
    
    /**
     * (0)
     */
    olTableView(0),
    
    /**
     * (1)
     */
    olCardView(1),
    
    /**
     * (2)
     */
    olCalendarView(2),
    
    /**
     * (3)
     */
    olIconView(3),
    
    /**
     * (4)
     */
    olTimelineView(4),
    
    /**
     * (5)
     */
    olBusinessCardView(5),
    
    /**
     * (6)
     */
    olDailyTaskListView(6),
    
    /**
     * (7)
     */
    olPeopleView(7),
    ;

    private OlViewType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}