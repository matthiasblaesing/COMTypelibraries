
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A6872888-D8A9-3BFA-9EAD-0998D01E37D1})</p>
 */
public enum WdTwoLinesInOneType implements IComEnum {
    
    /**
     * (0)
     */
    wdTwoLinesInOneNone(0),
    
    /**
     * (1)
     */
    wdTwoLinesInOneNoBrackets(1),
    
    /**
     * (2)
     */
    wdTwoLinesInOneParentheses(2),
    
    /**
     * (3)
     */
    wdTwoLinesInOneSquareBrackets(3),
    
    /**
     * (4)
     */
    wdTwoLinesInOneAngleBrackets(4),
    
    /**
     * (5)
     */
    wdTwoLinesInOneCurlyBrackets(5),
    ;

    private WdTwoLinesInOneType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}