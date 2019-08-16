
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244AB-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244AB-0001-0000-C000-000000000046}")
public interface ISort extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xabc)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Rng", dispId = 0xabc)
    com.sun.jna.platform.win32.WinNT.HRESULT getRng(VARIANT RHS);
            
    /**
     * <p>id(0x37f)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code XlYesNoGuess}
     */
    @ComProperty(name = "Header", dispId = 0x37f)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeader(VARIANT RHS);
            
    /**
     * <p>id(0x37f)</p>
     * <p>vtableId(12)</p>
     * @param RHS [in] {@code XlYesNoGuess}
     */
    @ComProperty(name = "Header", dispId = 0x37f)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeader(XlYesNoGuess RHS);
            
    /**
     * <p>id(0x1aa)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MatchCase", dispId = 0x1aa)
    com.sun.jna.platform.win32.WinNT.HRESULT getMatchCase(VARIANT RHS);
            
    /**
     * <p>id(0x1aa)</p>
     * <p>vtableId(14)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MatchCase", dispId = 0x1aa)
    com.sun.jna.platform.win32.WinNT.HRESULT setMatchCase(Boolean RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code XlSortOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code XlSortOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(XlSortOrientation RHS);
            
    /**
     * <p>id(0x381)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code XlSortMethod}
     */
    @ComProperty(name = "SortMethod", dispId = 0x381)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortMethod(VARIANT RHS);
            
    /**
     * <p>id(0x381)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code XlSortMethod}
     */
    @ComProperty(name = "SortMethod", dispId = 0x381)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortMethod(XlSortMethod RHS);
            
    /**
     * <p>id(0xabd)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code SortFields}
     */
    @ComProperty(name = "SortFields", dispId = 0xabd)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortFields(VARIANT RHS);
            
    /**
     * <p>id(0xabe)</p>
     * <p>vtableId(20)</p>
     * @param Rng [in] {@code Range}
     */
    @ComMethod(name = "SetRange", dispId = 0xabe)
    com.sun.jna.platform.win32.WinNT.HRESULT SetRange(Range Rng);
            
    /**
     * <p>id(0x68b)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x68b)
    com.sun.jna.platform.win32.WinNT.HRESULT Apply();
            
    
}