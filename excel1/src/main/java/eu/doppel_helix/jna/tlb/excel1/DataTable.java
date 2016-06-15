
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020843-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020843-0000-0000-C000-000000000046}")
public interface DataTable extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    Boolean getShowLegendKey();
            
    /**
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    void setShowLegendKey(Boolean param0);
            
    /**
     * <p>id(0x687)</p>
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x687)
    Boolean getHasBorderHorizontal();
            
    /**
     * <p>id(0x687)</p>
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x687)
    void setHasBorderHorizontal(Boolean param0);
            
    /**
     * <p>id(0x688)</p>
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x688)
    Boolean getHasBorderVertical();
            
    /**
     * <p>id(0x688)</p>
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x688)
    void setHasBorderVertical(Boolean param0);
            
    /**
     * <p>id(0x689)</p>
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x689)
    Boolean getHasBorderOutline();
            
    /**
     * <p>id(0x689)</p>
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x689)
    void setHasBorderOutline(Boolean param0);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    
}