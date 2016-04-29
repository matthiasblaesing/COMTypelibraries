
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EC64ADD2-4DB2-36C1-8915-2E9C64F9F57B})</p>
 */
public enum WdRelativeHorizontalPosition implements IComEnum {
    
    /**
     * (0)
     */
    wdRelativeHorizontalPositionMargin(0),
    
    /**
     * (1)
     */
    wdRelativeHorizontalPositionPage(1),
    
    /**
     * (2)
     */
    wdRelativeHorizontalPositionColumn(2),
    
    /**
     * (3)
     */
    wdRelativeHorizontalPositionCharacter(3),
    
    /**
     * (4)
     */
    wdRelativeHorizontalPositionLeftMarginArea(4),
    
    /**
     * (5)
     */
    wdRelativeHorizontalPositionRightMarginArea(5),
    
    /**
     * (6)
     */
    wdRelativeHorizontalPositionInnerMarginArea(6),
    
    /**
     * (7)
     */
    wdRelativeHorizontalPositionOuterMarginArea(7),
    ;

    private WdRelativeHorizontalPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}