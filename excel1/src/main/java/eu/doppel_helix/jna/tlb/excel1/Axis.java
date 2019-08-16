
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020848-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020848-0000-0000-C000-000000000046}")
public interface Axis extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2d)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    Boolean getAxisBetweenCategories();
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    void setAxisBetweenCategories(Boolean param0);
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "AxisTitle", dispId = 0x52)
    AxisTitle getAxisTitle();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    Object getCategoryNames();
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    void setCategoryNames(Object param0);
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    XlAxisCrosses getCrosses();
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code XlAxisCrosses}
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    void setCrosses(XlAxisCrosses param0);
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    Double getCrossesAt();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    void setCrossesAt(Double param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    Boolean getHasMajorGridlines();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    void setHasMajorGridlines(Boolean param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    Boolean getHasMinorGridlines();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    void setHasMinorGridlines(Boolean param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "MajorGridlines", dispId = 0x59)
    Gridlines getMajorGridlines();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    XlTickMark getMajorTickMark();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code XlTickMark}
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    void setMajorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    Double getMajorUnit();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    void setMajorUnit(Double param0);
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    Boolean getMajorUnitIsAuto();
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    void setMajorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    Double getMaximumScale();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    void setMaximumScale(Double param0);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    Boolean getMaximumScaleIsAuto();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    void setMaximumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    Double getMinimumScale();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    void setMinimumScale(Double param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    Boolean getMinimumScaleIsAuto();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    void setMinimumScaleIsAuto(Boolean param0);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "MinorGridlines", dispId = 0x5a)
    Gridlines getMinorGridlines();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    XlTickMark getMinorTickMark();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code XlTickMark}
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    void setMinorTickMark(XlTickMark param0);
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    Double getMinorUnit();
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    void setMinorUnit(Double param0);
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    Boolean getMinorUnitIsAuto();
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    void setMinorUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    Boolean getReversePlotOrder();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    void setReversePlotOrder(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    XlScaleType getScaleType();
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code XlScaleType}
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    void setScaleType(XlScaleType param0);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    XlTickLabelPosition getTickLabelPosition();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code XlTickLabelPosition}
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    void setTickLabelPosition(XlTickLabelPosition param0);
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "TickLabels", dispId = 0x5b)
    TickLabels getTickLabels();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    Integer getTickLabelSpacing();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    void setTickLabelSpacing(Integer param0);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    Integer getTickMarkSpacing();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    void setTickMarkSpacing(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlAxisType getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code XlAxisType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(XlAxisType param0);
            
    /**
     * <p>id(0x66f)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    XlTimeUnit getBaseUnit();
            
    /**
     * <p>id(0x66f)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    void setBaseUnit(XlTimeUnit param0);
            
    /**
     * <p>id(0x670)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    Boolean getBaseUnitIsAuto();
            
    /**
     * <p>id(0x670)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    void setBaseUnitIsAuto(Boolean param0);
            
    /**
     * <p>id(0x671)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    XlTimeUnit getMajorUnitScale();
            
    /**
     * <p>id(0x671)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    void setMajorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x672)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    XlTimeUnit getMinorUnitScale();
            
    /**
     * <p>id(0x672)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    void setMinorUnitScale(XlTimeUnit param0);
            
    /**
     * <p>id(0x673)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    XlCategoryType getCategoryType();
            
    /**
     * <p>id(0x673)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code XlCategoryType}
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    void setCategoryType(XlCategoryType param0);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x75e)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    XlDisplayUnit getDisplayUnit();
            
    /**
     * <p>id(0x75e)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code XlDisplayUnit}
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    void setDisplayUnit(XlDisplayUnit param0);
            
    /**
     * <p>id(0x75f)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    Double getDisplayUnitCustom();
            
    /**
     * <p>id(0x75f)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    void setDisplayUnitCustom(Double param0);
            
    /**
     * <p>id(0x760)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    Boolean getHasDisplayUnitLabel();
            
    /**
     * <p>id(0x760)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    void setHasDisplayUnitLabel(Boolean param0);
            
    /**
     * <p>id(0x761)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "DisplayUnitLabel", dispId = 0x761)
    DisplayUnitLabel getDisplayUnitLabel();
            
    /**
     * <p>id(0xa56)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    Double getLogBase();
            
    /**
     * <p>id(0xa56)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    void setLogBase(Double param0);
            
    /**
     * <p>id(0xa57)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    Boolean getTickLabelSpacingIsAuto();
            
    /**
     * <p>id(0xa57)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    void setTickLabelSpacingIsAuto(Boolean param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    
}