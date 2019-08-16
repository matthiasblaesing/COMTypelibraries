
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244CE-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244CE-0001-0000-C000-000000000046}")
public interface ITableObject extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x631)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowNumbers(VARIANT RHS);
            
    /**
     * <p>id(0x631)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowNumbers(Boolean RHS);
            
    /**
     * <p>id(0x634)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FetchedRowOverflow", dispId = 0x634)
    com.sun.jna.platform.win32.WinNT.HRESULT getFetchedRowOverflow(VARIANT RHS);
            
    /**
     * <p>id(0x636)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code XlCellInsertionMode}
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshStyle(VARIANT RHS);
            
    /**
     * <p>id(0x636)</p>
     * <p>vtableId(14)</p>
     * @param RHS [in] {@code XlCellInsertionMode}
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshStyle(XlCellInsertionMode RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableRefresh(Boolean RHS);
            
    /**
     * <p>id(0x2a9)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Destination", dispId = 0x2a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getDestination(VARIANT RHS);
            
    /**
     * <p>id(0x638)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "ResultRange", dispId = 0x638)
    com.sun.jna.platform.win32.WinNT.HRESULT getResultRange(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh(VARIANT RHS);
            
    /**
     * <p>id(0x63b)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableEditing(VARIANT RHS);
            
    /**
     * <p>id(0x63b)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableEditing(Boolean RHS);
            
    /**
     * <p>id(0x74b)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveColumnInfo(VARIANT RHS);
            
    /**
     * <p>id(0x74b)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveColumnInfo(Boolean RHS);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveFormatting(VARIANT RHS);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveFormatting(Boolean RHS);
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT setAdjustColumnWidth(Boolean RHS);
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code ListObject}
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getListObject(VARIANT RHS);
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    
}