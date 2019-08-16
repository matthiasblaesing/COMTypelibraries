
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244BF-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244BF-0001-0000-C000-000000000046}")
public interface INegativeBarFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x893)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlDataBarNegativeColorType}
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    com.sun.jna.platform.win32.WinNT.HRESULT getColorType(VARIANT RHS);
            
    /**
     * <p>id(0x893)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code XlDataBarNegativeColorType}
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    com.sun.jna.platform.win32.WinNT.HRESULT setColorType(XlDataBarNegativeColorType RHS);
            
    /**
     * <p>id(0xb99)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code XlDataBarNegativeColorType}
     */
    @ComProperty(name = "BorderColorType", dispId = 0xb99)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorderColorType(VARIANT RHS);
            
    /**
     * <p>id(0xb99)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code XlDataBarNegativeColorType}
     */
    @ComProperty(name = "BorderColorType", dispId = 0xb99)
    com.sun.jna.platform.win32.WinNT.HRESULT setBorderColorType(XlDataBarNegativeColorType RHS);
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Color", dispId = 0x63)
    com.sun.jna.platform.win32.WinNT.HRESULT getColor(VARIANT RHS);
            
    /**
     * <p>id(0xb9a)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "BorderColor", dispId = 0xb9a)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorderColor(VARIANT RHS);
            
    
}