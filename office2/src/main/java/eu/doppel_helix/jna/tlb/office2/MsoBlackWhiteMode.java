
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBlackWhiteMode implements IComEnum {
    
    /**
     * (-2)
     */
    msoBlackWhiteMixed(-2),
    
    /**
     * (1)
     */
    msoBlackWhiteAutomatic(1),
    
    /**
     * (2)
     */
    msoBlackWhiteGrayScale(2),
    
    /**
     * (3)
     */
    msoBlackWhiteLightGrayScale(3),
    
    /**
     * (4)
     */
    msoBlackWhiteInverseGrayScale(4),
    
    /**
     * (5)
     */
    msoBlackWhiteGrayOutline(5),
    
    /**
     * (6)
     */
    msoBlackWhiteBlackTextAndLine(6),
    
    /**
     * (7)
     */
    msoBlackWhiteHighContrast(7),
    
    /**
     * (8)
     */
    msoBlackWhiteBlack(8),
    
    /**
     * (9)
     */
    msoBlackWhiteWhite(9),
    
    /**
     * (10)
     */
    msoBlackWhiteDontShow(10),
    ;

    private MsoBlackWhiteMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}