
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DFB6AA6C-1068-420F-969D-01280FCC1630})</p>
 */
@ComInterface(iid="{DFB6AA6C-1068-420F-969D-01280FCC1630}")
public interface SmartTagAction extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
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
     * <p>id(0x3eb)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x3eb)
    void Execute();
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3ec)
    WdSmartTagControlType getType();
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "PresentInPane", dispId = 0x3ed)
    Boolean getPresentInPane();
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x3ee)
    Boolean getExpandHelp();
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x3ee)
    void setExpandHelp(Boolean param0);
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "CheckboxState", dispId = 0x3ef)
    Boolean getCheckboxState();
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "CheckboxState", dispId = 0x3ef)
    void setCheckboxState(Boolean param0);
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "TextboxText", dispId = 0x3f0)
    String getTextboxText();
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "TextboxText", dispId = 0x3f0)
    void setTextboxText(String param0);
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComProperty(name = "ListSelection", dispId = 0x3f1)
    Integer getListSelection();
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComProperty(name = "ListSelection", dispId = 0x3f1)
    void setListSelection(Integer param0);
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x3f2)
    Integer getRadioGroupSelection();
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x3f2)
    void setRadioGroupSelection(Integer param0);
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "ExpandDocumentFragment", dispId = 0x3f3)
    Boolean getExpandDocumentFragment();
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "ExpandDocumentFragment", dispId = 0x3f3)
    void setExpandDocumentFragment(Boolean param0);
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComProperty(name = "ActiveXControl", dispId = 0x3f4)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveXControl();
            
    
}