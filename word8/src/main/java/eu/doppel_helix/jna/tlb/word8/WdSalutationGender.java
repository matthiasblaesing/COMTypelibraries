
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B4DDD66F-48BF-33C4-B074-F0D61992E186})</p>
 */
public enum WdSalutationGender implements IComEnum {
    
    /**
     * (0)
     */
    wdGenderFemale(0),
    
    /**
     * (1)
     */
    wdGenderMale(1),
    
    /**
     * (2)
     */
    wdGenderNeutral(2),
    
    /**
     * (3)
     */
    wdGenderUnknown(3),
    ;

    private WdSalutationGender(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}