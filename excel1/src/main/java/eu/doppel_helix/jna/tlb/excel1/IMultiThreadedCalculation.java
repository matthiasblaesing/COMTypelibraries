
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B1-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B1-0001-0000-C000-000000000046}")
public interface IMultiThreadedCalculation {
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
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0xace)</p>
     */
    @ComProperty(name = "ThreadMode", dispId = 0xace)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreadMode(VARIANT RHS);
            
    /**
     * <p>id(0xace)</p>
     */
    @ComProperty(name = "ThreadMode", dispId = 0xace)
    com.sun.jna.platform.win32.WinNT.HRESULT setThreadMode(XlThreadMode RHS);
            
    /**
     * <p>id(0xacf)</p>
     */
    @ComProperty(name = "ThreadCount", dispId = 0xacf)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreadCount(VARIANT RHS);
            
    /**
     * <p>id(0xacf)</p>
     */
    @ComProperty(name = "ThreadCount", dispId = 0xacf)
    com.sun.jna.platform.win32.WinNT.HRESULT setThreadCount(Integer RHS);
            
    
}