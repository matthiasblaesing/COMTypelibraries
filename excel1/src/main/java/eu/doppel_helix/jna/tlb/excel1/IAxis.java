
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020848-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020848-0001-0000-C000-000000000046}")
public interface IAxis {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisBetweenCategories(VARIANT RHS);
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "AxisBetweenCategories", dispId = 0x2d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAxisBetweenCategories(Boolean RHS);
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisGroup(VARIANT RHS);
            
    /**
     * <p>id(0x52)</p>
     */
    @ComProperty(name = "AxisTitle", dispId = 0x52)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisTitle(VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategoryNames(VARIANT RHS);
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "CategoryNames", dispId = 0x9c)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategoryNames(Object RHS);
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    com.sun.jna.platform.win32.WinNT.HRESULT getCrosses(VARIANT RHS);
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "Crosses", dispId = 0x2a)
    com.sun.jna.platform.win32.WinNT.HRESULT setCrosses(XlAxisCrosses RHS);
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCrossesAt(VARIANT RHS);
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "CrossesAt", dispId = 0x2b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCrossesAt(Double RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasMajorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "HasMajorGridlines", dispId = 0x18)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasMajorGridlines(Boolean RHS);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasMinorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "HasMinorGridlines", dispId = 0x19)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasMinorGridlines(Boolean RHS);
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasTitle(VARIANT RHS);
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasTitle(Boolean RHS);
            
    /**
     * <p>id(0x59)</p>
     */
    @ComProperty(name = "MajorGridlines", dispId = 0x59)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorTickMark(VARIANT RHS);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MajorTickMark", dispId = 0x1a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorTickMark(XlTickMark RHS);
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorUnit(VARIANT RHS);
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "MajorUnit", dispId = 0x25)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorUnit(Double RHS);
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorUnitIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "MajorUnitIsAuto", dispId = 0x26)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorUnitIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaximumScale(VARIANT RHS);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "MaximumScale", dispId = 0x23)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaximumScale(Double RHS);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaximumScaleIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "MaximumScaleIsAuto", dispId = 0x24)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaximumScaleIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinimumScale(VARIANT RHS);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "MinimumScale", dispId = 0x21)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinimumScale(Double RHS);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinimumScaleIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "MinimumScaleIsAuto", dispId = 0x22)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinimumScaleIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "MinorGridlines", dispId = 0x5a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorTickMark(VARIANT RHS);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "MinorTickMark", dispId = 0x1b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorTickMark(XlTickMark RHS);
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorUnit(VARIANT RHS);
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "MinorUnit", dispId = 0x27)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorUnit(Double RHS);
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorUnitIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "MinorUnitIsAuto", dispId = 0x28)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorUnitIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    com.sun.jna.platform.win32.WinNT.HRESULT getReversePlotOrder(VARIANT RHS);
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "ReversePlotOrder", dispId = 0x2c)
    com.sun.jna.platform.win32.WinNT.HRESULT setReversePlotOrder(Boolean RHS);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    com.sun.jna.platform.win32.WinNT.HRESULT getScaleType(VARIANT RHS);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "ScaleType", dispId = 0x29)
    com.sun.jna.platform.win32.WinNT.HRESULT setScaleType(XlScaleType RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabelPosition(VARIANT RHS);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "TickLabelPosition", dispId = 0x1c)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickLabelPosition(XlTickLabelPosition RHS);
            
    /**
     * <p>id(0x5b)</p>
     */
    @ComProperty(name = "TickLabels", dispId = 0x5b)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabels(VARIANT RHS);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabelSpacing(VARIANT RHS);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "TickLabelSpacing", dispId = 0x1d)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickLabelSpacing(Integer RHS);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickMarkSpacing(VARIANT RHS);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "TickMarkSpacing", dispId = 0x1f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickMarkSpacing(Integer RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(XlAxisType RHS);
            
    /**
     * <p>id(0x66f)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseUnit(VARIANT RHS);
            
    /**
     * <p>id(0x66f)</p>
     */
    @ComProperty(name = "BaseUnit", dispId = 0x66f)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseUnit(XlTimeUnit RHS);
            
    /**
     * <p>id(0x670)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseUnitIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0x670)</p>
     */
    @ComProperty(name = "BaseUnitIsAuto", dispId = 0x670)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseUnitIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x671)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    com.sun.jna.platform.win32.WinNT.HRESULT getMajorUnitScale(VARIANT RHS);
            
    /**
     * <p>id(0x671)</p>
     */
    @ComProperty(name = "MajorUnitScale", dispId = 0x671)
    com.sun.jna.platform.win32.WinNT.HRESULT setMajorUnitScale(XlTimeUnit RHS);
            
    /**
     * <p>id(0x672)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinorUnitScale(VARIANT RHS);
            
    /**
     * <p>id(0x672)</p>
     */
    @ComProperty(name = "MinorUnitScale", dispId = 0x672)
    com.sun.jna.platform.win32.WinNT.HRESULT setMinorUnitScale(XlTimeUnit RHS);
            
    /**
     * <p>id(0x673)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategoryType(VARIANT RHS);
            
    /**
     * <p>id(0x673)</p>
     */
    @ComProperty(name = "CategoryType", dispId = 0x673)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategoryType(XlCategoryType RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x75e)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayUnit(VARIANT RHS);
            
    /**
     * <p>id(0x75e)</p>
     */
    @ComProperty(name = "DisplayUnit", dispId = 0x75e)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayUnit(XlDisplayUnit RHS);
            
    /**
     * <p>id(0x75f)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayUnitCustom(VARIANT RHS);
            
    /**
     * <p>id(0x75f)</p>
     */
    @ComProperty(name = "DisplayUnitCustom", dispId = 0x75f)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayUnitCustom(Double RHS);
            
    /**
     * <p>id(0x760)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDisplayUnitLabel(VARIANT RHS);
            
    /**
     * <p>id(0x760)</p>
     */
    @ComProperty(name = "HasDisplayUnitLabel", dispId = 0x760)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasDisplayUnitLabel(Boolean RHS);
            
    /**
     * <p>id(0x761)</p>
     */
    @ComProperty(name = "DisplayUnitLabel", dispId = 0x761)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayUnitLabel(VARIANT RHS);
            
    /**
     * <p>id(0xa56)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    com.sun.jna.platform.win32.WinNT.HRESULT getLogBase(VARIANT RHS);
            
    /**
     * <p>id(0xa56)</p>
     */
    @ComProperty(name = "LogBase", dispId = 0xa56)
    com.sun.jna.platform.win32.WinNT.HRESULT setLogBase(Double RHS);
            
    /**
     * <p>id(0xa57)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    com.sun.jna.platform.win32.WinNT.HRESULT getTickLabelSpacingIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0xa57)</p>
     */
    @ComProperty(name = "TickLabelSpacingIsAuto", dispId = 0xa57)
    com.sun.jna.platform.win32.WinNT.HRESULT setTickLabelSpacingIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}