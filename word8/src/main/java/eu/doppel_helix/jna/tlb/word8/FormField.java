
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020928-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020928-0000-0000-C000-000000000046}")
public interface FormField {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdFieldType getType();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    void setName(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "EntryMacro", dispId = 0x3)
    String getEntryMacro();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "EntryMacro", dispId = 0x3)
    void setEntryMacro(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ExitMacro", dispId = 0x4)
    String getExitMacro();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ExitMacro", dispId = 0x4)
    void setExitMacro(String param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "OwnHelp", dispId = 0x5)
    Boolean getOwnHelp();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "OwnHelp", dispId = 0x5)
    void setOwnHelp(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "OwnStatus", dispId = 0x6)
    Boolean getOwnStatus();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "OwnStatus", dispId = 0x6)
    void setOwnStatus(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "HelpText", dispId = 0x7)
    String getHelpText();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "HelpText", dispId = 0x7)
    void setHelpText(String param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "StatusText", dispId = 0x8)
    String getStatusText();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "StatusText", dispId = 0x8)
    void setStatusText(String param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x9)
    Boolean getEnabled();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x9)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Result", dispId = 0xa)
    String getResult();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Result", dispId = 0xa)
    void setResult(String param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "TextInput", dispId = 0xb)
    TextInput getTextInput();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "CheckBox", dispId = 0xc)
    CheckBox getCheckBox();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DropDown", dispId = 0xd)
    DropDown getDropDown();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "Next", dispId = 0xe)
    FormField getNext();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Previous", dispId = 0xf)
    FormField getPrevious();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "CalculateOnExit", dispId = 0x10)
    Boolean getCalculateOnExit();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "CalculateOnExit", dispId = 0x10)
    void setCalculateOnExit(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Range", dispId = 0x11)
    Range getRange();
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x65)
    void Copy();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x66)
    void Cut();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x67)
    void Delete();
            
    
}