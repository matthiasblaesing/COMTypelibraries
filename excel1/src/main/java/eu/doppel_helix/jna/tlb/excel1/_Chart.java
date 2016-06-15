
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D6-0000-0000-C000-000000000046}")
public interface _Chart extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy(Object Before,
            Object After);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x55d)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x55d)
    String getCodeName();
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    String get_CodeName();
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    void set_CodeName(String param0);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x27d)</p>
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    void Move(Object Before,
            Object After);
            
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
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.COM.util.IDispatch getNext();
            
    /**
     * <p>id(0x274)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    String getOnDoubleClick();
            
    /**
     * <p>id(0x274)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    void setOnDoubleClick(String param0);
            
    /**
     * <p>id(0x407)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    String getOnSheetActivate();
            
    /**
     * <p>id(0x407)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    void setOnSheetActivate(String param0);
            
    /**
     * <p>id(0x439)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    String getOnSheetDeactivate();
            
    /**
     * <p>id(0x439)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    void setOnSheetDeactivate(String param0);
            
    /**
     * <p>id(0x3e6)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x3e6)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.COM.util.IDispatch getPrevious();
            
    /**
     * <p>id(0x389)</p>
     */
    @ComMethod(name = "__PrintOut", dispId = 0x389)
    void __PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate);
            
    /**
     * <p>id(0x119)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    void PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x11a)</p>
     */
    @ComMethod(name = "_Protect", dispId = 0x11a)
    void _Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x124)</p>
     */
    @ComProperty(name = "ProtectContents", dispId = 0x124)
    Boolean getProtectContents();
            
    /**
     * <p>id(0x125)</p>
     */
    @ComProperty(name = "ProtectDrawingObjects", dispId = 0x125)
    Boolean getProtectDrawingObjects();
            
    /**
     * <p>id(0x487)</p>
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    Boolean getProtectionMode();
            
    /**
     * <p>id(0x10017)</p>
     */
    @ComMethod(name = "_Dummy23", dispId = 0x10017)
    void _Dummy23();
            
    /**
     * <p>id(0x11c)</p>
     */
    @ComMethod(name = "_SaveAs", dispId = 0x11c)
    void _SaveAs(String Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select(Object Replace);
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    XlSheetVisibility getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(XlSheetVisibility param0);
            
    /**
     * <p>id(0x561)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x561)
    Shapes getShapes();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    void _ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
            Object AutoText,
            Object HasLeaderLines);
            
    /**
     * <p>id(0x2f8)</p>
     */
    @ComMethod(name = "Arcs", dispId = 0x2f8)
    com.sun.jna.platform.win32.COM.util.IDispatch Arcs(Object Index);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Area3DGroup", dispId = 0x11)
    ChartGroup getArea3DGroup();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "AreaGroups", dispId = 0x9)
    com.sun.jna.platform.win32.COM.util.IDispatch AreaGroups(Object Index);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComMethod(name = "AutoFormat", dispId = 0x72)
    void AutoFormat(Integer Gallery,
            Object Format);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6b)
    Boolean getAutoScaling();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6b)
    void setAutoScaling(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "Axes", dispId = 0x17)
    com.sun.jna.platform.win32.COM.util.IDispatch Axes(Object Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x4a4)</p>
     */
    @ComMethod(name = "SetBackgroundPicture", dispId = 0x4a4)
    void SetBackgroundPicture(String Filename);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "Bar3DGroup", dispId = 0x12)
    ChartGroup getBar3DGroup();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "BarGroups", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch BarGroups(Object Index);
            
    /**
     * <p>id(0x22d)</p>
     */
    @ComMethod(name = "Buttons", dispId = 0x22d)
    com.sun.jna.platform.win32.COM.util.IDispatch Buttons(Object Index);
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "ChartArea", dispId = 0x50)
    ChartArea getChartArea();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "ChartGroups", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch ChartGroups(Object Index);
            
    /**
     * <p>id(0x424)</p>
     */
    @ComMethod(name = "ChartObjects", dispId = 0x424)
    com.sun.jna.platform.win32.COM.util.IDispatch ChartObjects(Object Index);
            
    /**
     * <p>id(0x51)</p>
     */
    @ComProperty(name = "ChartTitle", dispId = 0x51)
    ChartTitle getChartTitle();
            
    /**
     * <p>id(0xc4)</p>
     */
    @ComMethod(name = "ChartWizard", dispId = 0xc4)
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
     * <p>id(0x338)</p>
     */
    @ComMethod(name = "CheckBoxes", dispId = 0x338)
    com.sun.jna.platform.win32.COM.util.IDispatch CheckBoxes(Object Index);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    void CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Column3DGroup", dispId = 0x13)
    ChartGroup getColumn3DGroup();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "ColumnGroups", dispId = 0xb)
    com.sun.jna.platform.win32.COM.util.IDispatch ColumnGroups(Object Index);
            
    /**
     * <p>id(0xd5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    void CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            XlPictureAppearance Size);
            
    /**
     * <p>id(0x4f)</p>
     */
    @ComProperty(name = "Corners", dispId = 0x4f)
    Corners getCorners();
            
    /**
     * <p>id(0x1ca)</p>
     */
    @ComMethod(name = "CreatePublisher", dispId = 0x1ca)
    void CreatePublisher(Object Edition,
            XlPictureAppearance Appearance,
            XlPictureAppearance Size,
            Object ContainsPICT,
            Object ContainsBIFF,
            Object ContainsRTF,
            Object ContainsVALU);
            
    /**
     * <p>id(0x573)</p>
     */
    @ComProperty(name = "DataTable", dispId = 0x573)
    DataTable getDataTable();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "DepthPercent", dispId = 0x30)
    Integer getDepthPercent();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "DepthPercent", dispId = 0x30)
    void setDepthPercent(Integer param0);
            
    /**
     * <p>id(0x460)</p>
     */
    @ComMethod(name = "Deselect", dispId = 0x460)
    void Deselect();
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    XlDisplayBlanksAs getDisplayBlanksAs();
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    void setDisplayBlanksAs(XlDisplayBlanksAs param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "DoughnutGroups", dispId = 0xe)
    com.sun.jna.platform.win32.COM.util.IDispatch DoughnutGroups(Object Index);
            
    /**
     * <p>id(0x304)</p>
     */
    @ComMethod(name = "Drawings", dispId = 0x304)
    com.sun.jna.platform.win32.COM.util.IDispatch Drawings(Object Index);
            
    /**
     * <p>id(0x58)</p>
     */
    @ComMethod(name = "DrawingObjects", dispId = 0x58)
    com.sun.jna.platform.win32.COM.util.IDispatch DrawingObjects(Object Index);
            
    /**
     * <p>id(0x344)</p>
     */
    @ComMethod(name = "DropDowns", dispId = 0x344)
    com.sun.jna.platform.win32.COM.util.IDispatch DropDowns(Object Index);
            
    /**
     * <p>id(0x31)</p>
     */
    @ComProperty(name = "Elevation", dispId = 0x31)
    Integer getElevation();
            
    /**
     * <p>id(0x31)</p>
     */
    @ComProperty(name = "Elevation", dispId = 0x31)
    void setElevation(Integer param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Evaluate", dispId = 0x1)
    Object Evaluate(Object Name);
            
    /**
     * <p>id(0xfffffffb)</p>
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(Object Name);
            
    /**
     * <p>id(0x53)</p>
     */
    @ComProperty(name = "Floor", dispId = 0x53)
    Floor getFloor();
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "GapDepth", dispId = 0x32)
    Integer getGapDepth();
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "GapDepth", dispId = 0x32)
    void setGapDepth(Integer param0);
            
    /**
     * <p>id(0x342)</p>
     */
    @ComMethod(name = "GroupBoxes", dispId = 0x342)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupBoxes(Object Index);
            
    /**
     * <p>id(0x459)</p>
     */
    @ComMethod(name = "GroupObjects", dispId = 0x459)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupObjects(Object Index);
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "HasAxis", dispId = 0x34)
    Object getHasAxis(Object Index1,
            Object Index2);
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "HasAxis", dispId = 0x34)
    void setHasAxis(Object Index1,
            Object Index2,
            Object param2);
            
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
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "HeightPercent", dispId = 0x37)
    Integer getHeightPercent();
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "HeightPercent", dispId = 0x37)
    void setHeightPercent(Integer param0);
            
    /**
     * <p>id(0x571)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x349)</p>
     */
    @ComMethod(name = "Labels", dispId = 0x349)
    com.sun.jna.platform.win32.COM.util.IDispatch Labels(Object Index);
            
    /**
     * <p>id(0x54)</p>
     */
    @ComProperty(name = "Legend", dispId = 0x54)
    Legend getLegend();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "Line3DGroup", dispId = 0x14)
    ChartGroup getLine3DGroup();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "LineGroups", dispId = 0xc)
    com.sun.jna.platform.win32.COM.util.IDispatch LineGroups(Object Index);
            
    /**
     * <p>id(0x2ff)</p>
     */
    @ComMethod(name = "Lines", dispId = 0x2ff)
    com.sun.jna.platform.win32.COM.util.IDispatch Lines(Object Index);
            
    /**
     * <p>id(0x340)</p>
     */
    @ComMethod(name = "ListBoxes", dispId = 0x340)
    com.sun.jna.platform.win32.COM.util.IDispatch ListBoxes(Object Index);
            
    /**
     * <p>id(0x575)</p>
     */
    @ComMethod(name = "Location", dispId = 0x575)
    Chart Location(XlChartLocation Where,
            Object Name);
            
    /**
     * <p>id(0x31f)</p>
     */
    @ComMethod(name = "OLEObjects", dispId = 0x31f)
    com.sun.jna.platform.win32.COM.util.IDispatch OLEObjects(Object Index);
            
    /**
     * <p>id(0x33a)</p>
     */
    @ComMethod(name = "OptionButtons", dispId = 0x33a)
    com.sun.jna.platform.win32.COM.util.IDispatch OptionButtons(Object Index);
            
    /**
     * <p>id(0x321)</p>
     */
    @ComMethod(name = "Ovals", dispId = 0x321)
    com.sun.jna.platform.win32.COM.util.IDispatch Ovals(Object Index);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    void Paste(Object Type);
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x39)
    Integer getPerspective();
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x39)
    void setPerspective(Integer param0);
            
    /**
     * <p>id(0x303)</p>
     */
    @ComMethod(name = "Pictures", dispId = 0x303)
    com.sun.jna.platform.win32.COM.util.IDispatch Pictures(Object Index);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "Pie3DGroup", dispId = 0x15)
    ChartGroup getPie3DGroup();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "PieGroups", dispId = 0xd)
    com.sun.jna.platform.win32.COM.util.IDispatch PieGroups(Object Index);
            
    /**
     * <p>id(0x55)</p>
     */
    @ComProperty(name = "PlotArea", dispId = 0x55)
    PlotArea getPlotArea();
            
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
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "RadarGroups", dispId = 0xf)
    com.sun.jna.platform.win32.COM.util.IDispatch RadarGroups(Object Index);
            
    /**
     * <p>id(0x306)</p>
     */
    @ComMethod(name = "Rectangles", dispId = 0x306)
    com.sun.jna.platform.win32.COM.util.IDispatch Rectangles(Object Index);
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x3a)
    Object getRightAngleAxes();
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x3a)
    void setRightAngleAxes(Object param0);
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    Object getRotation();
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    void setRotation(Object param0);
            
    /**
     * <p>id(0x33e)</p>
     */
    @ComMethod(name = "ScrollBars", dispId = 0x33e)
    com.sun.jna.platform.win32.COM.util.IDispatch ScrollBars(Object Index);
            
    /**
     * <p>id(0x44)</p>
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch SeriesCollection(Object Index);
            
    /**
     * <p>id(0x5e)</p>
     */
    @ComProperty(name = "SizeWithWindow", dispId = 0x5e)
    Boolean getSizeWithWindow();
            
    /**
     * <p>id(0x5e)</p>
     */
    @ComProperty(name = "SizeWithWindow", dispId = 0x5e)
    void setSizeWithWindow(Boolean param0);
            
    /**
     * <p>id(0x577)</p>
     */
    @ComProperty(name = "ShowWindow", dispId = 0x577)
    Boolean getShowWindow();
            
    /**
     * <p>id(0x577)</p>
     */
    @ComProperty(name = "ShowWindow", dispId = 0x577)
    void setShowWindow(Boolean param0);
            
    /**
     * <p>id(0x346)</p>
     */
    @ComMethod(name = "Spinners", dispId = 0x346)
    com.sun.jna.platform.win32.COM.util.IDispatch Spinners(Object Index);
            
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
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "SurfaceGroup", dispId = 0x16)
    ChartGroup getSurfaceGroup();
            
    /**
     * <p>id(0x309)</p>
     */
    @ComMethod(name = "TextBoxes", dispId = 0x309)
    com.sun.jna.platform.win32.COM.util.IDispatch TextBoxes(Object Index);
            
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
    XlChartType getChartType();
            
    /**
     * <p>id(0x578)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    void setChartType(XlChartType param0);
            
    /**
     * <p>id(0x579)</p>
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    void ApplyCustomType(XlChartType ChartType,
            Object TypeName);
            
    /**
     * <p>id(0x56)</p>
     */
    @ComProperty(name = "Walls", dispId = 0x56)
    Walls getWalls();
            
    /**
     * <p>id(0xd2)</p>
     */
    @ComProperty(name = "WallsAndGridlines2D", dispId = 0xd2)
    Boolean getWallsAndGridlines2D();
            
    /**
     * <p>id(0xd2)</p>
     */
    @ComProperty(name = "WallsAndGridlines2D", dispId = 0xd2)
    void setWallsAndGridlines2D(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "XYGroups", dispId = 0x10)
    com.sun.jna.platform.win32.COM.util.IDispatch XYGroups(Object Index);
            
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
     * <p>id(0x57c)</p>
     */
    @ComMethod(name = "CopyChartBuild", dispId = 0x57c)
    void CopyChartBuild();
            
    /**
     * <p>id(0x57d)</p>
     */
    @ComProperty(name = "ProtectFormatting", dispId = 0x57d)
    Boolean getProtectFormatting();
            
    /**
     * <p>id(0x57d)</p>
     */
    @ComProperty(name = "ProtectFormatting", dispId = 0x57d)
    void setProtectFormatting(Boolean param0);
            
    /**
     * <p>id(0x57e)</p>
     */
    @ComProperty(name = "ProtectData", dispId = 0x57e)
    Boolean getProtectData();
            
    /**
     * <p>id(0x57e)</p>
     */
    @ComProperty(name = "ProtectData", dispId = 0x57e)
    void setProtectData(Boolean param0);
            
    /**
     * <p>id(0x57f)</p>
     */
    @ComProperty(name = "ProtectGoalSeek", dispId = 0x57f)
    Boolean getProtectGoalSeek();
            
    /**
     * <p>id(0x57f)</p>
     */
    @ComProperty(name = "ProtectGoalSeek", dispId = 0x57f)
    void setProtectGoalSeek(Boolean param0);
            
    /**
     * <p>id(0x580)</p>
     */
    @ComProperty(name = "ProtectSelection", dispId = 0x580)
    Boolean getProtectSelection();
            
    /**
     * <p>id(0x580)</p>
     */
    @ComProperty(name = "ProtectSelection", dispId = 0x580)
    void setProtectSelection(Boolean param0);
            
    /**
     * <p>id(0x581)</p>
     */
    @ComMethod(name = "GetChartElement", dispId = 0x581)
    void GetChartElement(Integer x,
            Integer y,
            Integer ElementID,
            Integer Arg1,
            Integer Arg2);
            
    /**
     * <p>id(0x585)</p>
     */
    @ComMethod(name = "SetSourceData", dispId = 0x585)
    void SetSourceData(Range Source,
            Object PlotBy);
            
    /**
     * <p>id(0x586)</p>
     */
    @ComMethod(name = "Export", dispId = 0x586)
    Boolean Export(String Filename,
            Object FilterName,
            Object Interactive);
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x716)</p>
     */
    @ComProperty(name = "PivotLayout", dispId = 0x716)
    PivotLayout getPivotLayout();
            
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
     * <p>id(0x718)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x718)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
    /**
     * <p>id(0x6ec)</p>
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    void _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x411)</p>
     */
    @ComProperty(name = "Tab", dispId = 0x411)
    Tab getTab();
            
    /**
     * <p>id(0x7e5)</p>
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x7e5)
    eu.doppel_helix.jna.tlb.office2.MsoEnvelope getMailEnvelope();
            
    /**
     * <p>id(0x782)</p>
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
     * <p>id(0x785)</p>
     */
    @ComMethod(name = "SaveAs", dispId = 0x785)
    void SaveAs(String Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout,
            Object Local);
            
    /**
     * <p>id(0x7ed)</p>
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    void Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x9c4)</p>
     */
    @ComMethod(name = "ApplyLayout", dispId = 0x9c4)
    void ApplyLayout(Integer Layout,
            Object ChartType);
            
    /**
     * <p>id(0x9c6)</p>
     */
    @ComMethod(name = "SetElement", dispId = 0x9c6)
    void SetElement(eu.doppel_helix.jna.tlb.office2.MsoChartElementType Element);
            
    /**
     * <p>id(0x9c8)</p>
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x9c8)
    Boolean getShowDataLabelsOverMaximum();
            
    /**
     * <p>id(0x9c8)</p>
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x9c8)
    void setShowDataLabelsOverMaximum(Boolean param0);
            
    /**
     * <p>id(0x9c9)</p>
     */
    @ComProperty(name = "SideWall", dispId = 0x9c9)
    Walls getSideWall();
            
    /**
     * <p>id(0x9ca)</p>
     */
    @ComProperty(name = "BackWall", dispId = 0x9ca)
    Walls getBackWall();
            
    /**
     * <p>id(0x939)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    void PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x9cb)</p>
     */
    @ComMethod(name = "ApplyChartTemplate", dispId = 0x9cb)
    void ApplyChartTemplate(String Filename);
            
    /**
     * <p>id(0x9cc)</p>
     */
    @ComMethod(name = "SaveChartTemplate", dispId = 0x9cc)
    void SaveChartTemplate(String Filename);
            
    /**
     * <p>id(0xdb)</p>
     */
    @ComMethod(name = "SetDefaultChart", dispId = 0xdb)
    void SetDefaultChart(Object Name);
            
    /**
     * <p>id(0x9bd)</p>
     */
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x9bd)
    void ExportAsFixedFormat(XlFixedFormatType Type,
            Object Filename,
            Object Quality,
            Object IncludeDocProperties,
            Object IgnorePrintAreas,
            Object From,
            Object To,
            Object OpenAfterPublish,
            Object FixedFormatExtClassPtr);
            
    /**
     * <p>id(0x9cd)</p>
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9cd)
    Object getChartStyle();
            
    /**
     * <p>id(0x9cd)</p>
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9cd)
    void setChartStyle(Object param0);
            
    /**
     * <p>id(0x9ce)</p>
     */
    @ComMethod(name = "ClearToMatchStyle", dispId = 0x9ce)
    void ClearToMatchStyle();
            
    /**
     * <p>id(0xb29)</p>
     */
    @ComProperty(name = "PrintedCommentPages", dispId = 0xb29)
    Integer getPrintedCommentPages();
            
    /**
     * <p>id(0xb2a)</p>
     */
    @ComProperty(name = "Dummy24", dispId = 0xb2a)
    Boolean getDummy24();
            
    /**
     * <p>id(0xb2a)</p>
     */
    @ComProperty(name = "Dummy24", dispId = 0xb2a)
    void setDummy24(Boolean param0);
            
    /**
     * <p>id(0xb2b)</p>
     */
    @ComProperty(name = "Dummy25", dispId = 0xb2b)
    Boolean getDummy25();
            
    /**
     * <p>id(0xb2b)</p>
     */
    @ComProperty(name = "Dummy25", dispId = 0xb2b)
    void setDummy25(Boolean param0);
            
    /**
     * <p>id(0xb2c)</p>
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0xb2c)
    Boolean getShowReportFilterFieldButtons();
            
    /**
     * <p>id(0xb2c)</p>
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0xb2c)
    void setShowReportFilterFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb2d)</p>
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0xb2d)
    Boolean getShowLegendFieldButtons();
            
    /**
     * <p>id(0xb2d)</p>
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0xb2d)
    void setShowLegendFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb2e)</p>
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0xb2e)
    Boolean getShowAxisFieldButtons();
            
    /**
     * <p>id(0xb2e)</p>
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0xb2e)
    void setShowAxisFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb2f)</p>
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0xb2f)
    Boolean getShowValueFieldButtons();
            
    /**
     * <p>id(0xb2f)</p>
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0xb2f)
    void setShowValueFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb30)</p>
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0xb30)
    Boolean getShowAllFieldButtons();
            
    /**
     * <p>id(0xb30)</p>
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0xb30)
    void setShowAllFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xbe7)</p>
     */
    @ComMethod(name = "FullSeriesCollection", dispId = 0xbe7)
    com.sun.jna.platform.win32.COM.util.IDispatch FullSeriesCollection(Object Index);
            
    /**
     * <p>id(0xbe8)</p>
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xbe8)
    XlCategoryLabelLevel getCategoryLabelLevel();
            
    /**
     * <p>id(0xbe8)</p>
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xbe8)
    void setCategoryLabelLevel(XlCategoryLabelLevel param0);
            
    /**
     * <p>id(0xbe9)</p>
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xbe9)
    XlSeriesNameLevel getSeriesNameLevel();
            
    /**
     * <p>id(0xbe9)</p>
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xbe9)
    void setSeriesNameLevel(XlSeriesNameLevel param0);
            
    /**
     * <p>id(0xbea)</p>
     */
    @ComProperty(name = "HasHiddenContent", dispId = 0xbea)
    Boolean getHasHiddenContent();
            
    /**
     * <p>id(0xbeb)</p>
     */
    @ComMethod(name = "DeleteHiddenContent", dispId = 0xbeb)
    void DeleteHiddenContent();
            
    /**
     * <p>id(0xbec)</p>
     */
    @ComProperty(name = "ChartColor", dispId = 0xbec)
    Object getChartColor();
            
    /**
     * <p>id(0xbec)</p>
     */
    @ComProperty(name = "ChartColor", dispId = 0xbec)
    void setChartColor(Object param0);
            
    /**
     * <p>id(0xbed)</p>
     */
    @ComMethod(name = "ClearToMatchColorStyle", dispId = 0xbed)
    void ClearToMatchColorStyle();
            
    
}