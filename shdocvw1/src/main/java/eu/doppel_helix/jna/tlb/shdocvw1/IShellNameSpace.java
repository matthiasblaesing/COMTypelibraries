
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IShellNameSpace Interface
 *
 * <p>uuid({E572D3C9-37BE-4AE2-825D-D521763E3108})</p>
 */
@ComInterface(iid="{E572D3C9-37BE-4AE2-825D-D521763E3108}")
public interface IShellNameSpace {
    /**
     * method MoveSelectionUp
     *
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "MoveSelectionUp", dispId = 0x1)
    void MoveSelectionUp();
            
    /**
     * method MoveSelectionDown
     *
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "MoveSelectionDown", dispId = 0x2)
    void MoveSelectionDown();
            
    /**
     * method ResetSort
     *
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "ResetSort", dispId = 0x3)
    void ResetSort();
            
    /**
     * method NewFolder
     *
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "NewFolder", dispId = 0x4)
    void NewFolder();
            
    /**
     * method Synchronize
     *
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Synchronize", dispId = 0x5)
    void Synchronize();
            
    /**
     * method Import
     *
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Import", dispId = 0x6)
    void Import();
            
    /**
     * method Export
     *
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "Export", dispId = 0x7)
    void Export();
            
    /**
     * method InvokeContextMenuCommand
     *
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "InvokeContextMenuCommand", dispId = 0x8)
    void InvokeContextMenuCommand(String strCommand);
            
    /**
     * method MoveSelectionTo
     *
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "MoveSelectionTo", dispId = 0x9)
    void MoveSelectionTo();
            
    /**
     * Query to see if subscriptions are enabled
     *
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "SubscriptionsEnabled", dispId = 0xa)
    Boolean getSubscriptionsEnabled();
            
    /**
     * method CreateSubscriptionForSelection
     *
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "CreateSubscriptionForSelection", dispId = 0xb)
    Boolean CreateSubscriptionForSelection();
            
    /**
     * method DeleteSubscriptionForSelection
     *
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "DeleteSubscriptionForSelection", dispId = 0xc)
    Boolean DeleteSubscriptionForSelection();
            
    /**
     * old, use put_Root() instead
     *
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "SetRoot", dispId = 0xd)
    void SetRoot(String bstrFullPath);
            
    /**
     * options 
     *
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "EnumOptions", dispId = 0xe)
    Integer getEnumOptions();
            
    /**
     * options 
     *
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "EnumOptions", dispId = 0xe)
    void setEnumOptions(Integer param0);
            
    /**
     * get the selected item
     *
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "SelectedItem", dispId = 0xf)
    com.sun.jna.platform.win32.COM.util.IDispatch getSelectedItem();
            
    /**
     * get the selected item
     *
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "SelectedItem", dispId = 0xf)
    void setSelectedItem(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * get the root item
     *
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Root", dispId = 0x10)
    Object getRoot();
            
    /**
     * get the root item
     *
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Root", dispId = 0x10)
    void setRoot(Object param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Depth", dispId = 0x11)
    Integer getDepth();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Depth", dispId = 0x11)
    void setDepth(Integer param0);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x12)
    Integer getMode();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x12)
    void setMode(Integer param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Flags", dispId = 0x13)
    Integer getFlags();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Flags", dispId = 0x13)
    void setFlags(Integer param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "TVFlags", dispId = 0x14)
    void setTVFlags(Integer param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "TVFlags", dispId = 0x14)
    Integer getTVFlags();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x15)
    String getColumns();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x15)
    void setColumns(String param0);
            
    /**
     * number of view types
     *
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "CountViewTypes", dispId = 0x16)
    Integer getCountViewTypes();
            
    /**
     * set view type
     *
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "SetViewType", dispId = 0x17)
    void SetViewType(Integer iType);
            
    /**
     * collection of selected items
     *
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "SelectedItems", dispId = 0x18)
    com.sun.jna.platform.win32.COM.util.IDispatch SelectedItems();
            
    /**
     * expands item specified depth
     *
     * <p>id(0x19)</p>
     */
    @ComMethod(name = "Expand", dispId = 0x19)
    void Expand(Object var,
            Integer iDepth);
            
    /**
     * unselects all items
     *
     * <p>id(0x1a)</p>
     */
    @ComMethod(name = "UnselectAll", dispId = 0x1a)
    void UnselectAll();
            
    
}