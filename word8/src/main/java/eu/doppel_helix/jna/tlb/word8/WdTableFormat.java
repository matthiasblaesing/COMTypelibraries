
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6EEDBBA4-BD98-3F0A-A7E4-F4E97C8A6AA0})</p>
 */
public enum WdTableFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdTableFormatNone(0),
    
    /**
     * (1)
     */
    wdTableFormatSimple1(1),
    
    /**
     * (2)
     */
    wdTableFormatSimple2(2),
    
    /**
     * (3)
     */
    wdTableFormatSimple3(3),
    
    /**
     * (4)
     */
    wdTableFormatClassic1(4),
    
    /**
     * (5)
     */
    wdTableFormatClassic2(5),
    
    /**
     * (6)
     */
    wdTableFormatClassic3(6),
    
    /**
     * (7)
     */
    wdTableFormatClassic4(7),
    
    /**
     * (8)
     */
    wdTableFormatColorful1(8),
    
    /**
     * (9)
     */
    wdTableFormatColorful2(9),
    
    /**
     * (10)
     */
    wdTableFormatColorful3(10),
    
    /**
     * (11)
     */
    wdTableFormatColumns1(11),
    
    /**
     * (12)
     */
    wdTableFormatColumns2(12),
    
    /**
     * (13)
     */
    wdTableFormatColumns3(13),
    
    /**
     * (14)
     */
    wdTableFormatColumns4(14),
    
    /**
     * (15)
     */
    wdTableFormatColumns5(15),
    
    /**
     * (16)
     */
    wdTableFormatGrid1(16),
    
    /**
     * (17)
     */
    wdTableFormatGrid2(17),
    
    /**
     * (18)
     */
    wdTableFormatGrid3(18),
    
    /**
     * (19)
     */
    wdTableFormatGrid4(19),
    
    /**
     * (20)
     */
    wdTableFormatGrid5(20),
    
    /**
     * (21)
     */
    wdTableFormatGrid6(21),
    
    /**
     * (22)
     */
    wdTableFormatGrid7(22),
    
    /**
     * (23)
     */
    wdTableFormatGrid8(23),
    
    /**
     * (24)
     */
    wdTableFormatList1(24),
    
    /**
     * (25)
     */
    wdTableFormatList2(25),
    
    /**
     * (26)
     */
    wdTableFormatList3(26),
    
    /**
     * (27)
     */
    wdTableFormatList4(27),
    
    /**
     * (28)
     */
    wdTableFormatList5(28),
    
    /**
     * (29)
     */
    wdTableFormatList6(29),
    
    /**
     * (30)
     */
    wdTableFormatList7(30),
    
    /**
     * (31)
     */
    wdTableFormatList8(31),
    
    /**
     * (32)
     */
    wdTableFormat3DEffects1(32),
    
    /**
     * (33)
     */
    wdTableFormat3DEffects2(33),
    
    /**
     * (34)
     */
    wdTableFormat3DEffects3(34),
    
    /**
     * (35)
     */
    wdTableFormatContemporary(35),
    
    /**
     * (36)
     */
    wdTableFormatElegant(36),
    
    /**
     * (37)
     */
    wdTableFormatProfessional(37),
    
    /**
     * (38)
     */
    wdTableFormatSubtle1(38),
    
    /**
     * (39)
     */
    wdTableFormatSubtle2(39),
    
    /**
     * (40)
     */
    wdTableFormatWeb1(40),
    
    /**
     * (41)
     */
    wdTableFormatWeb2(41),
    
    /**
     * (42)
     */
    wdTableFormatWeb3(42),
    ;

    private WdTableFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}