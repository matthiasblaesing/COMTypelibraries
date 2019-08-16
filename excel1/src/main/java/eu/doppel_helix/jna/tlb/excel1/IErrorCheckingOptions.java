
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002445B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002445B-0001-0000-C000-000000000046}")
public interface IErrorCheckingOptions extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x899)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BackgroundChecking", dispId = 0x899)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundChecking(VARIANT RHS);
            
    /**
     * <p>id(0x899)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundChecking", dispId = 0x899)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundChecking(Boolean RHS);
            
    /**
     * <p>id(0x89a)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "IndicatorColorIndex", dispId = 0x89a)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndicatorColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x89a)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "IndicatorColorIndex", dispId = 0x89a)
    com.sun.jna.platform.win32.WinNT.HRESULT setIndicatorColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0x89b)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EvaluateToError", dispId = 0x89b)
    com.sun.jna.platform.win32.WinNT.HRESULT getEvaluateToError(VARIANT RHS);
            
    /**
     * <p>id(0x89b)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EvaluateToError", dispId = 0x89b)
    com.sun.jna.platform.win32.WinNT.HRESULT setEvaluateToError(Boolean RHS);
            
    /**
     * <p>id(0x89c)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextDate", dispId = 0x89c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextDate(VARIANT RHS);
            
    /**
     * <p>id(0x89c)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextDate", dispId = 0x89c)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextDate(Boolean RHS);
            
    /**
     * <p>id(0x89d)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "NumberAsText", dispId = 0x89d)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberAsText(VARIANT RHS);
            
    /**
     * <p>id(0x89d)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "NumberAsText", dispId = 0x89d)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberAsText(Boolean RHS);
            
    /**
     * <p>id(0x89e)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InconsistentFormula", dispId = 0x89e)
    com.sun.jna.platform.win32.WinNT.HRESULT getInconsistentFormula(VARIANT RHS);
            
    /**
     * <p>id(0x89e)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InconsistentFormula", dispId = 0x89e)
    com.sun.jna.platform.win32.WinNT.HRESULT setInconsistentFormula(Boolean RHS);
            
    /**
     * <p>id(0x89f)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "OmittedCells", dispId = 0x89f)
    com.sun.jna.platform.win32.WinNT.HRESULT getOmittedCells(VARIANT RHS);
            
    /**
     * <p>id(0x89f)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "OmittedCells", dispId = 0x89f)
    com.sun.jna.platform.win32.WinNT.HRESULT setOmittedCells(Boolean RHS);
            
    /**
     * <p>id(0x8a0)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "UnlockedFormulaCells", dispId = 0x8a0)
    com.sun.jna.platform.win32.WinNT.HRESULT getUnlockedFormulaCells(VARIANT RHS);
            
    /**
     * <p>id(0x8a0)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "UnlockedFormulaCells", dispId = 0x8a0)
    com.sun.jna.platform.win32.WinNT.HRESULT setUnlockedFormulaCells(Boolean RHS);
            
    /**
     * <p>id(0x8a1)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EmptyCellReferences", dispId = 0x8a1)
    com.sun.jna.platform.win32.WinNT.HRESULT getEmptyCellReferences(VARIANT RHS);
            
    /**
     * <p>id(0x8a1)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EmptyCellReferences", dispId = 0x8a1)
    com.sun.jna.platform.win32.WinNT.HRESULT setEmptyCellReferences(Boolean RHS);
            
    /**
     * <p>id(0x8f8)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ListDataValidation", dispId = 0x8f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getListDataValidation(VARIANT RHS);
            
    /**
     * <p>id(0x8f8)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ListDataValidation", dispId = 0x8f8)
    com.sun.jna.platform.win32.WinNT.HRESULT setListDataValidation(Boolean RHS);
            
    /**
     * <p>id(0xa73)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InconsistentTableFormula", dispId = 0xa73)
    com.sun.jna.platform.win32.WinNT.HRESULT getInconsistentTableFormula(VARIANT RHS);
            
    /**
     * <p>id(0xa73)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InconsistentTableFormula", dispId = 0xa73)
    com.sun.jna.platform.win32.WinNT.HRESULT setInconsistentTableFormula(Boolean RHS);
            
    
}