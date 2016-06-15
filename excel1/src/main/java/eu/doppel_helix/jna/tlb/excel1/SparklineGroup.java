
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B7-0000-0000-C000-000000000046}")
public interface SparklineGroup extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Sparkline getItem(Object Index);
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    Range getLocation();
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    void setLocation(Range param0);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    String getSourceData();
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    void setSourceData(String param0);
            
    /**
     * <p>id(0xb84)</p>
     */
    @ComProperty(name = "DateRange", dispId = 0xb84)
    String getDateRange();
            
    /**
     * <p>id(0xb84)</p>
     */
    @ComProperty(name = "DateRange", dispId = 0xb84)
    void setDateRange(String param0);
            
    /**
     * <p>id(0xb85)</p>
     */
    @ComMethod(name = "ModifyLocation", dispId = 0xb85)
    void ModifyLocation(Range Location);
            
    /**
     * <p>id(0xb86)</p>
     */
    @ComMethod(name = "ModifySourceData", dispId = 0xb86)
    void ModifySourceData(String SourceData);
            
    /**
     * <p>id(0x62d)</p>
     */
    @ComMethod(name = "Modify", dispId = 0x62d)
    void Modify(Range Location,
            String SourceData);
            
    /**
     * <p>id(0xb87)</p>
     */
    @ComMethod(name = "ModifyDateRange", dispId = 0xb87)
    void ModifyDateRange(String DateRange);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlSparkType getType();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(XlSparkType param0);
            
    /**
     * <p>id(0xb88)</p>
     */
    @ComProperty(name = "SeriesColor", dispId = 0xb88)
    FormatColor getSeriesColor();
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "Points", dispId = 0x46)
    SparkPoints getPoints();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Axes", dispId = 0x17)
    SparkAxes getAxes();
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    XlDisplayBlanksAs getDisplayBlanksAs();
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    void setDisplayBlanksAs(XlDisplayBlanksAs param0);
            
    /**
     * <p>id(0xb89)</p>
     */
    @ComProperty(name = "DisplayHidden", dispId = 0xb89)
    Boolean getDisplayHidden();
            
    /**
     * <p>id(0xb89)</p>
     */
    @ComProperty(name = "DisplayHidden", dispId = 0xb89)
    void setDisplayHidden(Boolean param0);
            
    /**
     * <p>id(0xb8a)</p>
     */
    @ComProperty(name = "LineWeight", dispId = 0xb8a)
    Object getLineWeight();
            
    /**
     * <p>id(0xb8a)</p>
     */
    @ComProperty(name = "LineWeight", dispId = 0xb8a)
    void setLineWeight(Object param0);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    XlSparklineRowCol getPlotBy();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    void setPlotBy(XlSparklineRowCol param0);
            
    
}