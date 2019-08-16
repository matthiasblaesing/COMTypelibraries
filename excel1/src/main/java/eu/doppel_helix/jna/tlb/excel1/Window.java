
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    Object Activate();
            
    /**
     * <p>id(0x45b)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "ActivateNext", dispId = 0x45b)
    Object ActivateNext();
            
    /**
     * <p>id(0x45c)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "ActivatePrevious", dispId = 0x45c)
    Object ActivatePrevious();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActiveCell", dispId = 0x131)
    Range getActiveCell();
            
    /**
     * <p>id(0xb7)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ActiveChart", dispId = 0xb7)
    Chart getActiveChart();
            
    /**
     * <p>id(0x282)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ActivePane", dispId = 0x282)
    Pane getActivePane();
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ActiveSheet", dispId = 0x133)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheet();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    Object getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(Object param0);
            
    /**
     * <p>id(0x115)</p>
     * <p>vtableId(19)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param Filename [in, optional] {@code Object}
     * @param RouteWorkbook [in, optional] {@code Object}
     */
    @ComMethod(name = "Close", dispId = 0x115)
    Boolean Close(Object SaveChanges,
            Object Filename,
            Object RouteWorkbook);
            
    /**
     * <p>id(0x284)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    Boolean getDisplayFormulas();
            
    /**
     * <p>id(0x284)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    void setDisplayFormulas(Boolean param0);
            
    /**
     * <p>id(0x285)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    Boolean getDisplayGridlines();
            
    /**
     * <p>id(0x285)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    void setDisplayGridlines(Boolean param0);
            
    /**
     * <p>id(0x286)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    Boolean getDisplayHeadings();
            
    /**
     * <p>id(0x286)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    void setDisplayHeadings(Boolean param0);
            
    /**
     * <p>id(0x399)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x399)
    Boolean getDisplayHorizontalScrollBar();
            
    /**
     * <p>id(0x399)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x399)
    void setDisplayHorizontalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x287)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    Boolean getDisplayOutline();
            
    /**
     * <p>id(0x287)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    void setDisplayOutline(Boolean param0);
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    Boolean get_DisplayRightToLeft();
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    void set_DisplayRightToLeft(Boolean param0);
            
    /**
     * <p>id(0x39a)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    Boolean getDisplayVerticalScrollBar();
            
    /**
     * <p>id(0x39a)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    void setDisplayVerticalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x39b)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "DisplayWorkbookTabs", dispId = 0x39b)
    Boolean getDisplayWorkbookTabs();
            
    /**
     * <p>id(0x39b)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayWorkbookTabs", dispId = 0x39b)
    void setDisplayWorkbookTabs(Boolean param0);
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    Boolean getDisplayZeros();
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    void setDisplayZeros(Boolean param0);
            
    /**
     * <p>id(0x4a8)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    Boolean getEnableResize();
            
    /**
     * <p>id(0x4a8)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    void setEnableResize(Boolean param0);
            
    /**
     * <p>id(0x28a)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "FreezePanes", dispId = 0x28a)
    Boolean getFreezePanes();
            
    /**
     * <p>id(0x28a)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FreezePanes", dispId = 0x28a)
    void setFreezePanes(Boolean param0);
            
    /**
     * <p>id(0x28b)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "GridlineColor", dispId = 0x28b)
    Integer getGridlineColor();
            
    /**
     * <p>id(0x28b)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridlineColor", dispId = 0x28b)
    void setGridlineColor(Integer param0);
            
    /**
     * <p>id(0x28c)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "GridlineColorIndex", dispId = 0x28c)
    XlColorIndex getGridlineColorIndex();
            
    /**
     * <p>id(0x28c)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "GridlineColorIndex", dispId = 0x28c)
    void setGridlineColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x223)</p>
     * <p>vtableId(49)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     */
    @ComMethod(name = "LargeScroll", dispId = 0x223)
    Object LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(52)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x118)
    Window NewWindow();
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    String getOnWindow();
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    void setOnWindow(String param0);
            
    /**
     * <p>id(0x28d)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Panes", dispId = 0x28d)
    Panes getPanes();
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(56)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(57)</p>
     * @param EnableChanges [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    Object PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x4a5)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "RangeSelection", dispId = 0x4a5)
    Range getRangeSelection();
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    Integer getScrollColumn();
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    void setScrollColumn(Integer param0);
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    Integer getScrollRow();
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    void setScrollRow(Integer param0);
            
    /**
     * <p>id(0x296)</p>
     * <p>vtableId(63)</p>
     * @param Sheets [in, optional] {@code Object}
     * @param Position [in, optional] {@code Object}
     */
    @ComMethod(name = "ScrollWorkbookTabs", dispId = 0x296)
    Object ScrollWorkbookTabs(Object Sheets,
            Object Position);
            
    /**
     * <p>id(0x290)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "SelectedSheets", dispId = 0x290)
    Sheets getSelectedSheets();
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x93)
    com.sun.jna.platform.win32.COM.util.IDispatch getSelection();
            
    /**
     * <p>id(0x224)</p>
     * <p>vtableId(66)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     */
    @ComMethod(name = "SmallScroll", dispId = 0x224)
    Object SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x291)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "Split", dispId = 0x291)
    Boolean getSplit();
            
    /**
     * <p>id(0x291)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Split", dispId = 0x291)
    void setSplit(Boolean param0);
            
    /**
     * <p>id(0x292)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "SplitColumn", dispId = 0x292)
    Integer getSplitColumn();
            
    /**
     * <p>id(0x292)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SplitColumn", dispId = 0x292)
    void setSplitColumn(Integer param0);
            
    /**
     * <p>id(0x293)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "SplitHorizontal", dispId = 0x293)
    Double getSplitHorizontal();
            
    /**
     * <p>id(0x293)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "SplitHorizontal", dispId = 0x293)
    void setSplitHorizontal(Double param0);
            
    /**
     * <p>id(0x294)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "SplitRow", dispId = 0x294)
    Integer getSplitRow();
            
    /**
     * <p>id(0x294)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SplitRow", dispId = 0x294)
    void setSplitRow(Integer param0);
            
    /**
     * <p>id(0x295)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "SplitVertical", dispId = 0x295)
    Double getSplitVertical();
            
    /**
     * <p>id(0x295)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "SplitVertical", dispId = 0x295)
    void setSplitVertical(Double param0);
            
    /**
     * <p>id(0x2a1)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "TabRatio", dispId = 0x2a1)
    Double getTabRatio();
            
    /**
     * <p>id(0x2a1)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "TabRatio", dispId = 0x2a1)
    void setTabRatio(Double param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlWindowType getType();
            
    /**
     * <p>id(0x185)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "UsableHeight", dispId = 0x185)
    Double getUsableHeight();
            
    /**
     * <p>id(0x186)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "UsableWidth", dispId = 0x186)
    Double getUsableWidth();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x45e)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "VisibleRange", dispId = 0x45e)
    Range getVisibleRange();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x45f)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "WindowNumber", dispId = 0x45f)
    Integer getWindowNumber();
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    XlWindowState getWindowState();
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code XlWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    void setWindowState(XlWindowState param0);
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    Object getZoom();
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    void setZoom(Object param0);
            
    /**
     * <p>id(0x4aa)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "View", dispId = 0x4aa)
    XlWindowView getView();
            
    /**
     * <p>id(0x4aa)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code XlWindowView}
     */
    @ComProperty(name = "View", dispId = 0x4aa)
    void setView(XlWindowView param0);
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    Boolean getDisplayRightToLeft();
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    void setDisplayRightToLeft(Boolean param0);
            
    /**
     * <p>id(0x6f0)</p>
     * <p>vtableId(98)</p>
     * @param Points [in] {@code Integer}
     */
    @ComMethod(name = "PointsToScreenPixelsX", dispId = 0x6f0)
    Integer PointsToScreenPixelsX(Integer Points);
            
    /**
     * <p>id(0x6f1)</p>
     * <p>vtableId(99)</p>
     * @param Points [in] {@code Integer}
     */
    @ComMethod(name = "PointsToScreenPixelsY", dispId = 0x6f1)
    Integer PointsToScreenPixelsY(Integer Points);
            
    /**
     * <p>id(0x6f2)</p>
     * <p>vtableId(100)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "RangeFromPoint", dispId = 0x6f2)
    com.sun.jna.platform.win32.COM.util.IDispatch RangeFromPoint(Integer x,
            Integer y);
            
    /**
     * <p>id(0x6f5)</p>
     * <p>vtableId(101)</p>
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     * @param Start [in, optional] {@code Object}
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x6f5)
    void ScrollIntoView(Integer Left,
            Integer Top,
            Integer Width,
            Integer Height,
            Object Start);
            
    /**
     * <p>id(0x940)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "SheetViews", dispId = 0x940)
    SheetViews getSheetViews();
            
    /**
     * <p>id(0x941)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "ActiveSheetView", dispId = 0x941)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheetView();
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(104)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "DisplayRuler", dispId = 0x942)
    Boolean getDisplayRuler();
            
    /**
     * <p>id(0x942)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRuler", dispId = 0x942)
    void setDisplayRuler(Boolean param0);
            
    /**
     * <p>id(0x943)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "AutoFilterDateGrouping", dispId = 0x943)
    Boolean getAutoFilterDateGrouping();
            
    /**
     * <p>id(0x943)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFilterDateGrouping", dispId = 0x943)
    void setAutoFilterDateGrouping(Boolean param0);
            
    /**
     * <p>id(0x944)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "DisplayWhitespace", dispId = 0x944)
    Boolean getDisplayWhitespace();
            
    /**
     * <p>id(0x944)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayWhitespace", dispId = 0x944)
    void setDisplayWhitespace(Boolean param0);
            
    /**
     * <p>id(0x79e)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "Hwnd", dispId = 0x79e)
    Integer getHwnd();
            
    
}