
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024402-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024402-0001-0000-C000-000000000046}")
public interface IVPageBreak extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x58c)</p>
     */
    @ComMethod(name = "DragOff", dispId = 0x58c)
    com.sun.jna.platform.win32.WinNT.HRESULT DragOff(XlDirection Direction,
            Integer RegionIndex);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(XlPageBreak RHS);
            
    /**
     * <p>id(0x58e)</p>
     */
    @ComProperty(name = "Extent", dispId = 0x58e)
    com.sun.jna.platform.win32.WinNT.HRESULT getExtent(VARIANT RHS);
            
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
            
    
}