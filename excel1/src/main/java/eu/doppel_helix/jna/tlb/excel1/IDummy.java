
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002442E-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002442E-0001-0000-C000-000000000046}")
public interface IDummy extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x644)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "_ActiveSheetOrChart", dispId = 0x644)
    com.sun.jna.platform.win32.WinNT.HRESULT _ActiveSheetOrChart();
            
    /**
     * <p>id(0x41f)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "RGB", dispId = 0x41f)
    com.sun.jna.platform.win32.WinNT.HRESULT RGB();
            
    /**
     * <p>id(0x420)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "ChDir", dispId = 0x420)
    com.sun.jna.platform.win32.WinNT.HRESULT ChDir();
            
    /**
     * <p>id(0x475)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "DoScript", dispId = 0x475)
    com.sun.jna.platform.win32.WinNT.HRESULT DoScript();
            
    /**
     * <p>id(0x473)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "DirectObject", dispId = 0x473)
    com.sun.jna.platform.win32.WinNT.HRESULT DirectObject();
            
    /**
     * <p>id(0x758)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "RefreshDocument", dispId = 0x758)
    com.sun.jna.platform.win32.WinNT.HRESULT RefreshDocument();
            
    /**
     * <p>id(0xa48)</p>
     * <p>vtableId(13)</p>
     * @param SigProv [in] {@code Object}
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.Signature}
     */
    @ComMethod(name = "AddSignatureLine", dispId = 0xa48)
    com.sun.jna.platform.win32.WinNT.HRESULT AddSignatureLine(Object SigProv,
            VARIANT RHS);
            
    /**
     * <p>id(0xa4a)</p>
     * <p>vtableId(14)</p>
     * @param SigProv [in] {@code Object}
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.Signature}
     */
    @ComMethod(name = "AddNonVisibleSignature", dispId = 0xa4a)
    com.sun.jna.platform.win32.WinNT.HRESULT AddNonVisibleSignature(Object SigProv,
            VARIANT RHS);
            
    /**
     * <p>id(0xa4b)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowSignaturesPane", dispId = 0xa4b)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowSignaturesPane(VARIANT RHS);
            
    /**
     * <p>id(0xa4b)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSignaturesPane", dispId = 0xa4b)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowSignaturesPane(Boolean RHS);
            
    /**
     * <p>id(0xa4c)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "ThemeFontScheme", dispId = 0xa4c)
    com.sun.jna.platform.win32.WinNT.HRESULT ThemeFontScheme();
            
    /**
     * <p>id(0xa4d)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "ThemeColorScheme", dispId = 0xa4d)
    com.sun.jna.platform.win32.WinNT.HRESULT ThemeColorScheme();
            
    /**
     * <p>id(0xa4e)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "ThemeEffectScheme", dispId = 0xa4e)
    com.sun.jna.platform.win32.WinNT.HRESULT ThemeEffectScheme();
            
    /**
     * <p>id(0xa4f)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Load", dispId = 0xa4f)
    com.sun.jna.platform.win32.WinNT.HRESULT Load();
            
    
}