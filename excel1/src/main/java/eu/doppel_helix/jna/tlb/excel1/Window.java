
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020893-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020893-0000-0000-C000-000000000046}")
public interface Window extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    Object Activate();
            
    /**
     * <p>id(0x45b)</p>
     */
    @ComMethod(name = "ActivateNext", dispId = 0x45b)
    Object ActivateNext();
            
    /**
     * <p>id(0x45c)</p>
     */
    @ComMethod(name = "ActivatePrevious", dispId = 0x45c)
    Object ActivatePrevious();
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "ActiveCell", dispId = 0x131)
    Range getActiveCell();
            
    /**
     * <p>id(0xb7)</p>
     */
    @ComProperty(name = "ActiveChart", dispId = 0xb7)
    Chart getActiveChart();
            
    /**
     * <p>id(0x282)</p>
     */
    @ComProperty(name = "ActivePane", dispId = 0x282)
    Pane getActivePane();
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "ActiveSheet", dispId = 0x133)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheet();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    Object getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(Object param0);
            
    /**
     * <p>id(0x115)</p>
     */
    @ComMethod(name = "Close", dispId = 0x115)
    Boolean Close(Object SaveChanges,
            Object Filename,
            Object RouteWorkbook);
            
    /**
     * <p>id(0x284)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    Boolean getDisplayFormulas();
            
    /**
     * <p>id(0x284)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    void setDisplayFormulas(Boolean param0);
            
    /**
     * <p>id(0x285)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    Boolean getDisplayGridlines();
            
    /**
     * <p>id(0x285)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    void setDisplayGridlines(Boolean param0);
            
    /**
     * <p>id(0x286)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    Boolean getDisplayHeadings();
            
    /**
     * <p>id(0x286)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    void setDisplayHeadings(Boolean param0);
            
    /**
     * <p>id(0x399)</p>
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x399)
    Boolean getDisplayHorizontalScrollBar();
            
    /**
     * <p>id(0x399)</p>
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x399)
    void setDisplayHorizontalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x287)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    Boolean getDisplayOutline();
            
    /**
     * <p>id(0x287)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    void setDisplayOutline(Boolean param0);
            
    /**
     * <p>id(0x288)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    Boolean get_DisplayRightToLeft();
            
    /**
     * <p>id(0x288)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    void set_DisplayRightToLeft(Boolean param0);
            
    /**
     * <p>id(0x39a)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    Boolean getDisplayVerticalScrollBar();
            
    /**
     * <p>id(0x39a)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    void setDisplayVerticalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x39b)</p>
     */
    @ComProperty(name = "DisplayWorkbookTabs", dispId = 0x39b)
    Boolean getDisplayWorkbookTabs();
            
    /**
     * <p>id(0x39b)</p>
     */
    @ComProperty(name = "DisplayWorkbookTabs", dispId = 0x39b)
    void setDisplayWorkbookTabs(Boolean param0);
            
    /**
     * <p>id(0x289)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    Boolean getDisplayZeros();
            
    /**
     * <p>id(0x289)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    void setDisplayZeros(Boolean param0);
            
    /**
     * <p>id(0x4a8)</p>
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    Boolean getEnableResize();
            
    /**
     * <p>id(0x4a8)</p>
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    void setEnableResize(Boolean param0);
            
    /**
     * <p>id(0x28a)</p>
     */
    @ComProperty(name = "FreezePanes", dispId = 0x28a)
    Boolean getFreezePanes();
            
    /**
     * <p>id(0x28a)</p>
     */
    @ComProperty(name = "FreezePanes", dispId = 0x28a)
    void setFreezePanes(Boolean param0);
            
    /**
     * <p>id(0x28b)</p>
     */
    @ComProperty(name = "GridlineColor", dispId = 0x28b)
    Integer getGridlineColor();
            
    /**
     * <p>id(0x28b)</p>
     */
    @ComProperty(name = "GridlineColor", dispId = 0x28b)
    void setGridlineColor(Integer param0);
            
    /**
     * <p>id(0x28c)</p>
     */
    @ComProperty(name = "GridlineColorIndex", dispId = 0x28c)
    XlColorIndex getGridlineColorIndex();
            
    /**
     * <p>id(0x28c)</p>
     */
    @ComProperty(name = "GridlineColorIndex", dispId = 0x28c)
    void setGridlineColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x223)</p>
     */
    @ComMethod(name = "LargeScroll", dispId = 0x223)
    Object LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x118)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x118)
    Window NewWindow();
            
    /**
     * <p>id(0x26f)</p>
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    String getOnWindow();
            
    /**
     * <p>id(0x26f)</p>
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    void setOnWindow(String param0);
            
    /**
     * <p>id(0x28d)</p>
     */
    @ComProperty(name = "Panes", dispId = 0x28d)
    Panes getPanes();
            
    /**
     * <p>id(0x6ec)</p>
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    Object _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x119)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    Object PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x4a5)</p>
     */
    @ComProperty(name = "RangeSelection", dispId = 0x4a5)
    Range getRangeSelection();
            
    /**
     * <p>id(0x28e)</p>
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    Integer getScrollColumn();
            
    /**
     * <p>id(0x28e)</p>
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    void setScrollColumn(Integer param0);
            
    /**
     * <p>id(0x28f)</p>
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    Integer getScrollRow();
            
    /**
     * <p>id(0x28f)</p>
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    void setScrollRow(Integer param0);
            
    /**
     * <p>id(0x296)</p>
     */
    @ComMethod(name = "ScrollWorkbookTabs", dispId = 0x296)
    Object ScrollWorkbookTabs(Object Sheets,
            Object Position);
            
    /**
     * <p>id(0x290)</p>
     */
    @ComProperty(name = "SelectedSheets", dispId = 0x290)
    Sheets getSelectedSheets();
            
    /**
     * <p>id(0x93)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x93)
    com.sun.jna.platform.win32.COM.util.IDispatch getSelection();
            
    /**
     * <p>id(0x224)</p>
     */
    @ComMethod(name = "SmallScroll", dispId = 0x224)
    Object SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x291)</p>
     */
    @ComProperty(name = "Split", dispId = 0x291)
    Boolean getSplit();
            
    /**
     * <p>id(0x291)</p>
     */
    @ComProperty(name = "Split", dispId = 0x291)
    void setSplit(Boolean param0);
            
    /**
     * <p>id(0x292)</p>
     */
    @ComProperty(name = "SplitColumn", dispId = 0x292)
    Integer getSplitColumn();
            
    /**
     * <p>id(0x292)</p>
     */
    @ComProperty(name = "SplitColumn", dispId = 0x292)
    void setSplitColumn(Integer param0);
            
    /**
     * <p>id(0x293)</p>
     */
    @ComProperty(name = "SplitHorizontal", dispId = 0x293)
    Double getSplitHorizontal();
            
    /**
     * <p>id(0x293)</p>
     */
    @ComProperty(name = "SplitHorizontal", dispId = 0x293)
    void setSplitHorizontal(Double param0);
            
    /**
     * <p>id(0x294)</p>
     */
    @ComProperty(name = "SplitRow", dispId = 0x294)
    Integer getSplitRow();
            
    /**
     * <p>id(0x294)</p>
     */
    @ComProperty(name = "SplitRow", dispId = 0x294)
    void setSplitRow(Integer param0);
            
    /**
     * <p>id(0x295)</p>
     */
    @ComProperty(name = "SplitVertical", dispId = 0x295)
    Double getSplitVertical();
            
    /**
     * <p>id(0x295)</p>
     */
    @ComProperty(name = "SplitVertical", dispId = 0x295)
    void setSplitVertical(Double param0);
            
    /**
     * <p>id(0x2a1)</p>
     */
    @ComProperty(name = "TabRatio", dispId = 0x2a1)
    Double getTabRatio();
            
    /**
     * <p>id(0x2a1)</p>
     */
    @ComProperty(name = "TabRatio", dispId = 0x2a1)
    void setTabRatio(Double param0);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlWindowType getType();
            
    /**
     * <p>id(0x185)</p>
     */
    @ComProperty(name = "UsableHeight", dispId = 0x185)
    Double getUsableHeight();
            
    /**
     * <p>id(0x186)</p>
     */
    @ComProperty(name = "UsableWidth", dispId = 0x186)
    Double getUsableWidth();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x45e)</p>
     */
    @ComProperty(name = "VisibleRange", dispId = 0x45e)
    Range getVisibleRange();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x45f)</p>
     */
    @ComProperty(name = "WindowNumber", dispId = 0x45f)
    Integer getWindowNumber();
            
    /**
     * <p>id(0x18c)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    XlWindowState getWindowState();
            
    /**
     * <p>id(0x18c)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    void setWindowState(XlWindowState param0);
            
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
     * <p>id(0x4aa)</p>
     */
    @ComProperty(name = "View", dispId = 0x4aa)
    XlWindowView getView();
            
    /**
     * <p>id(0x4aa)</p>
     */
    @ComProperty(name = "View", dispId = 0x4aa)
    void setView(XlWindowView param0);
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    Boolean getDisplayRightToLeft();
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    void setDisplayRightToLeft(Boolean param0);
            
    /**
     * <p>id(0x6f0)</p>
     */
    @ComMethod(name = "PointsToScreenPixelsX", dispId = 0x6f0)
    Integer PointsToScreenPixelsX(Integer Points);
            
    /**
     * <p>id(0x6f1)</p>
     */
    @ComMethod(name = "PointsToScreenPixelsY", dispId = 0x6f1)
    Integer PointsToScreenPixelsY(Integer Points);
            
    /**
     * <p>id(0x6f2)</p>
     */
    @ComMethod(name = "RangeFromPoint", dispId = 0x6f2)
    com.sun.jna.platform.win32.COM.util.IDispatch RangeFromPoint(Integer x,
            Integer y);
            
    /**
     * <p>id(0x6f5)</p>
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x6f5)
    void ScrollIntoView(Integer Left,
            Integer Top,
            Integer Width,
            Integer Height,
            Object Start);
            
    /**
     * <p>id(0x940)</p>
     */
    @ComProperty(name = "SheetViews", dispId = 0x940)
    SheetViews getSheetViews();
            
    /**
     * <p>id(0x941)</p>
     */
    @ComProperty(name = "ActiveSheetView", dispId = 0x941)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheetView();
            
    /**
     * <p>id(0x939)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    Object PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x942)</p>
     */
    @ComProperty(name = "DisplayRuler", dispId = 0x942)
    Boolean getDisplayRuler();
            
    /**
     * <p>id(0x942)</p>
     */
    @ComProperty(name = "DisplayRuler", dispId = 0x942)
    void setDisplayRuler(Boolean param0);
            
    /**
     * <p>id(0x943)</p>
     */
    @ComProperty(name = "AutoFilterDateGrouping", dispId = 0x943)
    Boolean getAutoFilterDateGrouping();
            
    /**
     * <p>id(0x943)</p>
     */
    @ComProperty(name = "AutoFilterDateGrouping", dispId = 0x943)
    void setAutoFilterDateGrouping(Boolean param0);
            
    /**
     * <p>id(0x944)</p>
     */
    @ComProperty(name = "DisplayWhitespace", dispId = 0x944)
    Boolean getDisplayWhitespace();
            
    /**
     * <p>id(0x944)</p>
     */
    @ComProperty(name = "DisplayWhitespace", dispId = 0x944)
    void setDisplayWhitespace(Boolean param0);
            
    /**
     * <p>id(0x79e)</p>
     */
    @ComProperty(name = "Hwnd", dispId = 0x79e)
    Integer getHwnd();
            
    
}