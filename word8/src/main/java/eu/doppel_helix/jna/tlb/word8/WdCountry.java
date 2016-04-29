
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5A6A6EF1-8165-3EFA-8982-536C7977A79D})</p>
 */
public enum WdCountry implements IComEnum {
    
    /**
     * (1)
     */
    wdUS(1),
    
    /**
     * (2)
     */
    wdCanada(2),
    
    /**
     * (3)
     */
    wdLatinAmerica(3),
    
    /**
     * (31)
     */
    wdNetherlands(31),
    
    /**
     * (33)
     */
    wdFrance(33),
    
    /**
     * (34)
     */
    wdSpain(34),
    
    /**
     * (39)
     */
    wdItaly(39),
    
    /**
     * (44)
     */
    wdUK(44),
    
    /**
     * (45)
     */
    wdDenmark(45),
    
    /**
     * (46)
     */
    wdSweden(46),
    
    /**
     * (47)
     */
    wdNorway(47),
    
    /**
     * (49)
     */
    wdGermany(49),
    
    /**
     * (51)
     */
    wdPeru(51),
    
    /**
     * (52)
     */
    wdMexico(52),
    
    /**
     * (54)
     */
    wdArgentina(54),
    
    /**
     * (55)
     */
    wdBrazil(55),
    
    /**
     * (56)
     */
    wdChile(56),
    
    /**
     * (58)
     */
    wdVenezuela(58),
    
    /**
     * (81)
     */
    wdJapan(81),
    
    /**
     * (886)
     */
    wdTaiwan(886),
    
    /**
     * (86)
     */
    wdChina(86),
    
    /**
     * (82)
     */
    wdKorea(82),
    
    /**
     * (358)
     */
    wdFinland(358),
    
    /**
     * (354)
     */
    wdIceland(354),
    ;

    private WdCountry(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}