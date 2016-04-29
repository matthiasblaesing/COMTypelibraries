
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({7EBC66BD-F788-42C3-91F4-E8C841A69005})</p>
 */
@ComInterface(iid="{7EBC66BD-F788-42C3-91F4-E8C841A69005}")
public interface Axis {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x60020000)
    Boolean getAxisBetweenCategories();
            
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x60020000)
    void setAxisBetweenCategories(Boolean param0);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x60020002)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "AxisTitle", dispId = 0x60020003)
    AxisTitle getAxisTitle();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x60020004)
    Object getCategoryNames();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x60020004)
    void setCategoryNames(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x60020006)
    XlAxisCrosses getCrosses();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x60020006)
    void setCrosses(XlAxisCrosses param0);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x60020008)
    Double getCrossesAt();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x60020008)
    void setCrossesAt(Double param0);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6002000a)
    Object Delete();
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x6002000b)
    Boolean getHasMajorGridlines();
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x6002000b)
    void setHasMajorGridlines(Boolean param0);
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x6002000d)
    Boolean getHasMinorGridlines();
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x6002000d)
    void setHasMinorGridlines(Boolean param0);
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x6002000f)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x6002000f)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x60020011)</p>
     */
    @ComProperty(name = "MajorGridlines", dispId = 0x60020011)
    Gridlines getMajorGridlines();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x60020012)
    XlTickMark getMajorTickMark();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x60020012)
    void setMajorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x60020014)
    Double getMajorUnit();
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x60020014)
    void setMajorUnit(Double param0);
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0x60020016)
    Double getLogBase();
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0x60020016)
    void setLogBase(Double param0);
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0x60020018)
    Boolean getTickLabelSpacingIsAuto();
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0x60020018)
    void setTickLabelSpacingIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002001a)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x6002001a)
    Boolean getMajorUnitIsAuto();
            
    /**
     * <p>id(0x6002001a)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x6002001a)
    void setMajorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002001c)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x6002001c)
    Double getMaximumScale();
            
    /**
     * <p>id(0x6002001c)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x6002001c)
    void setMaximumScale(Double param0);
            
    /**
     * <p>id(0x6002001e)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x6002001e)
    Boolean getMaximumScaleIsAuto();
            
    /**
     * <p>id(0x6002001e)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x6002001e)
    void setMaximumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x60020020)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x60020020)
    Double getMinimumScale();
            
    /**
     * <p>id(0x60020020)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x60020020)
    void setMinimumScale(Double param0);
            
    /**
     * <p>id(0x60020022)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x60020022)
    Boolean getMinimumScaleIsAuto();
            
    /**
     * <p>id(0x60020022)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x60020022)
    void setMinimumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x60020024)</p>
     */
    @ComProperty(name = "MinorGridlines", dispId = 0x60020024)
    Gridlines getMinorGridlines();
            
    /**
     * <p>id(0x60020025)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x60020025)
    XlTickMark getMinorTickMark();
            
    /**
     * <p>id(0x60020025)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x60020025)
    void setMinorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x60020027)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x60020027)
    Double getMinorUnit();
            
    /**
     * <p>id(0x60020027)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x60020027)
    void setMinorUnit(Double param0);
            
    /**
     * <p>id(0x60020029)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x60020029)
    Boolean getMinorUnitIsAuto();
            
    /**
     * <p>id(0x60020029)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x60020029)
    void setMinorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002002b)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x6002002b)
    Boolean getReversePlotOrder();
            
    /**
     * <p>id(0x6002002b)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x6002002b)
    void setReversePlotOrder(Boolean param0);
            
    /**
     * <p>id(0x6002002d)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x6002002d)
    XlScaleType getScaleType();
            
    /**
     * <p>id(0x6002002d)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x6002002d)
    void setScaleType(XlScaleType param0);
            
    /**
     * <p>id(0x6002002f)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6002002f)
    Object Select();
            
    /**
     * <p>id(0x60020030)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x60020030)
    XlTickLabelPosition getTickLabelPosition();
            
    /**
     * <p>id(0x60020030)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x60020030)
    void setTickLabelPosition(XlTickLabelPosition param0);
            
    /**
     * <p>id(0x60020032)</p>
     */
    @ComProperty(name = "TickLabels", dispId = 0x60020032)
    TickLabels getTickLabels();
            
    /**
     * <p>id(0x60020033)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x60020033)
    Integer getTickLabelSpacing();
            
    /**
     * <p>id(0x60020033)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x60020033)
    void setTickLabelSpacing(Integer param0);
            
    /**
     * <p>id(0x60020035)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x60020035)
    Integer getTickMarkSpacing();
            
    /**
     * <p>id(0x60020035)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x60020035)
    void setTickMarkSpacing(Integer param0);
            
    /**
     * <p>id(0x60020037)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020037)
    XlAxisType getType();
            
    /**
     * <p>id(0x60020037)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020037)
    void setType(XlAxisType param0);
            
    /**
     * <p>id(0x60020039)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x60020039)
    XlTimeUnit getBaseUnit();
            
    /**
     * <p>id(0x60020039)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x60020039)
    void setBaseUnit(XlTimeUnit param0);
            
    /**
     * <p>id(0x6002003b)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x6002003b)
    Boolean getBaseUnitIsAuto();
            
    /**
     * <p>id(0x6002003b)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x6002003b)
    void setBaseUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002003d)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x6002003d)
    XlTimeUnit getMajorUnitScale();
            
    /**
     * <p>id(0x6002003d)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x6002003d)
    void setMajorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x6002003f)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x6002003f)
    XlTimeUnit getMinorUnitScale();
            
    /**
     * <p>id(0x6002003f)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x6002003f)
    void setMinorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x60020041)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x60020041)
    XlCategoryType getCategoryType();
            
    /**
     * <p>id(0x60020041)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x60020041)
    void setCategoryType(XlCategoryType param0);
            
    /**
     * <p>id(0x60020043)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60020043)
    Double getLeft();
            
    /**
     * <p>id(0x60020044)</p>
     */
    @ComProperty(name = "Top", dispId = 0x60020044)
    Double getTop();
            
    /**
     * <p>id(0x60020045)</p>
     */
    @ComProperty(name = "Width", dispId = 0x60020045)
    Double getWidth();
            
    /**
     * <p>id(0x60020046)</p>
     */
    @ComProperty(name = "Height", dispId = 0x60020046)
    Double getHeight();
            
    /**
     * <p>id(0x60020047)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x60020047)
    XlDisplayUnit getDisplayUnit();
            
    /**
     * <p>id(0x60020047)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x60020047)
    void setDisplayUnit(XlDisplayUnit param0);
            
    /**
     * <p>id(0x60020049)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x60020049)
    Double getDisplayUnitCustom();
            
    /**
     * <p>id(0x60020049)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x60020049)
    void setDisplayUnitCustom(Double param0);
            
    /**
     * <p>id(0x6002004b)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x6002004b)
    Boolean getHasDisplayUnitLabel();
            
    /**
     * <p>id(0x6002004b)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x6002004b)
    void setHasDisplayUnitLabel(Boolean param0);
            
    /**
     * <p>id(0x6002004d)</p>
     */
    @ComProperty(name = "DisplayUnitLabel", dispId = 0x6002004d)
    DisplayUnitLabel getDisplayUnitLabel();
            
    /**
     * <p>id(0x6002004e)</p>
     */
    @ComProperty(name = "Border", dispId = 0x6002004e)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x60020050)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020050)
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
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}