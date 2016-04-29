
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPaperSize implements IComEnum {
    
    /**
     * (16)
     */
    xlPaper10x14(16),
    
    /**
     * (17)
     */
    xlPaper11x17(17),
    
    /**
     * (8)
     */
    xlPaperA3(8),
    
    /**
     * (9)
     */
    xlPaperA4(9),
    
    /**
     * (10)
     */
    xlPaperA4Small(10),
    
    /**
     * (11)
     */
    xlPaperA5(11),
    
    /**
     * (12)
     */
    xlPaperB4(12),
    
    /**
     * (13)
     */
    xlPaperB5(13),
    
    /**
     * (24)
     */
    xlPaperCsheet(24),
    
    /**
     * (25)
     */
    xlPaperDsheet(25),
    
    /**
     * (20)
     */
    xlPaperEnvelope10(20),
    
    /**
     * (21)
     */
    xlPaperEnvelope11(21),
    
    /**
     * (22)
     */
    xlPaperEnvelope12(22),
    
    /**
     * (23)
     */
    xlPaperEnvelope14(23),
    
    /**
     * (19)
     */
    xlPaperEnvelope9(19),
    
    /**
     * (33)
     */
    xlPaperEnvelopeB4(33),
    
    /**
     * (34)
     */
    xlPaperEnvelopeB5(34),
    
    /**
     * (35)
     */
    xlPaperEnvelopeB6(35),
    
    /**
     * (29)
     */
    xlPaperEnvelopeC3(29),
    
    /**
     * (30)
     */
    xlPaperEnvelopeC4(30),
    
    /**
     * (28)
     */
    xlPaperEnvelopeC5(28),
    
    /**
     * (31)
     */
    xlPaperEnvelopeC6(31),
    
    /**
     * (32)
     */
    xlPaperEnvelopeC65(32),
    
    /**
     * (27)
     */
    xlPaperEnvelopeDL(27),
    
    /**
     * (36)
     */
    xlPaperEnvelopeItaly(36),
    
    /**
     * (37)
     */
    xlPaperEnvelopeMonarch(37),
    
    /**
     * (38)
     */
    xlPaperEnvelopePersonal(38),
    
    /**
     * (26)
     */
    xlPaperEsheet(26),
    
    /**
     * (7)
     */
    xlPaperExecutive(7),
    
    /**
     * (41)
     */
    xlPaperFanfoldLegalGerman(41),
    
    /**
     * (40)
     */
    xlPaperFanfoldStdGerman(40),
    
    /**
     * (39)
     */
    xlPaperFanfoldUS(39),
    
    /**
     * (14)
     */
    xlPaperFolio(14),
    
    /**
     * (4)
     */
    xlPaperLedger(4),
    
    /**
     * (5)
     */
    xlPaperLegal(5),
    
    /**
     * (1)
     */
    xlPaperLetter(1),
    
    /**
     * (2)
     */
    xlPaperLetterSmall(2),
    
    /**
     * (18)
     */
    xlPaperNote(18),
    
    /**
     * (15)
     */
    xlPaperQuarto(15),
    
    /**
     * (6)
     */
    xlPaperStatement(6),
    
    /**
     * (3)
     */
    xlPaperTabloid(3),
    
    /**
     * (256)
     */
    xlPaperUser(256),
    ;

    private XlPaperSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}