
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244AB-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244AB-0001-0000-C000-000000000046}")
public interface ISort {
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
     * <p>id(0xabc)</p>
     */
    @ComProperty(name = "Rng", dispId = 0xabc)
    com.sun.jna.platform.win32.WinNT.HRESULT getRng(VARIANT RHS);
            
    /**
     * <p>id(0x37f)</p>
     */
    @ComProperty(name = "Header", dispId = 0x37f)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeader(VARIANT RHS);
            
    /**
     * <p>id(0x37f)</p>
     */
    @ComProperty(name = "Header", dispId = 0x37f)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeader(XlYesNoGuess RHS);
            
    /**
     * <p>id(0x1aa)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0x1aa)
    com.sun.jna.platform.win32.WinNT.HRESULT getMatchCase(VARIANT RHS);
            
    /**
     * <p>id(0x1aa)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0x1aa)
    com.sun.jna.platform.win32.WinNT.HRESULT setMatchCase(Boolean RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(XlSortOrientation RHS);
            
    /**
     * <p>id(0x381)</p>
     */
    @ComProperty(name = "SortMethod", dispId = 0x381)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortMethod(VARIANT RHS);
            
    /**
     * <p>id(0x381)</p>
     */
    @ComProperty(name = "SortMethod", dispId = 0x381)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortMethod(XlSortMethod RHS);
            
    /**
     * <p>id(0xabd)</p>
     */
    @ComProperty(name = "SortFields", dispId = 0xabd)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortFields(VARIANT RHS);
            
    /**
     * <p>id(0xabe)</p>
     */
    @ComMethod(name = "SetRange", dispId = 0xabe)
    com.sun.jna.platform.win32.WinNT.HRESULT SetRange(Range Rng);
            
    /**
     * <p>id(0x68b)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x68b)
    com.sun.jna.platform.win32.WinNT.HRESULT Apply();
            
    
}