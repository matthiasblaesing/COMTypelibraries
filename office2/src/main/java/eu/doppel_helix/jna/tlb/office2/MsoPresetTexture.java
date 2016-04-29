
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetTexture implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetTextureMixed(-2),
    
    /**
     * (1)
     */
    msoTexturePapyrus(1),
    
    /**
     * (2)
     */
    msoTextureCanvas(2),
    
    /**
     * (3)
     */
    msoTextureDenim(3),
    
    /**
     * (4)
     */
    msoTextureWovenMat(4),
    
    /**
     * (5)
     */
    msoTextureWaterDroplets(5),
    
    /**
     * (6)
     */
    msoTexturePaperBag(6),
    
    /**
     * (7)
     */
    msoTextureFishFossil(7),
    
    /**
     * (8)
     */
    msoTextureSand(8),
    
    /**
     * (9)
     */
    msoTextureGreenMarble(9),
    
    /**
     * (10)
     */
    msoTextureWhiteMarble(10),
    
    /**
     * (11)
     */
    msoTextureBrownMarble(11),
    
    /**
     * (12)
     */
    msoTextureGranite(12),
    
    /**
     * (13)
     */
    msoTextureNewsprint(13),
    
    /**
     * (14)
     */
    msoTextureRecycledPaper(14),
    
    /**
     * (15)
     */
    msoTextureParchment(15),
    
    /**
     * (16)
     */
    msoTextureStationery(16),
    
    /**
     * (17)
     */
    msoTextureBlueTissuePaper(17),
    
    /**
     * (18)
     */
    msoTexturePinkTissuePaper(18),
    
    /**
     * (19)
     */
    msoTexturePurpleMesh(19),
    
    /**
     * (20)
     */
    msoTextureBouquet(20),
    
    /**
     * (21)
     */
    msoTextureCork(21),
    
    /**
     * (22)
     */
    msoTextureWalnut(22),
    
    /**
     * (23)
     */
    msoTextureOak(23),
    
    /**
     * (24)
     */
    msoTextureMediumWood(24),
    ;

    private MsoPresetTexture(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}