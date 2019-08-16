
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024459-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024459-0001-0000-C000-000000000046}")
public interface IGraphic extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x892)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Brightness", dispId = 0x892)
    com.sun.jna.platform.win32.WinNT.HRESULT getBrightness(VARIANT RHS);
            
    /**
     * <p>id(0x892)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Brightness", dispId = 0x892)
    com.sun.jna.platform.win32.WinNT.HRESULT setBrightness(Float RHS);
            
    /**
     * <p>id(0x893)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoPictureColorType}
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    com.sun.jna.platform.win32.WinNT.HRESULT getColorType(VARIANT RHS);
            
    /**
     * <p>id(0x893)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPictureColorType}
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    com.sun.jna.platform.win32.WinNT.HRESULT setColorType(eu.doppel_helix.jna.tlb.office2.MsoPictureColorType RHS);
            
    /**
     * <p>id(0x894)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Contrast", dispId = 0x894)
    com.sun.jna.platform.win32.WinNT.HRESULT getContrast(VARIANT RHS);
            
    /**
     * <p>id(0x894)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Contrast", dispId = 0x894)
    com.sun.jna.platform.win32.WinNT.HRESULT setContrast(Float RHS);
            
    /**
     * <p>id(0x895)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "CropBottom", dispId = 0x895)
    com.sun.jna.platform.win32.WinNT.HRESULT getCropBottom(VARIANT RHS);
            
    /**
     * <p>id(0x895)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "CropBottom", dispId = 0x895)
    com.sun.jna.platform.win32.WinNT.HRESULT setCropBottom(Float RHS);
            
    /**
     * <p>id(0x896)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "CropLeft", dispId = 0x896)
    com.sun.jna.platform.win32.WinNT.HRESULT getCropLeft(VARIANT RHS);
            
    /**
     * <p>id(0x896)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "CropLeft", dispId = 0x896)
    com.sun.jna.platform.win32.WinNT.HRESULT setCropLeft(Float RHS);
            
    /**
     * <p>id(0x897)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "CropRight", dispId = 0x897)
    com.sun.jna.platform.win32.WinNT.HRESULT getCropRight(VARIANT RHS);
            
    /**
     * <p>id(0x897)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "CropRight", dispId = 0x897)
    com.sun.jna.platform.win32.WinNT.HRESULT setCropRight(Float RHS);
            
    /**
     * <p>id(0x898)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "CropTop", dispId = 0x898)
    com.sun.jna.platform.win32.WinNT.HRESULT getCropTop(VARIANT RHS);
            
    /**
     * <p>id(0x898)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "CropTop", dispId = 0x898)
    com.sun.jna.platform.win32.WinNT.HRESULT setCropTop(Float RHS);
            
    /**
     * <p>id(0x587)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Filename", dispId = 0x587)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilename(VARIANT RHS);
            
    /**
     * <p>id(0x587)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Filename", dispId = 0x587)
    com.sun.jna.platform.win32.WinNT.HRESULT setFilename(String RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Float RHS);
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    com.sun.jna.platform.win32.WinNT.HRESULT getLockAspectRatio(VARIANT RHS);
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    com.sun.jna.platform.win32.WinNT.HRESULT setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Float RHS);
            
    
}