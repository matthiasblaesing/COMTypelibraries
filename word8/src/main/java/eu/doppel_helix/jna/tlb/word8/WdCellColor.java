
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({347CDE09-0CE2-3FBB-9BB8-7C9ECF5B750E})</p>
 */
public enum WdCellColor implements IComEnum {
    
    /**
     * (-1)
     */
    wdCellColorByAuthor(-1),
    
    /**
     * (0)
     */
    wdCellColorNoHighlight(0),
    
    /**
     * (1)
     */
    wdCellColorPink(1),
    
    /**
     * (2)
     */
    wdCellColorLightBlue(2),
    
    /**
     * (3)
     */
    wdCellColorLightYellow(3),
    
    /**
     * (4)
     */
    wdCellColorLightPurple(4),
    
    /**
     * (5)
     */
    wdCellColorLightOrange(5),
    
    /**
     * (6)
     */
    wdCellColorLightGreen(6),
    
    /**
     * (7)
     */
    wdCellColorLightGray(7),
    ;

    private WdCellColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}