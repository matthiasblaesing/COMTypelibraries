
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020992-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020992-0000-0000-C000-000000000046}")
public interface List {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Range", dispId = 0x1)
    Range getRange();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "ListParagraphs", dispId = 0x2)
    ListParagraphs getListParagraphs();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "SingleListTemplate", dispId = 0x3)
    Boolean getSingleListTemplate();
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "ConvertNumbersToText", dispId = 0x65)
    void ConvertNumbersToText(Object NumberType);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "RemoveNumbers", dispId = 0x66)
    void RemoveNumbers(Object NumberType);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "CountNumberedItems", dispId = 0x67)
    Integer CountNumberedItems(Object NumberType,
            Object Level);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "ApplyListTemplateOld", dispId = 0x68)
    void ApplyListTemplateOld(ListTemplate ListTemplate,
            Object ContinuePreviousList);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "CanContinuePreviousList", dispId = 0x69)
    WdContinue CanContinuePreviousList(ListTemplate ListTemplate);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "ApplyListTemplate", dispId = 0x6a)
    void ApplyListTemplate(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object DefaultListBehavior);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "StyleName", dispId = 0x4)
    String getStyleName();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "ApplyListTemplateWithLevel", dispId = 0x6b)
    void ApplyListTemplateWithLevel(ListTemplate ListTemplate,
            Object ContinuePreviousList,
            Object DefaultListBehavior,
            Object ApplyLevel);
            
    
}