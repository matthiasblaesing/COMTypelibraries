
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
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(11)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy(Object Before,
            Object After);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x55d)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x55d)
    String getCodeName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    String get_CodeName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    void set_CodeName(String param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x27d)</p>
     * <p>vtableId(17)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    void Move(Object Before,
            Object After);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.COM.util.IDispatch getNext();
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    String getOnDoubleClick();
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    void setOnDoubleClick(String param0);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    String getOnSheetActivate();
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    void setOnSheetActivate(String param0);
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    String getOnSheetDeactivate();
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    void setOnSheetDeactivate(String param0);
            
    /**
     * <p>id(0x3e6)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x3e6)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.COM.util.IDispatch getPrevious();
            
    /**
     * <p>id(0x389)</p>
     * <p>vtableId(29)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
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
     * <p>vtableId(30)</p>
     * @param EnableChanges [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    void PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(31)</p>
     * @param Password [in, optional] {@code Object}
     * @param DrawingObjects [in, optional] {@code Object}
     * @param Contents [in, optional] {@code Object}
     * @param Scenarios [in, optional] {@code Object}
     * @param UserInterfaceOnly [in, optional] {@code Object}
     */
    @ComMethod(name = "_Protect", dispId = 0x11a)
    void _Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x124)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ProtectContents", dispId = 0x124)
    Boolean getProtectContents();
            
    /**
     * <p>id(0x125)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ProtectDrawingObjects", dispId = 0x125)
    Boolean getProtectDrawingObjects();
            
    /**
     * <p>id(0x487)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    Boolean getProtectionMode();
            
    /**
     * <p>id(0x10017)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "_Dummy23", dispId = 0x10017)
    void _Dummy23();
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(36)</p>
     * @param Filename [in] {@code String}
     * @param FileFormat [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param TextCodepage [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
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
     * <p>vtableId(37)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select(Object Replace);
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(38)</p>
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    XlSheetVisibility getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code XlSheetVisibility}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(XlSheetVisibility param0);
            
    /**
     * <p>id(0x561)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x561)
    Shapes getShapes();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(42)</p>
     * @param Type [in, optional] {@code XlDataLabelsType}
     * @param LegendKey [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param HasLeaderLines [in, optional] {@code Object}
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    void _ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
            Object AutoText,
            Object HasLeaderLines);
            
    /**
     * <p>id(0x2f8)</p>
     * <p>vtableId(43)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Arcs", dispId = 0x2f8)
    com.sun.jna.platform.win32.COM.util.IDispatch Arcs(Object Index);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Area3DGroup", dispId = 0x11)
    ChartGroup getArea3DGroup();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(45)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "AreaGroups", dispId = 0x9)
    com.sun.jna.platform.win32.COM.util.IDispatch AreaGroups(Object Index);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(46)</p>
     * @param Gallery [in] {@code Integer}
     * @param Format [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoFormat", dispId = 0x72)
    void AutoFormat(Integer Gallery,
            Object Format);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6b)
    Boolean getAutoScaling();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoScaling", dispId = 0x6b)
    void setAutoScaling(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(49)</p>
     * @param Type [in, optional] {@code Object}
     * @param AxisGroup [in, optional] {@code XlAxisGroup}
     */
    @ComMethod(name = "Axes", dispId = 0x17)
    com.sun.jna.platform.win32.COM.util.IDispatch Axes(Object Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x4a4)</p>
     * <p>vtableId(50)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "SetBackgroundPicture", dispId = 0x4a4)
    void SetBackgroundPicture(String Filename);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Bar3DGroup", dispId = 0x12)
    ChartGroup getBar3DGroup();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(52)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "BarGroups", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch BarGroups(Object Index);
            
    /**
     * <p>id(0x22d)</p>
     * <p>vtableId(53)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Buttons", dispId = 0x22d)
    com.sun.jna.platform.win32.COM.util.IDispatch Buttons(Object Index);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "ChartArea", dispId = 0x50)
    ChartArea getChartArea();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(55)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ChartGroups", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch ChartGroups(Object Index);
            
    /**
     * <p>id(0x424)</p>
     * <p>vtableId(56)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ChartObjects", dispId = 0x424)
    com.sun.jna.platform.win32.COM.util.IDispatch ChartObjects(Object Index);
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "ChartTitle", dispId = 0x51)
    ChartTitle getChartTitle();
            
    /**
     * <p>id(0xc4)</p>
     * <p>vtableId(58)</p>
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
     * <p>vtableId(59)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckBoxes", dispId = 0x338)
    com.sun.jna.platform.win32.COM.util.IDispatch CheckBoxes(Object Index);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(60)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    void CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Column3DGroup", dispId = 0x13)
    ChartGroup getColumn3DGroup();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(62)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ColumnGroups", dispId = 0xb)
    com.sun.jna.platform.win32.COM.util.IDispatch ColumnGroups(Object Index);
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(63)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     * @param Size [in, optional] {@code XlPictureAppearance}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    void CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            XlPictureAppearance Size);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "Corners", dispId = 0x4f)
    Corners getCorners();
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(65)</p>
     * @param Edition [in, optional] {@code Object}
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Size [in, optional] {@code XlPictureAppearance}
     * @param ContainsPICT [in, optional] {@code Object}
     * @param ContainsBIFF [in, optional] {@code Object}
     * @param ContainsRTF [in, optional] {@code Object}
     * @param ContainsVALU [in, optional] {@code Object}
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
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "DataTable", dispId = 0x573)
    DataTable getDataTable();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "DepthPercent", dispId = 0x30)
    Integer getDepthPercent();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DepthPercent", dispId = 0x30)
    void setDepthPercent(Integer param0);
            
    /**
     * <p>id(0x460)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "Deselect", dispId = 0x460)
    void Deselect();
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    XlDisplayBlanksAs getDisplayBlanksAs();
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code XlDisplayBlanksAs}
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    void setDisplayBlanksAs(XlDisplayBlanksAs param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(72)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "DoughnutGroups", dispId = 0xe)
    com.sun.jna.platform.win32.COM.util.IDispatch DoughnutGroups(Object Index);
            
    /**
     * <p>id(0x304)</p>
     * <p>vtableId(73)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Drawings", dispId = 0x304)
    com.sun.jna.platform.win32.COM.util.IDispatch Drawings(Object Index);
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(74)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "DrawingObjects", dispId = 0x58)
    com.sun.jna.platform.win32.COM.util.IDispatch DrawingObjects(Object Index);
            
    /**
     * <p>id(0x344)</p>
     * <p>vtableId(75)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "DropDowns", dispId = 0x344)
    com.sun.jna.platform.win32.COM.util.IDispatch DropDowns(Object Index);
            
    /**
     * <p>id(0x31)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "Elevation", dispId = 0x31)
    Integer getElevation();
            
    /**
     * <p>id(0x31)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Elevation", dispId = 0x31)
    void setElevation(Integer param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(78)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "Evaluate", dispId = 0x1)
    Object Evaluate(Object Name);
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(79)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(Object Name);
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "Floor", dispId = 0x53)
    Floor getFloor();
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "GapDepth", dispId = 0x32)
    Integer getGapDepth();
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GapDepth", dispId = 0x32)
    void setGapDepth(Integer param0);
            
    /**
     * <p>id(0x342)</p>
     * <p>vtableId(83)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "GroupBoxes", dispId = 0x342)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupBoxes(Object Index);
            
    /**
     * <p>id(0x459)</p>
     * <p>vtableId(84)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "GroupObjects", dispId = 0x459)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupObjects(Object Index);
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(85)</p>
     * @param Index1 [in, optional] {@code Object}
     * @param Index2 [in, optional] {@code Object}
     */
    @ComProperty(name = "HasAxis", dispId = 0x34)
    Object getHasAxis(Object Index1,
            Object Index2);
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(86)</p>
     * @param Index1 [in, optional] {@code Object}
     * @param Index2 [in, optional] {@code Object}
     * @param param2 [in] {@code Object}
     */
    @ComProperty(name = "HasAxis", dispId = 0x34)
    void setHasAxis(Object Index1,
            Object Index2,
            Object param2);
            
    /**
     * <p>id(0x574)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "HasDataTable", dispId = 0x574)
    Boolean getHasDataTable();
            
    /**
     * <p>id(0x574)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDataTable", dispId = 0x574)
    void setHasDataTable(Boolean param0);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "HasLegend", dispId = 0x35)
    Boolean getHasLegend();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasLegend", dispId = 0x35)
    void setHasLegend(Boolean param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    Boolean getHasTitle();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasTitle", dispId = 0x36)
    void setHasTitle(Boolean param0);
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "HeightPercent", dispId = 0x37)
    Integer getHeightPercent();
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HeightPercent", dispId = 0x37)
    void setHeightPercent(Integer param0);
            
    /**
     * <p>id(0x571)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x349)</p>
     * <p>vtableId(96)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Labels", dispId = 0x349)
    com.sun.jna.platform.win32.COM.util.IDispatch Labels(Object Index);
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "Legend", dispId = 0x54)
    Legend getLegend();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "Line3DGroup", dispId = 0x14)
    ChartGroup getLine3DGroup();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(99)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "LineGroups", dispId = 0xc)
    com.sun.jna.platform.win32.COM.util.IDispatch LineGroups(Object Index);
            
    /**
     * <p>id(0x2ff)</p>
     * <p>vtableId(100)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Lines", dispId = 0x2ff)
    com.sun.jna.platform.win32.COM.util.IDispatch Lines(Object Index);
            
    /**
     * <p>id(0x340)</p>
     * <p>vtableId(101)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ListBoxes", dispId = 0x340)
    com.sun.jna.platform.win32.COM.util.IDispatch ListBoxes(Object Index);
            
    /**
     * <p>id(0x575)</p>
     * <p>vtableId(102)</p>
     * @param Where [in] {@code XlChartLocation}
     * @param Name [in, optional] {@code Object}
     */
    @ComMethod(name = "Location", dispId = 0x575)
    Chart Location(XlChartLocation Where,
            Object Name);
            
    /**
     * <p>id(0x31f)</p>
     * <p>vtableId(103)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "OLEObjects", dispId = 0x31f)
    com.sun.jna.platform.win32.COM.util.IDispatch OLEObjects(Object Index);
            
    /**
     * <p>id(0x33a)</p>
     * <p>vtableId(104)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "OptionButtons", dispId = 0x33a)
    com.sun.jna.platform.win32.COM.util.IDispatch OptionButtons(Object Index);
            
    /**
     * <p>id(0x321)</p>
     * <p>vtableId(105)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Ovals", dispId = 0x321)
    com.sun.jna.platform.win32.COM.util.IDispatch Ovals(Object Index);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(106)</p>
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    void Paste(Object Type);
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "Perspective", dispId = 0x39)
    Integer getPerspective();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Perspective", dispId = 0x39)
    void setPerspective(Integer param0);
            
    /**
     * <p>id(0x303)</p>
     * <p>vtableId(109)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Pictures", dispId = 0x303)
    com.sun.jna.platform.win32.COM.util.IDispatch Pictures(Object Index);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "Pie3DGroup", dispId = 0x15)
    ChartGroup getPie3DGroup();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(111)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "PieGroups", dispId = 0xd)
    com.sun.jna.platform.win32.COM.util.IDispatch PieGroups(Object Index);
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "PlotArea", dispId = 0x55)
    PlotArea getPlotArea();
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "PlotVisibleOnly", dispId = 0x5c)
    Boolean getPlotVisibleOnly();
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PlotVisibleOnly", dispId = 0x5c)
    void setPlotVisibleOnly(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(115)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "RadarGroups", dispId = 0xf)
    com.sun.jna.platform.win32.COM.util.IDispatch RadarGroups(Object Index);
            
    /**
     * <p>id(0x306)</p>
     * <p>vtableId(116)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Rectangles", dispId = 0x306)
    com.sun.jna.platform.win32.COM.util.IDispatch Rectangles(Object Index);
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x3a)
    Object getRightAngleAxes();
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "RightAngleAxes", dispId = 0x3a)
    void setRightAngleAxes(Object param0);
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    Object getRotation();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Rotation", dispId = 0x3b)
    void setRotation(Object param0);
            
    /**
     * <p>id(0x33e)</p>
     * <p>vtableId(121)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ScrollBars", dispId = 0x33e)
    com.sun.jna.platform.win32.COM.util.IDispatch ScrollBars(Object Index);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(122)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "SeriesCollection", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch SeriesCollection(Object Index);
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "SizeWithWindow", dispId = 0x5e)
    Boolean getSizeWithWindow();
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SizeWithWindow", dispId = 0x5e)
    void setSizeWithWindow(Boolean param0);
            
    /**
     * <p>id(0x577)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "ShowWindow", dispId = 0x577)
    Boolean getShowWindow();
            
    /**
     * <p>id(0x577)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowWindow", dispId = 0x577)
    void setShowWindow(Boolean param0);
            
    /**
     * <p>id(0x346)</p>
     * <p>vtableId(127)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Spinners", dispId = 0x346)
    com.sun.jna.platform.win32.COM.util.IDispatch Spinners(Object Index);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    Integer getSubType();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(129)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SubType", dispId = 0x6d)
    void setSubType(Integer param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "SurfaceGroup", dispId = 0x16)
    ChartGroup getSurfaceGroup();
            
    /**
     * <p>id(0x309)</p>
     * <p>vtableId(131)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "TextBoxes", dispId = 0x309)
    com.sun.jna.platform.win32.COM.util.IDispatch TextBoxes(Object Index);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(132)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(133)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(Integer param0);
            
    /**
     * <p>id(0x578)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    XlChartType getChartType();
            
    /**
     * <p>id(0x578)</p>
     * <p>vtableId(135)</p>
     * @param param0 [in] {@code XlChartType}
     */
    @ComProperty(name = "ChartType", dispId = 0x578)
    void setChartType(XlChartType param0);
            
    /**
     * <p>id(0x579)</p>
     * <p>vtableId(136)</p>
     * @param ChartType [in] {@code XlChartType}
     * @param TypeName [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyCustomType", dispId = 0x579)
    void ApplyCustomType(XlChartType ChartType,
            Object TypeName);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "Walls", dispId = 0x56)
    Walls getWalls();
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "WallsAndGridlines2D", dispId = 0xd2)
    Boolean getWallsAndGridlines2D();
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WallsAndGridlines2D", dispId = 0xd2)
    void setWallsAndGridlines2D(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(140)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "XYGroups", dispId = 0x10)
    com.sun.jna.platform.win32.COM.util.IDispatch XYGroups(Object Index);
            
    /**
     * <p>id(0x57b)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    XlBarShape getBarShape();
            
    /**
     * <p>id(0x57b)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code XlBarShape}
     */
    @ComProperty(name = "BarShape", dispId = 0x57b)
    void setBarShape(XlBarShape param0);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    XlRowCol getPlotBy();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code XlRowCol}
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    void setPlotBy(XlRowCol param0);
            
    /**
     * <p>id(0x57c)</p>
     * <p>vtableId(145)</p>
     */
    @ComMethod(name = "CopyChartBuild", dispId = 0x57c)
    void CopyChartBuild();
            
    /**
     * <p>id(0x57d)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "ProtectFormatting", dispId = 0x57d)
    Boolean getProtectFormatting();
            
    /**
     * <p>id(0x57d)</p>
     * <p>vtableId(147)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ProtectFormatting", dispId = 0x57d)
    void setProtectFormatting(Boolean param0);
            
    /**
     * <p>id(0x57e)</p>
     * <p>vtableId(148)</p>
     */
    @ComProperty(name = "ProtectData", dispId = 0x57e)
    Boolean getProtectData();
            
    /**
     * <p>id(0x57e)</p>
     * <p>vtableId(149)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ProtectData", dispId = 0x57e)
    void setProtectData(Boolean param0);
            
    /**
     * <p>id(0x57f)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "ProtectGoalSeek", dispId = 0x57f)
    Boolean getProtectGoalSeek();
            
    /**
     * <p>id(0x57f)</p>
     * <p>vtableId(151)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ProtectGoalSeek", dispId = 0x57f)
    void setProtectGoalSeek(Boolean param0);
            
    /**
     * <p>id(0x580)</p>
     * <p>vtableId(152)</p>
     */
    @ComProperty(name = "ProtectSelection", dispId = 0x580)
    Boolean getProtectSelection();
            
    /**
     * <p>id(0x580)</p>
     * <p>vtableId(153)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ProtectSelection", dispId = 0x580)
    void setProtectSelection(Boolean param0);
            
    /**
     * <p>id(0x581)</p>
     * <p>vtableId(154)</p>
     * @param x [in] {@code Integer}
     * @param y [in] {@code Integer}
     * @param ElementID [in] {@code Integer}
     * @param Arg1 [in] {@code Integer}
     * @param Arg2 [in] {@code Integer}
     */
    @ComMethod(name = "GetChartElement", dispId = 0x581)
    void GetChartElement(Integer x,
            Integer y,
            Integer ElementID,
            Integer Arg1,
            Integer Arg2);
            
    /**
     * <p>id(0x585)</p>
     * <p>vtableId(155)</p>
     * @param Source [in] {@code Range}
     * @param PlotBy [in, optional] {@code Object}
     */
    @ComMethod(name = "SetSourceData", dispId = 0x585)
    void SetSourceData(Range Source,
            Object PlotBy);
            
    /**
     * <p>id(0x586)</p>
     * <p>vtableId(156)</p>
     * @param Filename [in] {@code String}
     * @param FilterName [in, optional] {@code Object}
     * @param Interactive [in, optional] {@code Object}
     */
    @ComMethod(name = "Export", dispId = 0x586)
    Boolean Export(String Filename,
            Object FilterName,
            Object Interactive);
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(157)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x716)</p>
     * <p>vtableId(158)</p>
     */
    @ComProperty(name = "PivotLayout", dispId = 0x716)
    PivotLayout getPivotLayout();
            
    /**
     * <p>id(0x717)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "HasPivotFields", dispId = 0x717)
    Boolean getHasPivotFields();
            
    /**
     * <p>id(0x717)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasPivotFields", dispId = 0x717)
    void setHasPivotFields(Boolean param0);
            
    /**
     * <p>id(0x718)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x718)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(162)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "Tab", dispId = 0x411)
    Tab getTab();
            
    /**
     * <p>id(0x7e5)</p>
     * <p>vtableId(164)</p>
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x7e5)
    eu.doppel_helix.jna.tlb.office2.MsoEnvelope getMailEnvelope();
            
    /**
     * <p>id(0x782)</p>
     * <p>vtableId(165)</p>
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
     * <p>id(0x785)</p>
     * <p>vtableId(166)</p>
     * @param Filename [in] {@code String}
     * @param FileFormat [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param TextCodepage [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
     * @param Local [in, optional] {@code Object}
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
     * <p>vtableId(167)</p>
     * @param Password [in, optional] {@code Object}
     * @param DrawingObjects [in, optional] {@code Object}
     * @param Contents [in, optional] {@code Object}
     * @param Scenarios [in, optional] {@code Object}
     * @param UserInterfaceOnly [in, optional] {@code Object}
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    void Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x9c4)</p>
     * <p>vtableId(168)</p>
     * @param Layout [in] {@code Integer}
     * @param ChartType [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyLayout", dispId = 0x9c4)
    void ApplyLayout(Integer Layout,
            Object ChartType);
            
    /**
     * <p>id(0x9c6)</p>
     * <p>vtableId(169)</p>
     * @param Element [in] {@code eu.doppel_helix.jna.tlb.office2.MsoChartElementType}
     */
    @ComMethod(name = "SetElement", dispId = 0x9c6)
    void SetElement(eu.doppel_helix.jna.tlb.office2.MsoChartElementType Element);
            
    /**
     * <p>id(0x9c8)</p>
     * <p>vtableId(170)</p>
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x9c8)
    Boolean getShowDataLabelsOverMaximum();
            
    /**
     * <p>id(0x9c8)</p>
     * <p>vtableId(171)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDataLabelsOverMaximum", dispId = 0x9c8)
    void setShowDataLabelsOverMaximum(Boolean param0);
            
    /**
     * <p>id(0x9c9)</p>
     * <p>vtableId(172)</p>
     */
    @ComProperty(name = "SideWall", dispId = 0x9c9)
    Walls getSideWall();
            
    /**
     * <p>id(0x9ca)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "BackWall", dispId = 0x9ca)
    Walls getBackWall();
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(174)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(175)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "ApplyChartTemplate", dispId = 0x9cb)
    void ApplyChartTemplate(String Filename);
            
    /**
     * <p>id(0x9cc)</p>
     * <p>vtableId(176)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "SaveChartTemplate", dispId = 0x9cc)
    void SaveChartTemplate(String Filename);
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(177)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "SetDefaultChart", dispId = 0xdb)
    void SetDefaultChart(Object Name);
            
    /**
     * <p>id(0x9bd)</p>
     * <p>vtableId(178)</p>
     * @param Type [in] {@code XlFixedFormatType}
     * @param Filename [in, optional] {@code Object}
     * @param Quality [in, optional] {@code Object}
     * @param IncludeDocProperties [in, optional] {@code Object}
     * @param IgnorePrintAreas [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param OpenAfterPublish [in, optional] {@code Object}
     * @param FixedFormatExtClassPtr [in, optional] {@code Object}
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
     * <p>vtableId(179)</p>
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9cd)
    Object getChartStyle();
            
    /**
     * <p>id(0x9cd)</p>
     * <p>vtableId(180)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ChartStyle", dispId = 0x9cd)
    void setChartStyle(Object param0);
            
    /**
     * <p>id(0x9ce)</p>
     * <p>vtableId(181)</p>
     */
    @ComMethod(name = "ClearToMatchStyle", dispId = 0x9ce)
    void ClearToMatchStyle();
            
    /**
     * <p>id(0xb29)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "PrintedCommentPages", dispId = 0xb29)
    Integer getPrintedCommentPages();
            
    /**
     * <p>id(0xb2a)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "Dummy24", dispId = 0xb2a)
    Boolean getDummy24();
            
    /**
     * <p>id(0xb2a)</p>
     * <p>vtableId(184)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Dummy24", dispId = 0xb2a)
    void setDummy24(Boolean param0);
            
    /**
     * <p>id(0xb2b)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "Dummy25", dispId = 0xb2b)
    Boolean getDummy25();
            
    /**
     * <p>id(0xb2b)</p>
     * <p>vtableId(186)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Dummy25", dispId = 0xb2b)
    void setDummy25(Boolean param0);
            
    /**
     * <p>id(0xb2c)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0xb2c)
    Boolean getShowReportFilterFieldButtons();
            
    /**
     * <p>id(0xb2c)</p>
     * <p>vtableId(188)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowReportFilterFieldButtons", dispId = 0xb2c)
    void setShowReportFilterFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb2d)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0xb2d)
    Boolean getShowLegendFieldButtons();
            
    /**
     * <p>id(0xb2d)</p>
     * <p>vtableId(190)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowLegendFieldButtons", dispId = 0xb2d)
    void setShowLegendFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb2e)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0xb2e)
    Boolean getShowAxisFieldButtons();
            
    /**
     * <p>id(0xb2e)</p>
     * <p>vtableId(192)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAxisFieldButtons", dispId = 0xb2e)
    void setShowAxisFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb2f)</p>
     * <p>vtableId(193)</p>
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0xb2f)
    Boolean getShowValueFieldButtons();
            
    /**
     * <p>id(0xb2f)</p>
     * <p>vtableId(194)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowValueFieldButtons", dispId = 0xb2f)
    void setShowValueFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xb30)</p>
     * <p>vtableId(195)</p>
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0xb30)
    Boolean getShowAllFieldButtons();
            
    /**
     * <p>id(0xb30)</p>
     * <p>vtableId(196)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAllFieldButtons", dispId = 0xb30)
    void setShowAllFieldButtons(Boolean param0);
            
    /**
     * <p>id(0xbe7)</p>
     * <p>vtableId(197)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "FullSeriesCollection", dispId = 0xbe7)
    com.sun.jna.platform.win32.COM.util.IDispatch FullSeriesCollection(Object Index);
            
    /**
     * <p>id(0xbe8)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xbe8)
    XlCategoryLabelLevel getCategoryLabelLevel();
            
    /**
     * <p>id(0xbe8)</p>
     * <p>vtableId(199)</p>
     * @param param0 [in] {@code XlCategoryLabelLevel}
     */
    @ComProperty(name = "CategoryLabelLevel", dispId = 0xbe8)
    void setCategoryLabelLevel(XlCategoryLabelLevel param0);
            
    /**
     * <p>id(0xbe9)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xbe9)
    XlSeriesNameLevel getSeriesNameLevel();
            
    /**
     * <p>id(0xbe9)</p>
     * <p>vtableId(201)</p>
     * @param param0 [in] {@code XlSeriesNameLevel}
     */
    @ComProperty(name = "SeriesNameLevel", dispId = 0xbe9)
    void setSeriesNameLevel(XlSeriesNameLevel param0);
            
    /**
     * <p>id(0xbea)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "HasHiddenContent", dispId = 0xbea)
    Boolean getHasHiddenContent();
            
    /**
     * <p>id(0xbeb)</p>
     * <p>vtableId(203)</p>
     */
    @ComMethod(name = "DeleteHiddenContent", dispId = 0xbeb)
    void DeleteHiddenContent();
            
    /**
     * <p>id(0xbec)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "ChartColor", dispId = 0xbec)
    Object getChartColor();
            
    /**
     * <p>id(0xbec)</p>
     * <p>vtableId(205)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ChartColor", dispId = 0xbec)
    void setChartColor(Object param0);
            
    /**
     * <p>id(0xbed)</p>
     * <p>vtableId(206)</p>
     */
    @ComMethod(name = "ClearToMatchColorStyle", dispId = 0xbed)
    void ClearToMatchColorStyle();
            
    
}