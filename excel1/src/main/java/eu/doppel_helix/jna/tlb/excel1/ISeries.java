
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002086B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002086B-0001-0000-C000-000000000046}")
public interface ISeries extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x97)</p>
     * <p>vtableId(10)</p>
     * @param Type [in, optional] {@code XlDataLabelsType}
     * @param LegendKey [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param HasLeaderLines [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    com.sun.jna.platform.win32.WinNT.HRESULT _ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
            Object AutoText,
            Object HasLeaderLines,
            VARIANT RHS);
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisGroup(VARIANT RHS);
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(12)</p>
     * @param RHS [in] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    com.sun.jna.platform.win32.WinNT.HRESULT setAxisGroup(XlAxisGroup RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0x9d)</p>
     * <p>vtableId(16)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "DataLabels", dispId = 0x9d)
    com.sun.jna.platform.win32.WinNT.HRESULT DataLabels(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(18)</p>
     * @param Direction [in] {@code XlErrorBarDirection}
     * @param Include [in] {@code XlErrorBarInclude}
     * @param Type [in] {@code XlErrorBarType}
     * @param Amount [in, optional] {@code Object}
     * @param MinusValues [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code ErrorBars}
     */
    @ComProperty(name = "ErrorBars", dispId = 0x9f)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrorBars(VARIANT RHS);
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    com.sun.jna.platform.win32.WinNT.HRESULT getExplosion(VARIANT RHS);
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    com.sun.jna.platform.win32.WinNT.HRESULT setExplosion(Integer RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLocal(VARIANT RHS);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLocal(String RHS);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1(VARIANT RHS);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1(String RHS);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1Local(VARIANT RHS);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1Local(String RHS);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDataLabels(VARIANT RHS);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasDataLabels(Boolean RHS);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasErrorBars(VARIANT RHS);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasErrorBars(Boolean RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code ChartFillFormat}
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertIfNegative(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertIfNegative(Boolean RHS);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColor(Integer RHS);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(43)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColor(Integer RHS);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerSize(VARIANT RHS);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerSize(Integer RHS);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerStyle(VARIANT RHS);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerStyle(XlMarkerStyle RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    com.sun.jna.platform.win32.WinNT.HRESULT Paste(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(53)</p>
     * @param RHS [out] {@code XlChartPictureType}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureType(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(54)</p>
     * @param RHS [in] {@code XlChartPictureType}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureType(XlChartPictureType RHS);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit(VARIANT RHS);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(56)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit(Integer RHS);
            
    /**
     * <p>id(0xe4)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlotOrder(VARIANT RHS);
            
    /**
     * <p>id(0xe4)</p>
     * <p>vtableId(58)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlotOrder(Integer RHS);
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(59)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Points", dispId = 0x46)
    com.sun.jna.platform.win32.WinNT.HRESULT Points(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(60)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmooth(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(62)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSmooth(Boolean RHS);
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(63)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Trendlines", dispId = 0x9a)
    com.sun.jna.platform.win32.WinNT.HRESULT Trendlines(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(65)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(Integer RHS);
            
    /**
     * <p>id(0x578)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code XlChartType}
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    com.sun.jna.platform.win32.WinNT.HRESULT getChartType(VARIANT RHS);
            
    /**
     * <p>id(0x578)</p>
     * <p>vtableId(67)</p>
     * @param RHS [in] {@code XlChartType}
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    com.sun.jna.platform.win32.WinNT.HRESULT setChartType(XlChartType RHS);
            
    /**
     * <p>id(0x579)</p>
     * <p>vtableId(68)</p>
     * @param ChartType [in] {@code XlChartType}
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyCustomType(XlChartType ChartType);
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(69)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    com.sun.jna.platform.win32.WinNT.HRESULT getValues(VARIANT RHS);
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(70)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    com.sun.jna.platform.win32.WinNT.HRESULT setValues(Object RHS);
            
    /**
     * <p>id(0x457)</p>
     * <p>vtableId(71)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    com.sun.jna.platform.win32.WinNT.HRESULT getXValues(VARIANT RHS);
            
    /**
     * <p>id(0x457)</p>
     * <p>vtableId(72)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    com.sun.jna.platform.win32.WinNT.HRESULT setXValues(Object RHS);
            
    /**
     * <p>id(0x680)</p>
     * <p>vtableId(73)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    com.sun.jna.platform.win32.WinNT.HRESULT getBubbleSizes(VARIANT RHS);
            
    /**
     * <p>id(0x680)</p>
     * <p>vtableId(74)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    com.sun.jna.platform.win32.WinNT.HRESULT setBubbleSizes(Object RHS);
            
    /**
     * <p>id(0x57b)</p>
     * <p>vtableId(75)</p>
     * @param RHS [out] {@code XlBarShape}
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    com.sun.jna.platform.win32.WinNT.HRESULT getBarShape(VARIANT RHS);
            
    /**
     * <p>id(0x57b)</p>
     * <p>vtableId(76)</p>
     * @param RHS [in] {@code XlBarShape}
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    com.sun.jna.platform.win32.WinNT.HRESULT setBarShape(XlBarShape RHS);
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToSides(VARIANT RHS);
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(78)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToSides(Boolean RHS);
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(79)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToFront(VARIANT RHS);
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(80)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToFront(Boolean RHS);
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(81)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToEnd(VARIANT RHS);
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(82)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToEnd(Boolean RHS);
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(83)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    com.sun.jna.platform.win32.WinNT.HRESULT getHas3DEffect(VARIANT RHS);
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(84)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    com.sun.jna.platform.win32.WinNT.HRESULT setHas3DEffect(Boolean RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(85)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(86)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x572)</p>
     * <p>vtableId(87)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasLeaderLines(VARIANT RHS);
            
    /**
     * <p>id(0x572)</p>
     * <p>vtableId(88)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasLeaderLines(Boolean RHS);
            
    /**
     * <p>id(0x682)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code LeaderLines}
     */
    @ComProperty(name = "LeaderLines", dispId = 0x682)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeaderLines(VARIANT RHS);
            
    /**
     * <p>id(0x782)</p>
     * <p>vtableId(90)</p>
     * @param Type [in, optional] {@code XlDataLabelsType}
     * @param LegendKey [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param HasLeaderLines [in, optional] {@code Object}
     * @param ShowSeriesName [in, optional] {@code Object}
     * @param ShowCategoryName [in, optional] {@code Object}
     * @param ShowValue [in, optional] {@code Object}
     * @param ShowPercentage [in, optional] {@code Object}
     * @param ShowBubbleSize [in, optional] {@code Object}
     * @param Separator [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ApplyDataLabels", dispId = 0x782)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
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
     * <p>id(0xa59)</p>
     * <p>vtableId(91)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit2(VARIANT RHS);
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(92)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit2(Double RHS);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(93)</p>
     * @param RHS [out] {@code ChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    /**
     * <p>id(0xb63)</p>
     * <p>vtableId(94)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PlotColorIndex", dispId = 0xb63)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlotColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0xb64)</p>
     * <p>vtableId(95)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "InvertColor", dispId = 0xb64)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertColor(VARIANT RHS);
            
    /**
     * <p>id(0xb64)</p>
     * <p>vtableId(96)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "InvertColor", dispId = 0xb64)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertColor(Integer RHS);
            
    /**
     * <p>id(0xb65)</p>
     * <p>vtableId(97)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb65)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0xb65)</p>
     * <p>vtableId(98)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb65)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertColorIndex(Integer RHS);
            
    /**
     * <p>id(0xc0b)</p>
     * <p>vtableId(99)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsFiltered", dispId = 0xc0b)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsFiltered(VARIANT RHS);
            
    /**
     * <p>id(0xc0b)</p>
     * <p>vtableId(100)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "IsFiltered", dispId = 0xc0b)
    com.sun.jna.platform.win32.WinNT.HRESULT setIsFiltered(Boolean RHS);
            
    
}