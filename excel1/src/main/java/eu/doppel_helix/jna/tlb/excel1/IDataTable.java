
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020843-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020843-0001-0000-C000-000000000046}")
public interface IDataTable {
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
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowLegendKey(VARIANT RHS);
            
    /**
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowLegendKey(Boolean RHS);
            
    /**
     * <p>id(0x687)</p>
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x687)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasBorderHorizontal(VARIANT RHS);
            
    /**
     * <p>id(0x687)</p>
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x687)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasBorderHorizontal(Boolean RHS);
            
    /**
     * <p>id(0x688)</p>
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x688)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasBorderVertical(VARIANT RHS);
            
    /**
     * <p>id(0x688)</p>
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x688)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasBorderVertical(Boolean RHS);
            
    /**
     * <p>id(0x689)</p>
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x689)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasBorderOutline(VARIANT RHS);
            
    /**
     * <p>id(0x689)</p>
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x689)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasBorderOutline(Boolean RHS);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoScaleFont(VARIANT RHS);
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoScaleFont(Object RHS);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}