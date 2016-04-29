
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({40810760-068A-4486-BEC9-8EA58C7029F5})</p>
 */
@ComInterface(iid="{40810760-068A-4486-BEC9-8EA58C7029F5}")
public interface Series {
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
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0x9d)</p>
     */
    @ComMethod(name = "DataLabels", dispId = 0x9d)
    com.sun.jna.platform.win32.COM.util.IDispatch DataLabels(Object Index);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x98)</p>
     */
    @ComMethod(name = "ErrorBar", dispId = 0x98)
    Object ErrorBar(XlErrorBarDirection Direction,
            XlErrorBarInclude Include,
            XlErrorBarType Type,
            Object Amount,
            Object MinusValues);
            
    /**
     * <p>id(0x9f)</p>
     */
    @ComProperty(name = "ErrorBars", dispId = 0x9f)
    ErrorBars getErrorBars();
            
    /**
     * <p>id(0xb6)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    Integer getExplosion();
            
    /**
     * <p>id(0xb6)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    void setExplosion(Integer param0);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    String getFormulaLocal();
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    void setFormulaLocal(String param0);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    String getFormulaR1C1();
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    void setFormulaR1C1(String param0);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    String getFormulaR1C1Local();
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    void setFormulaR1C1Local(String param0);
            
    /**
     * <p>id(0x4e)</p>
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    Boolean getHasDataLabels();
            
    /**
     * <p>id(0x4e)</p>
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    void setHasDataLabels(Boolean param0);
            
    /**
     * <p>id(0xa0)</p>
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    Boolean getHasErrorBars();
            
    /**
     * <p>id(0xa0)</p>
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    void setHasErrorBars(Boolean param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    Boolean getInvertIfNegative();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    void setInvertIfNegative(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    Integer getMarkerBackgroundColor();
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    void setMarkerBackgroundColor(Integer param0);
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    XlColorIndex getMarkerBackgroundColorIndex();
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    void setMarkerBackgroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    Integer getMarkerForegroundColor();
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    void setMarkerForegroundColor(Integer param0);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    XlColorIndex getMarkerForegroundColorIndex();
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    void setMarkerForegroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    Integer getMarkerSize();
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    void setMarkerSize(Integer param0);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    XlMarkerStyle getMarkerStyle();
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    void setMarkerStyle(XlMarkerStyle param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    Object Paste();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    XlChartPictureType getPictureType();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    void setPictureType(XlChartPictureType param0);
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    Double getPictureUnit();
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    void setPictureUnit(Double param0);
            
    /**
     * <p>id(0xe4)</p>
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    Integer getPlotOrder();
            
    /**
     * <p>id(0xe4)</p>
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    void setPlotOrder(Integer param0);
            
    /**
     * <p>id(0x46)</p>
     */
    @ComMethod(name = "Points", dispId = 0x46)
    com.sun.jna.platform.win32.COM.util.IDispatch Points(Object Index);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    Boolean getSmooth();
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    void setSmooth(Boolean param0);
            
    /**
     * <p>id(0x9a)</p>
     */
    @ComMethod(name = "Trendlines", dispId = 0x9a)
    com.sun.jna.platform.win32.COM.util.IDispatch Trendlines(Object Index);
            
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
     * <p>id(0x578)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    eu.doppel_helix.jna.tlb.office2.XlChartType getChartType();
            
    /**
     * <p>id(0x578)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    void setChartType(eu.doppel_helix.jna.tlb.office2.XlChartType param0);
            
    /**
     * <p>id(0x579)</p>
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    void ApplyCustomType(eu.doppel_helix.jna.tlb.office2.XlChartType ChartType);
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    Object getValues();
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    void setValues(Object param0);
            
    /**
     * <p>id(0x457)</p>
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    Object getXValues();
            
    /**
     * <p>id(0x457)</p>
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    void setXValues(Object param0);
            
    /**
     * <p>id(0x680)</p>
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    Object getBubbleSizes();
            
    /**
     * <p>id(0x680)</p>
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    void setBubbleSizes(Object param0);
            
    /**
     * <p>id(0x57b)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    XlBarShape getBarShape();
            
    /**
     * <p>id(0x57b)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    void setBarShape(XlBarShape param0);
            
    /**
     * <p>id(0x67b)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    Boolean getApplyPictToSides();
            
    /**
     * <p>id(0x67b)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    void setApplyPictToSides(Boolean param0);
            
    /**
     * <p>id(0x67c)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    Boolean getApplyPictToFront();
            
    /**
     * <p>id(0x67c)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    void setApplyPictToFront(Boolean param0);
            
    /**
     * <p>id(0x67d)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    Boolean getApplyPictToEnd();
            
    /**
     * <p>id(0x67d)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    void setApplyPictToEnd(Boolean param0);
            
    /**
     * <p>id(0x681)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    Boolean getHas3DEffect();
            
    /**
     * <p>id(0x681)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    void setHas3DEffect(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x572)</p>
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    Boolean getHasLeaderLines();
            
    /**
     * <p>id(0x572)</p>
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    void setHasLeaderLines(Boolean param0);
            
    /**
     * <p>id(0x682)</p>
     */
    @ComProperty(name = "LeaderLines", dispId = 0x682)
    LeaderLines getLeaderLines();
            
    /**
     * <p>id(0x782)</p>
     */
    @ComMethod(name = "ApplyDataLabels", dispId = 0x782)
    Object ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
            Object AutoText,
            Object HasLeaderLines,
            Object ShowSeriesName,
            Object ShowCategoryName,
            Object ShowValue,
            Object ShowPercentage,
            Object ShowBubbleSize,
            Object Separator);
            
    /**
     * <p>id(0x60020052)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020052)
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
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    Double getPictureUnit2();
            
    /**
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    void setPictureUnit2(Double param0);
            
    /**
     * <p>id(0x784)</p>
     */
    @ComProperty(name = "PlotColorIndex", dispId = 0x784)
    Integer getPlotColorIndex();
            
    /**
     * <p>id(0xb44)</p>
     */
    @ComProperty(name = "InvertColor", dispId = 0xb44)
    Integer getInvertColor();
            
    /**
     * <p>id(0xb44)</p>
     */
    @ComProperty(name = "InvertColor", dispId = 0xb44)
    void setInvertColor(Integer param0);
            
    /**
     * <p>id(0xb45)</p>
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb45)
    XlColorIndex getInvertColorIndex();
            
    /**
     * <p>id(0xb45)</p>
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb45)
    void setInvertColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0xb47)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    Boolean getIsFiltered();
            
    /**
     * <p>id(0xb47)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    void setIsFiltered(Boolean param0);
            
    
}