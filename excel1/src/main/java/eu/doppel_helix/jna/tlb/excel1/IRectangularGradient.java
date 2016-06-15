
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B0-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B0-0001-0000-C000-000000000046}")
public interface IRectangularGradient extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xac9)</p>
     */
    @ComProperty(name = "ColorStops", dispId = 0xac9)
    com.sun.jna.platform.win32.WinNT.HRESULT getColorStops(VARIANT RHS);
            
    /**
     * <p>id(0xaca)</p>
     */
    @ComProperty(name = "RectangleTop", dispId = 0xaca)
    com.sun.jna.platform.win32.WinNT.HRESULT getRectangleTop(VARIANT RHS);
            
    /**
     * <p>id(0xaca)</p>
     */
    @ComProperty(name = "RectangleTop", dispId = 0xaca)
    com.sun.jna.platform.win32.WinNT.HRESULT setRectangleTop(Double RHS);
            
    /**
     * <p>id(0xacb)</p>
     */
    @ComProperty(name = "RectangleBottom", dispId = 0xacb)
    com.sun.jna.platform.win32.WinNT.HRESULT getRectangleBottom(VARIANT RHS);
            
    /**
     * <p>id(0xacb)</p>
     */
    @ComProperty(name = "RectangleBottom", dispId = 0xacb)
    com.sun.jna.platform.win32.WinNT.HRESULT setRectangleBottom(Double RHS);
            
    /**
     * <p>id(0xacc)</p>
     */
    @ComProperty(name = "RectangleLeft", dispId = 0xacc)
    com.sun.jna.platform.win32.WinNT.HRESULT getRectangleLeft(VARIANT RHS);
            
    /**
     * <p>id(0xacc)</p>
     */
    @ComProperty(name = "RectangleLeft", dispId = 0xacc)
    com.sun.jna.platform.win32.WinNT.HRESULT setRectangleLeft(Double RHS);
            
    /**
     * <p>id(0xacd)</p>
     */
    @ComProperty(name = "RectangleRight", dispId = 0xacd)
    com.sun.jna.platform.win32.WinNT.HRESULT getRectangleRight(VARIANT RHS);
            
    /**
     * <p>id(0xacd)</p>
     */
    @ComProperty(name = "RectangleRight", dispId = 0xacd)
    com.sun.jna.platform.win32.WinNT.HRESULT setRectangleRight(Double RHS);
            
    
}