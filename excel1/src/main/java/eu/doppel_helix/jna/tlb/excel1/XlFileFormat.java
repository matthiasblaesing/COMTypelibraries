
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFileFormat implements IComEnum {
    
    /**
     * (18)
     */
    xlAddIn(18),
    
    /**
     * (6)
     */
    xlCSV(6),
    
    /**
     * (22)
     */
    xlCSVMac(22),
    
    /**
     * (24)
     */
    xlCSVMSDOS(24),
    
    /**
     * (23)
     */
    xlCSVWindows(23),
    
    /**
     * (7)
     */
    xlDBF2(7),
    
    /**
     * (8)
     */
    xlDBF3(8),
    
    /**
     * (11)
     */
    xlDBF4(11),
    
    /**
     * (9)
     */
    xlDIF(9),
    
    /**
     * (16)
     */
    xlExcel2(16),
    
    /**
     * (27)
     */
    xlExcel2FarEast(27),
    
    /**
     * (29)
     */
    xlExcel3(29),
    
    /**
     * (33)
     */
    xlExcel4(33),
    
    /**
     * (39)
     */
    xlExcel5(39),
    
    /**
     * (39)
     */
    xlExcel7(39),
    
    /**
     * (43)
     */
    xlExcel9795(43),
    
    /**
     * (35)
     */
    xlExcel4Workbook(35),
    
    /**
     * (26)
     */
    xlIntlAddIn(26),
    
    /**
     * (25)
     */
    xlIntlMacro(25),
    
    /**
     * (-4143)
     */
    xlWorkbookNormal(-4143),
    
    /**
     * (2)
     */
    xlSYLK(2),
    
    /**
     * (17)
     */
    xlTemplate(17),
    
    /**
     * (-4158)
     */
    xlCurrentPlatformText(-4158),
    
    /**
     * (19)
     */
    xlTextMac(19),
    
    /**
     * (21)
     */
    xlTextMSDOS(21),
    
    /**
     * (36)
     */
    xlTextPrinter(36),
    
    /**
     * (20)
     */
    xlTextWindows(20),
    
    /**
     * (14)
     */
    xlWJ2WD1(14),
    
    /**
     * (5)
     */
    xlWK1(5),
    
    /**
     * (31)
     */
    xlWK1ALL(31),
    
    /**
     * (30)
     */
    xlWK1FMT(30),
    
    /**
     * (15)
     */
    xlWK3(15),
    
    /**
     * (38)
     */
    xlWK4(38),
    
    /**
     * (32)
     */
    xlWK3FM3(32),
    
    /**
     * (4)
     */
    xlWKS(4),
    
    /**
     * (28)
     */
    xlWorks2FarEast(28),
    
    /**
     * (34)
     */
    xlWQ1(34),
    
    /**
     * (40)
     */
    xlWJ3(40),
    
    /**
     * (41)
     */
    xlWJ3FJ3(41),
    
    /**
     * (42)
     */
    xlUnicodeText(42),
    
    /**
     * (44)
     */
    xlHtml(44),
    
    /**
     * (45)
     */
    xlWebArchive(45),
    
    /**
     * (46)
     */
    xlXMLSpreadsheet(46),
    
    /**
     * (50)
     */
    xlExcel12(50),
    
    /**
     * (51)
     */
    xlOpenXMLWorkbook(51),
    
    /**
     * (52)
     */
    xlOpenXMLWorkbookMacroEnabled(52),
    
    /**
     * (53)
     */
    xlOpenXMLTemplateMacroEnabled(53),
    
    /**
     * (17)
     */
    xlTemplate8(17),
    
    /**
     * (54)
     */
    xlOpenXMLTemplate(54),
    
    /**
     * (18)
     */
    xlAddIn8(18),
    
    /**
     * (55)
     */
    xlOpenXMLAddIn(55),
    
    /**
     * (56)
     */
    xlExcel8(56),
    
    /**
     * (60)
     */
    xlOpenDocumentSpreadsheet(60),
    
    /**
     * (61)
     */
    xlOpenXMLStrictWorkbook(61),
    
    /**
     * (51)
     */
    xlWorkbookDefault(51),
    ;

    private XlFileFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}