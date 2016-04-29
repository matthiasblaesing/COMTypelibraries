
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8540D1F6-D74A-3FAD-8BE2-03F9CADC2B1E})</p>
 */
public enum WdPaperSize implements IComEnum {
    
    /**
     * (0)
     */
    wdPaper10x14(0),
    
    /**
     * (1)
     */
    wdPaper11x17(1),
    
    /**
     * (2)
     */
    wdPaperLetter(2),
    
    /**
     * (3)
     */
    wdPaperLetterSmall(3),
    
    /**
     * (4)
     */
    wdPaperLegal(4),
    
    /**
     * (5)
     */
    wdPaperExecutive(5),
    
    /**
     * (6)
     */
    wdPaperA3(6),
    
    /**
     * (7)
     */
    wdPaperA4(7),
    
    /**
     * (8)
     */
    wdPaperA4Small(8),
    
    /**
     * (9)
     */
    wdPaperA5(9),
    
    /**
     * (10)
     */
    wdPaperB4(10),
    
    /**
     * (11)
     */
    wdPaperB5(11),
    
    /**
     * (12)
     */
    wdPaperCSheet(12),
    
    /**
     * (13)
     */
    wdPaperDSheet(13),
    
    /**
     * (14)
     */
    wdPaperESheet(14),
    
    /**
     * (15)
     */
    wdPaperFanfoldLegalGerman(15),
    
    /**
     * (16)
     */
    wdPaperFanfoldStdGerman(16),
    
    /**
     * (17)
     */
    wdPaperFanfoldUS(17),
    
    /**
     * (18)
     */
    wdPaperFolio(18),
    
    /**
     * (19)
     */
    wdPaperLedger(19),
    
    /**
     * (20)
     */
    wdPaperNote(20),
    
    /**
     * (21)
     */
    wdPaperQuarto(21),
    
    /**
     * (22)
     */
    wdPaperStatement(22),
    
    /**
     * (23)
     */
    wdPaperTabloid(23),
    
    /**
     * (24)
     */
    wdPaperEnvelope9(24),
    
    /**
     * (25)
     */
    wdPaperEnvelope10(25),
    
    /**
     * (26)
     */
    wdPaperEnvelope11(26),
    
    /**
     * (27)
     */
    wdPaperEnvelope12(27),
    
    /**
     * (28)
     */
    wdPaperEnvelope14(28),
    
    /**
     * (29)
     */
    wdPaperEnvelopeB4(29),
    
    /**
     * (30)
     */
    wdPaperEnvelopeB5(30),
    
    /**
     * (31)
     */
    wdPaperEnvelopeB6(31),
    
    /**
     * (32)
     */
    wdPaperEnvelopeC3(32),
    
    /**
     * (33)
     */
    wdPaperEnvelopeC4(33),
    
    /**
     * (34)
     */
    wdPaperEnvelopeC5(34),
    
    /**
     * (35)
     */
    wdPaperEnvelopeC6(35),
    
    /**
     * (36)
     */
    wdPaperEnvelopeC65(36),
    
    /**
     * (37)
     */
    wdPaperEnvelopeDL(37),
    
    /**
     * (38)
     */
    wdPaperEnvelopeItaly(38),
    
    /**
     * (39)
     */
    wdPaperEnvelopeMonarch(39),
    
    /**
     * (40)
     */
    wdPaperEnvelopePersonal(40),
    
    /**
     * (41)
     */
    wdPaperCustom(41),
    ;

    private WdPaperSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}