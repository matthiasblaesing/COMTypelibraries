
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020893-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020893-0001-0000-C000-000000000046}")
public interface IWindow extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(VARIANT RHS);
            
    /**
     * <p>id(0x45b)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ActivateNext", dispId = 0x45b)
    com.sun.jna.platform.win32.WinNT.HRESULT ActivateNext(VARIANT RHS);
            
    /**
     * <p>id(0x45c)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ActivatePrevious", dispId = 0x45c)
    com.sun.jna.platform.win32.WinNT.HRESULT ActivatePrevious(VARIANT RHS);
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "ActiveCell", dispId = 0x131)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveCell(VARIANT RHS);
            
    /**
     * <p>id(0xb7)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Chart}
     */
    @ComProperty(name = "ActiveChart", dispId = 0xb7)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveChart(VARIANT RHS);
            
    /**
     * <p>id(0x282)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Pane}
     */
    @ComProperty(name = "ActivePane", dispId = 0x282)
    com.sun.jna.platform.win32.WinNT.HRESULT getActivePane(VARIANT RHS);
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "ActiveSheet", dispId = 0x133)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveSheet(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(Object RHS);
            
    /**
     * <p>id(0x115)</p>
     * <p>vtableId(19)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param Filename [in, optional] {@code Object}
     * @param RouteWorkbook [in, optional] {@code Object}
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "Close", dispId = 0x115)
    com.sun.jna.platform.win32.WinNT.HRESULT Close(Object SaveChanges,
            Object Filename,
            Object RouteWorkbook,
            VARIANT RHS);
            
    /**
     * <p>id(0x284)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayFormulas(VARIANT RHS);
            
    /**
     * <p>id(0x284)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayFormulas(Boolean RHS);
            
    /**
     * <p>id(0x285)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x285)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayGridlines(Boolean RHS);
            
    /**
     * <p>id(0x286)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayHeadings(VARIANT RHS);
            
    /**
     * <p>id(0x286)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayHeadings(Boolean RHS);
            
    /**
     * <p>id(0x399)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x399)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayHorizontalScrollBar(VARIANT RHS);
            
    /**
     * <p>id(0x399)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHorizontalScrollBar", dispId = 0x399)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayHorizontalScrollBar(Boolean RHS);
            
    /**
     * <p>id(0x287)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayOutline(VARIANT RHS);
            
    /**
     * <p>id(0x287)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayOutline(Boolean RHS);
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    com.sun.jna.platform.win32.WinNT.HRESULT get_DisplayRightToLeft(VARIANT RHS);
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    com.sun.jna.platform.win32.WinNT.HRESULT set_DisplayRightToLeft(Boolean RHS);
            
    /**
     * <p>id(0x39a)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayVerticalScrollBar(VARIANT RHS);
            
    /**
     * <p>id(0x39a)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayVerticalScrollBar(Boolean RHS);
            
    /**
     * <p>id(0x39b)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayWorkbookTabs", dispId = 0x39b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayWorkbookTabs(VARIANT RHS);
            
    /**
     * <p>id(0x39b)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayWorkbookTabs", dispId = 0x39b)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayWorkbookTabs(Boolean RHS);
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayZeros(VARIANT RHS);
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayZeros(Boolean RHS);
            
    /**
     * <p>id(0x4a8)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableResize(VARIANT RHS);
            
    /**
     * <p>id(0x4a8)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableResize(Boolean RHS);
            
    /**
     * <p>id(0x28a)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FreezePanes", dispId = 0x28a)
    com.sun.jna.platform.win32.WinNT.HRESULT getFreezePanes(VARIANT RHS);
            
    /**
     * <p>id(0x28a)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "FreezePanes", dispId = 0x28a)
    com.sun.jna.platform.win32.WinNT.HRESULT setFreezePanes(Boolean RHS);
            
    /**
     * <p>id(0x28b)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "GridlineColor", dispId = 0x28b)
    com.sun.jna.platform.win32.WinNT.HRESULT getGridlineColor(VARIANT RHS);
            
    /**
     * <p>id(0x28b)</p>
     * <p>vtableId(43)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "GridlineColor", dispId = 0x28b)
    com.sun.jna.platform.win32.WinNT.HRESULT setGridlineColor(Integer RHS);
            
    /**
     * <p>id(0x28c)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "GridlineColorIndex", dispId = 0x28c)
    com.sun.jna.platform.win32.WinNT.HRESULT getGridlineColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x28c)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "GridlineColorIndex", dispId = 0x28c)
    com.sun.jna.platform.win32.WinNT.HRESULT setGridlineColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x223)</p>
     * <p>vtableId(49)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "LargeScroll", dispId = 0x223)
    com.sun.jna.platform.win32.WinNT.HRESULT LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft,
            VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Window}
     */
    @ComMethod(name = "NewWindow", dispId = 0x118)
    com.sun.jna.platform.win32.WinNT.HRESULT NewWindow(VARIANT RHS);
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(53)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnWindow(VARIANT RHS);
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(54)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnWindow(String RHS);
            
    /**
     * <p>id(0x28d)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Panes}
     */
    @ComProperty(name = "Panes", dispId = 0x28d)
    com.sun.jna.platform.win32.WinNT.HRESULT getPanes(VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    com.sun.jna.platform.win32.WinNT.HRESULT _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            VARIANT RHS);
            
    /**
     * <p>id(0x119)</p>
     * <p>vtableId(57)</p>
     * @param EnableChanges [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintPreview(Object EnableChanges,
            VARIANT RHS);
            
    /**
     * <p>id(0x4a5)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "RangeSelection", dispId = 0x4a5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRangeSelection(VARIANT RHS);
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(59)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollColumn(VARIANT RHS);
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(60)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollColumn(Integer RHS);
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollRow(VARIANT RHS);
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(62)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollRow(Integer RHS);
            
    /**
     * <p>id(0x296)</p>
     * <p>vtableId(63)</p>
     * @param Sheets [in, optional] {@code Object}
     * @param Position [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ScrollWorkbookTabs", dispId = 0x296)
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollWorkbookTabs(Object Sheets,
            Object Position,
            VARIANT RHS);
            
    /**
     * <p>id(0x290)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code Sheets}
     */
    @ComProperty(name = "SelectedSheets", dispId = 0x290)
    com.sun.jna.platform.win32.WinNT.HRESULT getSelectedSheets(VARIANT RHS);
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Selection", dispId = 0x93)
    com.sun.jna.platform.win32.WinNT.HRESULT getSelection(VARIANT RHS);
            
    /**
     * <p>id(0x224)</p>
     * <p>vtableId(66)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "SmallScroll", dispId = 0x224)
    com.sun.jna.platform.win32.WinNT.HRESULT SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft,
            VARIANT RHS);
            
    /**
     * <p>id(0x291)</p>
     * <p>vtableId(67)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Split", dispId = 0x291)
    com.sun.jna.platform.win32.WinNT.HRESULT getSplit(VARIANT RHS);
            
    /**
     * <p>id(0x291)</p>
     * <p>vtableId(68)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Split", dispId = 0x291)
    com.sun.jna.platform.win32.WinNT.HRESULT setSplit(Boolean RHS);
            
    /**
     * <p>id(0x292)</p>
     * <p>vtableId(69)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "SplitColumn", dispId = 0x292)
    com.sun.jna.platform.win32.WinNT.HRESULT getSplitColumn(VARIANT RHS);
            
    /**
     * <p>id(0x292)</p>
     * <p>vtableId(70)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "SplitColumn", dispId = 0x292)
    com.sun.jna.platform.win32.WinNT.HRESULT setSplitColumn(Integer RHS);
            
    /**
     * <p>id(0x293)</p>
     * <p>vtableId(71)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "SplitHorizontal", dispId = 0x293)
    com.sun.jna.platform.win32.WinNT.HRESULT getSplitHorizontal(VARIANT RHS);
            
    /**
     * <p>id(0x293)</p>
     * <p>vtableId(72)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "SplitHorizontal", dispId = 0x293)
    com.sun.jna.platform.win32.WinNT.HRESULT setSplitHorizontal(Double RHS);
            
    /**
     * <p>id(0x294)</p>
     * <p>vtableId(73)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "SplitRow", dispId = 0x294)
    com.sun.jna.platform.win32.WinNT.HRESULT getSplitRow(VARIANT RHS);
            
    /**
     * <p>id(0x294)</p>
     * <p>vtableId(74)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "SplitRow", dispId = 0x294)
    com.sun.jna.platform.win32.WinNT.HRESULT setSplitRow(Integer RHS);
            
    /**
     * <p>id(0x295)</p>
     * <p>vtableId(75)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "SplitVertical", dispId = 0x295)
    com.sun.jna.platform.win32.WinNT.HRESULT getSplitVertical(VARIANT RHS);
            
    /**
     * <p>id(0x295)</p>
     * <p>vtableId(76)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "SplitVertical", dispId = 0x295)
    com.sun.jna.platform.win32.WinNT.HRESULT setSplitVertical(Double RHS);
            
    /**
     * <p>id(0x2a1)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "TabRatio", dispId = 0x2a1)
    com.sun.jna.platform.win32.WinNT.HRESULT getTabRatio(VARIANT RHS);
            
    /**
     * <p>id(0x2a1)</p>
     * <p>vtableId(78)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "TabRatio", dispId = 0x2a1)
    com.sun.jna.platform.win32.WinNT.HRESULT setTabRatio(Double RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(79)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(80)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(81)</p>
     * @param RHS [out] {@code XlWindowType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x185)</p>
     * <p>vtableId(82)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "UsableHeight", dispId = 0x185)
    com.sun.jna.platform.win32.WinNT.HRESULT getUsableHeight(VARIANT RHS);
            
    /**
     * <p>id(0x186)</p>
     * <p>vtableId(83)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "UsableWidth", dispId = 0x186)
    com.sun.jna.platform.win32.WinNT.HRESULT getUsableWidth(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(84)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(85)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x45e)</p>
     * <p>vtableId(86)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "VisibleRange", dispId = 0x45e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleRange(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(87)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(88)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x45f)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "WindowNumber", dispId = 0x45f)
    com.sun.jna.platform.win32.WinNT.HRESULT getWindowNumber(VARIANT RHS);
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(90)</p>
     * @param RHS [out] {@code XlWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    com.sun.jna.platform.win32.WinNT.HRESULT getWindowState(VARIANT RHS);
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(91)</p>
     * @param RHS [in] {@code XlWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    com.sun.jna.platform.win32.WinNT.HRESULT setWindowState(XlWindowState RHS);
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(92)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    com.sun.jna.platform.win32.WinNT.HRESULT getZoom(VARIANT RHS);
            
    /**
     * <p>id(0x297)</p>
     * <p>vtableId(93)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Zoom", dispId = 0x297)
    com.sun.jna.platform.win32.WinNT.HRESULT setZoom(Object RHS);
            
    /**
     * <p>id(0x4aa)</p>
     * <p>vtableId(94)</p>
     * @param RHS [out] {@code XlWindowView}
     */
    @ComProperty(name = "View", dispId = 0x4aa)
    com.sun.jna.platform.win32.WinNT.HRESULT getView(VARIANT RHS);
            
    /**
     * <p>id(0x4aa)</p>
     * <p>vtableId(95)</p>
     * @param RHS [in] {@code XlWindowView}
     */
    @ComProperty(name = "View", dispId = 0x4aa)
    com.sun.jna.platform.win32.WinNT.HRESULT setView(XlWindowView RHS);
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(96)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayRightToLeft(VARIANT RHS);
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(97)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayRightToLeft(Boolean RHS);
            
    /**
     * <p>id(0x6f0)</p>
     * <p>vtableId(98)</p>
     * @param Points [in] {@code Integer}
     * @param RHS [out] {@code Integer}
     */
    @ComMethod(name = "PointsToScreenPixelsX", dispId = 0x6f0)
    com.sun.jna.platform.win32.WinNT.HRESULT PointsToScreenPixelsX(Integer Points,
            VARIANT RHS);
            
    /**
     * <p>id(0x6f1)</p>
     * <p>vtableId(99)</p>
     * @param Points [in] {@code Integer}
     * @param RHS [out] {@code Integer}
     */
    @ComMethod(name = "PointsToScreenPixelsY", dispId = 0x6f1)
    com.sun.jna.platform.win32.WinNT.HRESULT PointsToScreenPixelsY(Integer Points,
            VARIANT RHS);
            
    /**
     * <p>id(0x6f2)</p>
     * <p>vtableId(100)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "RangeFromPoint", dispId = 0x6f2)
    com.sun.jna.platform.win32.WinNT.HRESULT RangeFromPoint(Integer x,
            Integer y,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollIntoView(Integer Left,
            Integer Top,
            Integer Width,
            Integer Height,
            Object Start);
            
    /**
     * <p>id(0x940)</p>
     * <p>vtableId(102)</p>
     * @param RHS [out] {@code SheetViews}
     */
    @ComProperty(name = "SheetViews", dispId = 0x940)
    com.sun.jna.platform.win32.WinNT.HRESULT getSheetViews(VARIANT RHS);
            
    /**
     * <p>id(0x941)</p>
     * <p>vtableId(103)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "ActiveSheetView", dispId = 0x941)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveSheetView(VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            VARIANT RHS);
            
    /**
     * <p>id(0x942)</p>
     * <p>vtableId(105)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayRuler", dispId = 0x942)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayRuler(VARIANT RHS);
            
    /**
     * <p>id(0x942)</p>
     * <p>vtableId(106)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRuler", dispId = 0x942)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayRuler(Boolean RHS);
            
    /**
     * <p>id(0x943)</p>
     * <p>vtableId(107)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AutoFilterDateGrouping", dispId = 0x943)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoFilterDateGrouping(VARIANT RHS);
            
    /**
     * <p>id(0x943)</p>
     * <p>vtableId(108)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFilterDateGrouping", dispId = 0x943)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoFilterDateGrouping(Boolean RHS);
            
    /**
     * <p>id(0x944)</p>
     * <p>vtableId(109)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayWhitespace", dispId = 0x944)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayWhitespace(VARIANT RHS);
            
    /**
     * <p>id(0x944)</p>
     * <p>vtableId(110)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayWhitespace", dispId = 0x944)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayWhitespace(Boolean RHS);
            
    /**
     * <p>id(0x79e)</p>
     * <p>vtableId(111)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Hwnd", dispId = 0x79e)
    com.sun.jna.platform.win32.WinNT.HRESULT getHwnd(VARIANT RHS);
            
    
}