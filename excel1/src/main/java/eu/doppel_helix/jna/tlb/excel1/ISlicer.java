
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0xba7)</p>
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisableMoveResizeUI(VARIANT RHS);
            
    /**
     * <p>id(0xba7)</p>
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisableMoveResizeUI(Boolean RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowHeight(VARIANT RHS);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowHeight(Double RHS);
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT setColumnWidth(Double RHS);
            
    /**
     * <p>id(0xba8)</p>
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberOfColumns(VARIANT RHS);
            
    /**
     * <p>id(0xba8)</p>
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberOfColumns(Integer RHS);
            
    /**
     * <p>id(0xba9)</p>
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayHeader(VARIANT RHS);
            
    /**
     * <p>id(0xba9)</p>
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayHeader(Boolean RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0xbaa)</p>
     */
    @ComProperty(name = "SlicerCache", dispId = 0xbaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCache(VARIANT RHS);
            
    /**
     * <p>id(0xbab)</p>
     */
    @ComProperty(name = "SlicerCacheLevel", dispId = 0xbab)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheLevel(VARIANT RHS);
            
    /**
     * <p>id(0x62e)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShape(VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT getStyle(VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT setStyle(Object RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy();
            
    /**
     * <p>id(0xbac)</p>
     */
    @ComProperty(name = "ActiveItem", dispId = 0xbac)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveItem(VARIANT RHS);
            
    /**
     * <p>id(0xc2c)</p>
     */
    @ComProperty(name = "TimelineViewState", dispId = 0xc2c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTimelineViewState(VARIANT RHS);
            
    /**
     * <p>id(0xc27)</p>
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheType(VARIANT RHS);
            
    
}