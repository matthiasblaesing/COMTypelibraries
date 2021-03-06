
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C6-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C6-0001-0000-C000-000000000046}")
public interface ISlicerCacheLevel extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xba1)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code SlicerItems}
     */
    @ComProperty(name = "SlicerItems", dispId = 0xba1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerItems(VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xba5)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Ordinal", dispId = 0xba5)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrdinal(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xba2)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code XlSlicerCrossFilterType}
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCrossFilterType(VARIANT RHS);
            
    /**
     * <p>id(0xba2)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code XlSlicerCrossFilterType}
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    com.sun.jna.platform.win32.WinNT.HRESULT setCrossFilterType(XlSlicerCrossFilterType RHS);
            
    /**
     * <p>id(0xba3)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code XlSlicerSort}
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortItems(VARIANT RHS);
            
    /**
     * <p>id(0xba3)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code XlSlicerSort}
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortItems(XlSlicerSort RHS);
            
    /**
     * <p>id(0xba0)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleSlicerItemsList(VARIANT RHS);
            
    
}