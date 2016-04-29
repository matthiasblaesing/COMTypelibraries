
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002444C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002444C-0000-0000-C000-000000000046}")
public interface CubeField {
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
     * <p>id(0x77e)</p>
     */
    @ComProperty(name = "CubeFieldType", dispId = 0x77e)
    XlCubeFieldType getCubeFieldType();
            
    /**
     * <p>id(0xa6b)</p>
     */
    @ComProperty(name = "_Caption", dispId = 0xa6b)
    String get_Caption();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    XlPivotFieldOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(XlPivotFieldOrientation param0);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    Integer getPosition();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0x77f)</p>
     */
    @ComProperty(name = "TreeviewControl", dispId = 0x77f)
    TreeviewControl getTreeviewControl();
            
    /**
     * <p>id(0x5e4)</p>
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    Boolean getDragToColumn();
            
    /**
     * <p>id(0x5e4)</p>
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    void setDragToColumn(Boolean param0);
            
    /**
     * <p>id(0x5e5)</p>
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    Boolean getDragToHide();
            
    /**
     * <p>id(0x5e5)</p>
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    void setDragToHide(Boolean param0);
            
    /**
     * <p>id(0x5e6)</p>
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    Boolean getDragToPage();
            
    /**
     * <p>id(0x5e6)</p>
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    void setDragToPage(Boolean param0);
            
    /**
     * <p>id(0x5e7)</p>
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    Boolean getDragToRow();
            
    /**
     * <p>id(0x5e7)</p>
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    void setDragToRow(Boolean param0);
            
    /**
     * <p>id(0x734)</p>
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    Boolean getDragToData();
            
    /**
     * <p>id(0x734)</p>
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    void setDragToData(Boolean param0);
            
    /**
     * <p>id(0x780)</p>
     */
    @ComProperty(name = "HiddenLevels", dispId = 0x780)
    Integer getHiddenLevels();
            
    /**
     * <p>id(0x780)</p>
     */
    @ComProperty(name = "HiddenLevels", dispId = 0x780)
    void setHiddenLevels(Integer param0);
            
    /**
     * <p>id(0x885)</p>
     */
    @ComProperty(name = "HasMemberProperties", dispId = 0x885)
    Boolean getHasMemberProperties();
            
    /**
     * <p>id(0x738)</p>
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    XlLayoutFormType getLayoutForm();
            
    /**
     * <p>id(0x738)</p>
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    void setLayoutForm(XlLayoutFormType param0);
            
    /**
     * <p>id(0x2ce)</p>
     */
    @ComProperty(name = "PivotFields", dispId = 0x2ce)
    PivotFields getPivotFields();
            
    /**
     * <p>id(0x886)</p>
     */
    @ComMethod(name = "_AddMemberPropertyField", dispId = 0x886)
    void _AddMemberPropertyField(String Property,
            Object PropertyOrder);
            
    /**
     * <p>id(0x888)</p>
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    Boolean getEnableMultiplePageItems();
            
    /**
     * <p>id(0x888)</p>
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    void setEnableMultiplePageItems(Boolean param0);
            
    /**
     * <p>id(0x736)</p>
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    XlSubtototalLocationType getLayoutSubtotalLocation();
            
    /**
     * <p>id(0x736)</p>
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    void setLayoutSubtotalLocation(XlSubtototalLocationType param0);
            
    /**
     * <p>id(0x889)</p>
     */
    @ComProperty(name = "ShowInFieldList", dispId = 0x889)
    Boolean getShowInFieldList();
            
    /**
     * <p>id(0x889)</p>
     */
    @ComProperty(name = "ShowInFieldList", dispId = 0x889)
    void setShowInFieldList(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xa6c)</p>
     */
    @ComMethod(name = "AddMemberPropertyField", dispId = 0xa6c)
    void AddMemberPropertyField(String Property,
            Object PropertyOrder,
            Object PropertyDisplayedIn);
            
    /**
     * <p>id(0xa1b)</p>
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    Boolean getIncludeNewItemsInFilter();
            
    /**
     * <p>id(0xa1b)</p>
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    void setIncludeNewItemsInFilter(Boolean param0);
            
    /**
     * <p>id(0xa6e)</p>
     */
    @ComProperty(name = "CubeFieldSubType", dispId = 0xa6e)
    XlCubeFieldSubType getCubeFieldSubType();
            
    /**
     * <p>id(0xa21)</p>
     */
    @ComProperty(name = "AllItemsVisible", dispId = 0xa21)
    Boolean getAllItemsVisible();
            
    /**
     * <p>id(0xa22)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    void ClearManualFilter();
            
    /**
     * <p>id(0xa6f)</p>
     */
    @ComMethod(name = "CreatePivotFields", dispId = 0xa6f)
    void CreatePivotFields();
            
    /**
     * <p>id(0x73c)</p>
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    String getCurrentPageName();
            
    /**
     * <p>id(0x73c)</p>
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    void setCurrentPageName(String param0);
            
    /**
     * <p>id(0xa70)</p>
     */
    @ComProperty(name = "IsDate", dispId = 0xa70)
    Boolean getIsDate();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0xb6c)</p>
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    Boolean getFlattenHierarchies();
            
    /**
     * <p>id(0xb6c)</p>
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    void setFlattenHierarchies(Boolean param0);
            
    /**
     * <p>id(0xb6d)</p>
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    Boolean getHierarchizeDistinct();
            
    /**
     * <p>id(0xb6d)</p>
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    void setHierarchizeDistinct(Boolean param0);
            
    
}