
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1E795768-6E5C-3CF7-AACB-4CDE284B7B04})</p>
 */
public enum WdStyleType implements IComEnum {
    
    /**
     * (1)
     */
    wdStyleTypeParagraph(1),
    
    /**
     * (2)
     */
    wdStyleTypeCharacter(2),
    
    /**
     * (3)
     */
    wdStyleTypeTable(3),
    
    /**
     * (4)
     */
    wdStyleTypeList(4),
    
    /**
     * (5)
     */
    wdStyleTypeParagraphOnly(5),
    
    /**
     * (6)
     */
    wdStyleTypeLinked(6),
    ;

    private WdStyleType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}