
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1709-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1709-0000-0000-C000-000000000046}")
public interface IMsoChart {
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x60020001)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x60020001)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "ChartTitle", dispId = 0x60020003)
    IMsoChartTitle getChartTitle();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "DepthPercent", dispId = 0x60020004)
    Integer getDepthPercent();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "DepthPercent", dispId = 0x60020004)
    void setDepthPercent(Integer param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Elevation", dispId = 0x60020006)
    Integer getElevation();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Elevation", dispId = 0x60020006)
    void setElevation(Integer param0);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "GapDepth", dispId = 0x60020008)
    Integer getGapDepth();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "GapDepth", dispId = 0x60020008)
    void setGapDepth(Integer param0);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "HeightPercent", dispId = 0x6002000a)
    Integer getHeightPercent();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "HeightPercent", dispId = 0x6002000a)
    void setHeightPercent(Integer param0);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x6002000c)
    Integer getPerspective();
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x6002000c)
    void setPerspective(Integer param0);
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x6002000e)
    Object getRightAngleAxes();
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x6002000e)
    void setRightAngleAxes(Object param0);
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x60020010)
    Object getRotation();
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x60020010)
    void setRotation(Object param0);
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x60020012)
    void setDisplayBlanksAs(XlDisplayBlanksAs param0);
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x60020012)
    XlDisplayBlanksAs getDisplayBlanksAs();
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "ProtectData", dispId = 0x60020014)
    void setProtectData(Boolean param0);
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "ProtectData", dispId = 0x60020014)
    Boolean getProtectData();
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "ProtectFormatting", dispId = 0x60020016)
    void setProtectFormatting(Boolean param0);
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "ProtectFormatting", dispId = 0x60020016)
    Boolean getProtectFormatting();
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComProperty(name = "ProtectGoalSeek", dispId = 0x60020018)
    void setProtectGoalSeek(Boolean param0);
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComProperty(name = "ProtectGoalSeek", dispId = 0x60020018)
    Boolean getProtectGoalSeek();
            
    /**
     * <p>id(0x6002001a)</p>
     */
    @ComProperty(name = "ProtectSelection", dispId = 0x6002001a)
    void setProtectSelection(Boolean param0);
            
    /**
     * <p>id(0x6002001a)</p>
     */
    @ComProperty(name = "ProtectSelection", dispId = 0x6002001a)
    Boolean getProtectSelection();
            
    /**
     * <p>id(0x6002001c)</p>
     */
    @ComProperty(name = "ProtectChartObjects", dispId = 0x6002001c)
    void setProtectChartObjects(Boolean param0);
            
    /**
     * <p>id(0x6002001c)</p>
     */
    @ComProperty(name = "ProtectChartObjects", dispId = 0x6002001c)
    Boolean getProtectChartObjects();
            
    /**
     * <p>id(0x6002001e)</p>
     */
    @ComMethod(name = "UnProtect", dispId = 0x6002001e)
    void UnProtect(Object Password);
            
    /**
     * <p>id(0x6002001f)</p>
     */
    @ComMethod(name = "Protect", dispId = 0x6002001f)
    void Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ChartGroups", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch getChartGroups(Object pvarIndex,
            Object varIgallery);
            
    /**
     * <p>id(0x44)</p>
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch SeriesCollection(Object Index);
            
    /**
     * <p>id(0x97)</p>
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    void _ApplyDataLabels(XlDataLabelsType Type,
            Object IMsoLegendKey,
            Object AutoText,
            Object HasLeaderLines);
            
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
     * <p>id(0x4f)</p>
     */
    @ComProperty(name = "Corners", dispId = 0x4f)
    IMsoCorners getCorners();
            
    /**
     * <p>id(0x782)</p>
     */
    @ComMethod(name = "ApplyDataLabels", dispId = 0x782)
    void ApplyDataLabels(XlDataLabelsType Type,
            Object IMsoLegendKey,
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
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    XlChartType getChartType();
            
    /**
     * <p>id(0x578)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    void setChartType(XlChartType param0);
            
    /**
     * <p>id(0x574)</p>
     */
    @ComProperty(name = "HasDataTable", dispId = 0x574)
    Boolean getHasDataTable();
            
    /**
     * <p>id(0x574)</p>
     */
    @ComProperty(name = "HasDataTable", dispId = 0x574)
    void setHasDataTable(Boolean param0);
            
    /**
     * <p>id(0x579)</p>
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    void ApplyCustomType(XlChartType ChartType,
            Object TypeName);
            
    /**
     * <p>id(0x581)</p>
     */
    @ComMethod(name = "GetChartElement", dispId = 0x581)
    void GetChartElement(Integer x,
            Integer y,
            VARIANT ElementID,
            VARIANT Arg1,
            VARIANT Arg2);
            
    /**
     * <p>id(0x585)</p>
     */
    @ComMethod(name = "SetSourceData", dispId = 0x585)
    void SetSourceData(String Source,
            Object PlotBy);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    XlRowCol getPlotBy();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    void setPlotBy(XlRowCol param0);
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "HasLegend", dispId = 0x35)
    Boolean getHasLegend();
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "HasLegend", dispId = 0x35)
    void setHasLegend(Boolean param0);
            
    /**
     * <p>id(0x54)</p>
     */
    @ComProperty(name = "Legend", dispId = 0x54)
    IMsoLegend getLegend();
            
    /**
     * <p>id(0x60020035)</p>
     */
    @ComMethod(name = "Axes", dispId = 0x60020035)
    com.sun.jna.platform.win32.COM.util.IDispatch Axes(Object Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x60020036)</p>
     */
    @ComProperty(name = "HasAxis", dispId = 0x60020036)
    void setHasAxis(Object axisType,
            Object AxisGroup,
            Object param2);
            
    /**
     * <p>id(0x60020036)</p>
     */
    @ComProperty(name = "HasAxis", dispId = 0x60020036)
    Object getHasAxis(Object axisType,
            Object AxisGroup);
            
    /**
     * <p>id(0x60020038)</p>
     */
    @ComProperty(name = "Walls", dispId = 0x60020038)
    IMsoWalls getWalls(Boolean fBackWall);
            
    /**
     * <p>id(0x60020039)</p>
     */
    @ComProperty(name = "Floor", dispId = 0x60020039)
    IMsoFloor getFloor();
            
    /**
     * <p>id(0x6002003a)</p>
     */
    @ComProperty(name = "PlotArea", dispId = 0x6002003a)
    IMsoPlotArea getPlotArea();
            
    /**
     * <p>id(0x5c)</p>
     */
    @ComProperty(name = "PlotVisibleOnly", dispId = 0x5c)
    Boolean getPlotVisibleOnly();
            
    /**
     * <p>id(0x5c)</p>
     */
    @ComProperty(name = "PlotVisibleOnly", dispId = 0x5c)
    void setPlotVisibleOnly(Boolean param0);
            
    /**
     * <p>id(0x6002003d)</p>
     */
    @ComProperty(name = "ChartArea", dispId = 0x6002003d)
    IMsoChartArea getChartArea();
            
    /**
     * <p>id(0x6002003e)</p>
     */
    @ComMethod(name = "AutoFormat", dispId = 0x6002003e)
    void AutoFormat(Integer rGallery,
            Object varFormat);
            
    /**
     * <p>id(0x6002003f)</p>
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6002003f)
    Boolean getAutoScaling();
            
    /**
     * <p>id(0x6002003f)</p>
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6002003f)
    void setAutoScaling(Boolean param0);
            
    /**
     * <p>id(0x60020041)</p>
     */
    @ComMethod(name = "SetBackgroundPicture", dispId = 0x60020041)
    void SetBackgroundPicture(String bstr);
            
    /**
     * <p>id(0x60020042)</p>
     */
    @ComMethod(name = "ChartWizard", dispId = 0x60020042)
    void ChartWizard(Object varSource,
            Object varGallery,
            Object varFormat,
            Object varPlotBy,
            Object varCategoryLabels,
            Object varSeriesLabels,
            Object varHasLegend,
            Object varTitle,
            Object varCategoryTitle,
            Object varValueTitle,
            Object varExtraTitle);
            
    /**
     * <p>id(0x60020043)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0x60020043)
    void CopyPicture(Integer Appearance,
            Integer Format,
            Integer Size);
            
    /**
     * <p>id(0x60020044)</p>
     */
    @ComProperty(name = "DataTable", dispId = 0x60020044)
    IMsoDataTable getDataTable();
            
    /**
     * <p>id(0x60020045)</p>
     */
    @ComMethod(name = "Evaluate", dispId = 0x60020045)
    Object Evaluate(Object varName,
            Integer LocaleID,
            VARIANT ObjType);
            
    /**
     * <p>id(0x60020046)</p>
     */
    @ComMethod(name = "_Evaluate", dispId = 0x60020046)
    Object _Evaluate(Object varName,
            Integer LocaleID);
            
    /**
     * <p>id(0x60020047)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x60020047)
    void Paste(Object varType);
            
    /**
     * <p>id(0x60020048)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x60020048)
    XlBarShape getBarShape();
            
    /**
     * <p>id(0x60020048)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x60020048)
    void setBarShape(XlBarShape param0);
            
    /**
     * <p>id(0x6002004a)</p>
     */
    @ComMethod(name = "Export", dispId = 0x6002004a)
    Boolean Export(String bstr,
            Object varFilterName,
            Object varInteractive);
            
    /**
     * <p>id(0x6002004b)</p>
     */
    @ComMethod(name = "SetDefaultChart", dispId = 0x6002004b)
    void SetDefaultChart(Object varName);
            
    /**
     * <p>id(0x6002004c)</p>
     */
    @ComMethod(name = "ApplyChartTemplate", dispId = 0x6002004c)
    void ApplyChartTemplate(String bstrFileName);
            
    /**
     * <p>id(0x6002004d)</p>
     */
    @ComMethod(name = "SaveChartTemplate", dispId = 0x6002004d)
    void SaveChartTemplate(String bstrFileName);
            
    /**
     * <p>id(0x949)</p>
     */
    @ComProperty(name = "SideWall", dispId = 0x949)
    IMsoWalls getSideWall();
            
    /**
     * <p>id(0x94a)</p>
     */
    @ComProperty(name = "BackWall", dispId = 0x94a)
    IMsoWalls getBackWall();
            
    /**
     * <p>id(0x9a1)</p>
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9a1)
    Object getChartStyle();
            
    /**
     * <p>id(0x9a1)</p>
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9a1)
    void setChartStyle(Object param0);
            
    /**
     * <p>id(0x9a2)</p>
     */
    @ComMethod(name = "ClearToMatchStyle", dispId = 0x9a2)
    void ClearToMatchStyle();
            
    /**
     * <p>id(0x716)</p>
     */
    @ComProperty(name = "PivotLayout", dispId = 0x716)
    com.sun.jna.platform.win32.COM.util.IDispatch getPivotLayout();
            
    /**
     * <p>id(0x717)</p>
     */
    @ComProperty(name = "HasPivotFields", dispId = 0x717)
    Boolean getHasPivotFields();
            
    /**
     * <p>id(0x717)</p>
     */
    @ComProperty(name = "HasPivotFields", dispId = 0x717)
    void setHasPivotFields(Boolean param0);
            
    /**
     * <p>id(0x60020056)</p>
     */
    @ComMethod(name = "RefreshPivotTable", dispId = 0x60020056)
    void RefreshPivotTable();
            
    /**
     * <p>id(0x60020057)</p>
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x60020057)
    void setShowDataLabelsOverMaximum(Boolean param0);
            
    /**
     * <p>id(0x60020057)</p>
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x60020057)
    Boolean getShowDataLabelsOverMaximum();
            
    /**
     * <p>id(0x9a4)</p>
     */
    @ComMethod(name = "ApplyLayout", dispId = 0x9a4)
    void ApplyLayout(Integer Layout,
            Object varChartType);
            
    /**
     * <p>id(0x6002005a)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x6002005a)
    com.sun.jna.platform.win32.COM.util.IDispatch getSelection();
            
    /**
     * <p>id(0x6002005b)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x6002005b)
    void Refresh();
            
    /**
     * <p>id(0x6002005c)</p>
     */
    @ComMethod(name = "SetElement", dispId = 0x6002005c)
    void SetElement(MsoChartElementType RHS);
            
    /**
     * <p>id(0x6002005d)</p>
     */
    @ComProperty(name = "ChartData", dispId = 0x6002005d)
    IMsoChartData getChartData();
            
    /**
     * <p>id(0x6002005e)</p>
     */
    @ComProperty(name = "Format", dispId = 0x6002005e)
    IMsoChartFormat getFormat();
            
    /**
     * <p>id(0x6002005f)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x6002005f)
    Shapes getShapes();
            
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
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Area3DGroup", dispId = 0x11)
    IMsoChartGroup getArea3DGroup();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "AreaGroups", dispId = 0x9)
    com.sun.jna.platform.win32.COM.util.IDispatch AreaGroups(Object Index);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "Bar3DGroup", dispId = 0x12)
    IMsoChartGroup getBar3DGroup();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "BarGroups", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch BarGroups(Object Index);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Column3DGroup", dispId = 0x13)
    IMsoChartGroup getColumn3DGroup();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "ColumnGroups", dispId = 0xb)
    com.sun.jna.platform.win32.COM.util.IDispatch ColumnGroups(Object Index);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "Line3DGroup", dispId = 0x14)
    IMsoChartGroup getLine3DGroup();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "LineGroups", dispId = 0xc)
    com.sun.jna.platform.win32.COM.util.IDispatch LineGroups(Object Index);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "Pie3DGroup", dispId = 0x15)
    IMsoChartGroup getPie3DGroup();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "PieGroups", dispId = 0xd)
    com.sun.jna.platform.win32.COM.util.IDispatch PieGroups(Object Index);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "DoughnutGroups", dispId = 0xe)
    com.sun.jna.platform.win32.COM.util.IDispatch DoughnutGroups(Object Index);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "RadarGroups", dispId = 0xf)
    com.sun.jna.platform.win32.COM.util.IDispatch RadarGroups(Object Index);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "SurfaceGroup", dispId = 0x16)
    IMsoChartGroup getSurfaceGroup();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "XYGroups", dispId = 0x10)
    com.sun.jna.platform.win32.COM.util.IDispatch XYGroups(Object Index);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select(Object Replace);
            
    /**
     * <p>id(0x60020073)</p>
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0x60020073)
    Boolean getShowReportFilterFieldButtons();
            
    /**
     * <p>id(0x60020073)</p>
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0x60020073)
    void setShowReportFilterFieldButtons(Boolean param0);
            
    /**
     * <p>id(0x60020075)</p>
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0x60020075)
    Boolean getShowLegendFieldButtons();
            
    /**
     * <p>id(0x60020075)</p>
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0x60020075)
    void setShowLegendFieldButtons(Boolean param0);
            
    /**
     * <p>id(0x60020077)</p>
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0x60020077)
    Boolean getShowAxisFieldButtons();
            
    /**
     * <p>id(0x60020077)</p>
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0x60020077)
    void setShowAxisFieldButtons(Boolean param0);
            
    /**
     * <p>id(0x60020079)</p>
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0x60020079)
    Boolean getShowValueFieldButtons();
            
    /**
     * <p>id(0x60020079)</p>
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0x60020079)
    void setShowValueFieldButtons(Boolean param0);
            
    /**
     * <p>id(0x6002007b)</p>
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0x6002007b)
    Boolean getShowAllFieldButtons();
            
    /**
     * <p>id(0x6002007b)</p>
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0x6002007b)
    void setShowAllFieldButtons(Boolean param0);
            
    /**
     * <p>id(0x6002007d)</p>
     */
    @ComProperty(name = "ProtectChartSheetFormatting", dispId = 0x6002007d)
    void setProtectChartSheetFormatting(Boolean param0);
            
    /**
     * <p>id(0xec)</p>
     */
    @ComMethod(name = "FullSeriesCollection", dispId = 0xec)
    com.sun.jna.platform.win32.COM.util.IDispatch FullSeriesCollection(Object Index);
            
    /**
     * <p>id(0xed)</p>
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xed)
    void setCategoryLabelLevel(XlCategoryLabelLevel param0);
            
    /**
     * <p>id(0xed)</p>
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xed)
    XlCategoryLabelLevel getCategoryLabelLevel();
            
    /**
     * <p>id(0xee)</p>
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xee)
    void setSeriesNameLevel(XlSeriesNameLevel param0);
            
    /**
     * <p>id(0xee)</p>
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xee)
    XlSeriesNameLevel getSeriesNameLevel();
            
    /**
     * <p>id(0xef)</p>
     */
    @ComProperty(name = "HasHiddenContent", dispId = 0xef)
    Boolean getHasHiddenContent();
            
    /**
     * <p>id(0xf0)</p>
     */
    @ComMethod(name = "DeleteHiddenContent", dispId = 0xf0)
    void DeleteHiddenContent();
            
    /**
     * <p>id(0x9a3)</p>
     */
    @ComProperty(name = "ChartColor", dispId = 0x9a3)
    Object getChartColor();
            
    /**
     * <p>id(0x9a3)</p>
     */
    @ComProperty(name = "ChartColor", dispId = 0x9a3)
    void setChartColor(Object param0);
            
    /**
     * <p>id(0x9a5)</p>
     */
    @ComMethod(name = "ClearToMatchColorStyle", dispId = 0x9a5)
    void ClearToMatchColorStyle();
            
    
}