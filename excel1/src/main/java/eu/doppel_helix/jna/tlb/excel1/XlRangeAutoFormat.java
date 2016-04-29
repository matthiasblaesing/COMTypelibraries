
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlRangeAutoFormat implements IComEnum {
    
    /**
     * (13)
     */
    xlRangeAutoFormat3DEffects1(13),
    
    /**
     * (14)
     */
    xlRangeAutoFormat3DEffects2(14),
    
    /**
     * (4)
     */
    xlRangeAutoFormatAccounting1(4),
    
    /**
     * (5)
     */
    xlRangeAutoFormatAccounting2(5),
    
    /**
     * (6)
     */
    xlRangeAutoFormatAccounting3(6),
    
    /**
     * (17)
     */
    xlRangeAutoFormatAccounting4(17),
    
    /**
     * (1)
     */
    xlRangeAutoFormatClassic1(1),
    
    /**
     * (2)
     */
    xlRangeAutoFormatClassic2(2),
    
    /**
     * (3)
     */
    xlRangeAutoFormatClassic3(3),
    
    /**
     * (7)
     */
    xlRangeAutoFormatColor1(7),
    
    /**
     * (8)
     */
    xlRangeAutoFormatColor2(8),
    
    /**
     * (9)
     */
    xlRangeAutoFormatColor3(9),
    
    /**
     * (10)
     */
    xlRangeAutoFormatList1(10),
    
    /**
     * (11)
     */
    xlRangeAutoFormatList2(11),
    
    /**
     * (12)
     */
    xlRangeAutoFormatList3(12),
    
    /**
     * (15)
     */
    xlRangeAutoFormatLocalFormat1(15),
    
    /**
     * (16)
     */
    xlRangeAutoFormatLocalFormat2(16),
    
    /**
     * (19)
     */
    xlRangeAutoFormatLocalFormat3(19),
    
    /**
     * (20)
     */
    xlRangeAutoFormatLocalFormat4(20),
    
    /**
     * (21)
     */
    xlRangeAutoFormatReport1(21),
    
    /**
     * (22)
     */
    xlRangeAutoFormatReport2(22),
    
    /**
     * (23)
     */
    xlRangeAutoFormatReport3(23),
    
    /**
     * (24)
     */
    xlRangeAutoFormatReport4(24),
    
    /**
     * (25)
     */
    xlRangeAutoFormatReport5(25),
    
    /**
     * (26)
     */
    xlRangeAutoFormatReport6(26),
    
    /**
     * (27)
     */
    xlRangeAutoFormatReport7(27),
    
    /**
     * (28)
     */
    xlRangeAutoFormatReport8(28),
    
    /**
     * (29)
     */
    xlRangeAutoFormatReport9(29),
    
    /**
     * (30)
     */
    xlRangeAutoFormatReport10(30),
    
    /**
     * (31)
     */
    xlRangeAutoFormatClassicPivotTable(31),
    
    /**
     * (32)
     */
    xlRangeAutoFormatTable1(32),
    
    /**
     * (33)
     */
    xlRangeAutoFormatTable2(33),
    
    /**
     * (34)
     */
    xlRangeAutoFormatTable3(34),
    
    /**
     * (35)
     */
    xlRangeAutoFormatTable4(35),
    
    /**
     * (36)
     */
    xlRangeAutoFormatTable5(36),
    
    /**
     * (37)
     */
    xlRangeAutoFormatTable6(37),
    
    /**
     * (38)
     */
    xlRangeAutoFormatTable7(38),
    
    /**
     * (39)
     */
    xlRangeAutoFormatTable8(39),
    
    /**
     * (40)
     */
    xlRangeAutoFormatTable9(40),
    
    /**
     * (41)
     */
    xlRangeAutoFormatTable10(41),
    
    /**
     * (42)
     */
    xlRangeAutoFormatPTNone(42),
    
    /**
     * (-4142)
     */
    xlRangeAutoFormatNone(-4142),
    
    /**
     * (-4154)
     */
    xlRangeAutoFormatSimple(-4154),
    ;

    private XlRangeAutoFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}