
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B1-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B1-0001-0000-C000-000000000046}")
public interface IMultiThreadedCalculation extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x258)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0xace)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code XlThreadMode}
     */
    @ComProperty(name = "ThreadMode", dispId = 0xace)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreadMode(VARIANT RHS);
            
    /**
     * <p>id(0xace)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code XlThreadMode}
     */
    @ComProperty(name = "ThreadMode", dispId = 0xace)
    com.sun.jna.platform.win32.WinNT.HRESULT setThreadMode(XlThreadMode RHS);
            
    /**
     * <p>id(0xacf)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ThreadCount", dispId = 0xacf)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreadCount(VARIANT RHS);
            
    /**
     * <p>id(0xacf)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ThreadCount", dispId = 0xacf)
    com.sun.jna.platform.win32.WinNT.HRESULT setThreadCount(Integer RHS);
            
    
}