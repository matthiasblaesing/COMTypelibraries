
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoScreenSize implements IComEnum {
    
    /**
     * (0)
     */
    msoScreenSize544x376(0),
    
    /**
     * (1)
     */
    msoScreenSize640x480(1),
    
    /**
     * (2)
     */
    msoScreenSize720x512(2),
    
    /**
     * (3)
     */
    msoScreenSize800x600(3),
    
    /**
     * (4)
     */
    msoScreenSize1024x768(4),
    
    /**
     * (5)
     */
    msoScreenSize1152x882(5),
    
    /**
     * (6)
     */
    msoScreenSize1152x900(6),
    
    /**
     * (7)
     */
    msoScreenSize1280x1024(7),
    
    /**
     * (8)
     */
    msoScreenSize1600x1200(8),
    
    /**
     * (9)
     */
    msoScreenSize1800x1440(9),
    
    /**
     * (10)
     */
    msoScreenSize1920x1200(10),
    ;

    private MsoScreenSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}