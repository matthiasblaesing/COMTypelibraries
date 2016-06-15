
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D1-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D1-0001-0000-C000-000000000046}")
public interface IModelConnection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandText(VARIANT RHS);
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandText(Object RHS);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandType(VARIANT RHS);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandType(XlCmdType RHS);
            
    /**
     * <p>id(0x81a)</p>
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.WinNT.HRESULT getADOConnection(VARIANT RHS);
            
    /**
     * <p>id(0x84d)</p>
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    com.sun.jna.platform.win32.WinNT.HRESULT getCalculatedMembers(VARIANT RHS);
            
    
}