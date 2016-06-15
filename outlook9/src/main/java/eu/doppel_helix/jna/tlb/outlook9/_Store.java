
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630C7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630C7-0000-0000-C000-000000000046}")
public interface _Store extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    String getDisplayName();
            
    /**
     * <p>id(0x3108)</p>
     */
    @ComProperty(name = "StoreID", dispId = 0x3108)
    String getStoreID();
            
    /**
     * <p>id(0xfada)</p>
     */
    @ComProperty(name = "ExchangeStoreType", dispId = 0xfada)
    OlExchangeStoreType getExchangeStoreType();
            
    /**
     * <p>id(0xfadd)</p>
     */
    @ComProperty(name = "FilePath", dispId = 0xfadd)
    String getFilePath();
            
    /**
     * <p>id(0xfade)</p>
     */
    @ComProperty(name = "IsCachedExchange", dispId = 0xfade)
    Boolean getIsCachedExchange();
            
    /**
     * <p>id(0xfadf)</p>
     */
    @ComProperty(name = "IsDataFileStore", dispId = 0xfadf)
    Boolean getIsDataFileStore();
            
    /**
     * <p>id(0xfadb)</p>
     */
    @ComMethod(name = "GetRootFolder", dispId = 0xfadb)
    MAPIFolder GetRootFolder();
            
    /**
     * <p>id(0xfadc)</p>
     */
    @ComMethod(name = "GetSearchFolders", dispId = 0xfadc)
    _Folders GetSearchFolders();
            
    /**
     * <p>id(0xfae0)</p>
     */
    @ComProperty(name = "IsOpen", dispId = 0xfae0)
    Boolean getIsOpen();
            
    /**
     * <p>id(0xf100)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0xfb09)</p>
     */
    @ComMethod(name = "GetRules", dispId = 0xfb09)
    Rules GetRules();
            
    /**
     * <p>id(0xfafd)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0x2108)</p>
     */
    @ComMethod(name = "GetSpecialFolder", dispId = 0x2108)
    MAPIFolder GetSpecialFolder(OlSpecialFolders FolderType);
            
    /**
     * <p>id(0xfc14)</p>
     */
    @ComProperty(name = "IsInstantSearchEnabled", dispId = 0xfc14)
    Boolean getIsInstantSearchEnabled();
            
    /**
     * <p>id(0xfc4e)</p>
     */
    @ComMethod(name = "RefreshQuotaDisplay", dispId = 0xfc4e)
    void RefreshQuotaDisplay();
            
    /**
     * <p>id(0xfc6d)</p>
     */
    @ComMethod(name = "GetDefaultFolder", dispId = 0xfc6d)
    MAPIFolder GetDefaultFolder(OlDefaultFolders FolderType);
            
    /**
     * <p>id(0xfc76)</p>
     */
    @ComProperty(name = "IsConversationEnabled", dispId = 0xfc76)
    Boolean getIsConversationEnabled();
            
    /**
     * <p>id(0xfba5)</p>
     */
    @ComProperty(name = "Categories", dispId = 0xfba5)
    Categories getCategories();
            
    
}