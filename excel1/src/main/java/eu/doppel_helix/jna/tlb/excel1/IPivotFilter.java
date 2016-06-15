
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024483-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024483-0001-0000-C000-000000000046}")
public interface IPivotFilter extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrder(VARIANT RHS);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrder(Integer RHS);
            
    /**
     * <p>id(0xa7e)</p>
     */
    @ComProperty(name = "FilterType", dispId = 0xa7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterType(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xda)</p>
     */
    @ComProperty(name = "Description", dispId = 0xda)
    com.sun.jna.platform.win32.WinNT.HRESULT getDescription(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x908)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    com.sun.jna.platform.win32.WinNT.HRESULT getActive(VARIANT RHS);
            
    /**
     * <p>id(0x2db)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotField(VARIANT RHS);
            
    /**
     * <p>id(0x82b)</p>
     */
    @ComProperty(name = "DataField", dispId = 0x82b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataField(VARIANT RHS);
            
    /**
     * <p>id(0xa7f)</p>
     */
    @ComProperty(name = "DataCubeField", dispId = 0xa7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataCubeField(VARIANT RHS);
            
    /**
     * <p>id(0xa80)</p>
     */
    @ComProperty(name = "Value1", dispId = 0xa80)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue1(VARIANT RHS);
            
    /**
     * <p>id(0x56c)</p>
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue2(VARIANT RHS);
            
    /**
     * <p>id(0xa81)</p>
     */
    @ComProperty(name = "MemberPropertyField", dispId = 0xa81)
    com.sun.jna.platform.win32.WinNT.HRESULT getMemberPropertyField(VARIANT RHS);
            
    /**
     * <p>id(0xa82)</p>
     */
    @ComProperty(name = "IsMemberPropertyFilter", dispId = 0xa82)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsMemberPropertyFilter(VARIANT RHS);
            
    /**
     * <p>id(0xc1b)</p>
     */
    @ComProperty(name = "WholeDayFilter", dispId = 0xc1b)
    com.sun.jna.platform.win32.WinNT.HRESULT getWholeDayFilter(VARIANT RHS);
            
    /**
     * <p>id(0xc1b)</p>
     */
    @ComProperty(name = "WholeDayFilter", dispId = 0xc1b)
    com.sun.jna.platform.win32.WinNT.HRESULT setWholeDayFilter(Boolean RHS);
            
    
}