
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
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    void setAxisGroup(XlAxisGroup param0);
            
    /**
     * <p>id(0x466)</p>
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x466)
    Integer getDoughnutHoleSize();
            
    /**
     * <p>id(0x466)</p>
     */
    @ComProperty(name = "DoughnutHoleSize", dispId = 0x466)
    void setDoughnutHoleSize(Integer param0);
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComProperty(name = "DownBars", dispId = 0x8d)
    DownBars getDownBars();
            
    /**
     * <p>id(0x8e)</p>
     */
    @ComProperty(name = "DropLines", dispId = 0x8e)
    DropLines getDropLines();
            
    /**
     * <p>id(0x3f)</p>
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x3f)
    Integer getFirstSliceAngle();
            
    /**
     * <p>id(0x3f)</p>
     */
    @ComProperty(name = "FirstSliceAngle", dispId = 0x3f)
    void setFirstSliceAngle(Integer param0);
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "GapWidth", dispId = 0x33)
    Integer getGapWidth();
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "GapWidth", dispId = 0x33)
    void setGapWidth(Integer param0);
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "HasDropLines", dispId = 0x3d)
    Boolean getHasDropLines();
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "HasDropLines", dispId = 0x3d)
    void setHasDropLines(Boolean param0);
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x3e)
    Boolean getHasHiLoLines();
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "HasHiLoLines", dispId = 0x3e)
    void setHasHiLoLines(Boolean param0);
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x40)
    Boolean getHasRadarAxisLabels();
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "HasRadarAxisLabels", dispId = 0x40)
    void setHasRadarAxisLabels(Boolean param0);
            
    /**
     * <p>id(0x41)</p>
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x41)
    Boolean getHasSeriesLines();
            
    /**
     * <p>id(0x41)</p>
     */
    @ComProperty(name = "HasSeriesLines", dispId = 0x41)
    void setHasSeriesLines(Boolean param0);
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x42)
    Boolean getHasUpDownBars();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "HasUpDownBars", dispId = 0x42)
    void setHasUpDownBars(Boolean param0);
            
    /**
     * <p>id(0x8f)</p>
     */
    @ComProperty(name = "HiLoLines", dispId = 0x8f)
    HiLoLines getHiLoLines();
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "Overlap", dispId = 0x38)
    Integer getOverlap();
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "Overlap", dispId = 0x38)
    void setOverlap(Integer param0);
            
    /**
     * <p>id(0x90)</p>
     */
    @ComProperty(name = "RadarAxisLabels", dispId = 0x90)
    TickLabels getRadarAxisLabels();
            
    /**
     * <p>id(0x44)</p>
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch SeriesCollection(Object Index);
            
    /**
     * <p>id(0x91)</p>
     */
    @ComProperty(name = "SeriesLines", dispId = 0x91)
    SeriesLines getSeriesLines();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    Integer getSubType();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    void setSubType(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(Integer param0);
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComProperty(name = "UpBars", dispId = 0x8c)
    UpBars getUpBars();
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x3c)
    Boolean getVaryByCategories();
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComProperty(name = "VaryByCategories", dispId = 0x3c)
    void setVaryByCategories(Boolean param0);
            
    /**
     * <p>id(0x674)</p>
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x674)
    XlSizeRepresents getSizeRepresents();
            
    /**
     * <p>id(0x674)</p>
     */
    @ComProperty(name = "SizeRepresents", dispId = 0x674)
    void setSizeRepresents(XlSizeRepresents param0);
            
    /**
     * <p>id(0x675)</p>
     */
    @ComProperty(name = "BubbleScale", dispId = 0x675)
    Integer getBubbleScale();
            
    /**
     * <p>id(0x675)</p>
     */
    @ComProperty(name = "BubbleScale", dispId = 0x675)
    void setBubbleScale(Integer param0);
            
    /**
     * <p>id(0x676)</p>
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x676)
    Boolean getShowNegativeBubbles();
            
    /**
     * <p>id(0x676)</p>
     */
    @ComProperty(name = "ShowNegativeBubbles", dispId = 0x676)
    void setShowNegativeBubbles(Boolean param0);
            
    /**
     * <p>id(0x677)</p>
     */
    @ComProperty(name = "SplitType", dispId = 0x677)
    XlChartSplitType getSplitType();
            
    /**
     * <p>id(0x677)</p>
     */
    @ComProperty(name = "SplitType", dispId = 0x677)
    void setSplitType(XlChartSplitType param0);
            
    /**
     * <p>id(0x678)</p>
     */
    @ComProperty(name = "SplitValue", dispId = 0x678)
    Object getSplitValue();
            
    /**
     * <p>id(0x678)</p>
     */
    @ComProperty(name = "SplitValue", dispId = 0x678)
    void setSplitValue(Object param0);
            
    /**
     * <p>id(0x679)</p>
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x679)
    Integer getSecondPlotSize();
            
    /**
     * <p>id(0x679)</p>
     */
    @ComProperty(name = "SecondPlotSize", dispId = 0x679)
    void setSecondPlotSize(Integer param0);
            
    /**
     * <p>id(0x67a)</p>
     */
    @ComProperty(name = "Has3DShading", dispId = 0x67a)
    Boolean getHas3DShading();
            
    /**
     * <p>id(0x67a)</p>
     */
    @ComProperty(name = "Has3DShading", dispId = 0x67a)
    void setHas3DShading(Boolean param0);
            
    /**
     * <p>id(0xc09)</p>
     */
    @ComMethod(name = "FullCategoryCollection", dispId = 0xc09)
    com.sun.jna.platform.win32.COM.util.IDispatch FullCategoryCollection(Object Index);
            
    /**
     * <p>id(0xc0a)</p>
     */
    @ComMethod(name = "CategoryCollection", dispId = 0xc0a)
    com.sun.jna.platform.win32.COM.util.IDispatch CategoryCollection(Object Index);
            
    
}