
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020874-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020874-0000-0000-C000-000000000046}")
public interface PivotField extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x13c)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    XlPivotFieldCalculation getCalculation();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code XlPivotFieldCalculation}
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    void setCalculation(XlPivotFieldCalculation param0);
            
    /**
     * <p>id(0x2e0)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ChildField", dispId = 0x2e0)
    PivotField getChildField();
            
    /**
     * <p>id(0x2da)</p>
     * <p>vtableId(13)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ChildItems", dispId = 0x2da)
    Object getChildItems(Object Index);
            
    /**
     * <p>id(0x2e2)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "CurrentPage", dispId = 0x2e2)
    Object getCurrentPage();
            
    /**
     * <p>id(0x2e2)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CurrentPage", dispId = 0x2e2)
    void setCurrentPage(Object param0);
            
    /**
     * <p>id(0x2d0)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DataRange", dispId = 0x2d0)
    Range getDataRange();
            
    /**
     * <p>id(0x2d2)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    XlPivotFieldDataType getDataType();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(String param0);
            
    /**
     * <p>id(0x383)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Function", dispId = 0x383)
    XlConsolidationFunction getFunction();
            
    /**
     * <p>id(0x383)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code XlConsolidationFunction}
     */
    @ComProperty(name = "Function", dispId = 0x383)
    void setFunction(XlConsolidationFunction param0);
            
    /**
     * <p>id(0x2d3)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "GroupLevel", dispId = 0x2d3)
    Object getGroupLevel();
            
    /**
     * <p>id(0x2d8)</p>
     * <p>vtableId(23)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "HiddenItems", dispId = 0x2d8)
    Object getHiddenItems(Object Index);
            
    /**
     * <p>id(0x2cf)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "LabelRange", dispId = 0x2cf)
    Range getLabelRange();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    String getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    XlPivotFieldOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code XlPivotFieldOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(XlPivotFieldOrientation param0);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    Boolean getShowAllItems();
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    void setShowAllItems(Boolean param0);
            
    /**
     * <p>id(0x2dc)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ParentField", dispId = 0x2dc)
    PivotField getParentField();
            
    /**
     * <p>id(0x2d9)</p>
     * <p>vtableId(34)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ParentItems", dispId = 0x2d9)
    Object getParentItems(Object Index);
            
    /**
     * <p>id(0x2e1)</p>
     * <p>vtableId(35)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "PivotItems", dispId = 0x2e1)
    Object PivotItems(Object Index);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    Object getPosition();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(Object param0);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    String getSourceName();
            
    /**
     * <p>id(0x2dd)</p>
     * <p>vtableId(39)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "Subtotals", dispId = 0x2dd)
    Object getSubtotals(Object Index);
            
    /**
     * <p>id(0x2dd)</p>
     * <p>vtableId(40)</p>
     * @param Index [in, optional] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Subtotals", dispId = 0x2dd)
    void setSubtotals(Object Index,
            Object param1);
            
    /**
     * <p>id(0x2de)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "BaseField", dispId = 0x2de)
    Object getBaseField();
            
    /**
     * <p>id(0x2de)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "BaseField", dispId = 0x2de)
    void setBaseField(Object param0);
            
    /**
     * <p>id(0x2df)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "BaseItem", dispId = 0x2df)
    Object getBaseItem();
            
    /**
     * <p>id(0x2df)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "BaseItem", dispId = 0x2df)
    void setBaseItem(Object param0);
            
    /**
     * <p>id(0x2d4)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "TotalLevels", dispId = 0x2d4)
    Object getTotalLevels();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(String param0);
            
    /**
     * <p>id(0x2d7)</p>
     * <p>vtableId(48)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "VisibleItems", dispId = 0x2d7)
    Object getVisibleItems(Object Index);
            
    /**
     * <p>id(0x5e3)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "CalculatedItems", dispId = 0x5e3)
    CalculatedItems CalculatedItems();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(50)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x5e4)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    Boolean getDragToColumn();
            
    /**
     * <p>id(0x5e4)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    void setDragToColumn(Boolean param0);
            
    /**
     * <p>id(0x5e5)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    Boolean getDragToHide();
            
    /**
     * <p>id(0x5e5)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    void setDragToHide(Boolean param0);
            
    /**
     * <p>id(0x5e6)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    Boolean getDragToPage();
            
    /**
     * <p>id(0x5e6)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    void setDragToPage(Boolean param0);
            
    /**
     * <p>id(0x5e7)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    Boolean getDragToRow();
            
    /**
     * <p>id(0x5e7)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    void setDragToRow(Boolean param0);
            
    /**
     * <p>id(0x734)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    Boolean getDragToData();
            
    /**
     * <p>id(0x734)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    void setDragToData(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x5e8)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "IsCalculated", dispId = 0x5e8)
    Boolean getIsCalculated();
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    Integer getMemoryUsed();
            
    /**
     * <p>id(0x5e9)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "ServerBased", dispId = 0x5e9)
    Boolean getServerBased();
            
    /**
     * <p>id(0x5e9)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ServerBased", dispId = 0x5e9)
    void setServerBased(Boolean param0);
            
    /**
     * <p>id(0xa13)</p>
     * <p>vtableId(67)</p>
     * @param Order [in] {@code Integer}
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "_AutoSort", dispId = 0xa13)
    void _AutoSort(Integer Order,
            String Field);
            
    /**
     * <p>id(0x5eb)</p>
     * <p>vtableId(68)</p>
     * @param Type [in] {@code Integer}
     * @param Range [in] {@code Integer}
     * @param Count [in] {@code Integer}
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "AutoShow", dispId = 0x5eb)
    void AutoShow(Integer Type,
            Integer Range,
            Integer Count,
            String Field);
            
    /**
     * <p>id(0x5ec)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "AutoSortOrder", dispId = 0x5ec)
    Integer getAutoSortOrder();
            
    /**
     * <p>id(0x5ed)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "AutoSortField", dispId = 0x5ed)
    String getAutoSortField();
            
    /**
     * <p>id(0x5ee)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "AutoShowType", dispId = 0x5ee)
    Integer getAutoShowType();
            
    /**
     * <p>id(0x5ef)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "AutoShowRange", dispId = 0x5ef)
    Integer getAutoShowRange();
            
    /**
     * <p>id(0x5f0)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "AutoShowCount", dispId = 0x5f0)
    Integer getAutoShowCount();
            
    /**
     * <p>id(0x5f1)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "AutoShowField", dispId = 0x5f1)
    String getAutoShowField();
            
    /**
     * <p>id(0x735)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "LayoutBlankLine", dispId = 0x735)
    Boolean getLayoutBlankLine();
            
    /**
     * <p>id(0x735)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutBlankLine", dispId = 0x735)
    void setLayoutBlankLine(Boolean param0);
            
    /**
     * <p>id(0x736)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    XlSubtototalLocationType getLayoutSubtotalLocation();
            
    /**
     * <p>id(0x736)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code XlSubtototalLocationType}
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    void setLayoutSubtotalLocation(XlSubtototalLocationType param0);
            
    /**
     * <p>id(0x737)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "LayoutPageBreak", dispId = 0x737)
    Boolean getLayoutPageBreak();
            
    /**
     * <p>id(0x737)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutPageBreak", dispId = 0x737)
    void setLayoutPageBreak(Boolean param0);
            
    /**
     * <p>id(0x738)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    XlLayoutFormType getLayoutForm();
            
    /**
     * <p>id(0x738)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code XlLayoutFormType}
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    void setLayoutForm(XlLayoutFormType param0);
            
    /**
     * <p>id(0x739)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "SubtotalName", dispId = 0x739)
    String getSubtotalName();
            
    /**
     * <p>id(0x739)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SubtotalName", dispId = 0x739)
    void setSubtotalName(String param0);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    Boolean getDrilledDown();
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    void setDrilledDown(Boolean param0);
            
    /**
     * <p>id(0x73b)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "CubeField", dispId = 0x73b)
    CubeField getCubeField();
            
    /**
     * <p>id(0x73c)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    String getCurrentPageName();
            
    /**
     * <p>id(0x73c)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    void setCurrentPageName(String param0);
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    String getStandardFormula();
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    void setStandardFormula(String param0);
            
    /**
     * <p>id(0x85b)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "HiddenItemsList", dispId = 0x85b)
    Object getHiddenItemsList();
            
    /**
     * <p>id(0x85b)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "HiddenItemsList", dispId = 0x85b)
    void setHiddenItemsList(Object param0);
            
    /**
     * <p>id(0x85c)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "DatabaseSort", dispId = 0x85c)
    Boolean getDatabaseSort();
            
    /**
     * <p>id(0x85c)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DatabaseSort", dispId = 0x85c)
    void setDatabaseSort(Boolean param0);
            
    /**
     * <p>id(0x85d)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "IsMemberProperty", dispId = 0x85d)
    Boolean getIsMemberProperty();
            
    /**
     * <p>id(0x85e)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "PropertyParentField", dispId = 0x85e)
    PivotField getPropertyParentField();
            
    /**
     * <p>id(0x85f)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "PropertyOrder", dispId = 0x85f)
    Integer getPropertyOrder();
            
    /**
     * <p>id(0x85f)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PropertyOrder", dispId = 0x85f)
    void setPropertyOrder(Integer param0);
            
    /**
     * <p>id(0x860)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "EnableItemSelection", dispId = 0x860)
    Boolean getEnableItemSelection();
            
    /**
     * <p>id(0x860)</p>
     * <p>vtableId(103)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableItemSelection", dispId = 0x860)
    void setEnableItemSelection(Boolean param0);
            
    /**
     * <p>id(0x861)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "CurrentPageList", dispId = 0x861)
    Object getCurrentPageList();
            
    /**
     * <p>id(0x861)</p>
     * <p>vtableId(105)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CurrentPageList", dispId = 0x861)
    void setCurrentPageList(Object param0);
            
    /**
     * <p>id(0x862)</p>
     * <p>vtableId(106)</p>
     * @param Item [in] {@code String}
     * @param ClearList [in, optional] {@code Object}
     */
    @ComMethod(name = "AddPageItem", dispId = 0x862)
    void AddPageItem(String Item,
            Object ClearList);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    Boolean getHidden();
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    void setHidden(Boolean param0);
            
    /**
     * <p>id(0xa14)</p>
     * <p>vtableId(109)</p>
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    void DrillTo(String Field);
            
    /**
     * <p>id(0xa15)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "UseMemberPropertyAsCaption", dispId = 0xa15)
    Boolean getUseMemberPropertyAsCaption();
            
    /**
     * <p>id(0xa15)</p>
     * <p>vtableId(111)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseMemberPropertyAsCaption", dispId = 0xa15)
    void setUseMemberPropertyAsCaption(Boolean param0);
            
    /**
     * <p>id(0xa16)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "MemberPropertyCaption", dispId = 0xa16)
    String getMemberPropertyCaption();
            
    /**
     * <p>id(0xa16)</p>
     * <p>vtableId(113)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MemberPropertyCaption", dispId = 0xa16)
    void setMemberPropertyCaption(String param0);
            
    /**
     * <p>id(0xa17)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "DisplayAsTooltip", dispId = 0xa17)
    Boolean getDisplayAsTooltip();
            
    /**
     * <p>id(0xa17)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAsTooltip", dispId = 0xa17)
    void setDisplayAsTooltip(Boolean param0);
            
    /**
     * <p>id(0xa18)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "DisplayInReport", dispId = 0xa18)
    Boolean getDisplayInReport();
            
    /**
     * <p>id(0xa18)</p>
     * <p>vtableId(117)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayInReport", dispId = 0xa18)
    void setDisplayInReport(Boolean param0);
            
    /**
     * <p>id(0xa19)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "DisplayAsCaption", dispId = 0xa19)
    Boolean getDisplayAsCaption();
            
    /**
     * <p>id(0xa1a)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "LayoutCompactRow", dispId = 0xa1a)
    Boolean getLayoutCompactRow();
            
    /**
     * <p>id(0xa1a)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutCompactRow", dispId = 0xa1a)
    void setLayoutCompactRow(Boolean param0);
            
    /**
     * <p>id(0xa1b)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    Boolean getIncludeNewItemsInFilter();
            
    /**
     * <p>id(0xa1b)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    void setIncludeNewItemsInFilter(Boolean param0);
            
    /**
     * <p>id(0xa1c)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "VisibleItemsList", dispId = 0xa1c)
    Object getVisibleItemsList();
            
    /**
     * <p>id(0xa1c)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "VisibleItemsList", dispId = 0xa1c)
    void setVisibleItemsList(Object param0);
            
    /**
     * <p>id(0xa1d)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "PivotFilters", dispId = 0xa1d)
    PivotFilters getPivotFilters();
            
    /**
     * <p>id(0xa1e)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "AutoSortPivotLine", dispId = 0xa1e)
    PivotLine getAutoSortPivotLine();
            
    /**
     * <p>id(0xa1f)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "AutoSortCustomSubtotal", dispId = 0xa1f)
    Integer getAutoSortCustomSubtotal();
            
    /**
     * <p>id(0xa20)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "ShowingInAxis", dispId = 0xa20)
    Boolean getShowingInAxis();
            
    /**
     * <p>id(0x888)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    Boolean getEnableMultiplePageItems();
            
    /**
     * <p>id(0x888)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    void setEnableMultiplePageItems(Boolean param0);
            
    /**
     * <p>id(0xa21)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "AllItemsVisible", dispId = 0xa21)
    Boolean getAllItemsVisible();
            
    /**
     * <p>id(0xa22)</p>
     * <p>vtableId(132)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    void ClearManualFilter();
            
    /**
     * <p>id(0xa01)</p>
     * <p>vtableId(133)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    void ClearAllFilters();
            
    /**
     * <p>id(0xa23)</p>
     * <p>vtableId(134)</p>
     */
    @ComMethod(name = "ClearValueFilters", dispId = 0xa23)
    void ClearValueFilters();
            
    /**
     * <p>id(0xa24)</p>
     * <p>vtableId(135)</p>
     */
    @ComMethod(name = "ClearLabelFilters", dispId = 0xa24)
    void ClearLabelFilters();
            
    /**
     * <p>id(0x5ea)</p>
     * <p>vtableId(136)</p>
     * @param Order [in] {@code Integer}
     * @param Field [in] {@code String}
     * @param PivotLine [in, optional] {@code Object}
     * @param CustomSubtotal [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoSort", dispId = 0x5ea)
    void AutoSort(Integer Order,
            String Field,
            Object PivotLine,
            Object CustomSubtotal);
            
    /**
     * <p>id(0xa27)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "SourceCaption", dispId = 0xa27)
    String getSourceCaption();
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    Boolean getShowDetail();
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    void setShowDetail(Boolean param0);
            
    /**
     * <p>id(0xb45)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "RepeatLabels", dispId = 0xb45)
    Boolean getRepeatLabels();
            
    /**
     * <p>id(0xb45)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RepeatLabels", dispId = 0xb45)
    void setRepeatLabels(Boolean param0);
            
    
}