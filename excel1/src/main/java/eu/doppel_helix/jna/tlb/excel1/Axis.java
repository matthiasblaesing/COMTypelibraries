
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020848-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020848-0000-0000-C000-000000000046}")
public interface Axis {
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
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    Boolean getAxisBetweenCategories();
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    void setAxisBetweenCategories(Boolean param0);
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x52)</p>
     */
    @ComProperty(name = "AxisTitle", dispId = 0x52)
    AxisTitle getAxisTitle();
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    Object getCategoryNames();
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    void setCategoryNames(Object param0);
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    XlAxisCrosses getCrosses();
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    void setCrosses(XlAxisCrosses param0);
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    Double getCrossesAt();
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    void setCrossesAt(Double param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    Boolean getHasMajorGridlines();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    void setHasMajorGridlines(Boolean param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    Boolean getHasMinorGridlines();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    void setHasMinorGridlines(Boolean param0);
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x59)</p>
     */
    @ComProperty(name = "MajorGridlines", dispId = 0x59)
    Gridlines getMajorGridlines();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    XlTickMark getMajorTickMark();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    void setMajorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    Double getMajorUnit();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    void setMajorUnit(Double param0);
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    Boolean getMajorUnitIsAuto();
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    void setMajorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    Double getMaximumScale();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    void setMaximumScale(Double param0);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    Boolean getMaximumScaleIsAuto();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    void setMaximumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    Double getMinimumScale();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    void setMinimumScale(Double param0);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    Boolean getMinimumScaleIsAuto();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    void setMinimumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "MinorGridlines", dispId = 0x5a)
    Gridlines getMinorGridlines();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    XlTickMark getMinorTickMark();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    void setMinorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    Double getMinorUnit();
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    void setMinorUnit(Double param0);
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    Boolean getMinorUnitIsAuto();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    void setMinorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    Boolean getReversePlotOrder();
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    void setReversePlotOrder(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    XlScaleType getScaleType();
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    void setScaleType(XlScaleType param0);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    XlTickLabelPosition getTickLabelPosition();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    void setTickLabelPosition(XlTickLabelPosition param0);
            
    /**
     * <p>id(0x5b)</p>
     */
    @ComProperty(name = "TickLabels", dispId = 0x5b)
    TickLabels getTickLabels();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    Integer getTickLabelSpacing();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    void setTickLabelSpacing(Integer param0);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    Integer getTickMarkSpacing();
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    void setTickMarkSpacing(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlAxisType getType();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(XlAxisType param0);
            
    /**
     * <p>id(0x66f)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    XlTimeUnit getBaseUnit();
            
    /**
     * <p>id(0x66f)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    void setBaseUnit(XlTimeUnit param0);
            
    /**
     * <p>id(0x670)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    Boolean getBaseUnitIsAuto();
            
    /**
     * <p>id(0x670)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    void setBaseUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x671)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    XlTimeUnit getMajorUnitScale();
            
    /**
     * <p>id(0x671)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    void setMajorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x672)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    XlTimeUnit getMinorUnitScale();
            
    /**
     * <p>id(0x672)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    void setMinorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x673)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    XlCategoryType getCategoryType();
            
    /**
     * <p>id(0x673)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    void setCategoryType(XlCategoryType param0);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x75e)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    XlDisplayUnit getDisplayUnit();
            
    /**
     * <p>id(0x75e)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    void setDisplayUnit(XlDisplayUnit param0);
            
    /**
     * <p>id(0x75f)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    Double getDisplayUnitCustom();
            
    /**
     * <p>id(0x75f)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    void setDisplayUnitCustom(Double param0);
            
    /**
     * <p>id(0x760)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    Boolean getHasDisplayUnitLabel();
            
    /**
     * <p>id(0x760)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    void setHasDisplayUnitLabel(Boolean param0);
            
    /**
     * <p>id(0x761)</p>
     */
    @ComProperty(name = "DisplayUnitLabel", dispId = 0x761)
    DisplayUnitLabel getDisplayUnitLabel();
            
    /**
     * <p>id(0xa56)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    Double getLogBase();
            
    /**
     * <p>id(0xa56)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    void setLogBase(Double param0);
            
    /**
     * <p>id(0xa57)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    Boolean getTickLabelSpacingIsAuto();
            
    /**
     * <p>id(0xa57)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    void setTickLabelSpacingIsAuto(Boolean param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    
}