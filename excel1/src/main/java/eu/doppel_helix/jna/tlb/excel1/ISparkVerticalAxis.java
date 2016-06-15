
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244BC-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244BC-0001-0000-C000-000000000046}")
public interface ISparkVerticalAxis extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb95)</p>
     */
    @ComProperty(name = "MinScaleType", dispId = 0xb95)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinScaleType(VARIANT RHS);
            
    /**
     * <p>id(0xb95)</p>
     */
    @ComProperty(name = "MinScaleType", dispId = 0xb95)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinScaleType(XlSparkScale RHS);
            
    /**
     * <p>id(0xb96)</p>
     */
    @ComProperty(name = "CustomMinScaleValue", dispId = 0xb96)
    com.sun.jna.platform.win32.WinNT.HRESULT getCustomMinScaleValue(VARIANT RHS);
            
    /**
     * <p>id(0xb96)</p>
     */
    @ComProperty(name = "CustomMinScaleValue", dispId = 0xb96)
    com.sun.jna.platform.win32.WinNT.HRESULT setCustomMinScaleValue(Object RHS);
            
    /**
     * <p>id(0xb97)</p>
     */
    @ComProperty(name = "MaxScaleType", dispId = 0xb97)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaxScaleType(VARIANT RHS);
            
    /**
     * <p>id(0xb97)</p>
     */
    @ComProperty(name = "MaxScaleType", dispId = 0xb97)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaxScaleType(XlSparkScale RHS);
            
    /**
     * <p>id(0xb98)</p>
     */
    @ComProperty(name = "CustomMaxScaleValue", dispId = 0xb98)
    com.sun.jna.platform.win32.WinNT.HRESULT getCustomMaxScaleValue(VARIANT RHS);
            
    /**
     * <p>id(0xb98)</p>
     */
    @ComProperty(name = "CustomMaxScaleValue", dispId = 0xb98)
    com.sun.jna.platform.win32.WinNT.HRESULT setCustomMaxScaleValue(Object RHS);
            
    
}