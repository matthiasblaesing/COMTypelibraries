
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020895-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020895-0001-0000-C000-000000000046}")
public interface IPane {
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
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x223)</p>
     */
    @ComMethod(name = "LargeScroll", dispId = 0x223)
    com.sun.jna.platform.win32.WinNT.HRESULT LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft,
            VARIANT RHS);
            
    /**
     * <p>id(0x28e)</p>
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollColumn(VARIANT RHS);
            
    /**
     * <p>id(0x28e)</p>
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollColumn(Integer RHS);
            
    /**
     * <p>id(0x28f)</p>
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollRow(VARIANT RHS);
            
    /**
     * <p>id(0x28f)</p>
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollRow(Integer RHS);
            
    /**
     * <p>id(0x224)</p>
     */
    @ComMethod(name = "SmallScroll", dispId = 0x224)
    com.sun.jna.platform.win32.WinNT.HRESULT SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft,
            VARIANT RHS);
            
    /**
     * <p>id(0x45e)</p>
     */
    @ComProperty(name = "VisibleRange", dispId = 0x45e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleRange(VARIANT RHS);
            
    /**
     * <p>id(0x6f5)</p>
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x6f5)
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollIntoView(Integer Left,
            Integer Top,
            Integer Width,
            Integer Height,
            Object Start);
            
    /**
     * <p>id(0x6f0)</p>
     */
    @ComMethod(name = "PointsToScreenPixelsX", dispId = 0x6f0)
    com.sun.jna.platform.win32.WinNT.HRESULT PointsToScreenPixelsX(Integer Points,
            VARIANT RHS);
            
    /**
     * <p>id(0x6f1)</p>
     */
    @ComMethod(name = "PointsToScreenPixelsY", dispId = 0x6f1)
    com.sun.jna.platform.win32.WinNT.HRESULT PointsToScreenPixelsY(Integer Points,
            VARIANT RHS);
            
    
}