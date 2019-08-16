
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024473-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024473-0001-0000-C000-000000000046}")
public interface IListColumn extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x75)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x911)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code ListDataFormat}
     */
    @ComProperty(name = "ListDataFormat", dispId = 0x911)
    com.sun.jna.platform.win32.WinNT.HRESULT getListDataFormat(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x912)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code XlTotalsCalculation}
     */
    @ComProperty(name = "TotalsCalculation", dispId = 0x912)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotalsCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x912)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code XlTotalsCalculation}
     */
    @ComProperty(name = "TotalsCalculation", dispId = 0x912)
    com.sun.jna.platform.win32.WinNT.HRESULT setTotalsCalculation(XlTotalsCalculation RHS);
            
    /**
     * <p>id(0x8d2)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code XPath}
     */
    @ComProperty(name = "XPath", dispId = 0x8d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getXPath(VARIANT RHS);
            
    /**
     * <p>id(0x913)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SharePointFormula", dispId = 0x913)
    com.sun.jna.platform.win32.WinNT.HRESULT getSharePointFormula(VARIANT RHS);
            
    /**
     * <p>id(0x2c1)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataBodyRange(VARIANT RHS);
            
    /**
     * <p>id(0xa79)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Total", dispId = 0xa79)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotal(VARIANT RHS);
            
    
}