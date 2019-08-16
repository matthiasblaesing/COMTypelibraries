
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020848-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020848-0001-0000-C000-000000000046}")
public interface IAxis extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisBetweenCategories(VARIANT RHS);
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAxisBetweenCategories(Boolean RHS);
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisGroup(VARIANT RHS);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code AxisTitle}
     */
    @ComProperty(name = "AxisTitle", dispId = 0x52)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisTitle(VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategoryNames(VARIANT RHS);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategoryNames(Object RHS);
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code XlAxisCrosses}
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    com.sun.jna.platform.win32.WinNT.HRESULT getCrosses(VARIANT RHS);
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code XlAxisCrosses}
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    com.sun.jna.platform.win32.WinNT.HRESULT setCrosses(XlAxisCrosses RHS);
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCrossesAt(VARIANT RHS);
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCrossesAt(Double RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasMajorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasMajorGridlines(Boolean RHS);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasMinorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasMinorGridlines(Boolean RHS);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasTitle(VARIANT RHS);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasTitle(Boolean RHS);
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Gridlines}
     */
    @ComProperty(name = "MajorGridlines", dispId = 0x59)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code XlTickMark}
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorTickMark(VARIANT RHS);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code XlTickMark}
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorTickMark(XlTickMark RHS);
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorUnit(VARIANT RHS);
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorUnit(Double RHS);
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorUnitIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(34)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorUnitIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaximumScale(VARIANT RHS);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(36)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaximumScale(Double RHS);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaximumScaleIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(38)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaximumScaleIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinimumScale(VARIANT RHS);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinimumScale(Double RHS);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinimumScaleIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinimumScaleIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Gridlines}
     */
    @ComProperty(name = "MinorGridlines", dispId = 0x5a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code XlTickMark}
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorTickMark(VARIANT RHS);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code XlTickMark}
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorTickMark(XlTickMark RHS);
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorUnit(VARIANT RHS);
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorUnit(Double RHS);
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorUnitIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorUnitIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    com.sun.jna.platform.win32.WinNT.HRESULT getReversePlotOrder(VARIANT RHS);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    com.sun.jna.platform.win32.WinNT.HRESULT setReversePlotOrder(Boolean RHS);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code XlScaleType}
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    com.sun.jna.platform.win32.WinNT.HRESULT getScaleType(VARIANT RHS);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(53)</p>
     * @param RHS [in] {@code XlScaleType}
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    com.sun.jna.platform.win32.WinNT.HRESULT setScaleType(XlScaleType RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code XlTickLabelPosition}
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabelPosition(VARIANT RHS);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(56)</p>
     * @param RHS [in] {@code XlTickLabelPosition}
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickLabelPosition(XlTickLabelPosition RHS);
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code TickLabels}
     */
    @ComProperty(name = "TickLabels", dispId = 0x5b)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabels(VARIANT RHS);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabelSpacing(VARIANT RHS);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(59)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickLabelSpacing(Integer RHS);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(60)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickMarkSpacing(VARIANT RHS);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(61)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickMarkSpacing(Integer RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code XlAxisType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(63)</p>
     * @param RHS [in] {@code XlAxisType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(XlAxisType RHS);
            
    /**
     * <p>id(0x66f)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code XlTimeUnit}
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseUnit(VARIANT RHS);
            
    /**
     * <p>id(0x66f)</p>
     * <p>vtableId(65)</p>
     * @param RHS [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseUnit(XlTimeUnit RHS);
            
    /**
     * <p>id(0x670)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseUnitIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x670)</p>
     * <p>vtableId(67)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseUnitIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x671)</p>
     * <p>vtableId(68)</p>
     * @param RHS [out] {@code XlTimeUnit}
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorUnitScale(VARIANT RHS);
            
    /**
     * <p>id(0x671)</p>
     * <p>vtableId(69)</p>
     * @param RHS [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorUnitScale(XlTimeUnit RHS);
            
    /**
     * <p>id(0x672)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code XlTimeUnit}
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorUnitScale(VARIANT RHS);
            
    /**
     * <p>id(0x672)</p>
     * <p>vtableId(71)</p>
     * @param RHS [in] {@code XlTimeUnit}
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorUnitScale(XlTimeUnit RHS);
            
    /**
     * <p>id(0x673)</p>
     * <p>vtableId(72)</p>
     * @param RHS [out] {@code XlCategoryType}
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategoryType(VARIANT RHS);
            
    /**
     * <p>id(0x673)</p>
     * <p>vtableId(73)</p>
     * @param RHS [in] {@code XlCategoryType}
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategoryType(XlCategoryType RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(74)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(75)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(76)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x75e)</p>
     * <p>vtableId(78)</p>
     * @param RHS [out] {@code XlDisplayUnit}
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayUnit(VARIANT RHS);
            
    /**
     * <p>id(0x75e)</p>
     * <p>vtableId(79)</p>
     * @param RHS [in] {@code XlDisplayUnit}
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayUnit(XlDisplayUnit RHS);
            
    /**
     * <p>id(0x75f)</p>
     * <p>vtableId(80)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayUnitCustom(VARIANT RHS);
            
    /**
     * <p>id(0x75f)</p>
     * <p>vtableId(81)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayUnitCustom(Double RHS);
            
    /**
     * <p>id(0x760)</p>
     * <p>vtableId(82)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDisplayUnitLabel(VARIANT RHS);
            
    /**
     * <p>id(0x760)</p>
     * <p>vtableId(83)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasDisplayUnitLabel(Boolean RHS);
            
    /**
     * <p>id(0x761)</p>
     * <p>vtableId(84)</p>
     * @param RHS [out] {@code DisplayUnitLabel}
     */
    @ComProperty(name = "DisplayUnitLabel", dispId = 0x761)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayUnitLabel(VARIANT RHS);
            
    /**
     * <p>id(0xa56)</p>
     * <p>vtableId(85)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    com.sun.jna.platform.win32.WinNT.HRESULT getLogBase(VARIANT RHS);
            
    /**
     * <p>id(0xa56)</p>
     * <p>vtableId(86)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    com.sun.jna.platform.win32.WinNT.HRESULT setLogBase(Double RHS);
            
    /**
     * <p>id(0xa57)</p>
     * <p>vtableId(87)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabelSpacingIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0xa57)</p>
     * <p>vtableId(88)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickLabelSpacingIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code ChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}