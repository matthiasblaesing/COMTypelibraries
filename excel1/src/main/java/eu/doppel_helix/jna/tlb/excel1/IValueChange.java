
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C0-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C0-0001-0000-C000-000000000046}")
public interface IValueChange extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc0)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrder(VARIANT RHS);
            
    /**
     * <p>id(0xb9b)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "VisibleInPivotTable", dispId = 0xb9b)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleInPivotTable(VARIANT RHS);
            
    /**
     * <p>id(0x7dd)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code PivotCell}
     */
    @ComProperty(name = "PivotCell", dispId = 0x7dd)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotCell(VARIANT RHS);
            
    /**
     * <p>id(0xb9c)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Tuple", dispId = 0xb9c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTuple(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0xb3a)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code XlAllocationValue}
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllocationValue(VARIANT RHS);
            
    /**
     * <p>id(0xb3b)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code XlAllocationMethod}
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllocationMethod(VARIANT RHS);
            
    /**
     * <p>id(0xb3c)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllocationWeightExpression(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    
}