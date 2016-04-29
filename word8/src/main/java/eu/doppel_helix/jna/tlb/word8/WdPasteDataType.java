
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({773B6CF3-4435-343F-BA19-8F0B7D78CC67})</p>
 */
public enum WdPasteDataType implements IComEnum {
    
    /**
     * (0)
     */
    wdPasteOLEObject(0),
    
    /**
     * (1)
     */
    wdPasteRTF(1),
    
    /**
     * (2)
     */
    wdPasteText(2),
    
    /**
     * (3)
     */
    wdPasteMetafilePicture(3),
    
    /**
     * (4)
     */
    wdPasteBitmap(4),
    
    /**
     * (5)
     */
    wdPasteDeviceIndependentBitmap(5),
    
    /**
     * (7)
     */
    wdPasteHyperlink(7),
    
    /**
     * (8)
     */
    wdPasteShape(8),
    
    /**
     * (9)
     */
    wdPasteEnhancedMetafile(9),
    
    /**
     * (10)
     */
    wdPasteHTML(10),
    ;

    private WdPasteDataType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}