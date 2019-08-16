
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({86488FB4-9633-4C93-8057-FC1FA7A847AE})</p>
 */
@ComInterface(iid="{86488FB4-9633-4C93-8057-FC1FA7A847AE}")
public interface ChartGroup extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x60020000)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x60020000)
    void setAxisGroup(XlAxisGroup param0);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x60020002)
    Integer getDoughnutHoleSize();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x60020002)
    void setDoughnutHoleSize(Integer param0);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DownBars", dispId = 0x60020004)
    DownBars getDownBars();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DropLines", dispId = 0x60020005)
    DropLines getDropLines();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x60020006)
    Integer getFirstSliceAngle();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x60020006)
    void setFirstSliceAngle(Integer param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "GapWidth", dispId = 0x60020008)
    Integer getGapWidth();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GapWidth", dispId = 0x60020008)
    void setGapWidth(Integer param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "HasDropLines", dispId = 0x6002000a)
    Boolean getHasDropLines();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDropLines", dispId = 0x6002000a)
    void setHasDropLines(Boolean param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x6002000c)
    Boolean getHasHiLoLines();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x6002000c)
    void setHasHiLoLines(Boolean param0);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x6002000e)
    Boolean getHasRadarAxisLabels();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x6002000e)
    void setHasRadarAxisLabels(Boolean param0);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x60020010)
    Boolean getHasSeriesLines();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x60020010)
    void setHasSeriesLines(Boolean param0);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x60020012)
    Boolean getHasUpDownBars();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x60020012)
    void setHasUpDownBars(Boolean param0);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "HiLoLines", dispId = 0x60020014)
    HiLoLines getHiLoLines();
            
    /**
     * <p>id(0x60020015)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Index", dispId = 0x60020015)
    Integer getIndex();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Overlap", dispId = 0x60020016)
    Integer getOverlap();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Overlap", dispId = 0x60020016)
    void setOverlap(Integer param0);
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "RadarAxisLabels", dispId = 0x60020018)
    TickLabels getRadarAxisLabels();
            
    /**
     * <p>id(0x60020019)</p>
     * <p>vtableId(32)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x60020019)
    com.sun.jna.platform.win32.COM.util.IDispatch SeriesCollection(Object Index);
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "SeriesLines", dispId = 0x6002001a)
    SeriesLines getSeriesLines();
            
    /**
     * <p>id(0x6002001b)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "SubType", dispId = 0x6002001b)
    Integer getSubType();
            
    /**
     * <p>id(0x6002001b)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SubType", dispId = 0x6002001b)
    void setSubType(Integer param0);
            
    /**
     * <p>id(0x6002001d)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6002001d)
    Integer getType();
            
    /**
     * <p>id(0x6002001d)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6002001d)
    void setType(Integer param0);
            
    /**
     * <p>id(0x6002001f)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "UpBars", dispId = 0x6002001f)
    UpBars getUpBars();
            
    /**
     * <p>id(0x60020020)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x60020020)
    Boolean getVaryByCategories();
            
    /**
     * <p>id(0x60020020)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x60020020)
    void setVaryByCategories(Boolean param0);
            
    /**
     * <p>id(0x60020022)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x60020022)
    XlSizeRepresents getSizeRepresents();
            
    /**
     * <p>id(0x60020022)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code XlSizeRepresents}
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x60020022)
    void setSizeRepresents(XlSizeRepresents param0);
            
    /**
     * <p>id(0x60020024)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "BubbleScale", dispId = 0x60020024)
    Integer getBubbleScale();
            
    /**
     * <p>id(0x60020024)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BubbleScale", dispId = 0x60020024)
    void setBubbleScale(Integer param0);
            
    /**
     * <p>id(0x60020026)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x60020026)
    Boolean getShowNegativeBubbles();
            
    /**
     * <p>id(0x60020026)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x60020026)
    void setShowNegativeBubbles(Boolean param0);
            
    /**
     * <p>id(0x60020028)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "SplitType", dispId = 0x60020028)
    XlChartSplitType getSplitType();
            
    /**
     * <p>id(0x60020028)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code XlChartSplitType}
     */
    @ComProperty(name = "SplitType", dispId = 0x60020028)
    void setSplitType(XlChartSplitType param0);
            
    /**
     * <p>id(0x6002002a)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "SplitValue", dispId = 0x6002002a)
    Object getSplitValue();
            
    /**
     * <p>id(0x6002002a)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "SplitValue", dispId = 0x6002002a)
    void setSplitValue(Object param0);
            
    /**
     * <p>id(0x6002002c)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x6002002c)
    Integer getSecondPlotSize();
            
    /**
     * <p>id(0x6002002c)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x6002002c)
    void setSecondPlotSize(Integer param0);
            
    /**
     * <p>id(0x6002002e)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Has3DShading", dispId = 0x6002002e)
    Boolean getHas3DShading();
            
    /**
     * <p>id(0x6002002e)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DShading", dispId = 0x6002002e)
    void setHas3DShading(Boolean param0);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(58)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "CategoryCollection", dispId = 0x97)
    com.sun.jna.platform.win32.COM.util.IDispatch CategoryCollection(Object Index);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(59)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "FullCategoryCollection", dispId = 0x98)
    com.sun.jna.platform.win32.COM.util.IDispatch FullCategoryCollection(Object Index);
            
    
}