
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0621016A-022C-3A7E-B017-F4589F97BA4E})</p>
 */
public enum WdOutlineLevel implements IComEnum {
    
    /**
     * (1)
     */
    wdOutlineLevel1(1),
    
    /**
     * (2)
     */
    wdOutlineLevel2(2),
    
    /**
     * (3)
     */
    wdOutlineLevel3(3),
    
    /**
     * (4)
     */
    wdOutlineLevel4(4),
    
    /**
     * (5)
     */
    wdOutlineLevel5(5),
    
    /**
     * (6)
     */
    wdOutlineLevel6(6),
    
    /**
     * (7)
     */
    wdOutlineLevel7(7),
    
    /**
     * (8)
     */
    wdOutlineLevel8(8),
    
    /**
     * (9)
     */
    wdOutlineLevel9(9),
    
    /**
     * (10)
     */
    wdOutlineLevelBodyText(10),
    ;

    private WdOutlineLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}