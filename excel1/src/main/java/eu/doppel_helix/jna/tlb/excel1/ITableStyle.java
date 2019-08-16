
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A7-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A7-0001-0000-C000-000000000046}")
public interface ITableStyle extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x3a9)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getNameLocal(VARIANT RHS);
            
    /**
     * <p>id(0x229)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    com.sun.jna.platform.win32.WinNT.HRESULT getBuiltIn(VARIANT RHS);
            
    /**
     * <p>id(0xab1)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code TableStyleElements}
     */
    @ComProperty(name = "TableStyleElements", dispId = 0xab1)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableStyleElements(VARIANT RHS);
            
    /**
     * <p>id(0xab2)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailableTableStyle", dispId = 0xab2)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAsAvailableTableStyle(VARIANT RHS);
            
    /**
     * <p>id(0xab2)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailableTableStyle", dispId = 0xab2)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAsAvailableTableStyle(Boolean RHS);
            
    /**
     * <p>id(0xab3)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailablePivotTableStyle", dispId = 0xab3)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAsAvailablePivotTableStyle(VARIANT RHS);
            
    /**
     * <p>id(0xab3)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailablePivotTableStyle", dispId = 0xab3)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAsAvailablePivotTableStyle(Boolean RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(20)</p>
     * @param NewTableStyleName [in, optional] {@code Object}
     * @param RHS [out] {@code TableStyle}
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(Object NewTableStyleName,
            VARIANT RHS);
            
    /**
     * <p>id(0xb82)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailableSlicerStyle", dispId = 0xb82)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAsAvailableSlicerStyle(VARIANT RHS);
            
    /**
     * <p>id(0xb82)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailableSlicerStyle", dispId = 0xb82)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAsAvailableSlicerStyle(Boolean RHS);
            
    /**
     * <p>id(0xc26)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailableTimelineStyle", dispId = 0xc26)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAsAvailableTimelineStyle(VARIANT RHS);
            
    /**
     * <p>id(0xc26)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAsAvailableTimelineStyle", dispId = 0xc26)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAsAvailableTimelineStyle(Boolean RHS);
            
    
}