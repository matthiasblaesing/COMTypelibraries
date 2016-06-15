
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C170B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C170B-0000-0000-C000-000000000046}")
public interface IMsoSeries extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x97)</p>
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    com.sun.jna.platform.win32.WinNT.HRESULT _ApplyDataLabels(XlDataLabelsType Type,
            Object IMsoLegendKey,
            Object AutoText,
            Object HasLeaderLines,
            VARIANT RHS);
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisGroup(VARIANT RHS);
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT setAxisGroup(XlAxisGroup RHS);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0x9d)</p>
     */
    @ComMethod(name = "DataLabels", dispId = 0x9d)
    com.sun.jna.platform.win32.WinNT.HRESULT DataLabels(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x98)</p>
     */
    @ComMethod(name = "ErrorBar", dispId = 0x98)
    com.sun.jna.platform.win32.WinNT.HRESULT ErrorBar(XlErrorBarDirection Direction,
            XlErrorBarInclude Include,
            XlErrorBarType Type,
            Object Amount,
            Object MinusValues,
            VARIANT RHS);
            
    /**
     * <p>id(0x9f)</p>
     */
    @ComProperty(name = "ErrorBars", dispId = 0x9f)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrorBars(VARIANT RHS);
            
    /**
     * <p>id(0xb6)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    com.sun.jna.platform.win32.WinNT.HRESULT getExplosion(VARIANT RHS);
            
    /**
     * <p>id(0xb6)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    com.sun.jna.platform.win32.WinNT.HRESULT setExplosion(Integer RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLocal(VARIANT RHS);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLocal(String RHS);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1(VARIANT RHS);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1(String RHS);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1Local(VARIANT RHS);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1Local(String RHS);
            
    /**
     * <p>id(0x4e)</p>
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDataLabels(VARIANT RHS);
            
    /**
     * <p>id(0x4e)</p>
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasDataLabels(Boolean RHS);
            
    /**
     * <p>id(0xa0)</p>
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasErrorBars(VARIANT RHS);
            
    /**
     * <p>id(0xa0)</p>
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasErrorBars(Boolean RHS);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertIfNegative(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertIfNegative(Boolean RHS);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColor(Integer RHS);
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColor(Integer RHS);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerSize(VARIANT RHS);
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerSize(Integer RHS);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerStyle(VARIANT RHS);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerStyle(XlMarkerStyle RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    com.sun.jna.platform.win32.WinNT.HRESULT Paste(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureType(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureType(XlChartPictureType RHS);
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit(VARIANT RHS);
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit(Double RHS);
            
    /**
     * <p>id(0xe4)</p>
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlotOrder(VARIANT RHS);
            
    /**
     * <p>id(0xe4)</p>
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlotOrder(Integer RHS);
            
    /**
     * <p>id(0x46)</p>
     */
    @ComMethod(name = "Points", dispId = 0x46)
    com.sun.jna.platform.win32.WinNT.HRESULT Points(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmooth(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSmooth(Boolean RHS);
            
    /**
     * <p>id(0x9a)</p>
     */
    @ComMethod(name = "Trendlines", dispId = 0x9a)
    com.sun.jna.platform.win32.WinNT.HRESULT Trendlines(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(Integer RHS);
            
    /**
     * <p>id(0x578)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    com.sun.jna.platform.win32.WinNT.HRESULT getChartType(VARIANT RHS);
            
    /**
     * <p>id(0x578)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    com.sun.jna.platform.win32.WinNT.HRESULT setChartType(XlChartType RHS);
            
    /**
     * <p>id(0x579)</p>
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyCustomType(XlChartType ChartType);
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    com.sun.jna.platform.win32.WinNT.HRESULT getValues(VARIANT RHS);
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    com.sun.jna.platform.win32.WinNT.HRESULT setValues(Object RHS);
            
    /**
     * <p>id(0x457)</p>
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    com.sun.jna.platform.win32.WinNT.HRESULT getXValues(VARIANT RHS);
            
    /**
     * <p>id(0x457)</p>
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    com.sun.jna.platform.win32.WinNT.HRESULT setXValues(Object RHS);
            
    /**
     * <p>id(0x680)</p>
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    com.sun.jna.platform.win32.WinNT.HRESULT getBubbleSizes(VARIANT RHS);
            
    /**
     * <p>id(0x680)</p>
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    com.sun.jna.platform.win32.WinNT.HRESULT setBubbleSizes(Object RHS);
            
    /**
     * <p>id(0x57b)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    com.sun.jna.platform.win32.WinNT.HRESULT getBarShape(VARIANT RHS);
            
    /**
     * <p>id(0x57b)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    com.sun.jna.platform.win32.WinNT.HRESULT setBarShape(XlBarShape RHS);
            
    /**
     * <p>id(0x67b)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToSides(VARIANT RHS);
            
    /**
     * <p>id(0x67b)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToSides(Boolean RHS);
            
    /**
     * <p>id(0x67c)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToFront(VARIANT RHS);
            
    /**
     * <p>id(0x67c)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToFront(Boolean RHS);
            
    /**
     * <p>id(0x67d)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToEnd(VARIANT RHS);
            
    /**
     * <p>id(0x67d)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToEnd(Boolean RHS);
            
    /**
     * <p>id(0x681)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    com.sun.jna.platform.win32.WinNT.HRESULT getHas3DEffect(VARIANT RHS);
            
    /**
     * <p>id(0x681)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    com.sun.jna.platform.win32.WinNT.HRESULT setHas3DEffect(Boolean RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x572)</p>
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasLeaderLines(VARIANT RHS);
            
    /**
     * <p>id(0x572)</p>
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasLeaderLines(Boolean RHS);
            
    /**
     * <p>id(0x682)</p>
     */
    @ComProperty(name = "LeaderLines", dispId = 0x682)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeaderLines(VARIANT RHS);
            
    /**
     * <p>id(0x782)</p>
     */
    @ComMethod(name = "ApplyDataLabels", dispId = 0x782)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyDataLabels(XlDataLabelsType Type,
            Object IMsoLegendKey,
            Object AutoText,
            Object HasLeaderLines,
            Object ShowSeriesName,
            Object ShowCategoryName,
            Object ShowValue,
            Object ShowPercentage,
            Object ShowBubbleSize,
            Object Separator,
            VARIANT RHS);
            
    /**
     * <p>id(0x60020052)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020052)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT ppChartFormat);
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    /**
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit2(VARIANT RHS);
            
    /**
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit2(Double RHS);
            
    /**
     * <p>id(0x784)</p>
     */
    @ComProperty(name = "PlotColorIndex", dispId = 0x784)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlotColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0xb44)</p>
     */
    @ComProperty(name = "InvertColor", dispId = 0xb44)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertColor(VARIANT RHS);
            
    /**
     * <p>id(0xb44)</p>
     */
    @ComProperty(name = "InvertColor", dispId = 0xb44)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertColor(Integer RHS);
            
    /**
     * <p>id(0xb45)</p>
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb45)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0xb45)</p>
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb45)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0xb47)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsFiltered(VARIANT RHS);
            
    /**
     * <p>id(0xb47)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    com.sun.jna.platform.win32.WinNT.HRESULT setIsFiltered(Boolean RHS);
            
    
}