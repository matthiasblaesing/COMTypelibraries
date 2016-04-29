
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0213F5F4-E991-3060-A73F-79E85BA560C1})</p>
 */
public enum WdTextureIndex implements IComEnum {
    
    /**
     * (0)
     */
    wdTextureNone(0),
    
    /**
     * (25)
     */
    wdTexture2Pt5Percent(25),
    
    /**
     * (50)
     */
    wdTexture5Percent(50),
    
    /**
     * (75)
     */
    wdTexture7Pt5Percent(75),
    
    /**
     * (100)
     */
    wdTexture10Percent(100),
    
    /**
     * (125)
     */
    wdTexture12Pt5Percent(125),
    
    /**
     * (150)
     */
    wdTexture15Percent(150),
    
    /**
     * (175)
     */
    wdTexture17Pt5Percent(175),
    
    /**
     * (200)
     */
    wdTexture20Percent(200),
    
    /**
     * (225)
     */
    wdTexture22Pt5Percent(225),
    
    /**
     * (250)
     */
    wdTexture25Percent(250),
    
    /**
     * (275)
     */
    wdTexture27Pt5Percent(275),
    
    /**
     * (300)
     */
    wdTexture30Percent(300),
    
    /**
     * (325)
     */
    wdTexture32Pt5Percent(325),
    
    /**
     * (350)
     */
    wdTexture35Percent(350),
    
    /**
     * (375)
     */
    wdTexture37Pt5Percent(375),
    
    /**
     * (400)
     */
    wdTexture40Percent(400),
    
    /**
     * (425)
     */
    wdTexture42Pt5Percent(425),
    
    /**
     * (450)
     */
    wdTexture45Percent(450),
    
    /**
     * (475)
     */
    wdTexture47Pt5Percent(475),
    
    /**
     * (500)
     */
    wdTexture50Percent(500),
    
    /**
     * (525)
     */
    wdTexture52Pt5Percent(525),
    
    /**
     * (550)
     */
    wdTexture55Percent(550),
    
    /**
     * (575)
     */
    wdTexture57Pt5Percent(575),
    
    /**
     * (600)
     */
    wdTexture60Percent(600),
    
    /**
     * (625)
     */
    wdTexture62Pt5Percent(625),
    
    /**
     * (650)
     */
    wdTexture65Percent(650),
    
    /**
     * (675)
     */
    wdTexture67Pt5Percent(675),
    
    /**
     * (700)
     */
    wdTexture70Percent(700),
    
    /**
     * (725)
     */
    wdTexture72Pt5Percent(725),
    
    /**
     * (750)
     */
    wdTexture75Percent(750),
    
    /**
     * (775)
     */
    wdTexture77Pt5Percent(775),
    
    /**
     * (800)
     */
    wdTexture80Percent(800),
    
    /**
     * (825)
     */
    wdTexture82Pt5Percent(825),
    
    /**
     * (850)
     */
    wdTexture85Percent(850),
    
    /**
     * (875)
     */
    wdTexture87Pt5Percent(875),
    
    /**
     * (900)
     */
    wdTexture90Percent(900),
    
    /**
     * (925)
     */
    wdTexture92Pt5Percent(925),
    
    /**
     * (950)
     */
    wdTexture95Percent(950),
    
    /**
     * (975)
     */
    wdTexture97Pt5Percent(975),
    
    /**
     * (1000)
     */
    wdTextureSolid(1000),
    
    /**
     * (-1)
     */
    wdTextureDarkHorizontal(-1),
    
    /**
     * (-2)
     */
    wdTextureDarkVertical(-2),
    
    /**
     * (-3)
     */
    wdTextureDarkDiagonalDown(-3),
    
    /**
     * (-4)
     */
    wdTextureDarkDiagonalUp(-4),
    
    /**
     * (-5)
     */
    wdTextureDarkCross(-5),
    
    /**
     * (-6)
     */
    wdTextureDarkDiagonalCross(-6),
    
    /**
     * (-7)
     */
    wdTextureHorizontal(-7),
    
    /**
     * (-8)
     */
    wdTextureVertical(-8),
    
    /**
     * (-9)
     */
    wdTextureDiagonalDown(-9),
    
    /**
     * (-10)
     */
    wdTextureDiagonalUp(-10),
    
    /**
     * (-11)
     */
    wdTextureCross(-11),
    
    /**
     * (-12)
     */
    wdTextureDiagonalCross(-12),
    ;

    private WdTextureIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}