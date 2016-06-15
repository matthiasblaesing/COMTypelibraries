
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B4-0000-0000-C000-000000000046}")
public interface PageSetup extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComProperty(name = "BlackAndWhite", dispId = 0x3f1)
    Boolean getBlackAndWhite();
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComProperty(name = "BlackAndWhite", dispId = 0x3f1)
    void setBlackAndWhite(Boolean param0);
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "BottomMargin", dispId = 0x3ea)
    Double getBottomMargin();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "BottomMargin", dispId = 0x3ea)
    void setBottomMargin(Double param0);
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    String getCenterFooter();
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    void setCenterFooter(String param0);
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    String getCenterHeader();
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    void setCenterHeader(String param0);
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "CenterHorizontally", dispId = 0x3ed)
    Boolean getCenterHorizontally();
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "CenterHorizontally", dispId = 0x3ed)
    void setCenterHorizontally(Boolean param0);
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "CenterVertically", dispId = 0x3ee)
    Boolean getCenterVertically();
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "CenterVertically", dispId = 0x3ee)
    void setCenterVertically(Boolean param0);
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComProperty(name = "ChartSize", dispId = 0x3f4)
    XlObjectSize getChartSize();
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComProperty(name = "ChartSize", dispId = 0x3f4)
    void setChartSize(XlObjectSize param0);
            
    /**
     * <p>id(0x3fc)</p>
     */
    @ComProperty(name = "Draft", dispId = 0x3fc)
    Boolean getDraft();
            
    /**
     * <p>id(0x3fc)</p>
     */
    @ComProperty(name = "Draft", dispId = 0x3fc)
    void setDraft(Boolean param0);
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "FirstPageNumber", dispId = 0x3f0)
    Integer getFirstPageNumber();
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "FirstPageNumber", dispId = 0x3f0)
    void setFirstPageNumber(Integer param0);
            
    /**
     * <p>id(0x3f5)</p>
     */
    @ComProperty(name = "FitToPagesTall", dispId = 0x3f5)
    Object getFitToPagesTall();
            
    /**
     * <p>id(0x3f5)</p>
     */
    @ComProperty(name = "FitToPagesTall", dispId = 0x3f5)
    void setFitToPagesTall(Object param0);
            
    /**
     * <p>id(0x3f6)</p>
     */
    @ComProperty(name = "FitToPagesWide", dispId = 0x3f6)
    Object getFitToPagesWide();
            
    /**
     * <p>id(0x3f6)</p>
     */
    @ComProperty(name = "FitToPagesWide", dispId = 0x3f6)
    void setFitToPagesWide(Object param0);
            
    /**
     * <p>id(0x3f7)</p>
     */
    @ComProperty(name = "FooterMargin", dispId = 0x3f7)
    Double getFooterMargin();
            
    /**
     * <p>id(0x3f7)</p>
     */
    @ComProperty(name = "FooterMargin", dispId = 0x3f7)
    void setFooterMargin(Double param0);
            
    /**
     * <p>id(0x3f8)</p>
     */
    @ComProperty(name = "HeaderMargin", dispId = 0x3f8)
    Double getHeaderMargin();
            
    /**
     * <p>id(0x3f8)</p>
     */
    @ComProperty(name = "HeaderMargin", dispId = 0x3f8)
    void setHeaderMargin(Double param0);
            
    /**
     * <p>id(0x3f9)</p>
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    String getLeftFooter();
            
    /**
     * <p>id(0x3f9)</p>
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    void setLeftFooter(String param0);
            
    /**
     * <p>id(0x3fa)</p>
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    String getLeftHeader();
            
    /**
     * <p>id(0x3fa)</p>
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    void setLeftHeader(String param0);
            
    /**
     * <p>id(0x3e7)</p>
     */
    @ComProperty(name = "LeftMargin", dispId = 0x3e7)
    Double getLeftMargin();
            
    /**
     * <p>id(0x3e7)</p>
     */
    @ComProperty(name = "LeftMargin", dispId = 0x3e7)
    void setLeftMargin(Double param0);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    XlOrder getOrder();
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    void setOrder(XlOrder param0);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    XlPageOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(XlPageOrientation param0);
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "PaperSize", dispId = 0x3ef)
    XlPaperSize getPaperSize();
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "PaperSize", dispId = 0x3ef)
    void setPaperSize(XlPaperSize param0);
            
    /**
     * <p>id(0x3fb)</p>
     */
    @ComProperty(name = "PrintArea", dispId = 0x3fb)
    String getPrintArea();
            
    /**
     * <p>id(0x3fb)</p>
     */
    @ComProperty(name = "PrintArea", dispId = 0x3fb)
    void setPrintArea(String param0);
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "PrintGridlines", dispId = 0x3ec)
    Boolean getPrintGridlines();
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "PrintGridlines", dispId = 0x3ec)
    void setPrintGridlines(Boolean param0);
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "PrintHeadings", dispId = 0x3eb)
    Boolean getPrintHeadings();
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "PrintHeadings", dispId = 0x3eb)
    void setPrintHeadings(Boolean param0);
            
    /**
     * <p>id(0x3fd)</p>
     */
    @ComProperty(name = "PrintNotes", dispId = 0x3fd)
    Boolean getPrintNotes();
            
    /**
     * <p>id(0x3fd)</p>
     */
    @ComProperty(name = "PrintNotes", dispId = 0x3fd)
    void setPrintNotes(Boolean param0);
            
    /**
     * <p>id(0x3fe)</p>
     */
    @ComProperty(name = "PrintQuality", dispId = 0x3fe)
    Object getPrintQuality(Object Index);
            
    /**
     * <p>id(0x3fe)</p>
     */
    @ComProperty(name = "PrintQuality", dispId = 0x3fe)
    void setPrintQuality(Object Index,
            Object param1);
            
    /**
     * <p>id(0x3ff)</p>
     */
    @ComProperty(name = "PrintTitleColumns", dispId = 0x3ff)
    String getPrintTitleColumns();
            
    /**
     * <p>id(0x3ff)</p>
     */
    @ComProperty(name = "PrintTitleColumns", dispId = 0x3ff)
    void setPrintTitleColumns(String param0);
            
    /**
     * <p>id(0x400)</p>
     */
    @ComProperty(name = "PrintTitleRows", dispId = 0x400)
    String getPrintTitleRows();
            
    /**
     * <p>id(0x400)</p>
     */
    @ComProperty(name = "PrintTitleRows", dispId = 0x400)
    void setPrintTitleRows(String param0);
            
    /**
     * <p>id(0x401)</p>
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    String getRightFooter();
            
    /**
     * <p>id(0x401)</p>
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    void setRightFooter(String param0);
            
    /**
     * <p>id(0x402)</p>
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    String getRightHeader();
            
    /**
     * <p>id(0x402)</p>
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    void setRightHeader(String param0);
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "RightMargin", dispId = 0x3e8)
    Double getRightMargin();
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "RightMargin", dispId = 0x3e8)
    void setRightMargin(Double param0);
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x3e9)
    Double getTopMargin();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x3e9)
    void setTopMargin(Double param0);
            
    /**
     * <p>id(0x297)</p>
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    Object getZoom();
            
    /**
     * <p>id(0x297)</p>
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    void setZoom(Object param0);
            
    /**
     * <p>id(0x5f4)</p>
     */
    @ComProperty(name = "PrintComments", dispId = 0x5f4)
    XlPrintLocation getPrintComments();
            
    /**
     * <p>id(0x5f4)</p>
     */
    @ComProperty(name = "PrintComments", dispId = 0x5f4)
    void setPrintComments(XlPrintLocation param0);
            
    /**
     * <p>id(0x865)</p>
     */
    @ComProperty(name = "PrintErrors", dispId = 0x865)
    XlPrintErrors getPrintErrors();
            
    /**
     * <p>id(0x865)</p>
     */
    @ComProperty(name = "PrintErrors", dispId = 0x865)
    void setPrintErrors(XlPrintErrors param0);
            
    /**
     * <p>id(0x866)</p>
     */
    @ComProperty(name = "CenterHeaderPicture", dispId = 0x866)
    Graphic getCenterHeaderPicture();
            
    /**
     * <p>id(0x867)</p>
     */
    @ComProperty(name = "CenterFooterPicture", dispId = 0x867)
    Graphic getCenterFooterPicture();
            
    /**
     * <p>id(0x868)</p>
     */
    @ComProperty(name = "LeftHeaderPicture", dispId = 0x868)
    Graphic getLeftHeaderPicture();
            
    /**
     * <p>id(0x869)</p>
     */
    @ComProperty(name = "LeftFooterPicture", dispId = 0x869)
    Graphic getLeftFooterPicture();
            
    /**
     * <p>id(0x86a)</p>
     */
    @ComProperty(name = "RightHeaderPicture", dispId = 0x86a)
    Graphic getRightHeaderPicture();
            
    /**
     * <p>id(0x86b)</p>
     */
    @ComProperty(name = "RightFooterPicture", dispId = 0x86b)
    Graphic getRightFooterPicture();
            
    /**
     * <p>id(0xa28)</p>
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0xa28)
    Boolean getOddAndEvenPagesHeaderFooter();
            
    /**
     * <p>id(0xa28)</p>
     */
    @ComProperty(name = "OddAndEvenPagesHeaderFooter", dispId = 0xa28)
    void setOddAndEvenPagesHeaderFooter(Boolean param0);
            
    /**
     * <p>id(0xa29)</p>
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0xa29)
    Boolean getDifferentFirstPageHeaderFooter();
            
    /**
     * <p>id(0xa29)</p>
     */
    @ComProperty(name = "DifferentFirstPageHeaderFooter", dispId = 0xa29)
    void setDifferentFirstPageHeaderFooter(Boolean param0);
            
    /**
     * <p>id(0xa2a)</p>
     */
    @ComProperty(name = "ScaleWithDocHeaderFooter", dispId = 0xa2a)
    Boolean getScaleWithDocHeaderFooter();
            
    /**
     * <p>id(0xa2a)</p>
     */
    @ComProperty(name = "ScaleWithDocHeaderFooter", dispId = 0xa2a)
    void setScaleWithDocHeaderFooter(Boolean param0);
            
    /**
     * <p>id(0xa2b)</p>
     */
    @ComProperty(name = "AlignMarginsHeaderFooter", dispId = 0xa2b)
    Boolean getAlignMarginsHeaderFooter();
            
    /**
     * <p>id(0xa2b)</p>
     */
    @ComProperty(name = "AlignMarginsHeaderFooter", dispId = 0xa2b)
    void setAlignMarginsHeaderFooter(Boolean param0);
            
    /**
     * <p>id(0xa2c)</p>
     */
    @ComProperty(name = "Pages", dispId = 0xa2c)
    Pages getPages();
            
    /**
     * <p>id(0xa2d)</p>
     */
    @ComProperty(name = "EvenPage", dispId = 0xa2d)
    Page getEvenPage();
            
    /**
     * <p>id(0xa2e)</p>
     */
    @ComProperty(name = "FirstPage", dispId = 0xa2e)
    Page getFirstPage();
            
    
}