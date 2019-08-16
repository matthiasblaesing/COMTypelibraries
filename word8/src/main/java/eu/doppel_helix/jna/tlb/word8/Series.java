
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({40810760-068A-4486-BEC9-8EA58C7029F5})</p>
 */
@ComInterface(iid="{40810760-068A-4486-BEC9-8EA58C7029F5}")
public interface Series extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    XlAxisGroup getAxisGroup();
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code XlAxisGroup}
     */
    @ComProperty(name = "AxisGroup", dispId = 0x2f)
    void setAxisGroup(XlAxisGroup param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0x9d)</p>
     * <p>vtableId(13)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "DataLabels", dispId = 0x9d)
    com.sun.jna.platform.win32.COM.util.IDispatch DataLabels(Object Index);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(15)</p>
     * @param Direction [in] {@code XlErrorBarDirection}
     * @param Include [in] {@code XlErrorBarInclude}
     * @param Type [in] {@code XlErrorBarType}
     * @param Amount [in, optional] {@code Object}
     * @param MinusValues [in, optional] {@code Object}
     */
    @ComMethod(name = "ErrorBar", dispId = 0x98)
    Object ErrorBar(XlErrorBarDirection Direction,
            XlErrorBarInclude Include,
            XlErrorBarType Type,
            Object Amount,
            Object MinusValues);
            
    /**
     * <p>id(0x9f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ErrorBars", dispId = 0x9f)
    ErrorBars getErrorBars();
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    Integer getExplosion();
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    void setExplosion(Integer param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    String getFormulaLocal();
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    void setFormulaLocal(String param0);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    String getFormulaR1C1();
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    void setFormulaR1C1(String param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    String getFormulaR1C1Local();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    void setFormulaR1C1Local(String param0);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    Boolean getHasDataLabels();
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDataLabels", dispId = 0x4e)
    void setHasDataLabels(Boolean param0);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    Boolean getHasErrorBars();
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasErrorBars", dispId = 0xa0)
    void setHasErrorBars(Boolean param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    Boolean getInvertIfNegative();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    void setInvertIfNegative(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    Integer getMarkerBackgroundColor();
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    void setMarkerBackgroundColor(Integer param0);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    XlColorIndex getMarkerBackgroundColorIndex();
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    void setMarkerBackgroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    Integer getMarkerForegroundColor();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    void setMarkerForegroundColor(Integer param0);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    XlColorIndex getMarkerForegroundColorIndex();
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    void setMarkerForegroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    Integer getMarkerSize();
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    void setMarkerSize(Integer param0);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    XlMarkerStyle getMarkerStyle();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    void setMarkerStyle(XlMarkerStyle param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    Object Paste();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    XlChartPictureType getPictureType();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code XlChartPictureType}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    void setPictureType(XlChartPictureType param0);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    Double getPictureUnit();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    void setPictureUnit(Double param0);
            
    /**
     * <p>id(0xe4)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    Integer getPlotOrder();
            
    /**
     * <p>id(0xe4)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PlotOrder", dispId = 0xe4)
    void setPlotOrder(Integer param0);
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(56)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Points", dispId = 0x46)
    com.sun.jna.platform.win32.COM.util.IDispatch Points(Object Index);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    Boolean getSmooth();
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    void setSmooth(Boolean param0);
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(60)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Trendlines", dispId = 0x9a)
    com.sun.jna.platform.win32.COM.util.IDispatch Trendlines(Object Index);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(Integer param0);
            
    /**
     * <p>id(0x578)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    eu.doppel_helix.jna.tlb.office2.XlChartType getChartType();
            
    /**
     * <p>id(0x578)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    void setChartType(eu.doppel_helix.jna.tlb.office2.XlChartType param0);
            
    /**
     * <p>id(0x579)</p>
     * <p>vtableId(65)</p>
     * @param ChartType [in] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    void ApplyCustomType(eu.doppel_helix.jna.tlb.office2.XlChartType ChartType);
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    Object getValues();
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    void setValues(Object param0);
            
    /**
     * <p>id(0x457)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    Object getXValues();
            
    /**
     * <p>id(0x457)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "XValues", dispId = 0x457)
    void setXValues(Object param0);
            
    /**
     * <p>id(0x680)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    Object getBubbleSizes();
            
    /**
     * <p>id(0x680)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "BubbleSizes", dispId = 0x680)
    void setBubbleSizes(Object param0);
            
    /**
     * <p>id(0x57b)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    XlBarShape getBarShape();
            
    /**
     * <p>id(0x57b)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code XlBarShape}
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    void setBarShape(XlBarShape param0);
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    Boolean getApplyPictToSides();
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    void setApplyPictToSides(Boolean param0);
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    Boolean getApplyPictToFront();
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    void setApplyPictToFront(Boolean param0);
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    Boolean getApplyPictToEnd();
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    void setApplyPictToEnd(Boolean param0);
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    Boolean getHas3DEffect();
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    void setHas3DEffect(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x572)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    Boolean getHasLeaderLines();
            
    /**
     * <p>id(0x572)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasLeaderLines", dispId = 0x572)
    void setHasLeaderLines(Boolean param0);
            
    /**
     * <p>id(0x682)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "LeaderLines", dispId = 0x682)
    LeaderLines getLeaderLines();
            
    /**
     * <p>id(0x782)</p>
     * <p>vtableId(87)</p>
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
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020052)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    Double getPictureUnit2();
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    void setPictureUnit2(Double param0);
            
    /**
     * <p>id(0x784)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "PlotColorIndex", dispId = 0x784)
    Integer getPlotColorIndex();
            
    /**
     * <p>id(0xb44)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "InvertColor", dispId = 0xb44)
    Integer getInvertColor();
            
    /**
     * <p>id(0xb44)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "InvertColor", dispId = 0xb44)
    void setInvertColor(Integer param0);
            
    /**
     * <p>id(0xb45)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb45)
    XlColorIndex getInvertColorIndex();
            
    /**
     * <p>id(0xb45)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "InvertColorIndex", dispId = 0xb45)
    void setInvertColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0xb47)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    Boolean getIsFiltered();
            
    /**
     * <p>id(0xb47)</p>
     * <p>vtableId(99)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    void setIsFiltered(Boolean param0);
            
    
}