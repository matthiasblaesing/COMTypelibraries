
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlTimelineViewMode implements IComEnum {
    
    /**
     * (0)
     */
    olTimelineViewDay(0),
    
    /**
     * (1)
     */
    olTimelineViewWeek(1),
    
    /**
     * (2)
     */
    olTimelineViewMonth(2),
    ;

    private OlTimelineViewMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}