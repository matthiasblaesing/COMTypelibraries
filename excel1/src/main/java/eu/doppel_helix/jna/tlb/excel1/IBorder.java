
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020854-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020854-0001-0000-C000-000000000046}")
public interface IBorder extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x63)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Color", dispId = 0x63)
    com.sun.jna.platform.win32.WinNT.HRESULT getColor(VARIANT RHS);
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Color", dispId = 0x63)
    com.sun.jna.platform.win32.WinNT.HRESULT setColor(Object RHS);
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    com.sun.jna.platform.win32.WinNT.HRESULT getColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    com.sun.jna.platform.win32.WinNT.HRESULT setColorIndex(Object RHS);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "LineStyle", dispId = 0x77)
    com.sun.jna.platform.win32.WinNT.HRESULT getLineStyle(VARIANT RHS);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "LineStyle", dispId = 0x77)
    com.sun.jna.platform.win32.WinNT.HRESULT setLineStyle(Object RHS);
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Weight", dispId = 0x78)
    com.sun.jna.platform.win32.WinNT.HRESULT getWeight(VARIANT RHS);
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Weight", dispId = 0x78)
    com.sun.jna.platform.win32.WinNT.HRESULT setWeight(Object RHS);
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    com.sun.jna.platform.win32.WinNT.HRESULT getThemeColor(VARIANT RHS);
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    com.sun.jna.platform.win32.WinNT.HRESULT setThemeColor(Object RHS);
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTintAndShade(VARIANT RHS);
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTintAndShade(Object RHS);
            
    
}