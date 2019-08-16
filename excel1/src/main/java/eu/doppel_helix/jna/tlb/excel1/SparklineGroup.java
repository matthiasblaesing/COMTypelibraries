
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
     * <p>id(0x76)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Sparkline getItem(Object Index);
            
    /**
     * <p>id(0x575)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    Range getLocation();
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    String getSourceData();
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    void setSourceData(String param0);
            
    /**
     * <p>id(0xb84)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DateRange", dispId = 0xb84)
    String getDateRange();
            
    /**
     * <p>id(0xb84)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DateRange", dispId = 0xb84)
    void setDateRange(String param0);
            
    /**
     * <p>id(0xb85)</p>
     * <p>vtableId(19)</p>
     * @param Location [in] {@code Range}
     */
    @ComMethod(name = "ModifyLocation", dispId = 0xb85)
    void ModifyLocation(Range Location);
            
    /**
     * <p>id(0xb86)</p>
     * <p>vtableId(20)</p>
     * @param SourceData [in] {@code String}
     */
    @ComMethod(name = "ModifySourceData", dispId = 0xb86)
    void ModifySourceData(String SourceData);
            
    /**
     * <p>id(0x62d)</p>
     * <p>vtableId(21)</p>
     * @param Location [in] {@code Range}
     * @param SourceData [in] {@code String}
     */
    @ComMethod(name = "Modify", dispId = 0x62d)
    void Modify(Range Location,
            String SourceData);
            
    /**
     * <p>id(0xb87)</p>
     * <p>vtableId(22)</p>
     * @param DateRange [in] {@code String}
     */
    @ComMethod(name = "ModifyDateRange", dispId = 0xb87)
    void ModifyDateRange(String DateRange);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlSparkType getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code XlSparkType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(XlSparkType param0);
            
    /**
     * <p>id(0xb88)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "SeriesColor", dispId = 0xb88)
    FormatColor getSeriesColor();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Points", dispId = 0x46)
    SparkPoints getPoints();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Axes", dispId = 0x17)
    SparkAxes getAxes();
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    XlDisplayBlanksAs getDisplayBlanksAs();
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code XlDisplayBlanksAs}
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    void setDisplayBlanksAs(XlDisplayBlanksAs param0);
            
    /**
     * <p>id(0xb89)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "DisplayHidden", dispId = 0xb89)
    Boolean getDisplayHidden();
            
    /**
     * <p>id(0xb89)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHidden", dispId = 0xb89)
    void setDisplayHidden(Boolean param0);
            
    /**
     * <p>id(0xb8a)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "LineWeight", dispId = 0xb8a)
    Object getLineWeight();
            
    /**
     * <p>id(0xb8a)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "LineWeight", dispId = 0xb8a)
    void setLineWeight(Object param0);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    XlSparklineRowCol getPlotBy();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code XlSparklineRowCol}
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    void setPlotBy(XlSparklineRowCol param0);
            
    
}