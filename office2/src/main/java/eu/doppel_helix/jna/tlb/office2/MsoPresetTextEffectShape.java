
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetTextEffectShape implements IComEnum {
    
    /**
     * (-2)
     */
    msoTextEffectShapeMixed(-2),
    
    /**
     * (1)
     */
    msoTextEffectShapePlainText(1),
    
    /**
     * (2)
     */
    msoTextEffectShapeStop(2),
    
    /**
     * (3)
     */
    msoTextEffectShapeTriangleUp(3),
    
    /**
     * (4)
     */
    msoTextEffectShapeTriangleDown(4),
    
    /**
     * (5)
     */
    msoTextEffectShapeChevronUp(5),
    
    /**
     * (6)
     */
    msoTextEffectShapeChevronDown(6),
    
    /**
     * (7)
     */
    msoTextEffectShapeRingInside(7),
    
    /**
     * (8)
     */
    msoTextEffectShapeRingOutside(8),
    
    /**
     * (9)
     */
    msoTextEffectShapeArchUpCurve(9),
    
    /**
     * (10)
     */
    msoTextEffectShapeArchDownCurve(10),
    
    /**
     * (11)
     */
    msoTextEffectShapeCircleCurve(11),
    
    /**
     * (12)
     */
    msoTextEffectShapeButtonCurve(12),
    
    /**
     * (13)
     */
    msoTextEffectShapeArchUpPour(13),
    
    /**
     * (14)
     */
    msoTextEffectShapeArchDownPour(14),
    
    /**
     * (15)
     */
    msoTextEffectShapeCirclePour(15),
    
    /**
     * (16)
     */
    msoTextEffectShapeButtonPour(16),
    
    /**
     * (17)
     */
    msoTextEffectShapeCurveUp(17),
    
    /**
     * (18)
     */
    msoTextEffectShapeCurveDown(18),
    
    /**
     * (19)
     */
    msoTextEffectShapeCanUp(19),
    
    /**
     * (20)
     */
    msoTextEffectShapeCanDown(20),
    
    /**
     * (21)
     */
    msoTextEffectShapeWave1(21),
    
    /**
     * (22)
     */
    msoTextEffectShapeWave2(22),
    
    /**
     * (23)
     */
    msoTextEffectShapeDoubleWave1(23),
    
    /**
     * (24)
     */
    msoTextEffectShapeDoubleWave2(24),
    
    /**
     * (25)
     */
    msoTextEffectShapeInflate(25),
    
    /**
     * (26)
     */
    msoTextEffectShapeDeflate(26),
    
    /**
     * (27)
     */
    msoTextEffectShapeInflateBottom(27),
    
    /**
     * (28)
     */
    msoTextEffectShapeDeflateBottom(28),
    
    /**
     * (29)
     */
    msoTextEffectShapeInflateTop(29),
    
    /**
     * (30)
     */
    msoTextEffectShapeDeflateTop(30),
    
    /**
     * (31)
     */
    msoTextEffectShapeDeflateInflate(31),
    
    /**
     * (32)
     */
    msoTextEffectShapeDeflateInflateDeflate(32),
    
    /**
     * (33)
     */
    msoTextEffectShapeFadeRight(33),
    
    /**
     * (34)
     */
    msoTextEffectShapeFadeLeft(34),
    
    /**
     * (35)
     */
    msoTextEffectShapeFadeUp(35),
    
    /**
     * (36)
     */
    msoTextEffectShapeFadeDown(36),
    
    /**
     * (37)
     */
    msoTextEffectShapeSlantUp(37),
    
    /**
     * (38)
     */
    msoTextEffectShapeSlantDown(38),
    
    /**
     * (39)
     */
    msoTextEffectShapeCascadeUp(39),
    
    /**
     * (40)
     */
    msoTextEffectShapeCascadeDown(40),
    ;

    private MsoPresetTextEffectShape(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}