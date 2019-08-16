
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020859-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020859-0000-0000-C000-000000000046}")
public interface ChartGroup extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2f)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    void setAxisGroup(XlAxisGroup param0);
            
    /**
     * <p>id(0x466)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x466)
    Integer getDoughnutHoleSize();
            
    /**
     * <p>id(0x466)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x466)
    void setDoughnutHoleSize(Integer param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "DownBars", dispId = 0x8d)
    DownBars getDownBars();
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "DropLines", dispId = 0x8e)
    DropLines getDropLines();
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x3f)
    Integer getFirstSliceAngle();
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x3f)
    void setFirstSliceAngle(Integer param0);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "GapWidth", dispId = 0x33)
    Integer getGapWidth();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GapWidth", dispId = 0x33)
    void setGapWidth(Integer param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "HasDropLines", dispId = 0x3d)
    Boolean getHasDropLines();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDropLines", dispId = 0x3d)
    void setHasDropLines(Boolean param0);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x3e)
    Boolean getHasHiLoLines();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x3e)
    void setHasHiLoLines(Boolean param0);
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x40)
    Boolean getHasRadarAxisLabels();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x40)
    void setHasRadarAxisLabels(Boolean param0);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x41)
    Boolean getHasSeriesLines();
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x41)
    void setHasSeriesLines(Boolean param0);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x42)
    Boolean getHasUpDownBars();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x42)
    void setHasUpDownBars(Boolean param0);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "HiLoLines", dispId = 0x8f)
    HiLoLines getHiLoLines();
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Overlap", dispId = 0x38)
    Integer getOverlap();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Overlap", dispId = 0x38)
    void setOverlap(Integer param0);
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "RadarAxisLabels", dispId = 0x90)
    TickLabels getRadarAxisLabels();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(35)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch SeriesCollection(Object Index);
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "SeriesLines", dispId = 0x91)
    SeriesLines getSeriesLines();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    Integer getSubType();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    void setSubType(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(Integer param0);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "UpBars", dispId = 0x8c)
    UpBars getUpBars();
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x3c)
    Boolean getVaryByCategories();
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x3c)
    void setVaryByCategories(Boolean param0);
            
    /**
     * <p>id(0x674)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x674)
    XlSizeRepresents getSizeRepresents();
            
    /**
     * <p>id(0x674)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code XlSizeRepresents}
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x674)
    void setSizeRepresents(XlSizeRepresents param0);
            
    /**
     * <p>id(0x675)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "BubbleScale", dispId = 0x675)
    Integer getBubbleScale();
            
    /**
     * <p>id(0x675)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BubbleScale", dispId = 0x675)
    void setBubbleScale(Integer param0);
            
    /**
     * <p>id(0x676)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x676)
    Boolean getShowNegativeBubbles();
            
    /**
     * <p>id(0x676)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x676)
    void setShowNegativeBubbles(Boolean param0);
            
    /**
     * <p>id(0x677)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "SplitType", dispId = 0x677)
    XlChartSplitType getSplitType();
            
    /**
     * <p>id(0x677)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code XlChartSplitType}
     */
    @ComProperty(name = "SplitType", dispId = 0x677)
    void setSplitType(XlChartSplitType param0);
            
    /**
     * <p>id(0x678)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "SplitValue", dispId = 0x678)
    Object getSplitValue();
            
    /**
     * <p>id(0x678)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "SplitValue", dispId = 0x678)
    void setSplitValue(Object param0);
            
    /**
     * <p>id(0x679)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x679)
    Integer getSecondPlotSize();
            
    /**
     * <p>id(0x679)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x679)
    void setSecondPlotSize(Integer param0);
            
    /**
     * <p>id(0x67a)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Has3DShading", dispId = 0x67a)
    Boolean getHas3DShading();
            
    /**
     * <p>id(0x67a)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DShading", dispId = 0x67a)
    void setHas3DShading(Boolean param0);
            
    /**
     * <p>id(0xc09)</p>
     * <p>vtableId(58)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "FullCategoryCollection", dispId = 0xc09)
    com.sun.jna.platform.win32.COM.util.IDispatch FullCategoryCollection(Object Index);
            
    /**
     * <p>id(0xc0a)</p>
     * <p>vtableId(59)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "CategoryCollection", dispId = 0xc0a)
    com.sun.jna.platform.win32.COM.util.IDispatch CategoryCollection(Object Index);
            
    
}