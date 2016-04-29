
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotFormatType implements IComEnum {
    
    /**
     * (0)
     */
    xlReport1(0),
    
    /**
     * (1)
     */
    xlReport2(1),
    
    /**
     * (2)
     */
    xlReport3(2),
    
    /**
     * (3)
     */
    xlReport4(3),
    
    /**
     * (4)
     */
    xlReport5(4),
    
    /**
     * (5)
     */
    xlReport6(5),
    
    /**
     * (6)
     */
    xlReport7(6),
    
    /**
     * (7)
     */
    xlReport8(7),
    
    /**
     * (8)
     */
    xlReport9(8),
    
    /**
     * (9)
     */
    xlReport10(9),
    
    /**
     * (10)
     */
    xlTable1(10),
    
    /**
     * (11)
     */
    xlTable2(11),
    
    /**
     * (12)
     */
    xlTable3(12),
    
    /**
     * (13)
     */
    xlTable4(13),
    
    /**
     * (14)
     */
    xlTable5(14),
    
    /**
     * (15)
     */
    xlTable6(15),
    
    /**
     * (16)
     */
    xlTable7(16),
    
    /**
     * (17)
     */
    xlTable8(17),
    
    /**
     * (18)
     */
    xlTable9(18),
    
    /**
     * (19)
     */
    xlTable10(19),
    
    /**
     * (20)
     */
    xlPTClassic(20),
    
    /**
     * (21)
     */
    xlPTNone(21),
    ;

    private XlPivotFormatType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}