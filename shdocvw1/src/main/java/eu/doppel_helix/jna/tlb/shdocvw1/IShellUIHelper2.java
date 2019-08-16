
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Shell UI Helper Control Interface 2
 *
 * <p>uuid({A7FE6EDA-1932-4281-B881-87B31B8BC52C})</p>
 */
@ComInterface(iid="{A7FE6EDA-1932-4281-B881-87B31B8BC52C}")
public interface IShellUIHelper2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "ResetFirstBootMode", dispId = 0x1)
    void ResetFirstBootMode();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "ResetSafeMode", dispId = 0x2)
    void ResetSafeMode();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "RefreshOfflineDesktop", dispId = 0x3)
    void RefreshOfflineDesktop();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param URL [in] {@code String}
     * @param Title [in, optional] {@code Object}
     */
    @ComMethod(name = "AddFavorite", dispId = 0x4)
    void AddFavorite(String URL,
            Object Title);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param URL [in] {@code String}
     */
    @ComMethod(name = "AddChannel", dispId = 0x5)
    void AddChannel(String URL);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param URL [in] {@code String}
     * @param Type [in] {@code String}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "AddDesktopComponent", dispId = 0x6)
    void AddDesktopComponent(String URL,
            String Type,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param URL [in] {@code String}
     */
    @ComMethod(name = "IsSubscribed", dispId = 0x7)
    Boolean IsSubscribed(String URL);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param URL [in] {@code String}
     * @param strQuery [in] {@code String}
     * @param varTargetFrame [in] {@code Object}
     */
    @ComMethod(name = "NavigateAndFind", dispId = 0x8)
    void NavigateAndFind(String URL,
            String strQuery,
            Object varTargetFrame);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     * @param fImport [in] {@code Boolean}
     * @param strImpExpPath [in] {@code String}
     */
    @ComMethod(name = "ImportExportFavorites", dispId = 0x9)
    void ImportExportFavorites(Boolean fImport,
            String strImpExpPath);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     * @param Form [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoCompleteSaveForm", dispId = 0xa)
    void AutoCompleteSaveForm(Object Form);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     * @param strSearch [in] {@code String}
     * @param strFailureUrl [in] {@code String}
     * @param pvarTargetFrame [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoScan", dispId = 0xb)
    void AutoScan(String strSearch,
            String strFailureUrl,
            Object pvarTargetFrame);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     * @param Reserved [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoCompleteAttach", dispId = 0xc)
    void AutoCompleteAttach(Object Reserved);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(19)</p>
     * @param bstrName [in] {@code String}
     * @param pvarIn [in] {@code Object}
     */
    @ComMethod(name = "ShowBrowserUI", dispId = 0xd)
    Object ShowBrowserUI(String bstrName,
            Object pvarIn);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(20)</p>
     * @param URL [in] {@code String}
     */
    @ComMethod(name = "AddSearchProvider", dispId = 0xe)
    void AddSearchProvider(String URL);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "RunOnceShown", dispId = 0xf)
    void RunOnceShown();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "SkipRunOnce", dispId = 0x10)
    void SkipRunOnce();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(23)</p>
     * @param fSQM [in] {@code Boolean}
     * @param fPhishing [in] {@code Boolean}
     * @param bstrLocale [in] {@code String}
     */
    @ComMethod(name = "CustomizeSettings", dispId = 0x11)
    void CustomizeSettings(Boolean fSQM,
            Boolean fPhishing,
            String bstrLocale);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "SqmEnabled", dispId = 0x12)
    Boolean SqmEnabled();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "PhishingEnabled", dispId = 0x13)
    Boolean PhishingEnabled();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "BrandImageUri", dispId = 0x14)
    String BrandImageUri();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "SkipTabsWelcome", dispId = 0x15)
    void SkipTabsWelcome();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "DiagnoseConnection", dispId = 0x16)
    void DiagnoseConnection();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(29)</p>
     * @param fSet [in] {@code Boolean}
     */
    @ComMethod(name = "CustomizeClearType", dispId = 0x17)
    void CustomizeClearType(Boolean fSet);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(30)</p>
     * @param URL [in] {@code String}
     */
    @ComMethod(name = "IsSearchProviderInstalled", dispId = 0x18)
    Integer IsSearchProviderInstalled(String URL);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "IsSearchMigrated", dispId = 0x19)
    Boolean IsSearchMigrated();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "DefaultSearchProvider", dispId = 0x1a)
    String DefaultSearchProvider();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(33)</p>
     * @param fComplete [in] {@code Boolean}
     */
    @ComMethod(name = "RunOnceRequiredSettingsComplete", dispId = 0x1b)
    void RunOnceRequiredSettingsComplete(Boolean fComplete);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "RunOnceHasShown", dispId = 0x1c)
    Boolean RunOnceHasShown();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "SearchGuideUrl", dispId = 0x1d)
    String SearchGuideUrl();
            
    
}