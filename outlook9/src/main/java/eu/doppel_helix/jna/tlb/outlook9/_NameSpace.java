
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063002-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063002-0000-0000-C000-000000000046}")
public interface _NameSpace extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2101)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CurrentUser", dispId = 0x2101)
    Recipient getCurrentUser();
            
    /**
     * <p>id(0x2103)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Folders", dispId = 0x2103)
    _Folders getFolders();
            
    /**
     * <p>id(0x2104)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Type", dispId = 0x2104)
    String getType();
            
    /**
     * <p>id(0x210d)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "AddressLists", dispId = 0x210d)
    AddressLists getAddressLists();
            
    /**
     * <p>id(0x210a)</p>
     * <p>vtableId(15)</p>
     * @param RecipientName [in] {@code String}
     */
    @ComMethod(name = "CreateRecipient", dispId = 0x210a)
    Recipient CreateRecipient(String RecipientName);
            
    /**
     * <p>id(0x210b)</p>
     * <p>vtableId(16)</p>
     * @param FolderType [in] {@code OlDefaultFolders}
     */
    @ComMethod(name = "GetDefaultFolder", dispId = 0x210b)
    MAPIFolder GetDefaultFolder(OlDefaultFolders FolderType);
            
    /**
     * <p>id(0x2108)</p>
     * <p>vtableId(17)</p>
     * @param EntryIDFolder [in] {@code String}
     * @param EntryIDStore [in, optional] {@code Object}
     */
    @ComMethod(name = "GetFolderFromID", dispId = 0x2108)
    MAPIFolder GetFolderFromID(String EntryIDFolder,
            Object EntryIDStore);
            
    /**
     * <p>id(0x2109)</p>
     * <p>vtableId(18)</p>
     * @param EntryIDItem [in] {@code String}
     * @param EntryIDStore [in, optional] {@code Object}
     */
    @ComMethod(name = "GetItemFromID", dispId = 0x2109)
    com.sun.jna.platform.win32.COM.util.IDispatch GetItemFromID(String EntryIDItem,
            Object EntryIDStore);
            
    /**
     * <p>id(0x2107)</p>
     * <p>vtableId(19)</p>
     * @param EntryID [in] {@code String}
     */
    @ComMethod(name = "GetRecipientFromID", dispId = 0x2107)
    Recipient GetRecipientFromID(String EntryID);
            
    /**
     * <p>id(0x210c)</p>
     * <p>vtableId(20)</p>
     * @param Recipient [in] {@code Recipient}
     * @param FolderType [in] {@code OlDefaultFolders}
     */
    @ComMethod(name = "GetSharedDefaultFolder", dispId = 0x210c)
    MAPIFolder GetSharedDefaultFolder(Recipient Recipient,
            OlDefaultFolders FolderType);
            
    /**
     * <p>id(0x2106)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Logoff", dispId = 0x2106)
    void Logoff();
            
    /**
     * <p>id(0x2105)</p>
     * <p>vtableId(22)</p>
     * @param Profile [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param ShowDialog [in, optional] {@code Object}
     * @param NewSession [in, optional] {@code Object}
     */
    @ComMethod(name = "Logon", dispId = 0x2105)
    void Logon(Object Profile,
            Object Password,
            Object ShowDialog,
            Object NewSession);
            
    /**
     * <p>id(0x210e)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "PickFolder", dispId = 0x210e)
    MAPIFolder PickFolder();
            
    /**
     * <p>id(0x2117)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "RefreshRemoteHeaders", dispId = 0x2117)
    void RefreshRemoteHeaders();
            
    /**
     * <p>id(0x2118)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "SyncObjects", dispId = 0x2118)
    SyncObjects getSyncObjects();
            
    /**
     * <p>id(0x2119)</p>
     * <p>vtableId(26)</p>
     * @param Store [in] {@code Object}
     */
    @ComMethod(name = "AddStore", dispId = 0x2119)
    void AddStore(Object Store);
            
    /**
     * <p>id(0x211a)</p>
     * <p>vtableId(27)</p>
     * @param Folder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "RemoveStore", dispId = 0x211a)
    void RemoveStore(MAPIFolder Folder);
            
    /**
     * <p>id(0xfa4c)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Offline", dispId = 0xfa4c)
    Boolean getOffline();
            
    /**
     * <p>id(0xfa0d)</p>
     * <p>vtableId(29)</p>
     * @param ContactItem [in, optional] {@code Object}
     */
    @ComMethod(name = "Dial", dispId = 0xfa0d)
    void Dial(Object ContactItem);
            
    /**
     * <p>id(0xf100)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0xfac1)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ExchangeConnectionMode", dispId = 0xfac1)
    OlExchangeConnectionMode getExchangeConnectionMode();
            
    /**
     * <p>id(0xfac5)</p>
     * <p>vtableId(32)</p>
     * @param Store [in] {@code Object}
     * @param Type [in] {@code OlStoreType}
     */
    @ComMethod(name = "AddStoreEx", dispId = 0xfac5)
    void AddStoreEx(Object Store,
            OlStoreType Type);
            
    /**
     * <p>id(0xfad0)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Accounts", dispId = 0xfad0)
    Accounts getAccounts();
            
    /**
     * <p>id(0xfad5)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "CurrentProfileName", dispId = 0xfad5)
    String getCurrentProfileName();
            
    /**
     * <p>id(0xfad8)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Stores", dispId = 0xfad8)
    Stores getStores();
            
    /**
     * <p>id(0xfae1)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "GetSelectNamesDialog", dispId = 0xfae1)
    SelectNamesDialog GetSelectNamesDialog();
            
    /**
     * <p>id(0xfad7)</p>
     * <p>vtableId(37)</p>
     * @param showProgressDialog [in] {@code Boolean}
     */
    @ComMethod(name = "SendAndReceive", dispId = 0xfad7)
    void SendAndReceive(Boolean showProgressDialog);
            
    /**
     * <p>id(0xfaec)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "DefaultStore", dispId = 0xfaec)
    Store getDefaultStore();
            
    /**
     * <p>id(0xfb04)</p>
     * <p>vtableId(39)</p>
     * @param ID [in] {@code String}
     */
    @ComMethod(name = "GetAddressEntryFromID", dispId = 0xfb04)
    AddressEntry GetAddressEntryFromID(String ID);
            
    /**
     * <p>id(0xfb05)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "GetGlobalAddressList", dispId = 0xfb05)
    AddressList GetGlobalAddressList();
            
    /**
     * <p>id(0xfb06)</p>
     * <p>vtableId(41)</p>
     * @param ID [in] {@code String}
     */
    @ComMethod(name = "GetStoreFromID", dispId = 0xfb06)
    Store GetStoreFromID(String ID);
            
    /**
     * <p>id(0xfba5)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Categories", dispId = 0xfba5)
    Categories getCategories();
            
    /**
     * <p>id(0xfbf6)</p>
     * <p>vtableId(43)</p>
     * @param Path [in] {@code String}
     * @param Name [in, optional] {@code Object}
     * @param DownloadAttachments [in, optional] {@code Object}
     * @param UseTTL [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenSharedFolder", dispId = 0xfbf6)
    MAPIFolder OpenSharedFolder(String Path,
            Object Name,
            Object DownloadAttachments,
            Object UseTTL);
            
    /**
     * <p>id(0xfbf7)</p>
     * <p>vtableId(44)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "OpenSharedItem", dispId = 0xfbf7)
    com.sun.jna.platform.win32.COM.util.IDispatch OpenSharedItem(String Path);
            
    /**
     * <p>id(0xfbe4)</p>
     * <p>vtableId(45)</p>
     * @param Context [in] {@code Object}
     * @param Provider [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateSharingItem", dispId = 0xfbe4)
    SharingItem CreateSharingItem(Object Context,
            Object Provider);
            
    /**
     * <p>id(0xfc05)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "ExchangeMailboxServerName", dispId = 0xfc05)
    String getExchangeMailboxServerName();
            
    /**
     * <p>id(0xfc04)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "ExchangeMailboxServerVersion", dispId = 0xfc04)
    String getExchangeMailboxServerVersion();
            
    /**
     * <p>id(0xfbfc)</p>
     * <p>vtableId(48)</p>
     * @param FirstEntryID [in] {@code String}
     * @param SecondEntryID [in] {@code String}
     */
    @ComMethod(name = "CompareEntryIDs", dispId = 0xfbfc)
    Boolean CompareEntryIDs(String FirstEntryID,
            String SecondEntryID);
            
    /**
     * <p>id(0xfc03)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "AutoDiscoverXml", dispId = 0xfc03)
    String getAutoDiscoverXml();
            
    /**
     * <p>id(0xfc2e)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "AutoDiscoverConnectionMode", dispId = 0xfc2e)
    OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode();
            
    /**
     * <p>id(0xfc85)</p>
     * <p>vtableId(51)</p>
     * @param AddressEntry [in] {@code AddressEntry}
     */
    @ComMethod(name = "CreateContactCard", dispId = 0xfc85)
    eu.doppel_helix.jna.tlb.office2.ContactCard CreateContactCard(AddressEntry AddressEntry);
            
    
}