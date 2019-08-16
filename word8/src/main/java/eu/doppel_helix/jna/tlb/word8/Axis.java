
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({7EBC66BD-F788-42C3-91F4-E8C841A69005})</p>
 */
@ComInterface(iid="{7EBC66BD-F788-42C3-91F4-E8C841A69005}")
public interface Axis extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x60020000)
    Boolean getAxisBetweenCategories();
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x60020000)
    void setAxisBetweenCategories(Boolean param0);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x60020002)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AxisTitle", dispId = 0x60020003)
    AxisTitle getAxisTitle();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x60020004)
    Object getCategoryNames();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CategoryNames", dispId = 0x60020004)
    void setCategoryNames(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x60020006)
    XlAxisCrosses getCrosses();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code XlAxisCrosses}
     */
    @ComProperty(name = "Crosses", dispId = 0x60020006)
    void setCrosses(XlAxisCrosses param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x60020008)
    Double getCrossesAt();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "CrossesAt", dispId = 0x60020008)
    void setCrossesAt(Double param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6002000a)
    Object Delete();
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x6002000b)
    Boolean getHasMajorGridlines();
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x6002000b)
    void setHasMajorGridlines(Boolean param0);
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x6002000d)
    Boolean getHasMinorGridlines();
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x6002000d)
    void setHasMinorGridlines(Boolean param0);
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x6002000f)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasTitle", dispId = 0x6002000f)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MajorGridlines", dispId = 0x60020011)
    Gridlines getMajorGridlines();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x60020012)
    XlTickMark getMajorTickMark();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code XlTickMark}
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x60020012)
    void setMajorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x60020014)
    Double getMajorUnit();
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MajorUnit", dispId = 0x60020014)
    void setMajorUnit(Double param0);
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0x60020016)
    Double getLogBase();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "LogBase", dispId = 0x60020016)
    void setLogBase(Double param0);
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0x60020018)
    Boolean getTickLabelSpacingIsAuto();
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0x60020018)
    void setTickLabelSpacingIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x6002001a)
    Boolean getMajorUnitIsAuto();
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x6002001a)
    void setMajorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002001c)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x6002001c)
    Double getMaximumScale();
            
    /**
     * <p>id(0x6002001c)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MaximumScale", dispId = 0x6002001c)
    void setMaximumScale(Double param0);
            
    /**
     * <p>id(0x6002001e)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x6002001e)
    Boolean getMaximumScaleIsAuto();
            
    /**
     * <p>id(0x6002001e)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x6002001e)
    void setMaximumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x60020020)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x60020020)
    Double getMinimumScale();
            
    /**
     * <p>id(0x60020020)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MinimumScale", dispId = 0x60020020)
    void setMinimumScale(Double param0);
            
    /**
     * <p>id(0x60020022)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x60020022)
    Boolean getMinimumScaleIsAuto();
            
    /**
     * <p>id(0x60020022)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x60020022)
    void setMinimumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x60020024)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "MinorGridlines", dispId = 0x60020024)
    Gridlines getMinorGridlines();
            
    /**
     * <p>id(0x60020025)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x60020025)
    XlTickMark getMinorTickMark();
            
    /**
     * <p>id(0x60020025)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code XlTickMark}
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x60020025)
    void setMinorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x60020027)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x60020027)
    Double getMinorUnit();
            
    /**
     * <p>id(0x60020027)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MinorUnit", dispId = 0x60020027)
    void setMinorUnit(Double param0);
            
    /**
     * <p>id(0x60020029)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x60020029)
    Boolean getMinorUnitIsAuto();
            
    /**
     * <p>id(0x60020029)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x60020029)
    void setMinorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002002b)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x6002002b)
    Boolean getReversePlotOrder();
            
    /**
     * <p>id(0x6002002b)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x6002002b)
    void setReversePlotOrder(Boolean param0);
            
    /**
     * <p>id(0x6002002d)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x6002002d)
    XlScaleType getScaleType();
            
    /**
     * <p>id(0x6002002d)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code XlScaleType}
     */
    @ComProperty(name = "ScaleType", dispId = 0x6002002d)
    void setScaleType(XlScaleType param0);
            
    /**
     * <p>id(0x6002002f)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6002002f)
    Object Select();
            
    /**
     * <p>id(0x60020030)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x60020030)
    XlTickLabelPosition getTickLabelPosition();
            
    /**
     * <p>id(0x60020030)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code XlTickLabelPosition}
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x60020030)
    void setTickLabelPosition(XlTickLabelPosition param0);
            
    /**
     * <p>id(0x60020032)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "TickLabels", dispId = 0x60020032)
    TickLabels getTickLabels();
            
    /**
     * <p>id(0x60020033)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x60020033)
    Integer getTickLabelSpacing();
            
    /**
     * <p>id(0x60020033)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x60020033)
    void setTickLabelSpacing(Integer param0);
            
    /**
     * <p>id(0x60020035)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x60020035)
    Integer getTickMarkSpacing();
            
    /**
     * <p>id(0x60020035)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x60020035)
    void setTickMarkSpacing(Integer param0);
            
    /**
     * <p>id(0x60020037)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020037)
    XlAxisType getType();
            
    /**
     * <p>id(0x60020037)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code XlAxisType}
     */
    @ComProperty(name = "Type", dispId = 0x60020037)
    void setType(XlAxisType param0);
            
    /**
     * <p>id(0x60020039)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x60020039)
    XlTimeUnit getBaseUnit();
            
    /**
     * <p>id(0x60020039)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "BaseUnit", dispId = 0x60020039)
    void setBaseUnit(XlTimeUnit param0);
            
    /**
     * <p>id(0x6002003b)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x6002003b)
    Boolean getBaseUnitIsAuto();
            
    /**
     * <p>id(0x6002003b)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x6002003b)
    void setBaseUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x6002003d)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x6002003d)
    XlTimeUnit getMajorUnitScale();
            
    /**
     * <p>id(0x6002003d)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x6002003d)
    void setMajorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x6002003f)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x6002003f)
    XlTimeUnit getMinorUnitScale();
            
    /**
     * <p>id(0x6002003f)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x6002003f)
    void setMinorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x60020041)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x60020041)
    XlCategoryType getCategoryType();
            
    /**
     * <p>id(0x60020041)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code XlCategoryType}
     */
    @ComProperty(name = "CategoryType", dispId = 0x60020041)
    void setCategoryType(XlCategoryType param0);
            
    /**
     * <p>id(0x60020043)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60020043)
    Double getLeft();
            
    /**
     * <p>id(0x60020044)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Top", dispId = 0x60020044)
    Double getTop();
            
    /**
     * <p>id(0x60020045)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "Width", dispId = 0x60020045)
    Double getWidth();
            
    /**
     * <p>id(0x60020046)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "Height", dispId = 0x60020046)
    Double getHeight();
            
    /**
     * <p>id(0x60020047)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x60020047)
    XlDisplayUnit getDisplayUnit();
            
    /**
     * <p>id(0x60020047)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code XlDisplayUnit}
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x60020047)
    void setDisplayUnit(XlDisplayUnit param0);
            
    /**
     * <p>id(0x60020049)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x60020049)
    Double getDisplayUnitCustom();
            
    /**
     * <p>id(0x60020049)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x60020049)
    void setDisplayUnitCustom(Double param0);
            
    /**
     * <p>id(0x6002004b)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x6002004b)
    Boolean getHasDisplayUnitLabel();
            
    /**
     * <p>id(0x6002004b)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x6002004b)
    void setHasDisplayUnitLabel(Boolean param0);
            
    /**
     * <p>id(0x6002004d)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "DisplayUnitLabel", dispId = 0x6002004d)
    DisplayUnitLabel getDisplayUnitLabel();
            
    /**
     * <p>id(0x6002004e)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "Border", dispId = 0x6002004e)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x60020050)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020050)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}