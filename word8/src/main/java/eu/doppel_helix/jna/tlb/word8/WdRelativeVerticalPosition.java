
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({01DABBC6-BBF7-3830-A252-E88AD0CB5678})</p>
 */
public enum WdRelativeVerticalPosition implements IComEnum {
    
    /**
     * (0)
     */
    wdRelativeVerticalPositionMargin(0),
    
    /**
     * (1)
     */
    wdRelativeVerticalPositionPage(1),
    
    /**
     * (2)
     */
    wdRelativeVerticalPositionParagraph(2),
    
    /**
     * (3)
     */
    wdRelativeVerticalPositionLine(3),
    
    /**
     * (4)
     */
    wdRelativeVerticalPositionTopMarginArea(4),
    
    /**
     * (5)
     */
    wdRelativeVerticalPositionBottomMarginArea(5),
    
    /**
     * (6)
     */
    wdRelativeVerticalPositionInnerMarginArea(6),
    
    /**
     * (7)
     */
    wdRelativeVerticalPositionOuterMarginArea(7),
    ;

    private WdRelativeVerticalPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}