
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002444A-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002444A-0001-0000-C000-000000000046}")
public interface IPivotLayout extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2c9)</p>
     * <p>vtableId(10)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "ColumnFields", dispId = 0x2c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2cb)</p>
     * <p>vtableId(11)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "DataFields", dispId = 0x2cb)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2ca)</p>
     * <p>vtableId(12)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "PageFields", dispId = 0x2ca)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2c8)</p>
     * <p>vtableId(13)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "RowFields", dispId = 0x2c8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2c7)</p>
     * <p>vtableId(14)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "HiddenFields", dispId = 0x2c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getHiddenFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2c6)</p>
     * <p>vtableId(15)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "VisibleFields", dispId = 0x2c6)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2ce)</p>
     * <p>vtableId(16)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "PivotFields", dispId = 0x2ce)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x72f)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code CubeFields}
     */
    @ComProperty(name = "CubeFields", dispId = 0x72f)
    com.sun.jna.platform.win32.WinNT.HRESULT getCubeFields(VARIANT RHS);
            
    /**
     * <p>id(0x5d8)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code PivotCache}
     */
    @ComProperty(name = "PivotCache", dispId = 0x5d8)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotCache(VARIANT RHS);
            
    /**
     * <p>id(0x2cc)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code PivotTable}
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotTable(VARIANT RHS);
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    com.sun.jna.platform.win32.WinNT.HRESULT getInnerDetail(VARIANT RHS);
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    com.sun.jna.platform.win32.WinNT.HRESULT setInnerDetail(String RHS);
            
    /**
     * <p>id(0x2c4)</p>
     * <p>vtableId(22)</p>
     * @param RowFields [in, optional] {@code Object}
     * @param ColumnFields [in, optional] {@code Object}
     * @param PageFields [in, optional] {@code Object}
     * @param AppendField [in, optional] {@code Object}
     */
    @ComMethod(name = "AddFields", dispId = 0x2c4)
    com.sun.jna.platform.win32.WinNT.HRESULT AddFields(Object RowFields,
            Object ColumnFields,
            Object PageFields,
            Object AppendField);
            
    
}