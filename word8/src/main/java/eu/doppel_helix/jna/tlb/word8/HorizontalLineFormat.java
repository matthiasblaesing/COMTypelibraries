
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209DE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209DE-0000-0000-C000-000000000046}")
public interface HorizontalLineFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "PercentWidth", dispId = 0x2)
    Float getPercentWidth();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PercentWidth", dispId = 0x2)
    void setPercentWidth(Float param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "NoShade", dispId = 0x3)
    Boolean getNoShade();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NoShade", dispId = 0x3)
    void setNoShade(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    WdHorizontalLineAlignment getAlignment();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code WdHorizontalLineAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    void setAlignment(WdHorizontalLineAlignment param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "WidthType", dispId = 0x5)
    WdHorizontalLineWidthType getWidthType();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code WdHorizontalLineWidthType}
     */
    @ComProperty(name = "WidthType", dispId = 0x5)
    void setWidthType(WdHorizontalLineWidthType param0);
            
    
}