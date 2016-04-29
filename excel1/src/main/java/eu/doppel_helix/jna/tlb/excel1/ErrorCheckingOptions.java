
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002445B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002445B-0000-0000-C000-000000000046}")
public interface ErrorCheckingOptions {
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
     * <p>id(0x899)</p>
     */
    @ComProperty(name = "BackgroundChecking", dispId = 0x899)
    Boolean getBackgroundChecking();
            
    /**
     * <p>id(0x899)</p>
     */
    @ComProperty(name = "BackgroundChecking", dispId = 0x899)
    void setBackgroundChecking(Boolean param0);
            
    /**
     * <p>id(0x89a)</p>
     */
    @ComProperty(name = "IndicatorColorIndex", dispId = 0x89a)
    XlColorIndex getIndicatorColorIndex();
            
    /**
     * <p>id(0x89a)</p>
     */
    @ComProperty(name = "IndicatorColorIndex", dispId = 0x89a)
    void setIndicatorColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x89b)</p>
     */
    @ComProperty(name = "EvaluateToError", dispId = 0x89b)
    Boolean getEvaluateToError();
            
    /**
     * <p>id(0x89b)</p>
     */
    @ComProperty(name = "EvaluateToError", dispId = 0x89b)
    void setEvaluateToError(Boolean param0);
            
    /**
     * <p>id(0x89c)</p>
     */
    @ComProperty(name = "TextDate", dispId = 0x89c)
    Boolean getTextDate();
            
    /**
     * <p>id(0x89c)</p>
     */
    @ComProperty(name = "TextDate", dispId = 0x89c)
    void setTextDate(Boolean param0);
            
    /**
     * <p>id(0x89d)</p>
     */
    @ComProperty(name = "NumberAsText", dispId = 0x89d)
    Boolean getNumberAsText();
            
    /**
     * <p>id(0x89d)</p>
     */
    @ComProperty(name = "NumberAsText", dispId = 0x89d)
    void setNumberAsText(Boolean param0);
            
    /**
     * <p>id(0x89e)</p>
     */
    @ComProperty(name = "InconsistentFormula", dispId = 0x89e)
    Boolean getInconsistentFormula();
            
    /**
     * <p>id(0x89e)</p>
     */
    @ComProperty(name = "InconsistentFormula", dispId = 0x89e)
    void setInconsistentFormula(Boolean param0);
            
    /**
     * <p>id(0x89f)</p>
     */
    @ComProperty(name = "OmittedCells", dispId = 0x89f)
    Boolean getOmittedCells();
            
    /**
     * <p>id(0x89f)</p>
     */
    @ComProperty(name = "OmittedCells", dispId = 0x89f)
    void setOmittedCells(Boolean param0);
            
    /**
     * <p>id(0x8a0)</p>
     */
    @ComProperty(name = "UnlockedFormulaCells", dispId = 0x8a0)
    Boolean getUnlockedFormulaCells();
            
    /**
     * <p>id(0x8a0)</p>
     */
    @ComProperty(name = "UnlockedFormulaCells", dispId = 0x8a0)
    void setUnlockedFormulaCells(Boolean param0);
            
    /**
     * <p>id(0x8a1)</p>
     */
    @ComProperty(name = "EmptyCellReferences", dispId = 0x8a1)
    Boolean getEmptyCellReferences();
            
    /**
     * <p>id(0x8a1)</p>
     */
    @ComProperty(name = "EmptyCellReferences", dispId = 0x8a1)
    void setEmptyCellReferences(Boolean param0);
            
    /**
     * <p>id(0x8f8)</p>
     */
    @ComProperty(name = "ListDataValidation", dispId = 0x8f8)
    Boolean getListDataValidation();
            
    /**
     * <p>id(0x8f8)</p>
     */
    @ComProperty(name = "ListDataValidation", dispId = 0x8f8)
    void setListDataValidation(Boolean param0);
            
    /**
     * <p>id(0xa73)</p>
     */
    @ComProperty(name = "InconsistentTableFormula", dispId = 0xa73)
    Boolean getInconsistentTableFormula();
            
    /**
     * <p>id(0xa73)</p>
     */
    @ComProperty(name = "InconsistentTableFormula", dispId = 0xa73)
    void setInconsistentTableFormula(Boolean param0);
            
    
}