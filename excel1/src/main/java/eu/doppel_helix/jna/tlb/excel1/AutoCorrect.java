
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D4-0000-0000-C000-000000000046}")
public interface AutoCorrect {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x47a)</p>
     */
    @ComMethod(name = "AddReplacement", dispId = 0x47a)
    Object AddReplacement(String What,
            String Replacement);
            
    /**
     * <p>id(0x47e)</p>
     */
    @ComProperty(name = "CapitalizeNamesOfDays", dispId = 0x47e)
    Boolean getCapitalizeNamesOfDays();
            
    /**
     * <p>id(0x47e)</p>
     */
    @ComProperty(name = "CapitalizeNamesOfDays", dispId = 0x47e)
    void setCapitalizeNamesOfDays(Boolean param0);
            
    /**
     * <p>id(0x47b)</p>
     */
    @ComMethod(name = "DeleteReplacement", dispId = 0x47b)
    Object DeleteReplacement(String What);
            
    /**
     * <p>id(0x47f)</p>
     */
    @ComProperty(name = "ReplacementList", dispId = 0x47f)
    Object getReplacementList(Object Index);
            
    /**
     * <p>id(0x47f)</p>
     */
    @ComProperty(name = "ReplacementList", dispId = 0x47f)
    void setReplacementList(Object Index,
            Object param1);
            
    /**
     * <p>id(0x47c)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x47c)
    Boolean getReplaceText();
            
    /**
     * <p>id(0x47c)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x47c)
    void setReplaceText(Boolean param0);
            
    /**
     * <p>id(0x47d)</p>
     */
    @ComProperty(name = "TwoInitialCapitals", dispId = 0x47d)
    Boolean getTwoInitialCapitals();
            
    /**
     * <p>id(0x47d)</p>
     */
    @ComProperty(name = "TwoInitialCapitals", dispId = 0x47d)
    void setTwoInitialCapitals(Boolean param0);
            
    /**
     * <p>id(0x653)</p>
     */
    @ComProperty(name = "CorrectSentenceCap", dispId = 0x653)
    Boolean getCorrectSentenceCap();
            
    /**
     * <p>id(0x653)</p>
     */
    @ComProperty(name = "CorrectSentenceCap", dispId = 0x653)
    void setCorrectSentenceCap(Boolean param0);
            
    /**
     * <p>id(0x654)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0x654)
    Boolean getCorrectCapsLock();
            
    /**
     * <p>id(0x654)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0x654)
    void setCorrectCapsLock(Boolean param0);
            
    /**
     * <p>id(0x786)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x786)
    Boolean getDisplayAutoCorrectOptions();
            
    /**
     * <p>id(0x786)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x786)
    void setDisplayAutoCorrectOptions(Boolean param0);
            
    /**
     * <p>id(0x8f6)</p>
     */
    @ComProperty(name = "AutoExpandListRange", dispId = 0x8f6)
    Boolean getAutoExpandListRange();
            
    /**
     * <p>id(0x8f6)</p>
     */
    @ComProperty(name = "AutoExpandListRange", dispId = 0x8f6)
    void setAutoExpandListRange(Boolean param0);
            
    /**
     * <p>id(0xa52)</p>
     */
    @ComProperty(name = "AutoFillFormulasInLists", dispId = 0xa52)
    Boolean getAutoFillFormulasInLists();
            
    /**
     * <p>id(0xa52)</p>
     */
    @ComProperty(name = "AutoFillFormulasInLists", dispId = 0xa52)
    void setAutoFillFormulasInLists(Boolean param0);
            
    
}