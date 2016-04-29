
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlDayWeekTimeScale implements IComEnum {
    
    /**
     * (0)
     */
    olTimeScale5Minutes(0),
    
    /**
     * (1)
     */
    olTimeScale6Minutes(1),
    
    /**
     * (2)
     */
    olTimeScale10Minutes(2),
    
    /**
     * (3)
     */
    olTimeScale15Minutes(3),
    
    /**
     * (4)
     */
    olTimeScale30Minutes(4),
    
    /**
     * (5)
     */
    olTimeScale60Minutes(5),
    ;

    private OlDayWeekTimeScale(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}