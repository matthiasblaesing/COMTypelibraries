
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063003-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063003-0000-0000-C000-000000000046}")
public interface _Explorer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2100)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x2100)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x2101)</p>
     */
    @ComProperty(name = "CurrentFolder", dispId = 0x2101)
    MAPIFolder getCurrentFolder();
            
    /**
     * <p>id(0x2101)</p>
     */
    @ComProperty(name = "CurrentFolder", dispId = 0x2101)
    void setCurrentFolder(MAPIFolder param0);
            
    /**
     * <p>id(0x2103)</p>
     */
    @ComMethod(name = "Close", dispId = 0x2103)
    void Close();
            
    /**
     * <p>id(0x2104)</p>
     */
    @ComMethod(name = "Display", dispId = 0x2104)
    void Display();
            
    /**
     * <p>id(0x2111)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x2111)
    String getCaption();
            
    /**
     * <p>id(0x2200)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x2200)
    Object getCurrentView();
            
    /**
     * <p>id(0x2200)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x2200)
    void setCurrentView(Object param0);
            
    /**
     * <p>id(0x2114)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2114)
    Integer getHeight();
            
    /**
     * <p>id(0x2114)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2114)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x2115)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2115)
    Integer getLeft();
            
    /**
     * <p>id(0x2115)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2115)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x2201)</p>
     */
    @ComProperty(name = "Panes", dispId = 0x2201)
    Panes getPanes();
            
    /**
     * <p>id(0x2202)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x2202)
    Selection getSelection();
            
    /**
     * <p>id(0x2116)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2116)
    Integer getTop();
            
    /**
     * <p>id(0x2116)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2116)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x2117)</p>
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    Integer getWidth();
            
    /**
     * <p>id(0x2117)</p>
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x2112)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x2112)
    OlWindowState getWindowState();
            
    /**
     * <p>id(0x2112)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x2112)
    void setWindowState(OlWindowState param0);
            
    /**
     * <p>id(0x2113)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x2113)
    void Activate();
            
    /**
     * <p>id(0x2203)</p>
     */
    @ComMethod(name = "IsPaneVisible", dispId = 0x2203)
    Boolean IsPaneVisible(OlPane Pane);
            
    /**
     * <p>id(0x2204)</p>
     */
    @ComMethod(name = "ShowPane", dispId = 0x2204)
    void ShowPane(OlPane Pane,
            Boolean Visible);
            
    /**
     * <p>id(0x3109)</p>
     */
    @ComProperty(name = "Views", dispId = 0x3109)
    com.sun.jna.platform.win32.COM.util.IDispatch getViews();
            
    /**
     * <p>id(0xfa92)</p>
     */
    @ComProperty(name = "HTMLDocument", dispId = 0xfa92)
    com.sun.jna.platform.win32.COM.util.IDispatch getHTMLDocument();
            
    /**
     * <p>id(0xfab1)</p>
     */
    @ComMethod(name = "SelectFolder", dispId = 0xfab1)
    void SelectFolder(MAPIFolder Folder);
            
    /**
     * <p>id(0xfab2)</p>
     */
    @ComMethod(name = "DeselectFolder", dispId = 0xfab2)
    void DeselectFolder(MAPIFolder Folder);
            
    /**
     * <p>id(0xfab3)</p>
     */
    @ComMethod(name = "IsFolderSelected", dispId = 0xfab3)
    Boolean IsFolderSelected(MAPIFolder Folder);
            
    /**
     * <p>id(0xfbb3)</p>
     */
    @ComProperty(name = "NavigationPane", dispId = 0xfbb3)
    _NavigationPane getNavigationPane();
            
    /**
     * <p>id(0xfbcd)</p>
     */
    @ComMethod(name = "ClearSearch", dispId = 0xfbcd)
    void ClearSearch();
            
    /**
     * <p>id(0xfa65)</p>
     */
    @ComMethod(name = "Search", dispId = 0xfa65)
    void Search(String Query,
            OlSearchScope SearchScope);
            
    /**
     * <p>id(0xfc35)</p>
     */
    @ComMethod(name = "IsItemSelectableInView", dispId = 0xfc35)
    Boolean IsItemSelectableInView(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc36)</p>
     */
    @ComMethod(name = "AddToSelection", dispId = 0xfc36)
    void AddToSelection(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc37)</p>
     */
    @ComMethod(name = "RemoveFromSelection", dispId = 0xfc37)
    void RemoveFromSelection(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc38)</p>
     */
    @ComMethod(name = "SelectAllItems", dispId = 0xfc38)
    void SelectAllItems();
            
    /**
     * <p>id(0xfc39)</p>
     */
    @ComMethod(name = "ClearSelection", dispId = 0xfc39)
    void ClearSelection();
            
    /**
     * <p>id(0xfc71)</p>
     */
    @ComProperty(name = "AccountSelector", dispId = 0xfc71)
    _AccountSelector getAccountSelector();
            
    /**
     * <p>id(0xfc78)</p>
     */
    @ComProperty(name = "AttachmentSelection", dispId = 0xfc78)
    _AttachmentSelection getAttachmentSelection();
            
    /**
     * <p>id(0xfc93)</p>
     */
    @ComProperty(name = "ActiveInlineResponse", dispId = 0xfc93)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveInlineResponse();
            
    /**
     * <p>id(0xfc94)</p>
     */
    @ComProperty(name = "ActiveInlineResponseWordEditor", dispId = 0xfc94)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveInlineResponseWordEditor();
            
    
}