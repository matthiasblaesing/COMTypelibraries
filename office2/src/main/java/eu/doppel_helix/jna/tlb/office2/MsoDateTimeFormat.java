
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoDateTimeFormat implements IComEnum {
    
    /**
     * (-2)
     */
    msoDateTimeFormatMixed(-2),
    
    /**
     * (1)
     */
    msoDateTimeMdyy(1),
    
    /**
     * (2)
     */
    msoDateTimeddddMMMMddyyyy(2),
    
    /**
     * (3)
     */
    msoDateTimedMMMMyyyy(3),
    
    /**
     * (4)
     */
    msoDateTimeMMMMdyyyy(4),
    
    /**
     * (5)
     */
    msoDateTimedMMMyy(5),
    
    /**
     * (6)
     */
    msoDateTimeMMMMyy(6),
    
    /**
     * (7)
     */
    msoDateTimeMMyy(7),
    
    /**
     * (8)
     */
    msoDateTimeMMddyyHmm(8),
    
    /**
     * (9)
     */
    msoDateTimeMMddyyhmmAMPM(9),
    
    /**
     * (10)
     */
    msoDateTimeHmm(10),
    
    /**
     * (11)
     */
    msoDateTimeHmmss(11),
    
    /**
     * (12)
     */
    msoDateTimehmmAMPM(12),
    
    /**
     * (13)
     */
    msoDateTimehmmssAMPM(13),
    
    /**
     * (14)
     */
    msoDateTimeFigureOut(14),
    ;

    private MsoDateTimeFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}