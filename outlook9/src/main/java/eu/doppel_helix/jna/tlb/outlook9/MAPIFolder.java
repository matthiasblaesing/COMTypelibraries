
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063006-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063006-0000-0000-C000-000000000046}")
public interface MAPIFolder extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3106)</p>
     */
    @ComProperty(name = "DefaultItemType", dispId = 0x3106)
    OlItemType getDefaultItemType();
            
    /**
     * <p>id(0x3107)</p>
     */
    @ComProperty(name = "DefaultMessageClass", dispId = 0x3107)
    String getDefaultMessageClass();
            
    /**
     * <p>id(0x3004)</p>
     */
    @ComProperty(name = "Description", dispId = 0x3004)
    String getDescription();
            
    /**
     * <p>id(0x3004)</p>
     */
    @ComProperty(name = "Description", dispId = 0x3004)
    void setDescription(String param0);
            
    /**
     * <p>id(0xf01e)</p>
     */
    @ComProperty(name = "EntryID", dispId = 0xf01e)
    String getEntryID();
            
    /**
     * <p>id(0x2103)</p>
     */
    @ComProperty(name = "Folders", dispId = 0x2103)
    _Folders getFolders();
            
    /**
     * <p>id(0x3100)</p>
     */
    @ComProperty(name = "Items", dispId = 0x3100)
    _Items getItems();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    void setName(String param0);
            
    /**
     * <p>id(0x3108)</p>
     */
    @ComProperty(name = "StoreID", dispId = 0x3108)
    String getStoreID();
            
    /**
     * <p>id(0x3603)</p>
     */
    @ComProperty(name = "UnReadItemCount", dispId = 0x3603)
    Integer getUnReadItemCount();
            
    /**
     * <p>id(0xf032)</p>
     */
    @ComMethod(name = "CopyTo", dispId = 0xf032)
    MAPIFolder CopyTo(MAPIFolder DestinationFolder);
            
    /**
     * <p>id(0xf045)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xf045)
    void Delete();
            
    /**
     * <p>id(0x3104)</p>
     */
    @ComMethod(name = "Display", dispId = 0x3104)
    void Display();
            
    /**
     * <p>id(0x3101)</p>
     */
    @ComMethod(name = "GetExplorer", dispId = 0x3101)
    _Explorer GetExplorer(Object DisplayMode);
            
    /**
     * <p>id(0xf034)</p>
     */
    @ComMethod(name = "MoveTo", dispId = 0xf034)
    void MoveTo(MAPIFolder DestinationFolder);
            
    /**
     * <p>id(0x3111)</p>
     */
    @ComProperty(name = "UserPermissions", dispId = 0x3111)
    com.sun.jna.platform.win32.COM.util.IDispatch getUserPermissions();
            
    /**
     * <p>id(0x3112)</p>
     */
    @ComProperty(name = "WebViewOn", dispId = 0x3112)
    Boolean getWebViewOn();
            
    /**
     * <p>id(0x3112)</p>
     */
    @ComProperty(name = "WebViewOn", dispId = 0x3112)
    void setWebViewOn(Boolean param0);
            
    /**
     * <p>id(0x3113)</p>
     */
    @ComProperty(name = "WebViewURL", dispId = 0x3113)
    String getWebViewURL();
            
    /**
     * <p>id(0x3113)</p>
     */
    @ComProperty(name = "WebViewURL", dispId = 0x3113)
    void setWebViewURL(String param0);
            
    /**
     * <p>id(0x3114)</p>
     */
    @ComProperty(name = "WebViewAllowNavigation", dispId = 0x3114)
    Boolean getWebViewAllowNavigation();
            
    /**
     * <p>id(0x3114)</p>
     */
    @ComProperty(name = "WebViewAllowNavigation", dispId = 0x3114)
    void setWebViewAllowNavigation(Boolean param0);
            
    /**
     * <p>id(0x3115)</p>
     */
    @ComMethod(name = "AddToPFFavorites", dispId = 0x3115)
    void AddToPFFavorites();
            
    /**
     * <p>id(0xfa6e)</p>
     */
    @ComProperty(name = "AddressBookName", dispId = 0xfa6e)
    String getAddressBookName();
            
    /**
     * <p>id(0xfa6e)</p>
     */
    @ComProperty(name = "AddressBookName", dispId = 0xfa6e)
    void setAddressBookName(String param0);
            
    /**
     * <p>id(0xfa6f)</p>
     */
    @ComProperty(name = "ShowAsOutlookAB", dispId = 0xfa6f)
    Boolean getShowAsOutlookAB();
            
    /**
     * <p>id(0xfa6f)</p>
     */
    @ComProperty(name = "ShowAsOutlookAB", dispId = 0xfa6f)
    void setShowAsOutlookAB(Boolean param0);
            
    /**
     * <p>id(0xfa78)</p>
     */
    @ComProperty(name = "FolderPath", dispId = 0xfa78)
    String getFolderPath();
            
    /**
     * <p>id(0xfa61)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0xfa61)
    void AddToFavorites(Object fNoUI,
            Object Name);
            
    /**
     * <p>id(0xfa4b)</p>
     */
    @ComProperty(name = "InAppFolderSyncObject", dispId = 0xfa4b)
    Boolean getInAppFolderSyncObject();
            
    /**
     * <p>id(0xfa4b)</p>
     */
    @ComProperty(name = "InAppFolderSyncObject", dispId = 0xfa4b)
    void setInAppFolderSyncObject(Boolean param0);
            
    /**
     * <p>id(0x2200)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x2200)
    View getCurrentView();
            
    /**
     * <p>id(0xfa46)</p>
     */
    @ComProperty(name = "CustomViewsOnly", dispId = 0xfa46)
    Boolean getCustomViewsOnly();
            
    /**
     * <p>id(0xfa46)</p>
     */
    @ComProperty(name = "CustomViewsOnly", dispId = 0xfa46)
    void setCustomViewsOnly(Boolean param0);
            
    /**
     * <p>id(0x3109)</p>
     */
    @ComProperty(name = "Views", dispId = 0x3109)
    _Views getViews();
            
    /**
     * <p>id(0xf100)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0xfa91)</p>
     */
    @ComProperty(name = "FullFolderPath", dispId = 0xfa91)
    String getFullFolderPath();
            
    /**
     * <p>id(0xfab6)</p>
     */
    @ComProperty(name = "IsSharePointFolder", dispId = 0xfab6)
    Boolean getIsSharePointFolder();
            
    /**
     * <p>id(0xfac2)</p>
     */
    @ComProperty(name = "ShowItemCount", dispId = 0xfac2)
    OlShowItemCount getShowItemCount();
            
    /**
     * <p>id(0xfac2)</p>
     */
    @ComProperty(name = "ShowItemCount", dispId = 0xfac2)
    void setShowItemCount(OlShowItemCount param0);
            
    /**
     * <p>id(0xfad9)</p>
     */
    @ComProperty(name = "Store", dispId = 0xfad9)
    Store getStore();
            
    /**
     * <p>id(0xfb08)</p>
     */
    @ComMethod(name = "GetStorage", dispId = 0xfb08)
    _StorageItem GetStorage(String StorageIdentifier,
            OlStorageIdentifierType StorageIdentifierType);
            
    /**
     * <p>id(0xfb1d)</p>
     */
    @ComMethod(name = "GetTable", dispId = 0xfb1d)
    Table GetTable(Object Filter,
            Object TableContents);
            
    /**
     * <p>id(0xfafd)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfba2)</p>
     */
    @ComMethod(name = "GetCalendarExporter", dispId = 0xfba2)
    CalendarSharing GetCalendarExporter();
            
    /**
     * <p>id(0xf816)</p>
     */
    @ComProperty(name = "UserDefinedProperties", dispId = 0xf816)
    UserDefinedProperties getUserDefinedProperties();
            
    /**
     * <p>id(0xfc3c)</p>
     */
    @ComMethod(name = "GetCustomIcon", dispId = 0xfc3c)
    eu.doppel_helix.jna.tlb.stdole2.Picture GetCustomIcon();
            
    /**
     * <p>id(0xfc3d)</p>
     */
    @ComMethod(name = "SetCustomIcon", dispId = 0xfc3d)
    void SetCustomIcon(eu.doppel_helix.jna.tlb.stdole2.Picture Picture);
            
    
}