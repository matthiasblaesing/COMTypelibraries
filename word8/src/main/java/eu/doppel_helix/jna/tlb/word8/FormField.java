
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020928-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020928-0000-0000-C000-000000000046}")
public interface FormField extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdFieldType getType();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x2)
    void setName(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "EntryMacro", dispId = 0x3)
    String getEntryMacro();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EntryMacro", dispId = 0x3)
    void setEntryMacro(String param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ExitMacro", dispId = 0x4)
    String getExitMacro();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ExitMacro", dispId = 0x4)
    void setExitMacro(String param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "OwnHelp", dispId = 0x5)
    Boolean getOwnHelp();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OwnHelp", dispId = 0x5)
    void setOwnHelp(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "OwnStatus", dispId = 0x6)
    Boolean getOwnStatus();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OwnStatus", dispId = 0x6)
    void setOwnStatus(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HelpText", dispId = 0x7)
    String getHelpText();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HelpText", dispId = 0x7)
    void setHelpText(String param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "StatusText", dispId = 0x8)
    String getStatusText();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusText", dispId = 0x8)
    void setStatusText(String param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x9)
    Boolean getEnabled();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x9)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Result", dispId = 0xa)
    String getResult();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Result", dispId = 0xa)
    void setResult(String param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "TextInput", dispId = 0xb)
    TextInput getTextInput();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "CheckBox", dispId = 0xc)
    CheckBox getCheckBox();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "DropDown", dispId = 0xd)
    DropDown getDropDown();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Next", dispId = 0xe)
    FormField getNext();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Previous", dispId = 0xf)
    FormField getPrevious();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "CalculateOnExit", dispId = 0x10)
    Boolean getCalculateOnExit();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CalculateOnExit", dispId = 0x10)
    void setCalculateOnExit(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Range", dispId = 0x11)
    Range getRange();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x65)
    void Copy();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(39)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x66)
    void Cut();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x67)
    void Delete();
            
    
}