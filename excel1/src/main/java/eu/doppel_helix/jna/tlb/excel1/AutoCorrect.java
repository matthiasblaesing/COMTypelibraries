
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D4-0000-0000-C000-000000000046}")
public interface AutoCorrect extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x47a)</p>
     * <p>vtableId(10)</p>
     * @param What [in] {@code String}
     * @param Replacement [in] {@code String}
     */
    @ComMethod(name = "AddReplacement", dispId = 0x47a)
    Object AddReplacement(String What,
            String Replacement);
            
    /**
     * <p>id(0x47e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CapitalizeNamesOfDays", dispId = 0x47e)
    Boolean getCapitalizeNamesOfDays();
            
    /**
     * <p>id(0x47e)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CapitalizeNamesOfDays", dispId = 0x47e)
    void setCapitalizeNamesOfDays(Boolean param0);
            
    /**
     * <p>id(0x47b)</p>
     * <p>vtableId(13)</p>
     * @param What [in] {@code String}
     */
    @ComMethod(name = "DeleteReplacement", dispId = 0x47b)
    Object DeleteReplacement(String What);
            
    /**
     * <p>id(0x47f)</p>
     * <p>vtableId(14)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ReplacementList", dispId = 0x47f)
    Object getReplacementList(Object Index);
            
    /**
     * <p>id(0x47f)</p>
     * <p>vtableId(15)</p>
     * @param Index [in, optional] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "ReplacementList", dispId = 0x47f)
    void setReplacementList(Object Index,
            Object param1);
            
    /**
     * <p>id(0x47c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x47c)
    Boolean getReplaceText();
            
    /**
     * <p>id(0x47c)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReplaceText", dispId = 0x47c)
    void setReplaceText(Boolean param0);
            
    /**
     * <p>id(0x47d)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "TwoInitialCapitals", dispId = 0x47d)
    Boolean getTwoInitialCapitals();
            
    /**
     * <p>id(0x47d)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TwoInitialCapitals", dispId = 0x47d)
    void setTwoInitialCapitals(Boolean param0);
            
    /**
     * <p>id(0x653)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "CorrectSentenceCap", dispId = 0x653)
    Boolean getCorrectSentenceCap();
            
    /**
     * <p>id(0x653)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectSentenceCap", dispId = 0x653)
    void setCorrectSentenceCap(Boolean param0);
            
    /**
     * <p>id(0x654)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0x654)
    Boolean getCorrectCapsLock();
            
    /**
     * <p>id(0x654)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0x654)
    void setCorrectCapsLock(Boolean param0);
            
    /**
     * <p>id(0x786)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x786)
    Boolean getDisplayAutoCorrectOptions();
            
    /**
     * <p>id(0x786)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x786)
    void setDisplayAutoCorrectOptions(Boolean param0);
            
    /**
     * <p>id(0x8f6)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "AutoExpandListRange", dispId = 0x8f6)
    Boolean getAutoExpandListRange();
            
    /**
     * <p>id(0x8f6)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoExpandListRange", dispId = 0x8f6)
    void setAutoExpandListRange(Boolean param0);
            
    /**
     * <p>id(0xa52)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "AutoFillFormulasInLists", dispId = 0xa52)
    Boolean getAutoFillFormulasInLists();
            
    /**
     * <p>id(0xa52)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFillFormulasInLists", dispId = 0xa52)
    void setAutoFillFormulasInLists(Boolean param0);
            
    
}