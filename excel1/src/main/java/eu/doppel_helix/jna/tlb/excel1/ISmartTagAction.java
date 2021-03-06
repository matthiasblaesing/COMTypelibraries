
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002445E-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002445E-0001-0000-C000-000000000046}")
public interface ISmartTagAction extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x8a3)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x8a3)
    com.sun.jna.platform.win32.WinNT.HRESULT Execute();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code XlSmartTagControlType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x8f9)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PresentInPane", dispId = 0x8f9)
    com.sun.jna.platform.win32.WinNT.HRESULT getPresentInPane(VARIANT RHS);
            
    /**
     * <p>id(0x8fa)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x8fa)
    com.sun.jna.platform.win32.WinNT.HRESULT getExpandHelp(VARIANT RHS);
            
    /**
     * <p>id(0x8fa)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ExpandHelp", dispId = 0x8fa)
    com.sun.jna.platform.win32.WinNT.HRESULT setExpandHelp(Boolean RHS);
            
    /**
     * <p>id(0x8fb)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "CheckboxState", dispId = 0x8fb)
    com.sun.jna.platform.win32.WinNT.HRESULT getCheckboxState(VARIANT RHS);
            
    /**
     * <p>id(0x8fb)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "CheckboxState", dispId = 0x8fb)
    com.sun.jna.platform.win32.WinNT.HRESULT setCheckboxState(Boolean RHS);
            
    /**
     * <p>id(0x8fc)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "TextboxText", dispId = 0x8fc)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextboxText(VARIANT RHS);
            
    /**
     * <p>id(0x8fc)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "TextboxText", dispId = 0x8fc)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextboxText(String RHS);
            
    /**
     * <p>id(0x8fd)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ListSelection", dispId = 0x8fd)
    com.sun.jna.platform.win32.WinNT.HRESULT getListSelection(VARIANT RHS);
            
    /**
     * <p>id(0x8fd)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ListSelection", dispId = 0x8fd)
    com.sun.jna.platform.win32.WinNT.HRESULT setListSelection(Integer RHS);
            
    /**
     * <p>id(0x8fe)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x8fe)
    com.sun.jna.platform.win32.WinNT.HRESULT getRadioGroupSelection(VARIANT RHS);
            
    /**
     * <p>id(0x8fe)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "RadioGroupSelection", dispId = 0x8fe)
    com.sun.jna.platform.win32.WinNT.HRESULT setRadioGroupSelection(Integer RHS);
            
    /**
     * <p>id(0x8ff)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "ActiveXControl", dispId = 0x8ff)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveXControl(VARIANT RHS);
            
    
}