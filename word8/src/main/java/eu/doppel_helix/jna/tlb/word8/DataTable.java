
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DCE9F2C4-4C02-43BA-840E-B4276550EF79})</p>
 */
@ComInterface(iid="{DCE9F2C4-4C02-43BA-840E-B4276550EF79}")
public interface DataTable extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0x60020000)
    Boolean getShowLegendKey();
            
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0x60020000)
    void setShowLegendKey(Boolean param0);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x60020002)
    Boolean getHasBorderHorizontal();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "HasBorderHorizontal", dispId = 0x60020002)
    void setHasBorderHorizontal(Boolean param0);
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x60020004)
    Boolean getHasBorderVertical();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "HasBorderVertical", dispId = 0x60020004)
    void setHasBorderVertical(Boolean param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x60020006)
    Boolean getHasBorderOutline();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "HasBorderOutline", dispId = 0x60020006)
    void setHasBorderOutline(Boolean param0);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "Border", dispId = 0x60020008)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x60020009)</p>
     */
    @ComProperty(name = "Font", dispId = 0x60020009)
    ChartFont getFont();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6002000a)
    void Select();
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6002000b)
    void Delete();
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6002000c)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x6002000d)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x6002000d)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "Format", dispId = 0x6002000f)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    
}