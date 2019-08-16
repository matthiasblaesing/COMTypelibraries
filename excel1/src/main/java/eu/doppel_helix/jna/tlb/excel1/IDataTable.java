
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020843-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020843-0001-0000-C000-000000000046}")
public interface IDataTable extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xab)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowLegendKey(VARIANT RHS);
            
    /**
     * <p>id(0xab)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowLegendKey(Boolean RHS);
            
    /**
     * <p>id(0x687)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x687)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasBorderHorizontal(VARIANT RHS);
            
    /**
     * <p>id(0x687)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x687)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasBorderHorizontal(Boolean RHS);
            
    /**
     * <p>id(0x688)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x688)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasBorderVertical(VARIANT RHS);
            
    /**
     * <p>id(0x688)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x688)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasBorderVertical(Boolean RHS);
            
    /**
     * <p>id(0x689)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x689)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasBorderOutline(VARIANT RHS);
            
    /**
     * <p>id(0x689)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x689)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasBorderOutline(Boolean RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoScaleFont(VARIANT RHS);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoScaleFont(Object RHS);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code ChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}