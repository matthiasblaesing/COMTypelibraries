
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetGradientType implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetGradientMixed(-2),
    
    /**
     * (1)
     */
    msoGradientEarlySunset(1),
    
    /**
     * (2)
     */
    msoGradientLateSunset(2),
    
    /**
     * (3)
     */
    msoGradientNightfall(3),
    
    /**
     * (4)
     */
    msoGradientDaybreak(4),
    
    /**
     * (5)
     */
    msoGradientHorizon(5),
    
    /**
     * (6)
     */
    msoGradientDesert(6),
    
    /**
     * (7)
     */
    msoGradientOcean(7),
    
    /**
     * (8)
     */
    msoGradientCalmWater(8),
    
    /**
     * (9)
     */
    msoGradientFire(9),
    
    /**
     * (10)
     */
    msoGradientFog(10),
    
    /**
     * (11)
     */
    msoGradientMoss(11),
    
    /**
     * (12)
     */
    msoGradientPeacock(12),
    
    /**
     * (13)
     */
    msoGradientWheat(13),
    
    /**
     * (14)
     */
    msoGradientParchment(14),
    
    /**
     * (15)
     */
    msoGradientMahogany(15),
    
    /**
     * (16)
     */
    msoGradientRainbow(16),
    
    /**
     * (17)
     */
    msoGradientRainbowII(17),
    
    /**
     * (18)
     */
    msoGradientGold(18),
    
    /**
     * (19)
     */
    msoGradientGoldII(19),
    
    /**
     * (20)
     */
    msoGradientBrass(20),
    
    /**
     * (21)
     */
    msoGradientChrome(21),
    
    /**
     * (22)
     */
    msoGradientChromeII(22),
    
    /**
     * (23)
     */
    msoGradientSilver(23),
    
    /**
     * (24)
     */
    msoGradientSapphire(24),
    ;

    private MsoPresetGradientType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}