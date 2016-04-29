
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6AEEBC10-0420-3FB1-8A04-5F2053C4DAE9})</p>
 */
public enum WdSaveFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdFormatDocument(0),
    
    /**
     * (0)
     */
    wdFormatDocument97(0),
    
    /**
     * (1)
     */
    wdFormatTemplate(1),
    
    /**
     * (1)
     */
    wdFormatTemplate97(1),
    
    /**
     * (2)
     */
    wdFormatText(2),
    
    /**
     * (3)
     */
    wdFormatTextLineBreaks(3),
    
    /**
     * (4)
     */
    wdFormatDOSText(4),
    
    /**
     * (5)
     */
    wdFormatDOSTextLineBreaks(5),
    
    /**
     * (6)
     */
    wdFormatRTF(6),
    
    /**
     * (7)
     */
    wdFormatUnicodeText(7),
    
    /**
     * (7)
     */
    wdFormatEncodedText(7),
    
    /**
     * (8)
     */
    wdFormatHTML(8),
    
    /**
     * (9)
     */
    wdFormatWebArchive(9),
    
    /**
     * (10)
     */
    wdFormatFilteredHTML(10),
    
    /**
     * (11)
     */
    wdFormatXML(11),
    
    /**
     * (12)
     */
    wdFormatXMLDocument(12),
    
    /**
     * (13)
     */
    wdFormatXMLDocumentMacroEnabled(13),
    
    /**
     * (14)
     */
    wdFormatXMLTemplate(14),
    
    /**
     * (15)
     */
    wdFormatXMLTemplateMacroEnabled(15),
    
    /**
     * (16)
     */
    wdFormatDocumentDefault(16),
    
    /**
     * (17)
     */
    wdFormatPDF(17),
    
    /**
     * (18)
     */
    wdFormatXPS(18),
    
    /**
     * (19)
     */
    wdFormatFlatXML(19),
    
    /**
     * (20)
     */
    wdFormatFlatXMLMacroEnabled(20),
    
    /**
     * (21)
     */
    wdFormatFlatXMLTemplate(21),
    
    /**
     * (22)
     */
    wdFormatFlatXMLTemplateMacroEnabled(22),
    
    /**
     * (23)
     */
    wdFormatOpenDocumentText(23),
    
    /**
     * (24)
     */
    wdFormatStrictOpenXMLDocument(24),
    ;

    private WdSaveFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}