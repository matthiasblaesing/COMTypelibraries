
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002445E-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002445E-0001-0000-C000-000000000046}")
public interface ISmartTagAction {
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x8a3)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x8a3)
    com.sun.jna.platform.win32.WinNT.HRESULT Execute();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x8f9)</p>
     */
    @ComProperty(name = "PresentInPane", dispId = 0x8f9)
    com.sun.jna.platform.win32.WinNT.HRESULT getPresentInPane(VARIANT RHS);
            
    /**
     * <p>id(0x8fa)</p>
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x8fa)
    com.sun.jna.platform.win32.WinNT.HRESULT getExpandHelp(VARIANT RHS);
            
    /**
     * <p>id(0x8fa)</p>
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x8fa)
    com.sun.jna.platform.win32.WinNT.HRESULT setExpandHelp(Boolean RHS);
            
    /**
     * <p>id(0x8fb)</p>
     */
    @ComProperty(name = "CheckboxState", dispId = 0x8fb)
    com.sun.jna.platform.win32.WinNT.HRESULT getCheckboxState(VARIANT RHS);
            
    /**
     * <p>id(0x8fb)</p>
     */
    @ComProperty(name = "CheckboxState", dispId = 0x8fb)
    com.sun.jna.platform.win32.WinNT.HRESULT setCheckboxState(Boolean RHS);
            
    /**
     * <p>id(0x8fc)</p>
     */
    @ComProperty(name = "TextboxText", dispId = 0x8fc)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextboxText(VARIANT RHS);
            
    /**
     * <p>id(0x8fc)</p>
     */
    @ComProperty(name = "TextboxText", dispId = 0x8fc)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextboxText(String RHS);
            
    /**
     * <p>id(0x8fd)</p>
     */
    @ComProperty(name = "ListSelection", dispId = 0x8fd)
    com.sun.jna.platform.win32.WinNT.HRESULT getListSelection(VARIANT RHS);
            
    /**
     * <p>id(0x8fd)</p>
     */
    @ComProperty(name = "ListSelection", dispId = 0x8fd)
    com.sun.jna.platform.win32.WinNT.HRESULT setListSelection(Integer RHS);
            
    /**
     * <p>id(0x8fe)</p>
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x8fe)
    com.sun.jna.platform.win32.WinNT.HRESULT getRadioGroupSelection(VARIANT RHS);
            
    /**
     * <p>id(0x8fe)</p>
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x8fe)
    com.sun.jna.platform.win32.WinNT.HRESULT setRadioGroupSelection(Integer RHS);
            
    /**
     * <p>id(0x8ff)</p>
     */
    @ComProperty(name = "ActiveXControl", dispId = 0x8ff)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveXControl(VARIANT RHS);
            
    
}