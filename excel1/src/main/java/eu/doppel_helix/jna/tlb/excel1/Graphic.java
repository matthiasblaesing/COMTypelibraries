
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024459-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024459-0000-0000-C000-000000000046}")
public interface Graphic extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x892)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Brightness", dispId = 0x892)
    Float getBrightness();
            
    /**
     * <p>id(0x892)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Brightness", dispId = 0x892)
    void setBrightness(Float param0);
            
    /**
     * <p>id(0x893)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    eu.doppel_helix.jna.tlb.office2.MsoPictureColorType getColorType();
            
    /**
     * <p>id(0x893)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPictureColorType}
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    void setColorType(eu.doppel_helix.jna.tlb.office2.MsoPictureColorType param0);
            
    /**
     * <p>id(0x894)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Contrast", dispId = 0x894)
    Float getContrast();
            
    /**
     * <p>id(0x894)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Contrast", dispId = 0x894)
    void setContrast(Float param0);
            
    /**
     * <p>id(0x895)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CropBottom", dispId = 0x895)
    Float getCropBottom();
            
    /**
     * <p>id(0x895)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropBottom", dispId = 0x895)
    void setCropBottom(Float param0);
            
    /**
     * <p>id(0x896)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "CropLeft", dispId = 0x896)
    Float getCropLeft();
            
    /**
     * <p>id(0x896)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropLeft", dispId = 0x896)
    void setCropLeft(Float param0);
            
    /**
     * <p>id(0x897)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "CropRight", dispId = 0x897)
    Float getCropRight();
            
    /**
     * <p>id(0x897)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropRight", dispId = 0x897)
    void setCropRight(Float param0);
            
    /**
     * <p>id(0x898)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "CropTop", dispId = 0x898)
    Float getCropTop();
            
    /**
     * <p>id(0x898)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropTop", dispId = 0x898)
    void setCropTop(Float param0);
            
    /**
     * <p>id(0x587)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Filename", dispId = 0x587)
    String getFilename();
            
    /**
     * <p>id(0x587)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Filename", dispId = 0x587)
    void setFilename(String param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Float getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0x6a4)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0x6a4)
    void setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Float getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Float param0);
            
    
}