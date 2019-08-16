
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020962-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020962-0000-0000-C000-000000000046}")
public interface Window extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ActivePane", dispId = 0x1)
    Pane getActivePane();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Document", dispId = 0x2)
    Document getDocument();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Panes", dispId = 0x3)
    Panes getPanes();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x4)
    Selection getSelection();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Left", dispId = 0x5)
    Integer getLeft();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x5)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6)
    Integer getTop();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x6)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7)
    Integer getWidth();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x7)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8)
    Integer getHeight();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x8)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Split", dispId = 0x9)
    Boolean getSplit();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Split", dispId = 0x9)
    void setSplit(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "SplitVertical", dispId = 0xa)
    Integer getSplitVertical();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SplitVertical", dispId = 0xa)
    void setSplitVertical(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    String getCaption();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    void setCaption(String param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0xb)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code WdWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0xb)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "DisplayRulers", dispId = 0xc)
    Boolean getDisplayRulers();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRulers", dispId = 0xc)
    void setDisplayRulers(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0xd)
    Boolean getDisplayVerticalRuler();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0xd)
    void setDisplayVerticalRuler(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "View", dispId = 0xe)
    View getView();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Type", dispId = 0xf)
    WdWindowType getType();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Next", dispId = 0x10)
    Window getNext();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x11)
    Window getPrevious();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "WindowNumber", dispId = 0x12)
    Integer getWindowNumber();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x13)
    Boolean getDisplayVerticalScrollBar();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x13)
    void setDisplayVerticalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x14)
    Boolean getDisplayHorizontalScrollBar();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x14)
    void setDisplayHorizontalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "StyleAreaWidth", dispId = 0x15)
    Float getStyleAreaWidth();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "StyleAreaWidth", dispId = 0x15)
    void setStyleAreaWidth(Float param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x16)
    Boolean getDisplayScreenTips();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x16)
    void setDisplayScreenTips(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0x17)
    Integer getHorizontalPercentScrolled();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0x17)
    void setHorizontalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0x18)
    Integer getVerticalPercentScrolled();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0x18)
    void setVerticalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "DocumentMap", dispId = 0x19)
    Boolean getDocumentMap();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DocumentMap", dispId = 0x19)
    void setDocumentMap(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Active", dispId = 0x1a)
    Boolean getActive();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "DocumentMapPercentWidth", dispId = 0x1b)
    Integer getDocumentMapPercentWidth();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DocumentMapPercentWidth", dispId = 0x1b)
    void setDocumentMapPercentWidth(Integer param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1c)
    Integer getIndex();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "IMEMode", dispId = 0x1e)
    WdIMEMode getIMEMode();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code WdIMEMode}
     */
    @ComProperty(name = "IMEMode", dispId = 0x1e)
    void setIMEMode(WdIMEMode param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(59)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(60)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param RouteDocument [in, optional] {@code Object}
     */
    @ComMethod(name = "Close", dispId = 0x66)
    void Close(Object SaveChanges,
            Object RouteDocument);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(61)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     */
    @ComMethod(name = "LargeScroll", dispId = 0x67)
    void LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(62)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     */
    @ComMethod(name = "SmallScroll", dispId = 0x68)
    void SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x69)
    Window NewWindow();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(64)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
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
     * <p>vtableId(65)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     */
    @ComMethod(name = "PageScroll", dispId = 0x6c)
    void PageScroll(Object Down,
            Object Up);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x6d)
    void SetFocus();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(67)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     */
    @ComMethod(name = "RangeFromPoint", dispId = 0x6e)
    com.sun.jna.platform.win32.COM.util.IDispatch RangeFromPoint(Integer x,
            Integer y);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(68)</p>
     * @param obj [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Start [in, optional] {@code Object}
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x6f)
    void ScrollIntoView(com.sun.jna.platform.win32.COM.util.IDispatch obj,
            Object Start);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(69)</p>
     * @param ScreenPixelsLeft [out] {@code Integer}
     * @param ScreenPixelsTop [out] {@code Integer}
     * @param ScreenPixelsWidth [out] {@code Integer}
     * @param ScreenPixelsHeight [out] {@code Integer}
     * @param obj [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "GetPoint", dispId = 0x70)
    void GetPoint(VARIANT ScreenPixelsLeft,
            VARIANT ScreenPixelsTop,
            VARIANT ScreenPixelsWidth,
            VARIANT ScreenPixelsHeight,
            com.sun.jna.platform.win32.COM.util.IDispatch obj);
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(70)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     * @param PrintZoomColumn [in, optional] {@code Object}
     * @param PrintZoomRow [in, optional] {@code Object}
     * @param PrintZoomPaperWidth [in, optional] {@code Object}
     * @param PrintZoomPaperHeight [in, optional] {@code Object}
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
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "UsableWidth", dispId = 0x1f)
    Integer getUsableWidth();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "UsableHeight", dispId = 0x20)
    Integer getUsableHeight();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x21)
    Boolean getEnvelopeVisible();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x21)
    void setEnvelopeVisible(Boolean param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "DisplayRightRuler", dispId = 0x23)
    Boolean getDisplayRightRuler();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRightRuler", dispId = 0x23)
    void setDisplayRightRuler(Boolean param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "DisplayLeftScrollBar", dispId = 0x22)
    Boolean getDisplayLeftScrollBar();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayLeftScrollBar", dispId = 0x22)
    void setDisplayLeftScrollBar(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x24)
    Boolean getVisible();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x24)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(81)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     * @param PrintZoomColumn [in, optional] {@code Object}
     * @param PrintZoomRow [in, optional] {@code Object}
     * @param PrintZoomPaperWidth [in, optional] {@code Object}
     * @param PrintZoomPaperHeight [in, optional] {@code Object}
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
     * <p>vtableId(82)</p>
     */
    @ComMethod(name = "ToggleShowAllReviewers", dispId = 0x1be)
    void ToggleShowAllReviewers();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "Thumbnails", dispId = 0x25)
    Boolean getThumbnails();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Thumbnails", dispId = 0x25)
    void setThumbnails(Boolean param0);
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "ShowSourceDocuments", dispId = 0x26)
    WdShowSourceDocuments getShowSourceDocuments();
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code WdShowSourceDocuments}
     */
    @ComProperty(name = "ShowSourceDocuments", dispId = 0x26)
    void setShowSourceDocuments(WdShowSourceDocuments param0);
            
    /**
     * <p>id(0x1bf)</p>
     * <p>vtableId(87)</p>
     */
    @ComMethod(name = "ToggleRibbon", dispId = 0x1bf)
    void ToggleRibbon();
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "Hwnd", dispId = 0x27)
    Integer getHwnd();
            
    
}