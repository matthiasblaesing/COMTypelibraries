
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
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BlackAndWhite", dispId = 0x3f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getBlackAndWhite(VARIANT RHS);
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "BlackAndWhite", dispId = 0x3f1)
    com.sun.jna.platform.win32.WinNT.HRESULT setBlackAndWhite(Boolean RHS);
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "BottomMargin", dispId = 0x3ea)
    com.sun.jna.platform.win32.WinNT.HRESULT getBottomMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "BottomMargin", dispId = 0x3ea)
    com.sun.jna.platform.win32.WinNT.HRESULT setBottomMargin(Double RHS);
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterFooter(VARIANT RHS);
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterFooter(String RHS);
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterHeader(VARIANT RHS);
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterHeader(String RHS);
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "CenterHorizontally", dispId = 0x3ed)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterHorizontally(VARIANT RHS);
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "CenterHorizontally", dispId = 0x3ed)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterHorizontally(Boolean RHS);
            
    /**
     * <p>id(0x3ee)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "CenterVertically", dispId = 0x3ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterVertically(VARIANT RHS);
            
    /**
     * <p>id(0x3ee)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "CenterVertically", dispId = 0x3ee)
    com.sun.jna.platform.win32.WinNT.HRESULT setCenterVertically(Boolean RHS);
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code XlObjectSize}
     */
    @ComProperty(name = "ChartSize", dispId = 0x3f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getChartSize(VARIANT RHS);
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code XlObjectSize}
     */
    @ComProperty(name = "ChartSize", dispId = 0x3f4)
    com.sun.jna.platform.win32.WinNT.HRESULT setChartSize(XlObjectSize RHS);
            
    /**
     * <p>id(0x3fc)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Draft", dispId = 0x3fc)
    com.sun.jna.platform.win32.WinNT.HRESULT getDraft(VARIANT RHS);
            
    /**
     * <p>id(0x3fc)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Draft", dispId = 0x3fc)
    com.sun.jna.platform.win32.WinNT.HRESULT setDraft(Boolean RHS);
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "FirstPageNumber", dispId = 0x3f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstPageNumber(VARIANT RHS);
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "FirstPageNumber", dispId = 0x3f0)
    com.sun.jna.platform.win32.WinNT.HRESULT setFirstPageNumber(Integer RHS);
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FitToPagesTall", dispId = 0x3f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getFitToPagesTall(VARIANT RHS);
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "FitToPagesTall", dispId = 0x3f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setFitToPagesTall(Object RHS);
            
    /**
     * <p>id(0x3f6)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FitToPagesWide", dispId = 0x3f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getFitToPagesWide(VARIANT RHS);
            
    /**
     * <p>id(0x3f6)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "FitToPagesWide", dispId = 0x3f6)
    com.sun.jna.platform.win32.WinNT.HRESULT setFitToPagesWide(Object RHS);
            
    /**
     * <p>id(0x3f7)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "FooterMargin", dispId = 0x3f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getFooterMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3f7)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "FooterMargin", dispId = 0x3f7)
    com.sun.jna.platform.win32.WinNT.HRESULT setFooterMargin(Double RHS);
            
    /**
     * <p>id(0x3f8)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "HeaderMargin", dispId = 0x3f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeaderMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3f8)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "HeaderMargin", dispId = 0x3f8)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeaderMargin(Double RHS);
            
    /**
     * <p>id(0x3f9)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftFooter(VARIANT RHS);
            
    /**
     * <p>id(0x3f9)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeftFooter(String RHS);
            
    /**
     * <p>id(0x3fa)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftHeader(VARIANT RHS);
            
    /**
     * <p>id(0x3fa)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeftHeader(String RHS);
            
    /**
     * <p>id(0x3e7)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "LeftMargin", dispId = 0x3e7)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3e7)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "LeftMargin", dispId = 0x3e7)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeftMargin(Double RHS);
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code XlOrder}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrder(VARIANT RHS);
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(43)</p>
     * @param RHS [in] {@code XlOrder}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrder(XlOrder RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code XlPageOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code XlPageOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(XlPageOrientation RHS);
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code XlPaperSize}
     */
    @ComProperty(name = "PaperSize", dispId = 0x3ef)
    com.sun.jna.platform.win32.WinNT.HRESULT getPaperSize(VARIANT RHS);
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code XlPaperSize}
     */
    @ComProperty(name = "PaperSize", dispId = 0x3ef)
    com.sun.jna.platform.win32.WinNT.HRESULT setPaperSize(XlPaperSize RHS);
            
    /**
     * <p>id(0x3fb)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PrintArea", dispId = 0x3fb)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintArea(VARIANT RHS);
            
    /**
     * <p>id(0x3fb)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "PrintArea", dispId = 0x3fb)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintArea(String RHS);
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintGridlines", dispId = 0x3ec)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintGridlines", dispId = 0x3ec)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintGridlines(Boolean RHS);
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintHeadings", dispId = 0x3eb)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintHeadings(VARIANT RHS);
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(53)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintHeadings", dispId = 0x3eb)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintHeadings(Boolean RHS);
            
    /**
     * <p>id(0x3fd)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintNotes", dispId = 0x3fd)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintNotes(VARIANT RHS);
            
    /**
     * <p>id(0x3fd)</p>
     * <p>vtableId(55)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintNotes", dispId = 0x3fd)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintNotes(Boolean RHS);
            
    /**
     * <p>id(0x3fe)</p>
     * <p>vtableId(56)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "PrintQuality", dispId = 0x3fe)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintQuality(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x3fe)</p>
     * <p>vtableId(57)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "PrintQuality", dispId = 0x3fe)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintQuality(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x3ff)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PrintTitleColumns", dispId = 0x3ff)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintTitleColumns(VARIANT RHS);
            
    /**
     * <p>id(0x3ff)</p>
     * <p>vtableId(59)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "PrintTitleColumns", dispId = 0x3ff)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintTitleColumns(String RHS);
            
    /**
     * <p>id(0x400)</p>
     * <p>vtableId(60)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PrintTitleRows", dispId = 0x400)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintTitleRows(VARIANT RHS);
            
    /**
     * <p>id(0x400)</p>
     * <p>vtableId(61)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "PrintTitleRows", dispId = 0x400)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintTitleRows(String RHS);
            
    /**
     * <p>id(0x401)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightFooter(VARIANT RHS);
            
    /**
     * <p>id(0x401)</p>
     * <p>vtableId(63)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    com.sun.jna.platform.win32.WinNT.HRESULT setRightFooter(String RHS);
            
    /**
     * <p>id(0x402)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightHeader(VARIANT RHS);
            
    /**
     * <p>id(0x402)</p>
     * <p>vtableId(65)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    com.sun.jna.platform.win32.WinNT.HRESULT setRightHeader(String RHS);
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "RightMargin", dispId = 0x3e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(67)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "RightMargin", dispId = 0x3e8)
    com.sun.jna.platform.win32.WinNT.HRESULT setRightMargin(Double RHS);
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(68)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "TopMargin", dispId = 0x3e9)
    com.sun.jna.platform.win32.WinNT.HRESULT getTopMargin(VARIANT RHS);
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(69)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "TopMargin", dispId = 0x3e9)
    com.sun.jna.platform.win32.WinNT.HRESULT setTopMargin(Double RHS);
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    com.sun.jna.platform.win32.WinNT.HRESULT getZoom(VARIANT RHS);
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(71)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    com.sun.jna.platform.win32.WinNT.HRESULT setZoom(Object RHS);
            
    /**
     * <p>id(0x5f4)</p>
     * <p>vtableId(72)</p>
     * @param RHS [out] {@code XlPrintLocation}
     */
    @ComProperty(name = "PrintComments", dispId = 0x5f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintComments(VARIANT RHS);
            
    /**
     * <p>id(0x5f4)</p>
     * <p>vtableId(73)</p>
     * @param RHS [in] {@code XlPrintLocation}
     */
    @ComProperty(name = "PrintComments", dispId = 0x5f4)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintComments(XlPrintLocation RHS);
            
    /**
     * <p>id(0x865)</p>
     * <p>vtableId(74)</p>
     * @param RHS [out] {@code XlPrintErrors}
     */
    @ComProperty(name = "PrintErrors", dispId = 0x865)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintErrors(VARIANT RHS);
            
    /**
     * <p>id(0x865)</p>
     * <p>vtableId(75)</p>
     * @param RHS [in] {@code XlPrintErrors}
     */
    @ComProperty(name = "PrintErrors", dispId = 0x865)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintErrors(XlPrintErrors RHS);
            
    /**
     * <p>id(0x866)</p>
     * <p>vtableId(76)</p>
     * @param RHS [out] {@code Graphic}
     */
    @ComProperty(name = "CenterHeaderPicture", dispId = 0x866)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterHeaderPicture(VARIANT RHS);
            
    /**
     * <p>id(0x867)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code Graphic}
     */
    @ComProperty(name = "CenterFooterPicture", dispId = 0x867)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterFooterPicture(VARIANT RHS);
            
    /**
     * <p>id(0x868)</p>
     * <p>vtableId(78)</p>
     * @param RHS [out] {@code Graphic}
     */
    @ComProperty(name = "LeftHeaderPicture", dispId = 0x868)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftHeaderPicture(VARIANT RHS);
            
    /**
     * <p>id(0x869)</p>
     * <p>vtableId(79)</p>
     * @param RHS [out] {@code Graphic}
     */
    @ComProperty(name = "LeftFooterPicture", dispId = 0x869)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftFooterPicture(VARIANT RHS);
            
    /**
     * <p>id(0x86a)</p>
     * <p>vtableId(80)</p>
     * @param RHS [out] {@code Graphic}
     */
    @ComProperty(name = "RightHeaderPicture", dispId = 0x86a)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightHeaderPicture(VARIANT RHS);
            
    /**
     * <p>id(0x86b)</p>
     * <p>vtableId(81)</p>
     * @param RHS [out] {@code Graphic}
     */
    @ComProperty(name = "RightFooterPicture", dispId = 0x86b)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightFooterPicture(VARIANT RHS);
            
    /**
     * <p>id(0xa28)</p>
     * <p>vtableId(82)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0xa28)
    com.sun.jna.platform.win32.WinNT.HRESULT getOddAndEvenPagesHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa28)</p>
     * <p>vtableId(83)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0xa28)
    com.sun.jna.platform.win32.WinNT.HRESULT setOddAndEvenPagesHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa29)</p>
     * <p>vtableId(84)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0xa29)
    com.sun.jna.platform.win32.WinNT.HRESULT getDifferentFirstPageHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa29)</p>
     * <p>vtableId(85)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0xa29)
    com.sun.jna.platform.win32.WinNT.HRESULT setDifferentFirstPageHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa2a)</p>
     * <p>vtableId(86)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ScaleWithDocHeaderFooter", dispId = 0xa2a)
    com.sun.jna.platform.win32.WinNT.HRESULT getScaleWithDocHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa2a)</p>
     * <p>vtableId(87)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ScaleWithDocHeaderFooter", dispId = 0xa2a)
    com.sun.jna.platform.win32.WinNT.HRESULT setScaleWithDocHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa2b)</p>
     * <p>vtableId(88)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AlignMarginsHeaderFooter", dispId = 0xa2b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlignMarginsHeaderFooter(VARIANT RHS);
            
    /**
     * <p>id(0xa2b)</p>
     * <p>vtableId(89)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AlignMarginsHeaderFooter", dispId = 0xa2b)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlignMarginsHeaderFooter(Boolean RHS);
            
    /**
     * <p>id(0xa2c)</p>
     * <p>vtableId(90)</p>
     * @param RHS [out] {@code Pages}
     */
    @ComProperty(name = "Pages", dispId = 0xa2c)
    com.sun.jna.platform.win32.WinNT.HRESULT getPages(VARIANT RHS);
            
    /**
     * <p>id(0xa2d)</p>
     * <p>vtableId(91)</p>
     * @param RHS [out] {@code Page}
     */
    @ComProperty(name = "EvenPage", dispId = 0xa2d)
    com.sun.jna.platform.win32.WinNT.HRESULT getEvenPage(VARIANT RHS);
            
    /**
     * <p>id(0xa2e)</p>
     * <p>vtableId(92)</p>
     * @param RHS [out] {@code Page}
     */
    @ComProperty(name = "FirstPage", dispId = 0xa2e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstPage(VARIANT RHS);
            
    
}