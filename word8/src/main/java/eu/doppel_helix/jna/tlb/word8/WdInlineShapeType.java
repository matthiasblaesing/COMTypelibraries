
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EEEC37A7-495B-30F5-8404-37644FC0358F})</p>
 */
public enum WdInlineShapeType implements IComEnum {
    
    /**
     * (1)
     */
    wdInlineShapeEmbeddedOLEObject(1),
    
    /**
     * (2)
     */
    wdInlineShapeLinkedOLEObject(2),
    
    /**
     * (3)
     */
    wdInlineShapePicture(3),
    
    /**
     * (4)
     */
    wdInlineShapeLinkedPicture(4),
    
    /**
     * (5)
     */
    wdInlineShapeOLEControlObject(5),
    
    /**
     * (6)
     */
    wdInlineShapeHorizontalLine(6),
    
    /**
     * (7)
     */
    wdInlineShapePictureHorizontalLine(7),
    
    /**
     * (8)
     */
    wdInlineShapeLinkedPictureHorizontalLine(8),
    
    /**
     * (9)
     */
    wdInlineShapePictureBullet(9),
    
    /**
     * (10)
     */
    wdInlineShapeScriptAnchor(10),
    
    /**
     * (11)
     */
    wdInlineShapeOWSAnchor(11),
    
    /**
     * (12)
     */
    wdInlineShapeChart(12),
    
    /**
     * (13)
     */
    wdInlineShapeDiagram(13),
    
    /**
     * (14)
     */
    wdInlineShapeLockedCanvas(14),
    
    /**
     * (15)
     */
    wdInlineShapeSmartArt(15),
    
    /**
     * (16)
     */
    wdInlineShapeWebVideo(16),
    ;

    private WdInlineShapeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}