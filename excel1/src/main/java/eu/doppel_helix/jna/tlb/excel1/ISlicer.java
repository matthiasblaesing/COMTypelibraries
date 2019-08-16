
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C8-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C8-0001-0000-C000-000000000046}")
public interface ISlicer extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0xba7)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisableMoveResizeUI(VARIANT RHS);
            
    /**
     * <p>id(0xba7)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisableMoveResizeUI(Boolean RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowHeight(VARIANT RHS);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowHeight(Double RHS);
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT setColumnWidth(Double RHS);
            
    /**
     * <p>id(0xba8)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberOfColumns(VARIANT RHS);
            
    /**
     * <p>id(0xba8)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberOfColumns(Integer RHS);
            
    /**
     * <p>id(0xba9)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayHeader(VARIANT RHS);
            
    /**
     * <p>id(0xba9)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayHeader(Boolean RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0xbaa)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code SlicerCache}
     */
    @ComProperty(name = "SlicerCache", dispId = 0xbaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCache(VARIANT RHS);
            
    /**
     * <p>id(0xbab)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code SlicerCacheLevel}
     */
    @ComProperty(name = "SlicerCacheLevel", dispId = 0xbab)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheLevel(VARIANT RHS);
            
    /**
     * <p>id(0x62e)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShape(VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT getStyle(VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(38)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT setStyle(Object RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(39)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(41)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy();
            
    /**
     * <p>id(0xbac)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code SlicerItem}
     */
    @ComProperty(name = "ActiveItem", dispId = 0xbac)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveItem(VARIANT RHS);
            
    /**
     * <p>id(0xc2c)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code TimelineViewState}
     */
    @ComProperty(name = "TimelineViewState", dispId = 0xc2c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTimelineViewState(VARIANT RHS);
            
    /**
     * <p>id(0xc27)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code XlSlicerCacheType}
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheType(VARIANT RHS);
            
    
}