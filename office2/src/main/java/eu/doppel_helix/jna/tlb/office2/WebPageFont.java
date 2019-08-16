
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0913-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0913-0000-0000-C000-000000000046}")
public interface WebPageFont extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "ProportionalFont", dispId = 0xa)
    String getProportionalFont();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ProportionalFont", dispId = 0xa)
    void setProportionalFont(String param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ProportionalFontSize", dispId = 0xb)
    Float getProportionalFontSize();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ProportionalFontSize", dispId = 0xb)
    void setProportionalFontSize(Float param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FixedWidthFont", dispId = 0xc)
    String getFixedWidthFont();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FixedWidthFont", dispId = 0xc)
    void setFixedWidthFont(String param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "FixedWidthFontSize", dispId = 0xd)
    Float getFixedWidthFontSize();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "FixedWidthFontSize", dispId = 0xd)
    void setFixedWidthFontSize(Float param0);
            
    
}