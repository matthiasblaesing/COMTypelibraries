
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002442A-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002442A-0001-0000-C000-000000000046}")
public interface IParameter {
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
     * <p>id(0x2d2)</p>
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataType(VARIANT RHS);
            
    /**
     * <p>id(0x2d2)</p>
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    com.sun.jna.platform.win32.WinNT.HRESULT setDataType(XlParameterDataType RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x63f)</p>
     */
    @ComProperty(name = "PromptString", dispId = 0x63f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPromptString(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x640)</p>
     */
    @ComProperty(name = "SourceRange", dispId = 0x640)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceRange(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x641)</p>
     */
    @ComMethod(name = "SetParam", dispId = 0x641)
    com.sun.jna.platform.win32.WinNT.HRESULT SetParam(XlParameterType Type,
            Object Value);
            
    /**
     * <p>id(0x757)</p>
     */
    @ComProperty(name = "RefreshOnChange", dispId = 0x757)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnChange(VARIANT RHS);
            
    /**
     * <p>id(0x757)</p>
     */
    @ComProperty(name = "RefreshOnChange", dispId = 0x757)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnChange(Boolean RHS);
            
    
}