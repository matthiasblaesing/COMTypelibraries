
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002445E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002445E-0000-0000-C000-000000000046}")
public interface SmartTagAction extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x8a3)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x8a3)
    void Execute();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlSmartTagControlType getType();
            
    /**
     * <p>id(0x8f9)</p>
     */
    @ComProperty(name = "PresentInPane", dispId = 0x8f9)
    Boolean getPresentInPane();
            
    /**
     * <p>id(0x8fa)</p>
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x8fa)
    Boolean getExpandHelp();
            
    /**
     * <p>id(0x8fa)</p>
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x8fa)
    void setExpandHelp(Boolean param0);
            
    /**
     * <p>id(0x8fb)</p>
     */
    @ComProperty(name = "CheckboxState", dispId = 0x8fb)
    Boolean getCheckboxState();
            
    /**
     * <p>id(0x8fb)</p>
     */
    @ComProperty(name = "CheckboxState", dispId = 0x8fb)
    void setCheckboxState(Boolean param0);
            
    /**
     * <p>id(0x8fc)</p>
     */
    @ComProperty(name = "TextboxText", dispId = 0x8fc)
    String getTextboxText();
            
    /**
     * <p>id(0x8fc)</p>
     */
    @ComProperty(name = "TextboxText", dispId = 0x8fc)
    void setTextboxText(String param0);
            
    /**
     * <p>id(0x8fd)</p>
     */
    @ComProperty(name = "ListSelection", dispId = 0x8fd)
    Integer getListSelection();
            
    /**
     * <p>id(0x8fd)</p>
     */
    @ComProperty(name = "ListSelection", dispId = 0x8fd)
    void setListSelection(Integer param0);
            
    /**
     * <p>id(0x8fe)</p>
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x8fe)
    Integer getRadioGroupSelection();
            
    /**
     * <p>id(0x8fe)</p>
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x8fe)
    void setRadioGroupSelection(Integer param0);
            
    /**
     * <p>id(0x8ff)</p>
     */
    @ComProperty(name = "ActiveXControl", dispId = 0x8ff)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveXControl();
            
    
}