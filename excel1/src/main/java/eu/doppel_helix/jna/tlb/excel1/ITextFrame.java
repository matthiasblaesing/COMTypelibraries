
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443D-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443D-0001-0000-C000-000000000046}")
public interface ITextFrame extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6d1)</p>
     */
    @ComProperty(name = "MarginBottom", dispId = 0x6d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginBottom(VARIANT RHS);
            
    /**
     * <p>id(0x6d1)</p>
     */
    @ComProperty(name = "MarginBottom", dispId = 0x6d1)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginBottom(Float RHS);
            
    /**
     * <p>id(0x6d2)</p>
     */
    @ComProperty(name = "MarginLeft", dispId = 0x6d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginLeft(VARIANT RHS);
            
    /**
     * <p>id(0x6d2)</p>
     */
    @ComProperty(name = "MarginLeft", dispId = 0x6d2)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginLeft(Float RHS);
            
    /**
     * <p>id(0x6d3)</p>
     */
    @ComProperty(name = "MarginRight", dispId = 0x6d3)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginRight(VARIANT RHS);
            
    /**
     * <p>id(0x6d3)</p>
     */
    @ComProperty(name = "MarginRight", dispId = 0x6d3)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginRight(Float RHS);
            
    /**
     * <p>id(0x6d4)</p>
     */
    @ComProperty(name = "MarginTop", dispId = 0x6d4)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginTop(VARIANT RHS);
            
    /**
     * <p>id(0x6d4)</p>
     */
    @ComProperty(name = "MarginTop", dispId = 0x6d4)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginTop(Float RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation RHS);
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComMethod(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT Characters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(XlHAlign RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(XlVAlign RHS);
            
    /**
     * <p>id(0x266)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSize(VARIANT RHS);
            
    /**
     * <p>id(0x266)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoSize(Boolean RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x6d5)</p>
     */
    @ComProperty(name = "AutoMargins", dispId = 0x6d5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoMargins(VARIANT RHS);
            
    /**
     * <p>id(0x6d5)</p>
     */
    @ComProperty(name = "AutoMargins", dispId = 0x6d5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoMargins(Boolean RHS);
            
    /**
     * <p>id(0xb6a)</p>
     */
    @ComProperty(name = "VerticalOverflow", dispId = 0xb6a)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalOverflow(VARIANT RHS);
            
    /**
     * <p>id(0xb6a)</p>
     */
    @ComProperty(name = "VerticalOverflow", dispId = 0xb6a)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalOverflow(XlOartVerticalOverflow RHS);
            
    /**
     * <p>id(0xb6b)</p>
     */
    @ComProperty(name = "HorizontalOverflow", dispId = 0xb6b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalOverflow(VARIANT RHS);
            
    /**
     * <p>id(0xb6b)</p>
     */
    @ComProperty(name = "HorizontalOverflow", dispId = 0xb6b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalOverflow(XlOartHorizontalOverflow RHS);
            
    
}