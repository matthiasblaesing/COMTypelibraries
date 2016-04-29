
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPictureEffectType implements IComEnum {
    
    /**
     * (0)
     */
    msoEffectNone(0),
    
    /**
     * (1)
     */
    msoEffectBackgroundRemoval(1),
    
    /**
     * (2)
     */
    msoEffectBlur(2),
    
    /**
     * (3)
     */
    msoEffectBrightnessContrast(3),
    
    /**
     * (4)
     */
    msoEffectCement(4),
    
    /**
     * (5)
     */
    msoEffectCrisscrossEtching(5),
    
    /**
     * (6)
     */
    msoEffectChalkSketch(6),
    
    /**
     * (7)
     */
    msoEffectColorTemperature(7),
    
    /**
     * (8)
     */
    msoEffectCutout(8),
    
    /**
     * (9)
     */
    msoEffectFilmGrain(9),
    
    /**
     * (10)
     */
    msoEffectGlass(10),
    
    /**
     * (11)
     */
    msoEffectGlowDiffused(11),
    
    /**
     * (12)
     */
    msoEffectGlowEdges(12),
    
    /**
     * (13)
     */
    msoEffectLightScreen(13),
    
    /**
     * (14)
     */
    msoEffectLineDrawing(14),
    
    /**
     * (15)
     */
    msoEffectMarker(15),
    
    /**
     * (16)
     */
    msoEffectMosiaicBubbles(16),
    
    /**
     * (17)
     */
    msoEffectPaintBrush(17),
    
    /**
     * (18)
     */
    msoEffectPaintStrokes(18),
    
    /**
     * (19)
     */
    msoEffectPastelsSmooth(19),
    
    /**
     * (20)
     */
    msoEffectPencilGrayscale(20),
    
    /**
     * (21)
     */
    msoEffectPencilSketch(21),
    
    /**
     * (22)
     */
    msoEffectPhotocopy(22),
    
    /**
     * (23)
     */
    msoEffectPlasticWrap(23),
    
    /**
     * (24)
     */
    msoEffectSaturation(24),
    
    /**
     * (25)
     */
    msoEffectSharpenSoften(25),
    
    /**
     * (26)
     */
    msoEffectTexturizer(26),
    
    /**
     * (27)
     */
    msoEffectWatercolorSponge(27),
    ;

    private MsoPictureEffectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}