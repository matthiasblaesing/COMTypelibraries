
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMarkInterval implements IComEnum {
    
    /**
     * (0)
     */
    olMarkToday(0),
    
    /**
     * (1)
     */
    olMarkTomorrow(1),
    
    /**
     * (2)
     */
    olMarkThisWeek(2),
    
    /**
     * (3)
     */
    olMarkNextWeek(3),
    
    /**
     * (4)
     */
    olMarkNoDate(4),
    
    /**
     * (5)
     */
    olMarkComplete(5),
    ;

    private OlMarkInterval(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}