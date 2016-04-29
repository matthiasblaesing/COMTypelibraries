
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9C1B95DA-5F16-303B-8B1C-9C846D96DE8E})</p>
 */
public enum WdOpenFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdOpenFormatAuto(0),
    
    /**
     * (1)
     */
    wdOpenFormatDocument(1),
    
    /**
     * (2)
     */
    wdOpenFormatTemplate(2),
    
    /**
     * (3)
     */
    wdOpenFormatRTF(3),
    
    /**
     * (4)
     */
    wdOpenFormatText(4),
    
    /**
     * (5)
     */
    wdOpenFormatUnicodeText(5),
    
    /**
     * (5)
     */
    wdOpenFormatEncodedText(5),
    
    /**
     * (6)
     */
    wdOpenFormatAllWord(6),
    
    /**
     * (7)
     */
    wdOpenFormatWebPages(7),
    
    /**
     * (8)
     */
    wdOpenFormatXML(8),
    
    /**
     * (9)
     */
    wdOpenFormatXMLDocument(9),
    
    /**
     * (10)
     */
    wdOpenFormatXMLDocumentMacroEnabled(10),
    
    /**
     * (11)
     */
    wdOpenFormatXMLTemplate(11),
    
    /**
     * (12)
     */
    wdOpenFormatXMLTemplateMacroEnabled(12),
    
    /**
     * (1)
     */
    wdOpenFormatDocument97(1),
    
    /**
     * (2)
     */
    wdOpenFormatTemplate97(2),
    
    /**
     * (13)
     */
    wdOpenFormatAllWordTemplates(13),
    
    /**
     * (14)
     */
    wdOpenFormatXMLDocumentSerialized(14),
    
    /**
     * (15)
     */
    wdOpenFormatXMLDocumentMacroEnabledSerialized(15),
    
    /**
     * (16)
     */
    wdOpenFormatXMLTemplateSerialized(16),
    
    /**
     * (17)
     */
    wdOpenFormatXMLTemplateMacroEnabledSerialized(17),
    
    /**
     * (18)
     */
    wdOpenFormatOpenDocumentText(18),
    ;

    private WdOpenFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}