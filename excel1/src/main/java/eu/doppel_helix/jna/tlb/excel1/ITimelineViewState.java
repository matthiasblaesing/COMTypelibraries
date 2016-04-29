
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E0-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E0-0001-0000-C000-000000000046}")
public interface ITimelineViewState {
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
     * <p>id(0xc43)</p>
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowHeader(VARIANT RHS);
            
    /**
     * <p>id(0xc43)</p>
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowHeader(Boolean RHS);
            
    /**
     * <p>id(0xc44)</p>
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowSelectionLabel(VARIANT RHS);
            
    /**
     * <p>id(0xc44)</p>
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowSelectionLabel(Boolean RHS);
            
    /**
     * <p>id(0xc45)</p>
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTimeLevel(VARIANT RHS);
            
    /**
     * <p>id(0xc45)</p>
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTimeLevel(Boolean RHS);
            
    /**
     * <p>id(0xc46)</p>
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowHorizontalScrollbar(VARIANT RHS);
            
    /**
     * <p>id(0xc46)</p>
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowHorizontalScrollbar(Boolean RHS);
            
    /**
     * <p>id(0xba4)</p>
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    com.sun.jna.platform.win32.WinNT.HRESULT getLevel(VARIANT RHS);
            
    /**
     * <p>id(0xba4)</p>
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    com.sun.jna.platform.win32.WinNT.HRESULT setLevel(XlTimelineLevel RHS);
            
    
}