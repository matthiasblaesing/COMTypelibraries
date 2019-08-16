
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2100)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x2100)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x2101)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CurrentFolder", dispId = 0x2101)
    MAPIFolder getCurrentFolder();
            
    /**
     * <p>id(0x2103)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Close", dispId = 0x2103)
    void Close();
            
    /**
     * <p>id(0x2104)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Display", dispId = 0x2104)
    void Display();
            
    /**
     * <p>id(0x2111)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x2111)
    String getCaption();
            
    /**
     * <p>id(0x2200)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x2200)
    Object getCurrentView();
            
    /**
     * <p>id(0x2200)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CurrentView", dispId = 0x2200)
    void setCurrentView(Object param0);
            
    /**
     * <p>id(0x2114)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2114)
    Integer getHeight();
            
    /**
     * <p>id(0x2114)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x2114)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x2115)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2115)
    Integer getLeft();
            
    /**
     * <p>id(0x2115)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x2115)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x2201)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Panes", dispId = 0x2201)
    Panes getPanes();
            
    /**
     * <p>id(0x2202)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x2202)
    Selection getSelection();
            
    /**
     * <p>id(0x2116)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2116)
    Integer getTop();
            
    /**
     * <p>id(0x2116)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x2116)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x2117)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    Integer getWidth();
            
    /**
     * <p>id(0x2117)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x2112)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x2112)
    OlWindowState getWindowState();
            
    /**
     * <p>id(0x2112)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code OlWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x2112)
    void setWindowState(OlWindowState param0);
            
    /**
     * <p>id(0x2113)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x2113)
    void Activate();
            
    /**
     * <p>id(0x2203)</p>
     * <p>vtableId(32)</p>
     * @param Pane [in] {@code OlPane}
     */
    @ComMethod(name = "IsPaneVisible", dispId = 0x2203)
    Boolean IsPaneVisible(OlPane Pane);
            
    /**
     * <p>id(0x2204)</p>
     * <p>vtableId(33)</p>
     * @param Pane [in] {@code OlPane}
     * @param Visible [in] {@code Boolean}
     */
    @ComMethod(name = "ShowPane", dispId = 0x2204)
    void ShowPane(OlPane Pane,
            Boolean Visible);
            
    /**
     * <p>id(0x3109)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Views", dispId = 0x3109)
    com.sun.jna.platform.win32.COM.util.IDispatch getViews();
            
    /**
     * <p>id(0xfa92)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "HTMLDocument", dispId = 0xfa92)
    com.sun.jna.platform.win32.COM.util.IDispatch getHTMLDocument();
            
    /**
     * <p>id(0xfab1)</p>
     * <p>vtableId(36)</p>
     * @param Folder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "SelectFolder", dispId = 0xfab1)
    void SelectFolder(MAPIFolder Folder);
            
    /**
     * <p>id(0xfab2)</p>
     * <p>vtableId(37)</p>
     * @param Folder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "DeselectFolder", dispId = 0xfab2)
    void DeselectFolder(MAPIFolder Folder);
            
    /**
     * <p>id(0xfab3)</p>
     * <p>vtableId(38)</p>
     * @param Folder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "IsFolderSelected", dispId = 0xfab3)
    Boolean IsFolderSelected(MAPIFolder Folder);
            
    /**
     * <p>id(0xfbb3)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "NavigationPane", dispId = 0xfbb3)
    _NavigationPane getNavigationPane();
            
    /**
     * <p>id(0xfbcd)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "ClearSearch", dispId = 0xfbcd)
    void ClearSearch();
            
    /**
     * <p>id(0xfa65)</p>
     * <p>vtableId(41)</p>
     * @param Query [in] {@code String}
     * @param SearchScope [in] {@code OlSearchScope}
     */
    @ComMethod(name = "Search", dispId = 0xfa65)
    void Search(String Query,
            OlSearchScope SearchScope);
            
    /**
     * <p>id(0xfc35)</p>
     * <p>vtableId(42)</p>
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "IsItemSelectableInView", dispId = 0xfc35)
    Boolean IsItemSelectableInView(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc36)</p>
     * <p>vtableId(43)</p>
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "AddToSelection", dispId = 0xfc36)
    void AddToSelection(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc37)</p>
     * <p>vtableId(44)</p>
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "RemoveFromSelection", dispId = 0xfc37)
    void RemoveFromSelection(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc38)</p>
     * <p>vtableId(45)</p>
     */
    @ComMethod(name = "SelectAllItems", dispId = 0xfc38)
    void SelectAllItems();
            
    /**
     * <p>id(0xfc39)</p>
     * <p>vtableId(46)</p>
     */
    @ComMethod(name = "ClearSelection", dispId = 0xfc39)
    void ClearSelection();
            
    /**
     * <p>id(0xfc71)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "AccountSelector", dispId = 0xfc71)
    _AccountSelector getAccountSelector();
            
    /**
     * <p>id(0xfc78)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "AttachmentSelection", dispId = 0xfc78)
    _AttachmentSelection getAttachmentSelection();
            
    /**
     * <p>id(0xfc93)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "ActiveInlineResponse", dispId = 0xfc93)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveInlineResponse();
            
    /**
     * <p>id(0xfc94)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "ActiveInlineResponseWordEditor", dispId = 0xfc94)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveInlineResponseWordEditor();
            
    
}