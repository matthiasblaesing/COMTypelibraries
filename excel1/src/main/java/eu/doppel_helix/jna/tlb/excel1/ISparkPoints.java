
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B8-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B8-0001-0000-C000-000000000046}")
public interface ISparkPoints extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb8b)</p>
     */
    @ComProperty(name = "Negative", dispId = 0xb8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getNegative(VARIANT RHS);
            
    /**
     * <p>id(0xb8c)</p>
     */
    @ComProperty(name = "Markers", dispId = 0xb8c)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkers(VARIANT RHS);
            
    /**
     * <p>id(0xb8d)</p>
     */
    @ComProperty(name = "Highpoint", dispId = 0xb8d)
    com.sun.jna.platform.win32.WinNT.HRESULT getHighpoint(VARIANT RHS);
            
    /**
     * <p>id(0xb8e)</p>
     */
    @ComProperty(name = "Lowpoint", dispId = 0xb8e)
    com.sun.jna.platform.win32.WinNT.HRESULT getLowpoint(VARIANT RHS);
            
    /**
     * <p>id(0xb8f)</p>
     */
    @ComProperty(name = "Firstpoint", dispId = 0xb8f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstpoint(VARIANT RHS);
            
    /**
     * <p>id(0xb90)</p>
     */
    @ComProperty(name = "Lastpoint", dispId = 0xb90)
    com.sun.jna.platform.win32.WinNT.HRESULT getLastpoint(VARIANT RHS);
            
    
}