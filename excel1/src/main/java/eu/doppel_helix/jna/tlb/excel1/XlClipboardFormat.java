
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlClipboardFormat implements IComEnum {
    
    /**
     * (63)
     */
    xlClipboardFormatBIFF12(63),
    
    /**
     * (8)
     */
    xlClipboardFormatBIFF(8),
    
    /**
     * (18)
     */
    xlClipboardFormatBIFF2(18),
    
    /**
     * (20)
     */
    xlClipboardFormatBIFF3(20),
    
    /**
     * (30)
     */
    xlClipboardFormatBIFF4(30),
    
    /**
     * (15)
     */
    xlClipboardFormatBinary(15),
    
    /**
     * (9)
     */
    xlClipboardFormatBitmap(9),
    
    /**
     * (13)
     */
    xlClipboardFormatCGM(13),
    
    /**
     * (5)
     */
    xlClipboardFormatCSV(5),
    
    /**
     * (4)
     */
    xlClipboardFormatDIF(4),
    
    /**
     * (12)
     */
    xlClipboardFormatDspText(12),
    
    /**
     * (21)
     */
    xlClipboardFormatEmbeddedObject(21),
    
    /**
     * (22)
     */
    xlClipboardFormatEmbedSource(22),
    
    /**
     * (11)
     */
    xlClipboardFormatLink(11),
    
    /**
     * (23)
     */
    xlClipboardFormatLinkSource(23),
    
    /**
     * (32)
     */
    xlClipboardFormatLinkSourceDesc(32),
    
    /**
     * (24)
     */
    xlClipboardFormatMovie(24),
    
    /**
     * (14)
     */
    xlClipboardFormatNative(14),
    
    /**
     * (31)
     */
    xlClipboardFormatObjectDesc(31),
    
    /**
     * (19)
     */
    xlClipboardFormatObjectLink(19),
    
    /**
     * (17)
     */
    xlClipboardFormatOwnerLink(17),
    
    /**
     * (2)
     */
    xlClipboardFormatPICT(2),
    
    /**
     * (3)
     */
    xlClipboardFormatPrintPICT(3),
    
    /**
     * (7)
     */
    xlClipboardFormatRTF(7),
    
    /**
     * (29)
     */
    xlClipboardFormatScreenPICT(29),
    
    /**
     * (28)
     */
    xlClipboardFormatStandardFont(28),
    
    /**
     * (27)
     */
    xlClipboardFormatStandardScale(27),
    
    /**
     * (6)
     */
    xlClipboardFormatSYLK(6),
    
    /**
     * (16)
     */
    xlClipboardFormatTable(16),
    
    /**
     * (0)
     */
    xlClipboardFormatText(0),
    
    /**
     * (25)
     */
    xlClipboardFormatToolFace(25),
    
    /**
     * (26)
     */
    xlClipboardFormatToolFacePICT(26),
    
    /**
     * (1)
     */
    xlClipboardFormatVALU(1),
    
    /**
     * (10)
     */
    xlClipboardFormatWK1(10),
    ;

    private XlClipboardFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}