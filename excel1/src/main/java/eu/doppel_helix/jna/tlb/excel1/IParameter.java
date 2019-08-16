
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002442A-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002442A-0001-0000-C000-000000000046}")
public interface IParameter extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2d2)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlParameterDataType}
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataType(VARIANT RHS);
            
    /**
     * <p>id(0x2d2)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code XlParameterDataType}
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    com.sun.jna.platform.win32.WinNT.HRESULT setDataType(XlParameterDataType RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code XlParameterType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x63f)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PromptString", dispId = 0x63f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPromptString(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x640)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "SourceRange", dispId = 0x640)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceRange(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x641)</p>
     * <p>vtableId(18)</p>
     * @param Type [in] {@code XlParameterType}
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "SetParam", dispId = 0x641)
    com.sun.jna.platform.win32.WinNT.HRESULT SetParam(XlParameterType Type,
            Object Value);
            
    /**
     * <p>id(0x757)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnChange", dispId = 0x757)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnChange(VARIANT RHS);
            
    /**
     * <p>id(0x757)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnChange", dispId = 0x757)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnChange(Boolean RHS);
            
    
}