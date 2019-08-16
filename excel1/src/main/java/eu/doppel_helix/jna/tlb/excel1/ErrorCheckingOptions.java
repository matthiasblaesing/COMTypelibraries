
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002445B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002445B-0000-0000-C000-000000000046}")
public interface ErrorCheckingOptions extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x899)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "BackgroundChecking", dispId = 0x899)
    Boolean getBackgroundChecking();
            
    /**
     * <p>id(0x899)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundChecking", dispId = 0x899)
    void setBackgroundChecking(Boolean param0);
            
    /**
     * <p>id(0x89a)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "IndicatorColorIndex", dispId = 0x89a)
    XlColorIndex getIndicatorColorIndex();
            
    /**
     * <p>id(0x89a)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "IndicatorColorIndex", dispId = 0x89a)
    void setIndicatorColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x89b)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "EvaluateToError", dispId = 0x89b)
    Boolean getEvaluateToError();
            
    /**
     * <p>id(0x89b)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EvaluateToError", dispId = 0x89b)
    void setEvaluateToError(Boolean param0);
            
    /**
     * <p>id(0x89c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "TextDate", dispId = 0x89c)
    Boolean getTextDate();
            
    /**
     * <p>id(0x89c)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextDate", dispId = 0x89c)
    void setTextDate(Boolean param0);
            
    /**
     * <p>id(0x89d)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "NumberAsText", dispId = 0x89d)
    Boolean getNumberAsText();
            
    /**
     * <p>id(0x89d)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NumberAsText", dispId = 0x89d)
    void setNumberAsText(Boolean param0);
            
    /**
     * <p>id(0x89e)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "InconsistentFormula", dispId = 0x89e)
    Boolean getInconsistentFormula();
            
    /**
     * <p>id(0x89e)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InconsistentFormula", dispId = 0x89e)
    void setInconsistentFormula(Boolean param0);
            
    /**
     * <p>id(0x89f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "OmittedCells", dispId = 0x89f)
    Boolean getOmittedCells();
            
    /**
     * <p>id(0x89f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OmittedCells", dispId = 0x89f)
    void setOmittedCells(Boolean param0);
            
    /**
     * <p>id(0x8a0)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "UnlockedFormulaCells", dispId = 0x8a0)
    Boolean getUnlockedFormulaCells();
            
    /**
     * <p>id(0x8a0)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UnlockedFormulaCells", dispId = 0x8a0)
    void setUnlockedFormulaCells(Boolean param0);
            
    /**
     * <p>id(0x8a1)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "EmptyCellReferences", dispId = 0x8a1)
    Boolean getEmptyCellReferences();
            
    /**
     * <p>id(0x8a1)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EmptyCellReferences", dispId = 0x8a1)
    void setEmptyCellReferences(Boolean param0);
            
    /**
     * <p>id(0x8f8)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "ListDataValidation", dispId = 0x8f8)
    Boolean getListDataValidation();
            
    /**
     * <p>id(0x8f8)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ListDataValidation", dispId = 0x8f8)
    void setListDataValidation(Boolean param0);
            
    /**
     * <p>id(0xa73)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "InconsistentTableFormula", dispId = 0xa73)
    Boolean getInconsistentTableFormula();
            
    /**
     * <p>id(0xa73)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InconsistentTableFormula", dispId = 0xa73)
    void setInconsistentTableFormula(Boolean param0);
            
    
}