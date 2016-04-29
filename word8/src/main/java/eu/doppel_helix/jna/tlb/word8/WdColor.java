
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B95C2C1C-FA2F-319B-A6DA-8D560FD44553})</p>
 */
public enum WdColor implements IComEnum {
    
    /**
     * (-16777216)
     */
    wdColorAutomatic(-16777216),
    
    /**
     * (0)
     */
    wdColorBlack(0),
    
    /**
     * (16711680)
     */
    wdColorBlue(16711680),
    
    /**
     * (16776960)
     */
    wdColorTurquoise(16776960),
    
    /**
     * (65280)
     */
    wdColorBrightGreen(65280),
    
    /**
     * (16711935)
     */
    wdColorPink(16711935),
    
    /**
     * (255)
     */
    wdColorRed(255),
    
    /**
     * (65535)
     */
    wdColorYellow(65535),
    
    /**
     * (16777215)
     */
    wdColorWhite(16777215),
    
    /**
     * (8388608)
     */
    wdColorDarkBlue(8388608),
    
    /**
     * (8421376)
     */
    wdColorTeal(8421376),
    
    /**
     * (32768)
     */
    wdColorGreen(32768),
    
    /**
     * (8388736)
     */
    wdColorViolet(8388736),
    
    /**
     * (128)
     */
    wdColorDarkRed(128),
    
    /**
     * (32896)
     */
    wdColorDarkYellow(32896),
    
    /**
     * (13209)
     */
    wdColorBrown(13209),
    
    /**
     * (13107)
     */
    wdColorOliveGreen(13107),
    
    /**
     * (13056)
     */
    wdColorDarkGreen(13056),
    
    /**
     * (6697728)
     */
    wdColorDarkTeal(6697728),
    
    /**
     * (10040115)
     */
    wdColorIndigo(10040115),
    
    /**
     * (26367)
     */
    wdColorOrange(26367),
    
    /**
     * (10053222)
     */
    wdColorBlueGray(10053222),
    
    /**
     * (39423)
     */
    wdColorLightOrange(39423),
    
    /**
     * (52377)
     */
    wdColorLime(52377),
    
    /**
     * (6723891)
     */
    wdColorSeaGreen(6723891),
    
    /**
     * (13421619)
     */
    wdColorAqua(13421619),
    
    /**
     * (16737843)
     */
    wdColorLightBlue(16737843),
    
    /**
     * (52479)
     */
    wdColorGold(52479),
    
    /**
     * (16763904)
     */
    wdColorSkyBlue(16763904),
    
    /**
     * (6697881)
     */
    wdColorPlum(6697881),
    
    /**
     * (13408767)
     */
    wdColorRose(13408767),
    
    /**
     * (10079487)
     */
    wdColorTan(10079487),
    
    /**
     * (10092543)
     */
    wdColorLightYellow(10092543),
    
    /**
     * (13434828)
     */
    wdColorLightGreen(13434828),
    
    /**
     * (16777164)
     */
    wdColorLightTurquoise(16777164),
    
    /**
     * (16764057)
     */
    wdColorPaleBlue(16764057),
    
    /**
     * (16751052)
     */
    wdColorLavender(16751052),
    
    /**
     * (15987699)
     */
    wdColorGray05(15987699),
    
    /**
     * (15132390)
     */
    wdColorGray10(15132390),
    
    /**
     * (14737632)
     */
    wdColorGray125(14737632),
    
    /**
     * (14277081)
     */
    wdColorGray15(14277081),
    
    /**
     * (13421772)
     */
    wdColorGray20(13421772),
    
    /**
     * (12632256)
     */
    wdColorGray25(12632256),
    
    /**
     * (11776947)
     */
    wdColorGray30(11776947),
    
    /**
     * (10921638)
     */
    wdColorGray35(10921638),
    
    /**
     * (10526880)
     */
    wdColorGray375(10526880),
    
    /**
     * (10066329)
     */
    wdColorGray40(10066329),
    
    /**
     * (9211020)
     */
    wdColorGray45(9211020),
    
    /**
     * (8421504)
     */
    wdColorGray50(8421504),
    
    /**
     * (7566195)
     */
    wdColorGray55(7566195),
    
    /**
     * (6710886)
     */
    wdColorGray60(6710886),
    
    /**
     * (6316128)
     */
    wdColorGray625(6316128),
    
    /**
     * (5855577)
     */
    wdColorGray65(5855577),
    
    /**
     * (5000268)
     */
    wdColorGray70(5000268),
    
    /**
     * (4210752)
     */
    wdColorGray75(4210752),
    
    /**
     * (3355443)
     */
    wdColorGray80(3355443),
    
    /**
     * (2500134)
     */
    wdColorGray85(2500134),
    
    /**
     * (2105376)
     */
    wdColorGray875(2105376),
    
    /**
     * (1644825)
     */
    wdColorGray90(1644825),
    
    /**
     * (789516)
     */
    wdColorGray95(789516),
    ;

    private WdColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}