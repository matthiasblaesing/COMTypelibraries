
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({53781DD1-52EC-3C5F-8219-49F320AAB5D6})</p>
 */
public enum WdTofFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdTOFTemplate(0),
    
    /**
     * (1)
     */
    wdTOFClassic(1),
    
    /**
     * (2)
     */
    wdTOFDistinctive(2),
    
    /**
     * (3)
     */
    wdTOFCentered(3),
    
    /**
     * (4)
     */
    wdTOFFormal(4),
    
    /**
     * (5)
     */
    wdTOFSimple(5),
    ;

    private WdTofFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}