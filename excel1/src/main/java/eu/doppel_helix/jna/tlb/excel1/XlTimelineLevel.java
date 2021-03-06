
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTimelineLevel implements IComEnum {
    
    /**
     * (0)
     */
    xlTimelineLevelYears(0),
    
    /**
     * (1)
     */
    xlTimelineLevelQuarters(1),
    
    /**
     * (2)
     */
    xlTimelineLevelMonths(2),
    
    /**
     * (3)
     */
    xlTimelineLevelDays(3),
    ;

    private XlTimelineLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}