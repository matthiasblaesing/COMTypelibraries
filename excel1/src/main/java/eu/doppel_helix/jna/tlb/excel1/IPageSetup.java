
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B4-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B4-0001-0000-C000-000000000046}")
public interface IPageSetup extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComProperty(name = "BlackAndWhite", dispId = 0x3f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getBlackAndWhite(VARIANT RHS);
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComProperty(name = "BlackAndWhite", dispId = 0x3f1)
    com.sun.jna.platform.win32.WinNT.HRESULT setBlackAndWhite(Boolean RHS);
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "BottomMargin", dispId = 0x3ea)
    com.sun.jna.platform.win32.WinNT.HRESULT getBottomMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "BottomMargin", dispId = 0x3ea)
    com.sun.jna.platform.win32.WinNT.HRESULT setBottomMargin(Double RHS);
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterFooter(VARIANT RHS);
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterFooter(String RHS);
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterHeader(VARIANT RHS);
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterHeader(String RHS);
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "CenterHorizontally", dispId = 0x3ed)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterHorizontally(VARIANT RHS);
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "CenterHorizontally", dispId = 0x3ed)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterHorizontally(Boolean RHS);
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "CenterVertically", dispId = 0x3ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterVertically(VARIANT RHS);
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "CenterVertically", dispId = 0x3ee)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterVertically(Boolean RHS);
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComProperty(name = "ChartSize", dispId = 0x3f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getChartSize(VARIANT RHS);
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComProperty(name = "ChartSize", dispId = 0x3f4)
    com.sun.jna.platform.win32.WinNT.HRESULT setChartSize(XlObjectSize RHS);
            
    /**
     * <p>id(0x3fc)</p>
     */
    @ComProperty(name = "Draft", dispId = 0x3fc)
    com.sun.jna.platform.win32.WinNT.HRESULT getDraft(VARIANT RHS);
            
    /**
     * <p>id(0x3fc)</p>
     */
    @ComProperty(name = "Draft", dispId = 0x3fc)
    com.sun.jna.platform.win32.WinNT.HRESULT setDraft(Boolean RHS);
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "FirstPageNumber", dispId = 0x3f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstPageNumber(VARIANT RHS);
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "FirstPageNumber", dispId = 0x3f0)
    com.sun.jna.platform.win32.WinNT.HRESULT setFirstPageNumber(Integer RHS);
            
    /**
     * <p>id(0x3f5)</p>
     */
    @ComProperty(name = "FitToPagesTall", dispId = 0x3f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getFitToPagesTall(VARIANT RHS);
            
    /**
     * <p>id(0x3f5)</p>
     */
    @ComProperty(name = "FitToPagesTall", dispId = 0x3f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setFitToPagesTall(Object RHS);
            
    /**
     * <p>id(0x3f6)</p>
     */
    @ComProperty(name = "FitToPagesWide", dispId = 0x3f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getFitToPagesWide(VARIANT RHS);
            
    /**
     * <p>id(0x3f6)</p>
     */
    @ComProperty(name = "FitToPagesWide", dispId = 0x3f6)
    com.sun.jna.platform.win32.WinNT.HRESULT setFitToPagesWide(Object RHS);
            
    /**
     * <p>id(0x3f7)</p>
     */
    @ComProperty(name = "FooterMargin", dispId = 0x3f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getFooterMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3f7)</p>
     */
    @ComProperty(name = "FooterMargin", dispId = 0x3f7)
    com.sun.jna.platform.win32.WinNT.HRESULT setFooterMargin(Double RHS);
            
    /**
     * <p>id(0x3f8)</p>
     */
    @ComProperty(name = "HeaderMargin", dispId = 0x3f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeaderMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3f8)</p>
     */
    @ComProperty(name = "HeaderMargin", dispId = 0x3f8)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeaderMargin(Double RHS);
            
    /**
     * <p>id(0x3f9)</p>
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftFooter(VARIANT RHS);
            
    /**
     * <p>id(0x3f9)</p>
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeftFooter(String RHS);
            
    /**
     * <p>id(0x3fa)</p>
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftHeader(VARIANT RHS);
            
    /**
     * <p>id(0x3fa)</p>
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeftHeader(String RHS);
            
    /**
     * <p>id(0x3e7)</p>
     */
    @ComProperty(name = "LeftMargin", dispId = 0x3e7)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3e7)</p>
     */
    @ComProperty(name = "LeftMargin", dispId = 0x3e7)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeftMargin(Double RHS);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrder(VARIANT RHS);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrder(XlOrder RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(XlPageOrientation RHS);
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "PaperSize", dispId = 0x3ef)
    com.sun.jna.platform.win32.WinNT.HRESULT getPaperSize(VARIANT RHS);
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "PaperSize", dispId = 0x3ef)
    com.sun.jna.platform.win32.WinNT.HRESULT setPaperSize(XlPaperSize RHS);
            
    /**
     * <p>id(0x3fb)</p>
     */
    @ComProperty(name = "PrintArea", dispId = 0x3fb)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintArea(VARIANT RHS);
            
    /**
     * <p>id(0x3fb)</p>
     */
    @ComProperty(name = "PrintArea", dispId = 0x3fb)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintArea(String RHS);
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "PrintGridlines", dispId = 0x3ec)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "PrintGridlines", dispId = 0x3ec)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintGridlines(Boolean RHS);
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "PrintHeadings", dispId = 0x3eb)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintHeadings(VARIANT RHS);
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "PrintHeadings", dispId = 0x3eb)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintHeadings(Boolean RHS);
            
    /**
     * <p>id(0x3fd)</p>
     */
    @ComProperty(name = "PrintNotes", dispId = 0x3fd)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintNotes(VARIANT RHS);
            
    /**
     * <p>id(0x3fd)</p>
     */
    @ComProperty(name = "PrintNotes", dispId = 0x3fd)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintNotes(Boolean RHS);
            
    /**
     * <p>id(0x3fe)</p>
     */
    @ComProperty(name = "PrintQuality", dispId = 0x3fe)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintQuality(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x3fe)</p>
     */
    @ComProperty(name = "PrintQuality", dispId = 0x3fe)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintQuality(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x3ff)</p>
     */
    @ComProperty(name = "PrintTitleColumns", dispId = 0x3ff)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintTitleColumns(VARIANT RHS);
            
    /**
     * <p>id(0x3ff)</p>
     */
    @ComProperty(name = "PrintTitleColumns", dispId = 0x3ff)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintTitleColumns(String RHS);
            
    /**
     * <p>id(0x400)</p>
     */
    @ComProperty(name = "PrintTitleRows", dispId = 0x400)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintTitleRows(VARIANT RHS);
            
    /**
     * <p>id(0x400)</p>
     */
    @ComProperty(name = "PrintTitleRows", dispId = 0x400)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintTitleRows(String RHS);
            
    /**
     * <p>id(0x401)</p>
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightFooter(VARIANT RHS);
            
    /**
     * <p>id(0x401)</p>
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    com.sun.jna.platform.win32.WinNT.HRESULT setRightFooter(String RHS);
            
    /**
     * <p>id(0x402)</p>
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightHeader(VARIANT RHS);
            
    /**
     * <p>id(0x402)</p>
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    com.sun.jna.platform.win32.WinNT.HRESULT setRightHeader(String RHS);
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "RightMargin", dispId = 0x3e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "RightMargin", dispId = 0x3e8)
    com.sun.jna.platform.win32.WinNT.HRESULT setRightMargin(Double RHS);
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x3e9)
    com.sun.jna.platform.win32.WinNT.HRESULT getTopMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x3e9)
    com.sun.jna.platform.win32.WinNT.HRESULT setTopMargin(Double RHS);
            
    /**
     * <p>id(0x297)</p>
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    com.sun.jna.platform.win32.WinNT.HRESULT getZoom(VARIANT RHS);
            
    /**
     * <p>id(0x297)</p>
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    com.sun.jna.platform.win32.WinNT.HRESULT setZoom(Object RHS);
            
    /**
     * <p>id(0x5f4)</p>
     */
    @ComProperty(name = "PrintComments", dispId = 0x5f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintComments(VARIANT RHS);
            
    /**
     * <p>id(0x5f4)</p>
     */
    @ComProperty(name = "PrintComments", dispId = 0x5f4)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintComments(XlPrintLocation RHS);
            
    /**
     * <p>id(0x865)</p>
     */
    @ComProperty(name = "PrintErrors", dispId = 0x865)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintErrors(VARIANT RHS);
            
    /**
     * <p>id(0x865)</p>
     */
    @ComProperty(name = "PrintErrors", dispId = 0x865)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintErrors(XlPrintErrors RHS);
            
    /**
     * <p>id(0x866)</p>
     */
    @ComProperty(name = "CenterHeaderPicture", dispId = 0x866)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterHeaderPicture(VARIANT RHS);
            
    /**
     * <p>id(0x867)</p>
     */
    @ComProperty(name = "CenterFooterPicture", dispId = 0x867)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterFooterPicture(VARIANT RHS);
            
    /**
     * <p>id(0x868)</p>
     */
    @ComProperty(name = "LeftHeaderPicture", dispId = 0x868)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftHeaderPicture(VARIANT RHS);
            
    /**
     * <p>id(0x869)</p>
     */
    @ComProperty(name = "LeftFooterPicture", dispId = 0x869)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftFooterPicture(VARIANT RHS);
            
    /**
     * <p>id(0x86a)</p>
     */
    @ComProperty(name = "RightHeaderPicture", dispId = 0x86a)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightHeaderPicture(VARIANT RHS);
            
    /**
     * <p>id(0x86b)</p>
     */
    @ComProperty(name = "RightFooterPicture", dispId = 0x86b)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightFooterPicture(VARIANT RHS);
            
    /**
     * <p>id(0xa28)</p>
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0xa28)
    com.sun.jna.platform.win32.WinNT.HRESULT getOddAndEvenPagesHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa28)</p>
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0xa28)
    com.sun.jna.platform.win32.WinNT.HRESULT setOddAndEvenPagesHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa29)</p>
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0xa29)
    com.sun.jna.platform.win32.WinNT.HRESULT getDifferentFirstPageHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa29)</p>
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0xa29)
    com.sun.jna.platform.win32.WinNT.HRESULT setDifferentFirstPageHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa2a)</p>
     */
    @ComProperty(name = "ScaleWithDocHeaderFooter", dispId = 0xa2a)
    com.sun.jna.platform.win32.WinNT.HRESULT getScaleWithDocHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa2a)</p>
     */
    @ComProperty(name = "ScaleWithDocHeaderFooter", dispId = 0xa2a)
    com.sun.jna.platform.win32.WinNT.HRESULT setScaleWithDocHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa2b)</p>
     */
    @ComProperty(name = "AlignMarginsHeaderFooter", dispId = 0xa2b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlignMarginsHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa2b)</p>
     */
    @ComProperty(name = "AlignMarginsHeaderFooter", dispId = 0xa2b)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlignMarginsHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa2c)</p>
     */
    @ComProperty(name = "Pages", dispId = 0xa2c)
    com.sun.jna.platform.win32.WinNT.HRESULT getPages(VARIANT RHS);
            
    /**
     * <p>id(0xa2d)</p>
     */
    @ComProperty(name = "EvenPage", dispId = 0xa2d)
    com.sun.jna.platform.win32.WinNT.HRESULT getEvenPage(VARIANT RHS);
            
    /**
     * <p>id(0xa2e)</p>
     */
    @ComProperty(name = "FirstPage", dispId = 0xa2e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstPage(VARIANT RHS);
            
    
}