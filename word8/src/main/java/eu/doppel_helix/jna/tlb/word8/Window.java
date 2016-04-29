
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020962-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020962-0000-0000-C000-000000000046}")
public interface Window {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ActivePane", dispId = 0x1)
    Pane getActivePane();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Document", dispId = 0x2)
    Document getDocument();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Panes", dispId = 0x3)
    Panes getPanes();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x4)
    Selection getSelection();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Left", dispId = 0x5)
    Integer getLeft();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Left", dispId = 0x5)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6)
    Integer getTop();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7)
    Integer getWidth();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8)
    Integer getHeight();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Split", dispId = 0x9)
    Boolean getSplit();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Split", dispId = 0x9)
    void setSplit(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "SplitVertical", dispId = 0xa)
    Integer getSplitVertical();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "SplitVertical", dispId = 0xa)
    void setSplitVertical(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    String getCaption();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    void setCaption(String param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0xb)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0xb)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "DisplayRulers", dispId = 0xc)
    Boolean getDisplayRulers();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "DisplayRulers", dispId = 0xc)
    void setDisplayRulers(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0xd)
    Boolean getDisplayVerticalRuler();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0xd)
    void setDisplayVerticalRuler(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "View", dispId = 0xe)
    View getView();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Type", dispId = 0xf)
    WdWindowType getType();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Next", dispId = 0x10)
    Window getNext();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x11)
    Window getPrevious();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "WindowNumber", dispId = 0x12)
    Integer getWindowNumber();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x13)
    Boolean getDisplayVerticalScrollBar();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x13)
    void setDisplayVerticalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x14)
    Boolean getDisplayHorizontalScrollBar();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x14)
    void setDisplayHorizontalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "StyleAreaWidth", dispId = 0x15)
    Float getStyleAreaWidth();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "StyleAreaWidth", dispId = 0x15)
    void setStyleAreaWidth(Float param0);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x16)
    Boolean getDisplayScreenTips();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x16)
    void setDisplayScreenTips(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0x17)
    Integer getHorizontalPercentScrolled();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0x17)
    void setHorizontalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0x18)
    Integer getVerticalPercentScrolled();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0x18)
    void setVerticalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "DocumentMap", dispId = 0x19)
    Boolean getDocumentMap();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "DocumentMap", dispId = 0x19)
    void setDocumentMap(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "Active", dispId = 0x1a)
    Boolean getActive();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "DocumentMapPercentWidth", dispId = 0x1b)
    Integer getDocumentMapPercentWidth();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "DocumentMapPercentWidth", dispId = 0x1b)
    void setDocumentMapPercentWidth(Integer param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1c)
    Integer getIndex();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "IMEMode", dispId = 0x1e)
    WdIMEMode getIMEMode();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "IMEMode", dispId = 0x1e)
    void setIMEMode(WdIMEMode param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Close", dispId = 0x66)
    void Close(Object SaveChanges,
            Object RouteDocument);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "LargeScroll", dispId = 0x67)
    void LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "SmallScroll", dispId = 0x68)
    void SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x69)
    Window NewWindow();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "PrintOutOld", dispId = 0x6b)
    void PrintOutOld(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "PageScroll", dispId = 0x6c)
    void PageScroll(Object Down,
            Object Up);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x6d)
    void SetFocus();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComMethod(name = "RangeFromPoint", dispId = 0x6e)
    com.sun.jna.platform.win32.COM.util.IDispatch RangeFromPoint(Integer x,
            Integer y);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x6f)
    void ScrollIntoView(com.sun.jna.platform.win32.COM.util.IDispatch obj,
            Object Start);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "GetPoint", dispId = 0x70)
    void GetPoint(VARIANT ScreenPixelsLeft,
            VARIANT ScreenPixelsTop,
            VARIANT ScreenPixelsWidth,
            VARIANT ScreenPixelsHeight,
            com.sun.jna.platform.win32.COM.util.IDispatch obj);
            
    /**
     * <p>id(0x1bc)</p>
     */
    @ComMethod(name = "PrintOut2000", dispId = 0x1bc)
    void PrintOut2000(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint,
            Object PrintZoomColumn,
            Object PrintZoomRow,
            Object PrintZoomPaperWidth,
            Object PrintZoomPaperHeight);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "UsableWidth", dispId = 0x1f)
    Integer getUsableWidth();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "UsableHeight", dispId = 0x20)
    Integer getUsableHeight();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x21)
    Boolean getEnvelopeVisible();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x21)
    void setEnvelopeVisible(Boolean param0);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "DisplayRightRuler", dispId = 0x23)
    Boolean getDisplayRightRuler();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "DisplayRightRuler", dispId = 0x23)
    void setDisplayRightRuler(Boolean param0);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "DisplayLeftScrollBar", dispId = 0x22)
    Boolean getDisplayLeftScrollBar();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "DisplayLeftScrollBar", dispId = 0x22)
    void setDisplayLeftScrollBar(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x24)
    Boolean getVisible();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x24)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x1bd)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0x1bd)
    void PrintOut(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint,
            Object PrintZoomColumn,
            Object PrintZoomRow,
            Object PrintZoomPaperWidth,
            Object PrintZoomPaperHeight);
            
    /**
     * <p>id(0x1be)</p>
     */
    @ComMethod(name = "ToggleShowAllReviewers", dispId = 0x1be)
    void ToggleShowAllReviewers();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "Thumbnails", dispId = 0x25)
    Boolean getThumbnails();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "Thumbnails", dispId = 0x25)
    void setThumbnails(Boolean param0);
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "ShowSourceDocuments", dispId = 0x26)
    WdShowSourceDocuments getShowSourceDocuments();
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "ShowSourceDocuments", dispId = 0x26)
    void setShowSourceDocuments(WdShowSourceDocuments param0);
            
    /**
     * <p>id(0x1bf)</p>
     */
    @ComMethod(name = "ToggleRibbon", dispId = 0x1bf)
    void ToggleRibbon();
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "Hwnd", dispId = 0x27)
    Integer getHwnd();
            
    
}