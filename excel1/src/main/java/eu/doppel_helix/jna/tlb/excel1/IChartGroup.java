
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020859-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020859-0001-0000-C000-000000000046}")
public interface IChartGroup extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2f)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisGroup(VARIANT RHS);
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT setAxisGroup(XlAxisGroup RHS);
            
    /**
     * <p>id(0x466)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x466)
    com.sun.jna.platform.win32.WinNT.HRESULT getDoughnutHoleSize(VARIANT RHS);
            
    /**
     * <p>id(0x466)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x466)
    com.sun.jna.platform.win32.WinNT.HRESULT setDoughnutHoleSize(Integer RHS);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code DownBars}
     */
    @ComProperty(name = "DownBars", dispId = 0x8d)
    com.sun.jna.platform.win32.WinNT.HRESULT getDownBars(VARIANT RHS);
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code DropLines}
     */
    @ComProperty(name = "DropLines", dispId = 0x8e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropLines(VARIANT RHS);
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x3f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstSliceAngle(VARIANT RHS);
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x3f)
    com.sun.jna.platform.win32.WinNT.HRESULT setFirstSliceAngle(Integer RHS);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "GapWidth", dispId = 0x33)
    com.sun.jna.platform.win32.WinNT.HRESULT getGapWidth(VARIANT RHS);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "GapWidth", dispId = 0x33)
    com.sun.jna.platform.win32.WinNT.HRESULT setGapWidth(Integer RHS);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasDropLines", dispId = 0x3d)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDropLines(VARIANT RHS);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasDropLines", dispId = 0x3d)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasDropLines(Boolean RHS);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x3e)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasHiLoLines(VARIANT RHS);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x3e)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasHiLoLines(Boolean RHS);
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x40)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasRadarAxisLabels(VARIANT RHS);
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x40)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasRadarAxisLabels(Boolean RHS);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x41)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasSeriesLines(VARIANT RHS);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x41)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasSeriesLines(Boolean RHS);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x42)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasUpDownBars(VARIANT RHS);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x42)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasUpDownBars(Boolean RHS);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code HiLoLines}
     */
    @ComProperty(name = "HiLoLines", dispId = 0x8f)
    com.sun.jna.platform.win32.WinNT.HRESULT getHiLoLines(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Overlap", dispId = 0x38)
    com.sun.jna.platform.win32.WinNT.HRESULT getOverlap(VARIANT RHS);
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Overlap", dispId = 0x38)
    com.sun.jna.platform.win32.WinNT.HRESULT setOverlap(Integer RHS);
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code TickLabels}
     */
    @ComProperty(name = "RadarAxisLabels", dispId = 0x90)
    com.sun.jna.platform.win32.WinNT.HRESULT getRadarAxisLabels(VARIANT RHS);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(35)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x44)
    com.sun.jna.platform.win32.WinNT.HRESULT SeriesCollection(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code SeriesLines}
     */
    @ComProperty(name = "SeriesLines", dispId = 0x91)
    com.sun.jna.platform.win32.WinNT.HRESULT getSeriesLines(VARIANT RHS);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubType(VARIANT RHS);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(38)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubType(Integer RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(Integer RHS);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code UpBars}
     */
    @ComProperty(name = "UpBars", dispId = 0x8c)
    com.sun.jna.platform.win32.WinNT.HRESULT getUpBars(VARIANT RHS);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x3c)
    com.sun.jna.platform.win32.WinNT.HRESULT getVaryByCategories(VARIANT RHS);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(43)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x3c)
    com.sun.jna.platform.win32.WinNT.HRESULT setVaryByCategories(Boolean RHS);
            
    /**
     * <p>id(0x674)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code XlSizeRepresents}
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x674)
    com.sun.jna.platform.win32.WinNT.HRESULT getSizeRepresents(VARIANT RHS);
            
    /**
     * <p>id(0x674)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code XlSizeRepresents}
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x674)
    com.sun.jna.platform.win32.WinNT.HRESULT setSizeRepresents(XlSizeRepresents RHS);
            
    /**
     * <p>id(0x675)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "BubbleScale", dispId = 0x675)
    com.sun.jna.platform.win32.WinNT.HRESULT getBubbleScale(VARIANT RHS);
            
    /**
     * <p>id(0x675)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "BubbleScale", dispId = 0x675)
    com.sun.jna.platform.win32.WinNT.HRESULT setBubbleScale(Integer RHS);
            
    /**
     * <p>id(0x676)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x676)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowNegativeBubbles(VARIANT RHS);
            
    /**
     * <p>id(0x676)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x676)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowNegativeBubbles(Boolean RHS);
            
    /**
     * <p>id(0x677)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code XlChartSplitType}
     */
    @ComProperty(name = "SplitType", dispId = 0x677)
    com.sun.jna.platform.win32.WinNT.HRESULT getSplitType(VARIANT RHS);
            
    /**
     * <p>id(0x677)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code XlChartSplitType}
     */
    @ComProperty(name = "SplitType", dispId = 0x677)
    com.sun.jna.platform.win32.WinNT.HRESULT setSplitType(XlChartSplitType RHS);
            
    /**
     * <p>id(0x678)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "SplitValue", dispId = 0x678)
    com.sun.jna.platform.win32.WinNT.HRESULT getSplitValue(VARIANT RHS);
            
    /**
     * <p>id(0x678)</p>
     * <p>vtableId(53)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "SplitValue", dispId = 0x678)
    com.sun.jna.platform.win32.WinNT.HRESULT setSplitValue(Object RHS);
            
    /**
     * <p>id(0x679)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x679)
    com.sun.jna.platform.win32.WinNT.HRESULT getSecondPlotSize(VARIANT RHS);
            
    /**
     * <p>id(0x679)</p>
     * <p>vtableId(55)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x679)
    com.sun.jna.platform.win32.WinNT.HRESULT setSecondPlotSize(Integer RHS);
            
    /**
     * <p>id(0x67a)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Has3DShading", dispId = 0x67a)
    com.sun.jna.platform.win32.WinNT.HRESULT getHas3DShading(VARIANT RHS);
            
    /**
     * <p>id(0x67a)</p>
     * <p>vtableId(57)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DShading", dispId = 0x67a)
    com.sun.jna.platform.win32.WinNT.HRESULT setHas3DShading(Boolean RHS);
            
    /**
     * <p>id(0xc09)</p>
     * <p>vtableId(58)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "FullCategoryCollection", dispId = 0xc09)
    com.sun.jna.platform.win32.WinNT.HRESULT FullCategoryCollection(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0xc0a)</p>
     * <p>vtableId(59)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "CategoryCollection", dispId = 0xc0a)
    com.sun.jna.platform.win32.WinNT.HRESULT CategoryCollection(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    
}