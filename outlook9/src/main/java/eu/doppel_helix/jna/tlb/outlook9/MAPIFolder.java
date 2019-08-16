
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
     * <p>id(0x3106)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DefaultItemType", dispId = 0x3106)
    OlItemType getDefaultItemType();
            
    /**
     * <p>id(0x3107)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DefaultMessageClass", dispId = 0x3107)
    String getDefaultMessageClass();
            
    /**
     * <p>id(0x3004)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Description", dispId = 0x3004)
    String getDescription();
            
    /**
     * <p>id(0x3004)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x3004)
    void setDescription(String param0);
            
    /**
     * <p>id(0xf01e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "EntryID", dispId = 0xf01e)
    String getEntryID();
            
    /**
     * <p>id(0x2103)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Folders", dispId = 0x2103)
    _Folders getFolders();
            
    /**
     * <p>id(0x3100)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Items", dispId = 0x3100)
    _Items getItems();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    void setName(String param0);
            
    /**
     * <p>id(0x3108)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "StoreID", dispId = 0x3108)
    String getStoreID();
            
    /**
     * <p>id(0x3603)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "UnReadItemCount", dispId = 0x3603)
    Integer getUnReadItemCount();
            
    /**
     * <p>id(0xf032)</p>
     * <p>vtableId(22)</p>
     * @param DestinationFolder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "CopyTo", dispId = 0xf032)
    MAPIFolder CopyTo(MAPIFolder DestinationFolder);
            
    /**
     * <p>id(0xf045)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xf045)
    void Delete();
            
    /**
     * <p>id(0x3104)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "Display", dispId = 0x3104)
    void Display();
            
    /**
     * <p>id(0x3101)</p>
     * <p>vtableId(25)</p>
     * @param DisplayMode [in, optional] {@code Object}
     */
    @ComMethod(name = "GetExplorer", dispId = 0x3101)
    _Explorer GetExplorer(Object DisplayMode);
            
    /**
     * <p>id(0xf034)</p>
     * <p>vtableId(26)</p>
     * @param DestinationFolder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "MoveTo", dispId = 0xf034)
    void MoveTo(MAPIFolder DestinationFolder);
            
    /**
     * <p>id(0x3111)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "UserPermissions", dispId = 0x3111)
    com.sun.jna.platform.win32.COM.util.IDispatch getUserPermissions();
            
    /**
     * <p>id(0x3112)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "WebViewOn", dispId = 0x3112)
    Boolean getWebViewOn();
            
    /**
     * <p>id(0x3112)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WebViewOn", dispId = 0x3112)
    void setWebViewOn(Boolean param0);
            
    /**
     * <p>id(0x3113)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "WebViewURL", dispId = 0x3113)
    String getWebViewURL();
            
    /**
     * <p>id(0x3113)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "WebViewURL", dispId = 0x3113)
    void setWebViewURL(String param0);
            
    /**
     * <p>id(0x3114)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "WebViewAllowNavigation", dispId = 0x3114)
    Boolean getWebViewAllowNavigation();
            
    /**
     * <p>id(0x3114)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WebViewAllowNavigation", dispId = 0x3114)
    void setWebViewAllowNavigation(Boolean param0);
            
    /**
     * <p>id(0x3115)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "AddToPFFavorites", dispId = 0x3115)
    void AddToPFFavorites();
            
    /**
     * <p>id(0xfa6e)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "AddressBookName", dispId = 0xfa6e)
    String getAddressBookName();
            
    /**
     * <p>id(0xfa6e)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AddressBookName", dispId = 0xfa6e)
    void setAddressBookName(String param0);
            
    /**
     * <p>id(0xfa6f)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "ShowAsOutlookAB", dispId = 0xfa6f)
    Boolean getShowAsOutlookAB();
            
    /**
     * <p>id(0xfa6f)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAsOutlookAB", dispId = 0xfa6f)
    void setShowAsOutlookAB(Boolean param0);
            
    /**
     * <p>id(0xfa78)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "FolderPath", dispId = 0xfa78)
    String getFolderPath();
            
    /**
     * <p>id(0xfa61)</p>
     * <p>vtableId(40)</p>
     * @param fNoUI [in, optional] {@code Object}
     * @param Name [in, optional] {@code Object}
     */
    @ComMethod(name = "AddToFavorites", dispId = 0xfa61)
    void AddToFavorites(Object fNoUI,
            Object Name);
            
    /**
     * <p>id(0xfa4b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "InAppFolderSyncObject", dispId = 0xfa4b)
    Boolean getInAppFolderSyncObject();
            
    /**
     * <p>id(0xfa4b)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InAppFolderSyncObject", dispId = 0xfa4b)
    void setInAppFolderSyncObject(Boolean param0);
            
    /**
     * <p>id(0x2200)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x2200)
    View getCurrentView();
            
    /**
     * <p>id(0xfa46)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "CustomViewsOnly", dispId = 0xfa46)
    Boolean getCustomViewsOnly();
            
    /**
     * <p>id(0xfa46)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CustomViewsOnly", dispId = 0xfa46)
    void setCustomViewsOnly(Boolean param0);
            
    /**
     * <p>id(0x3109)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Views", dispId = 0x3109)
    _Views getViews();
            
    /**
     * <p>id(0xf100)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0xfa91)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "FullFolderPath", dispId = 0xfa91)
    String getFullFolderPath();
            
    /**
     * <p>id(0xfab6)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "IsSharePointFolder", dispId = 0xfab6)
    Boolean getIsSharePointFolder();
            
    /**
     * <p>id(0xfac2)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "ShowItemCount", dispId = 0xfac2)
    OlShowItemCount getShowItemCount();
            
    /**
     * <p>id(0xfac2)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code OlShowItemCount}
     */
    @ComProperty(name = "ShowItemCount", dispId = 0xfac2)
    void setShowItemCount(OlShowItemCount param0);
            
    /**
     * <p>id(0xfad9)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Store", dispId = 0xfad9)
    Store getStore();
            
    /**
     * <p>id(0xfb08)</p>
     * <p>vtableId(53)</p>
     * @param StorageIdentifier [in] {@code String}
     * @param StorageIdentifierType [in] {@code OlStorageIdentifierType}
     */
    @ComMethod(name = "GetStorage", dispId = 0xfb08)
    _StorageItem GetStorage(String StorageIdentifier,
            OlStorageIdentifierType StorageIdentifierType);
            
    /**
     * <p>id(0xfb1d)</p>
     * <p>vtableId(54)</p>
     * @param Filter [in, optional] {@code Object}
     * @param TableContents [in, optional] {@code Object}
     */
    @ComMethod(name = "GetTable", dispId = 0xfb1d)
    Table GetTable(Object Filter,
            Object TableContents);
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfba2)</p>
     * <p>vtableId(56)</p>
     */
    @ComMethod(name = "GetCalendarExporter", dispId = 0xfba2)
    CalendarSharing GetCalendarExporter();
            
    /**
     * <p>id(0xf816)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "UserDefinedProperties", dispId = 0xf816)
    UserDefinedProperties getUserDefinedProperties();
            
    /**
     * <p>id(0xfc3c)</p>
     * <p>vtableId(58)</p>
     */
    @ComMethod(name = "GetCustomIcon", dispId = 0xfc3c)
    eu.doppel_helix.jna.tlb.stdole2.Picture GetCustomIcon();
            
    /**
     * <p>id(0xfc3d)</p>
     * <p>vtableId(59)</p>
     * @param Picture [in] {@code eu.doppel_helix.jna.tlb.stdole2.Picture}
     */
    @ComMethod(name = "SetCustomIcon", dispId = 0xfc3d)
    void SetCustomIcon(eu.doppel_helix.jna.tlb.stdole2.Picture Picture);
            
    
}