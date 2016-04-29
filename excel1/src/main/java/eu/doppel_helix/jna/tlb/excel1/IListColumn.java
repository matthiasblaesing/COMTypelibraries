
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024473-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024473-0001-0000-C000-000000000046}")
public interface IListColumn {
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
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x911)</p>
     */
    @ComProperty(name = "ListDataFormat", dispId = 0x911)
    com.sun.jna.platform.win32.WinNT.HRESULT getListDataFormat(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
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
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x912)</p>
     */
    @ComProperty(name = "TotalsCalculation", dispId = 0x912)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotalsCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x912)</p>
     */
    @ComProperty(name = "TotalsCalculation", dispId = 0x912)
    com.sun.jna.platform.win32.WinNT.HRESULT setTotalsCalculation(XlTotalsCalculation RHS);
            
    /**
     * <p>id(0x8d2)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x8d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getXPath(VARIANT RHS);
            
    /**
     * <p>id(0x913)</p>
     */
    @ComProperty(name = "SharePointFormula", dispId = 0x913)
    com.sun.jna.platform.win32.WinNT.HRESULT getSharePointFormula(VARIANT RHS);
            
    /**
     * <p>id(0x2c1)</p>
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataBodyRange(VARIANT RHS);
            
    /**
     * <p>id(0xa79)</p>
     */
    @ComProperty(name = "Total", dispId = 0xa79)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotal(VARIANT RHS);
            
    
}