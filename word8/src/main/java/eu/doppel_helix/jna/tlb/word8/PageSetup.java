
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020971-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020971-0000-0000-C000-000000000046}")
public interface PageSetup extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x64)
    Float getTopMargin();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TopMargin", dispId = 0x64)
    void setTopMargin(Float param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "BottomMargin", dispId = 0x65)
    Float getBottomMargin();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BottomMargin", dispId = 0x65)
    void setBottomMargin(Float param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "LeftMargin", dispId = 0x66)
    Float getLeftMargin();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftMargin", dispId = 0x66)
    void setLeftMargin(Float param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "RightMargin", dispId = 0x67)
    Float getRightMargin();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RightMargin", dispId = 0x67)
    void setRightMargin(Float param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Gutter", dispId = 0x68)
    Float getGutter();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Gutter", dispId = 0x68)
    void setGutter(Float param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "PageWidth", dispId = 0x69)
    Float getPageWidth();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PageWidth", dispId = 0x69)
    void setPageWidth(Float param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "PageHeight", dispId = 0x6a)
    Float getPageHeight();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PageHeight", dispId = 0x6a)
    void setPageHeight(Float param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x6b)
    WdOrientation getOrientation();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code WdOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x6b)
    void setOrientation(WdOrientation param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "FirstPageTray", dispId = 0x6c)
    WdPaperTray getFirstPageTray();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code WdPaperTray}
     */
    @ComProperty(name = "FirstPageTray", dispId = 0x6c)
    void setFirstPageTray(WdPaperTray param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "OtherPagesTray", dispId = 0x6d)
    WdPaperTray getOtherPagesTray();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code WdPaperTray}
     */
    @ComProperty(name = "OtherPagesTray", dispId = 0x6d)
    void setOtherPagesTray(WdPaperTray param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x6e)
    WdVerticalAlignment getVerticalAlignment();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code WdVerticalAlignment}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x6e)
    void setVerticalAlignment(WdVerticalAlignment param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "MirrorMargins", dispId = 0x6f)
    Integer getMirrorMargins();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MirrorMargins", dispId = 0x6f)
    void setMirrorMargins(Integer param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "HeaderDistance", dispId = 0x70)
    Float getHeaderDistance();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HeaderDistance", dispId = 0x70)
    void setHeaderDistance(Float param0);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "FooterDistance", dispId = 0x71)
    Float getFooterDistance();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "FooterDistance", dispId = 0x71)
    void setFooterDistance(Float param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "SectionStart", dispId = 0x72)
    WdSectionStart getSectionStart();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code WdSectionStart}
     */
    @ComProperty(name = "SectionStart", dispId = 0x72)
    void setSectionStart(WdSectionStart param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0x73)
    Integer getOddAndEvenPagesHeaderFooter();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0x73)
    void setOddAndEvenPagesHeaderFooter(Integer param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0x74)
    Integer getDifferentFirstPageHeaderFooter();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0x74)
    void setDifferentFirstPageHeaderFooter(Integer param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "SuppressEndnotes", dispId = 0x75)
    Integer getSuppressEndnotes();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SuppressEndnotes", dispId = 0x75)
    void setSuppressEndnotes(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "LineNumbering", dispId = 0x76)
    LineNumbering getLineNumbering();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code LineNumbering}
     */
    @ComProperty(name = "LineNumbering", dispId = 0x76)
    void setLineNumbering(LineNumbering param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "TextColumns", dispId = 0x77)
    TextColumns getTextColumns();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code TextColumns}
     */
    @ComProperty(name = "TextColumns", dispId = 0x77)
    void setTextColumns(TextColumns param0);
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "PaperSize", dispId = 0x78)
    WdPaperSize getPaperSize();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code WdPaperSize}
     */
    @ComProperty(name = "PaperSize", dispId = 0x78)
    void setPaperSize(WdPaperSize param0);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "TwoPagesOnOne", dispId = 0x79)
    Boolean getTwoPagesOnOne();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TwoPagesOnOne", dispId = 0x79)
    void setTwoPagesOnOne(Boolean param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "GutterOnTop", dispId = 0x7a)
    Boolean getGutterOnTop();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GutterOnTop", dispId = 0x7a)
    void setGutterOnTop(Boolean param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "CharsLine", dispId = 0x7b)
    Float getCharsLine();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CharsLine", dispId = 0x7b)
    void setCharsLine(Float param0);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "LinesPage", dispId = 0x7c)
    Float getLinesPage();
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LinesPage", dispId = 0x7c)
    void setLinesPage(Float param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "ShowGrid", dispId = 0x80)
    Boolean getShowGrid();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowGrid", dispId = 0x80)
    void setShowGrid(Boolean param0);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "TogglePortrait", dispId = 0xc9)
    void TogglePortrait();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "SetAsTemplateDefault", dispId = 0xca)
    void SetAsTemplateDefault();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "GutterStyle", dispId = 0x81)
    WdGutterStyleOld getGutterStyle();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code WdGutterStyleOld}
     */
    @ComProperty(name = "GutterStyle", dispId = 0x81)
    void setGutterStyle(WdGutterStyleOld param0);
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "SectionDirection", dispId = 0x82)
    WdSectionDirection getSectionDirection();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code WdSectionDirection}
     */
    @ComProperty(name = "SectionDirection", dispId = 0x82)
    void setSectionDirection(WdSectionDirection param0);
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "LayoutMode", dispId = 0x83)
    WdLayoutMode getLayoutMode();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code WdLayoutMode}
     */
    @ComProperty(name = "LayoutMode", dispId = 0x83)
    void setLayoutMode(WdLayoutMode param0);
            
    /**
     * <p>id(0x4c6)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "GutterPos", dispId = 0x4c6)
    WdGutterStyle getGutterPos();
            
    /**
     * <p>id(0x4c6)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code WdGutterStyle}
     */
    @ComProperty(name = "GutterPos", dispId = 0x4c6)
    void setGutterPos(WdGutterStyle param0);
            
    /**
     * <p>id(0x4c7)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "BookFoldPrinting", dispId = 0x4c7)
    Boolean getBookFoldPrinting();
            
    /**
     * <p>id(0x4c7)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BookFoldPrinting", dispId = 0x4c7)
    void setBookFoldPrinting(Boolean param0);
            
    /**
     * <p>id(0x4c8)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "BookFoldRevPrinting", dispId = 0x4c8)
    Boolean getBookFoldRevPrinting();
            
    /**
     * <p>id(0x4c8)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BookFoldRevPrinting", dispId = 0x4c8)
    void setBookFoldRevPrinting(Boolean param0);
            
    /**
     * <p>id(0x4c9)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "BookFoldPrintingSheets", dispId = 0x4c9)
    Integer getBookFoldPrintingSheets();
            
    /**
     * <p>id(0x4c9)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BookFoldPrintingSheets", dispId = 0x4c9)
    void setBookFoldPrintingSheets(Integer param0);
            
    
}