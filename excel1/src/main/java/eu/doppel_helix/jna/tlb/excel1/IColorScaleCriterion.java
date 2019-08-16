
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024495-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024495-0001-0000-C000-000000000046}")
public interface IColorScaleCriterion extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlConditionValueTypes}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(9)</p>
     * @param RHS [in] {@code XlConditionValueTypes}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(XlConditionValueTypes RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Object RHS);
            
    /**
     * <p>id(0xa9d)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code FormatColor}
     */
    @ComProperty(name = "FormatColor", dispId = 0xa9d)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormatColor(VARIANT RHS);
            
    
}