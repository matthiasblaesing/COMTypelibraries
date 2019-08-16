
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({6FFA84BB-A350-4442-BB53-A43653459A84})</p>
 */
@ComInterface(iid="{6FFA84BB-A350-4442-BB53-A43653459A84}")
public interface Chart extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x60020001)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasTitle", dispId = 0x60020001)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ChartTitle", dispId = 0x60020003)
    ChartTitle getChartTitle();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DepthPercent", dispId = 0x60020004)
    Integer getDepthPercent();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DepthPercent", dispId = 0x60020004)
    void setDepthPercent(Integer param0);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Elevation", dispId = 0x60020006)
    Integer getElevation();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Elevation", dispId = 0x60020006)
    void setElevation(Integer param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "GapDepth", dispId = 0x60020008)
    Integer getGapDepth();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GapDepth", dispId = 0x60020008)
    void setGapDepth(Integer param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "HeightPercent", dispId = 0x6002000a)
    Integer getHeightPercent();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HeightPercent", dispId = 0x6002000a)
    void setHeightPercent(Integer param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x6002000c)
    Integer getPerspective();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Perspective", dispId = 0x6002000c)
    void setPerspective(Integer param0);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x6002000e)
    Object getRightAngleAxes();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x6002000e)
    void setRightAngleAxes(Object param0);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x60020010)
    Object getRotation();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Rotation", dispId = 0x60020010)
    void setRotation(Object param0);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x60020012)
    XlDisplayBlanksAs getDisplayBlanksAs();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code XlDisplayBlanksAs}
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x60020012)
    void setDisplayBlanksAs(XlDisplayBlanksAs param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(27)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ChartGroups", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch getChartGroups(Object Index);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(28)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch SeriesCollection(Object Index);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    Integer getSubType();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    void setSubType(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(Integer param0);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Corners", dispId = 0x4f)
    Corners getCorners();
            
    /**
     * <p>id(0x782)</p>
     * <p>vtableId(34)</p>
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
    void ApplyDataLabels(XlDataLabelsType Type,
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
     * <p>id(0x578)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    eu.doppel_helix.jna.tlb.office2.XlChartType getChartType();
            
    /**
     * <p>id(0x578)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    void setChartType(eu.doppel_helix.jna.tlb.office2.XlChartType param0);
            
    /**
     * <p>id(0x574)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "HasDataTable", dispId = 0x574)
    Boolean getHasDataTable();
            
    /**
     * <p>id(0x574)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDataTable", dispId = 0x574)
    void setHasDataTable(Boolean param0);
            
    /**
     * <p>id(0x579)</p>
     * <p>vtableId(39)</p>
     * @param ChartType [in] {@code eu.doppel_helix.jna.tlb.office2.XlChartType}
     * @param TypeName [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    void ApplyCustomType(eu.doppel_helix.jna.tlb.office2.XlChartType ChartType,
            Object TypeName);
            
    /**
     * <p>id(0x581)</p>
     * <p>vtableId(40)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     * @param ElementID [out] {@code Integer}
     * @param Arg1 [out] {@code Integer}
     * @param Arg2 [out] {@code Integer}
     */
    @ComMethod(name = "GetChartElement", dispId = 0x581)
    void GetChartElement(Integer x,
            Integer y,
            VARIANT ElementID,
            VARIANT Arg1,
            VARIANT Arg2);
            
    /**
     * <p>id(0x585)</p>
     * <p>vtableId(41)</p>
     * @param Source [in] {@code String}
     * @param PlotBy [in, optional] {@code Object}
     */
    @ComMethod(name = "SetSourceData", dispId = 0x585)
    void SetSourceData(String Source,
            Object PlotBy);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    XlRowCol getPlotBy();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code XlRowCol}
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    void setPlotBy(XlRowCol param0);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "HasLegend", dispId = 0x35)
    Boolean getHasLegend();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasLegend", dispId = 0x35)
    void setHasLegend(Boolean param0);
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Legend", dispId = 0x54)
    Legend getLegend();
            
    /**
     * <p>id(0x60020035)</p>
     * <p>vtableId(47)</p>
     * @param Type [in, optional] {@code Object}
     * @param AxisGroup [in, optional] {@code XlAxisGroup}
     */
    @ComMethod(name = "Axes", dispId = 0x60020035)
    com.sun.jna.platform.win32.COM.util.IDispatch Axes(Object Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x60020036)</p>
     * <p>vtableId(48)</p>
     * @param Index1 [in, optional] {@code Object}
     * @param Index2 [in, optional] {@code Object}
     */
    @ComProperty(name = "HasAxis", dispId = 0x60020036)
    Object getHasAxis(Object Index1,
            Object Index2);
            
    /**
     * <p>id(0x60020036)</p>
     * <p>vtableId(49)</p>
     * @param Index1 [in, optional] {@code Object}
     * @param Index2 [in, optional] {@code Object}
     * @param param2 [in] {@code Object}
     */
    @ComProperty(name = "HasAxis", dispId = 0x60020036)
    void setHasAxis(Object Index1,
            Object Index2,
            Object param2);
            
    /**
     * <p>id(0x60020038)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Walls", dispId = 0x60020038)
    Walls getWalls();
            
    /**
     * <p>id(0x60020039)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Floor", dispId = 0x60020039)
    Floor getFloor();
            
    /**
     * <p>id(0x6002003a)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "PlotArea", dispId = 0x6002003a)
    PlotArea getPlotArea();
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "PlotVisibleOnly", dispId = 0x5c)
    Boolean getPlotVisibleOnly();
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PlotVisibleOnly", dispId = 0x5c)
    void setPlotVisibleOnly(Boolean param0);
            
    /**
     * <p>id(0x6002003d)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "ChartArea", dispId = 0x6002003d)
    ChartArea getChartArea();
            
    /**
     * <p>id(0x6002003e)</p>
     * <p>vtableId(56)</p>
     * @param Gallery [in] {@code Integer}
     * @param Format [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoFormat", dispId = 0x6002003e)
    void AutoFormat(Integer Gallery,
            Object Format);
            
    /**
     * <p>id(0x6002003f)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6002003f)
    Boolean getAutoScaling();
            
    /**
     * <p>id(0x6002003f)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6002003f)
    void setAutoScaling(Boolean param0);
            
    /**
     * <p>id(0x60020041)</p>
     * <p>vtableId(59)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SetBackgroundPicture", dispId = 0x60020041)
    void SetBackgroundPicture(String FileName);
            
    /**
     * <p>id(0x60020042)</p>
     * <p>vtableId(60)</p>
     * @param Source [in, optional] {@code Object}
     * @param Gallery [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param PlotBy [in, optional] {@code Object}
     * @param CategoryLabels [in, optional] {@code Object}
     * @param SeriesLabels [in, optional] {@code Object}
     * @param HasLegend [in, optional] {@code Object}
     * @param Title [in, optional] {@code Object}
     * @param CategoryTitle [in, optional] {@code Object}
     * @param ValueTitle [in, optional] {@code Object}
     * @param ExtraTitle [in, optional] {@code Object}
     */
    @ComMethod(name = "ChartWizard", dispId = 0x60020042)
    void ChartWizard(Object Source,
            Object Gallery,
            Object Format,
            Object PlotBy,
            Object CategoryLabels,
            Object SeriesLabels,
            Object HasLegend,
            Object Title,
            Object CategoryTitle,
            Object ValueTitle,
            Object ExtraTitle);
            
    /**
     * <p>id(0x60020043)</p>
     * <p>vtableId(61)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     * @param Size [in, optional] {@code XlPictureAppearance}
     */
    @ComMethod(name = "CopyPicture", dispId = 0x60020043)
    void CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            XlPictureAppearance Size);
            
    /**
     * <p>id(0x60020044)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "DataTable", dispId = 0x60020044)
    DataTable getDataTable();
            
    /**
     * <p>id(0x60020047)</p>
     * <p>vtableId(63)</p>
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "Paste", dispId = 0x60020047)
    void Paste(Object Type);
            
    /**
     * <p>id(0x60020048)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x60020048)
    XlBarShape getBarShape();
            
    /**
     * <p>id(0x60020048)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code XlBarShape}
     */
    @ComProperty(name = "BarShape", dispId = 0x60020048)
    void setBarShape(XlBarShape param0);
            
    /**
     * <p>id(0x6002004a)</p>
     * <p>vtableId(66)</p>
     * @param FileName [in] {@code String}
     * @param FilterName [in, optional] {@code Object}
     * @param Interactive [in, optional] {@code Object}
     */
    @ComMethod(name = "Export", dispId = 0x6002004a)
    Boolean Export(String FileName,
            Object FilterName,
            Object Interactive);
            
    /**
     * <p>id(0x6002004b)</p>
     * <p>vtableId(67)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "SetDefaultChart", dispId = 0x6002004b)
    void SetDefaultChart(Object Name);
            
    /**
     * <p>id(0x6002004c)</p>
     * <p>vtableId(68)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "ApplyChartTemplate", dispId = 0x6002004c)
    void ApplyChartTemplate(String FileName);
            
    /**
     * <p>id(0x6002004d)</p>
     * <p>vtableId(69)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SaveChartTemplate", dispId = 0x6002004d)
    void SaveChartTemplate(String FileName);
            
    /**
     * <p>id(0x949)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "SideWall", dispId = 0x949)
    Walls getSideWall();
            
    /**
     * <p>id(0x94a)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "BackWall", dispId = 0x94a)
    Walls getBackWall();
            
    /**
     * <p>id(0x9a1)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9a1)
    Object getChartStyle();
            
    /**
     * <p>id(0x9a1)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9a1)
    void setChartStyle(Object param0);
            
    /**
     * <p>id(0x9a2)</p>
     * <p>vtableId(74)</p>
     */
    @ComMethod(name = "ClearToMatchStyle", dispId = 0x9a2)
    void ClearToMatchStyle();
            
    /**
     * <p>id(0x716)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "PivotLayout", dispId = 0x716)
    com.sun.jna.platform.win32.COM.util.IDispatch getPivotLayout();
            
    /**
     * <p>id(0x717)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "HasPivotFields", dispId = 0x717)
    Boolean getHasPivotFields();
            
    /**
     * <p>id(0x717)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasPivotFields", dispId = 0x717)
    void setHasPivotFields(Boolean param0);
            
    /**
     * <p>id(0x60020057)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x60020057)
    Boolean getShowDataLabelsOverMaximum();
            
    /**
     * <p>id(0x60020057)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x60020057)
    void setShowDataLabelsOverMaximum(Boolean param0);
            
    /**
     * <p>id(0x9a4)</p>
     * <p>vtableId(80)</p>
     * @param Layout [in] {@code Integer}
     * @param ChartType [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyLayout", dispId = 0x9a4)
    void ApplyLayout(Integer Layout,
            Object ChartType);
            
    /**
     * <p>id(0x6002005b)</p>
     * <p>vtableId(81)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x6002005b)
    void Refresh();
            
    /**
     * <p>id(0x6002005c)</p>
     * <p>vtableId(82)</p>
     * @param Element [in] {@code eu.doppel_helix.jna.tlb.office2.MsoChartElementType}
     */
    @ComMethod(name = "SetElement", dispId = 0x6002005c)
    void SetElement(eu.doppel_helix.jna.tlb.office2.MsoChartElementType Element);
            
    /**
     * <p>id(0x6002005d)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "ChartData", dispId = 0x6002005d)
    ChartData getChartData();
            
    /**
     * <p>id(0x6002005f)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x6002005f)
    com.sun.jna.platform.win32.COM.util.IDispatch getShapes();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "Area3DGroup", dispId = 0x11)
    ChartGroup getArea3DGroup();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(88)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "AreaGroups", dispId = 0x9)
    com.sun.jna.platform.win32.COM.util.IDispatch AreaGroups(Object Index);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "Bar3DGroup", dispId = 0x12)
    ChartGroup getBar3DGroup();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(90)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "BarGroups", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch BarGroups(Object Index);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "Column3DGroup", dispId = 0x13)
    ChartGroup getColumn3DGroup();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(92)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ColumnGroups", dispId = 0xb)
    com.sun.jna.platform.win32.COM.util.IDispatch ColumnGroups(Object Index);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "Line3DGroup", dispId = 0x14)
    ChartGroup getLine3DGroup();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(94)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "LineGroups", dispId = 0xc)
    com.sun.jna.platform.win32.COM.util.IDispatch LineGroups(Object Index);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "Pie3DGroup", dispId = 0x15)
    ChartGroup getPie3DGroup();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(96)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "PieGroups", dispId = 0xd)
    com.sun.jna.platform.win32.COM.util.IDispatch PieGroups(Object Index);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(97)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "DoughnutGroups", dispId = 0xe)
    com.sun.jna.platform.win32.COM.util.IDispatch DoughnutGroups(Object Index);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(98)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "RadarGroups", dispId = 0xf)
    com.sun.jna.platform.win32.COM.util.IDispatch RadarGroups(Object Index);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "SurfaceGroup", dispId = 0x16)
    ChartGroup getSurfaceGroup();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(100)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "XYGroups", dispId = 0x10)
    com.sun.jna.platform.win32.COM.util.IDispatch XYGroups(Object Index);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(101)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(102)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy(Object Before,
            Object After);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(103)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select(Object Replace);
            
    /**
     * <p>id(0xb1c)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0xb1c)
    Boolean getShowReportFilterFieldButtons();
            
    /**
     * <p>id(0xb1c)</p>
     * <p>vtableId(105)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0xb1c)
    void setShowReportFilterFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb1d)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0xb1d)
    Boolean getShowLegendFieldButtons();
            
    /**
     * <p>id(0xb1d)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0xb1d)
    void setShowLegendFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb1e)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0xb1e)
    Boolean getShowAxisFieldButtons();
            
    /**
     * <p>id(0xb1e)</p>
     * <p>vtableId(109)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0xb1e)
    void setShowAxisFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb1f)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0xb1f)
    Boolean getShowValueFieldButtons();
            
    /**
     * <p>id(0xb1f)</p>
     * <p>vtableId(111)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0xb1f)
    void setShowValueFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb20)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0xb20)
    Boolean getShowAllFieldButtons();
            
    /**
     * <p>id(0xb20)</p>
     * <p>vtableId(113)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0xb20)
    void setShowAllFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xec)</p>
     * <p>vtableId(114)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "FullSeriesCollection", dispId = 0xec)
    com.sun.jna.platform.win32.COM.util.IDispatch FullSeriesCollection(Object Index);
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xed)
    XlCategoryLabelLevel getCategoryLabelLevel();
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code XlCategoryLabelLevel}
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xed)
    void setCategoryLabelLevel(XlCategoryLabelLevel param0);
            
    /**
     * <p>id(0xee)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xee)
    XlSeriesNameLevel getSeriesNameLevel();
            
    /**
     * <p>id(0xee)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code XlSeriesNameLevel}
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xee)
    void setSeriesNameLevel(XlSeriesNameLevel param0);
            
    /**
     * <p>id(0xef)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "HasHiddenContent", dispId = 0xef)
    Boolean getHasHiddenContent();
            
    /**
     * <p>id(0xf0)</p>
     * <p>vtableId(120)</p>
     */
    @ComMethod(name = "DeleteHiddenContent", dispId = 0xf0)
    void DeleteHiddenContent();
            
    /**
     * <p>id(0x9a3)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "ChartColor", dispId = 0x9a3)
    Object getChartColor();
            
    /**
     * <p>id(0x9a3)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ChartColor", dispId = 0x9a3)
    void setChartColor(Object param0);
            
    /**
     * <p>id(0x9a5)</p>
     * <p>vtableId(123)</p>
     */
    @ComMethod(name = "ClearToMatchColorStyle", dispId = 0x9a5)
    void ClearToMatchColorStyle();
            
    
}