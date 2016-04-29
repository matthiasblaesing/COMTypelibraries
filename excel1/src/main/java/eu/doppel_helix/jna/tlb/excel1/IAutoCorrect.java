
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D4-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D4-0001-0000-C000-000000000046}")
public interface IAutoCorrect {
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
     * <p>id(0x47a)</p>
     */
    @ComMethod(name = "AddReplacement", dispId = 0x47a)
    com.sun.jna.platform.win32.WinNT.HRESULT AddReplacement(String What,
            String Replacement,
            VARIANT RHS);
            
    /**
     * <p>id(0x47e)</p>
     */
    @ComProperty(name = "CapitalizeNamesOfDays", dispId = 0x47e)
    com.sun.jna.platform.win32.WinNT.HRESULT getCapitalizeNamesOfDays(VARIANT RHS);
            
    /**
     * <p>id(0x47e)</p>
     */
    @ComProperty(name = "CapitalizeNamesOfDays", dispId = 0x47e)
    com.sun.jna.platform.win32.WinNT.HRESULT setCapitalizeNamesOfDays(Boolean RHS);
            
    /**
     * <p>id(0x47b)</p>
     */
    @ComMethod(name = "DeleteReplacement", dispId = 0x47b)
    com.sun.jna.platform.win32.WinNT.HRESULT DeleteReplacement(String What,
            VARIANT RHS);
            
    /**
     * <p>id(0x47f)</p>
     */
    @ComProperty(name = "ReplacementList", dispId = 0x47f)
    com.sun.jna.platform.win32.WinNT.HRESULT getReplacementList(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x47f)</p>
     */
    @ComProperty(name = "ReplacementList", dispId = 0x47f)
    com.sun.jna.platform.win32.WinNT.HRESULT setReplacementList(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x47c)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x47c)
    com.sun.jna.platform.win32.WinNT.HRESULT getReplaceText(VARIANT RHS);
            
    /**
     * <p>id(0x47c)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x47c)
    com.sun.jna.platform.win32.WinNT.HRESULT setReplaceText(Boolean RHS);
            
    /**
     * <p>id(0x47d)</p>
     */
    @ComProperty(name = "TwoInitialCapitals", dispId = 0x47d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTwoInitialCapitals(VARIANT RHS);
            
    /**
     * <p>id(0x47d)</p>
     */
    @ComProperty(name = "TwoInitialCapitals", dispId = 0x47d)
    com.sun.jna.platform.win32.WinNT.HRESULT setTwoInitialCapitals(Boolean RHS);
            
    /**
     * <p>id(0x653)</p>
     */
    @ComProperty(name = "CorrectSentenceCap", dispId = 0x653)
    com.sun.jna.platform.win32.WinNT.HRESULT getCorrectSentenceCap(VARIANT RHS);
            
    /**
     * <p>id(0x653)</p>
     */
    @ComProperty(name = "CorrectSentenceCap", dispId = 0x653)
    com.sun.jna.platform.win32.WinNT.HRESULT setCorrectSentenceCap(Boolean RHS);
            
    /**
     * <p>id(0x654)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0x654)
    com.sun.jna.platform.win32.WinNT.HRESULT getCorrectCapsLock(VARIANT RHS);
            
    /**
     * <p>id(0x654)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0x654)
    com.sun.jna.platform.win32.WinNT.HRESULT setCorrectCapsLock(Boolean RHS);
            
    /**
     * <p>id(0x786)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x786)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayAutoCorrectOptions(VARIANT RHS);
            
    /**
     * <p>id(0x786)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x786)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayAutoCorrectOptions(Boolean RHS);
            
    /**
     * <p>id(0x8f6)</p>
     */
    @ComProperty(name = "AutoExpandListRange", dispId = 0x8f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoExpandListRange(VARIANT RHS);
            
    /**
     * <p>id(0x8f6)</p>
     */
    @ComProperty(name = "AutoExpandListRange", dispId = 0x8f6)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoExpandListRange(Boolean RHS);
            
    /**
     * <p>id(0xa52)</p>
     */
    @ComProperty(name = "AutoFillFormulasInLists", dispId = 0xa52)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoFillFormulasInLists(VARIANT RHS);
            
    /**
     * <p>id(0xa52)</p>
     */
    @ComProperty(name = "AutoFillFormulasInLists", dispId = 0xa52)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoFillFormulasInLists(Boolean RHS);
            
    
}