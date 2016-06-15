
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A2-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A2-0001-0000-C000-000000000046}")
public interface IPage extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3fa)</p>
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftHeader(VARIANT RHS);
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterHeader(VARIANT RHS);
            
    /**
     * <p>id(0x402)</p>
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightHeader(VARIANT RHS);
            
    /**
     * <p>id(0x3f9)</p>
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeftFooter(VARIANT RHS);
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCenterFooter(VARIANT RHS);
            
    /**
     * <p>id(0x401)</p>
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    com.sun.jna.platform.win32.WinNT.HRESULT getRightFooter(VARIANT RHS);
            
    
}