
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoShapeType implements IComEnum {
    
    /**
     * (-2)
     */
    msoShapeTypeMixed(-2),
    
    /**
     * (1)
     */
    msoAutoShape(1),
    
    /**
     * (2)
     */
    msoCallout(2),
    
    /**
     * (3)
     */
    msoChart(3),
    
    /**
     * (4)
     */
    msoComment(4),
    
    /**
     * (5)
     */
    msoFreeform(5),
    
    /**
     * (6)
     */
    msoGroup(6),
    
    /**
     * (7)
     */
    msoEmbeddedOLEObject(7),
    
    /**
     * (8)
     */
    msoFormControl(8),
    
    /**
     * (9)
     */
    msoLine(9),
    
    /**
     * (10)
     */
    msoLinkedOLEObject(10),
    
    /**
     * (11)
     */
    msoLinkedPicture(11),
    
    /**
     * (12)
     */
    msoOLEControlObject(12),
    
    /**
     * (13)
     */
    msoPicture(13),
    
    /**
     * (14)
     */
    msoPlaceholder(14),
    
    /**
     * (15)
     */
    msoTextEffect(15),
    
    /**
     * (16)
     */
    msoMedia(16),
    
    /**
     * (17)
     */
    msoTextBox(17),
    
    /**
     * (18)
     */
    msoScriptAnchor(18),
    
    /**
     * (19)
     */
    msoTable(19),
    
    /**
     * (20)
     */
    msoCanvas(20),
    
    /**
     * (21)
     */
    msoDiagram(21),
    
    /**
     * (22)
     */
    msoInk(22),
    
    /**
     * (23)
     */
    msoInkComment(23),
    
    /**
     * (24)
     */
    msoSmartArt(24),
    
    /**
     * (25)
     */
    msoSlicer(25),
    
    /**
     * (26)
     */
    msoWebVideo(26),
    ;

    private MsoShapeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}