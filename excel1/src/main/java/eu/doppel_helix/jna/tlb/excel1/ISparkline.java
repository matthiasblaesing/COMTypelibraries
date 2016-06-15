
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B9-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B9-0001-0000-C000-000000000046}")
public interface ISparkline extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocation(VARIANT RHS);
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocation(Range RHS);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceData(VARIANT RHS);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceData(String RHS);
            
    /**
     * <p>id(0xb85)</p>
     */
    @ComMethod(name = "ModifyLocation", dispId = 0xb85)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyLocation(Range Range);
            
    /**
     * <p>id(0xb86)</p>
     */
    @ComMethod(name = "ModifySourceData", dispId = 0xb86)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifySourceData(String Formula);
            
    
}