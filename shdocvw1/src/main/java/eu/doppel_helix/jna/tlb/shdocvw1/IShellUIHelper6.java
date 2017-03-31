
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Shell UI Helper Control Interface 6
 *
 * <p>uuid({987A573E-46EE-4E89-96AB-DDF7F8FDC98C})</p>
 */
@ComInterface(iid="{987A573E-46EE-4E89-96AB-DDF7F8FDC98C}")
public interface IShellUIHelper6 extends IUnknown, IRawDispatchHandle, IDispatch {
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
     */
    @ComMethod(name = "AddFavorite", dispId = 0x4)
    void AddFavorite(String URL,
            Object Title);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "AddChannel", dispId = 0x5)
    void AddChannel(String URL);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
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
     */
    @ComMethod(name = "IsSubscribed", dispId = 0x7)
    Boolean IsSubscribed(String URL);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "NavigateAndFind", dispId = 0x8)
    void NavigateAndFind(String URL,
            String strQuery,
            Object varTargetFrame);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "ImportExportFavorites", dispId = 0x9)
    void ImportExportFavorites(Boolean fImport,
            String strImpExpPath);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "AutoCompleteSaveForm", dispId = 0xa)
    void AutoCompleteSaveForm(Object Form);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "AutoScan", dispId = 0xb)
    void AutoScan(String strSearch,
            String strFailureUrl,
            Object pvarTargetFrame);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "AutoCompleteAttach", dispId = 0xc)
    void AutoCompleteAttach(Object Reserved);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "ShowBrowserUI", dispId = 0xd)
    Object ShowBrowserUI(String bstrName,
            Object pvarIn);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(20)</p>
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
     */
    @ComMethod(name = "CustomizeClearType", dispId = 0x17)
    void CustomizeClearType(Boolean fSet);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(30)</p>
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
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "AddService", dispId = 0x1e)
    void AddService(String URL);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "IsServiceInstalled", dispId = 0x1f)
    Integer IsServiceInstalled(String URL,
            String Verb);
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "InPrivateFilteringEnabled", dispId = 0x25)
    Boolean InPrivateFilteringEnabled();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(39)</p>
     */
    @ComMethod(name = "AddToFavoritesBar", dispId = 0x20)
    void AddToFavoritesBar(String URL,
            String Title,
            Object Type);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "BuildNewTabPage", dispId = 0x21)
    void BuildNewTabPage();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(41)</p>
     */
    @ComMethod(name = "SetRecentlyClosedVisible", dispId = 0x22)
    void SetRecentlyClosedVisible(Boolean fVisible);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(42)</p>
     */
    @ComMethod(name = "SetActivitiesVisible", dispId = 0x23)
    void SetActivitiesVisible(Boolean fVisible);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(43)</p>
     */
    @ComMethod(name = "ContentDiscoveryReset", dispId = 0x24)
    void ContentDiscoveryReset();
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(44)</p>
     */
    @ComMethod(name = "IsSuggestedSitesEnabled", dispId = 0x26)
    Boolean IsSuggestedSitesEnabled();
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(45)</p>
     */
    @ComMethod(name = "EnableSuggestedSites", dispId = 0x27)
    void EnableSuggestedSites(Boolean fEnable);
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(46)</p>
     */
    @ComMethod(name = "NavigateToSuggestedSites", dispId = 0x28)
    void NavigateToSuggestedSites(String bstrRelativeUrl);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(47)</p>
     */
    @ComMethod(name = "ShowTabsHelp", dispId = 0x29)
    void ShowTabsHelp();
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(48)</p>
     */
    @ComMethod(name = "ShowInPrivateHelp", dispId = 0x2a)
    void ShowInPrivateHelp();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "msIsSiteMode", dispId = 0x2b)
    Boolean msIsSiteMode();
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(50)</p>
     */
    @ComMethod(name = "msSiteModeShowThumbBar", dispId = 0x2f)
    void msSiteModeShowThumbBar();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(51)</p>
     */
    @ComMethod(name = "msSiteModeAddThumbBarButton", dispId = 0x30)
    Object msSiteModeAddThumbBarButton(String bstrIconURL,
            String bstrTooltip);
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(52)</p>
     */
    @ComMethod(name = "msSiteModeUpdateThumbBarButton", dispId = 0x2e)
    void msSiteModeUpdateThumbBarButton(Object ButtonID,
            Boolean fEnabled,
            Boolean fVisible);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(53)</p>
     */
    @ComMethod(name = "msSiteModeSetIconOverlay", dispId = 0x2c)
    void msSiteModeSetIconOverlay(String IconUrl,
            Object pvarDescription);
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "msSiteModeClearIconOverlay", dispId = 0x2d)
    void msSiteModeClearIconOverlay();
            
    /**
     * <p>id(0x31)</p>
     * <p>vtableId(55)</p>
     */
    @ComMethod(name = "msAddSiteMode", dispId = 0x31)
    void msAddSiteMode();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(56)</p>
     */
    @ComMethod(name = "msSiteModeCreateJumpList", dispId = 0x33)
    void msSiteModeCreateJumpList(String bstrHeader);
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "msSiteModeAddJumpListItem", dispId = 0x34)
    void msSiteModeAddJumpListItem(String bstrName,
            String bstrActionUri,
            String bstrIconUri,
            Object pvarWindowType);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(58)</p>
     */
    @ComMethod(name = "msSiteModeClearJumpList", dispId = 0x35)
    void msSiteModeClearJumpList();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(59)</p>
     */
    @ComMethod(name = "msSiteModeShowJumpList", dispId = 0x38)
    void msSiteModeShowJumpList();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "msSiteModeAddButtonStyle", dispId = 0x36)
    Object msSiteModeAddButtonStyle(Object uiButtonID,
            String bstrIconURL,
            String bstrTooltip);
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(61)</p>
     */
    @ComMethod(name = "msSiteModeShowButtonStyle", dispId = 0x37)
    void msSiteModeShowButtonStyle(Object uiButtonID,
            Object uiStyleID);
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "msSiteModeActivate", dispId = 0x3a)
    void msSiteModeActivate();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "msIsSiteModeFirstRun", dispId = 0x3b)
    Object msIsSiteModeFirstRun(Boolean fPreserveState);
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "msAddTrackingProtectionList", dispId = 0x39)
    void msAddTrackingProtectionList(String URL,
            String bstrFilterName);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "msTrackingProtectionEnabled", dispId = 0x3c)
    Boolean msTrackingProtectionEnabled();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "msActiveXFilteringEnabled", dispId = 0x3d)
    Boolean msActiveXFilteringEnabled();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(67)</p>
     */
    @ComMethod(name = "msProvisionNetworks", dispId = 0x3e)
    Object msProvisionNetworks(String bstrProvisioningXml);
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "msReportSafeUrl", dispId = 0x3f)
    void msReportSafeUrl();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "msSiteModeRefreshBadge", dispId = 0x40)
    void msSiteModeRefreshBadge();
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "msSiteModeClearBadge", dispId = 0x41)
    void msSiteModeClearBadge();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "msDiagnoseConnectionUILess", dispId = 0x42)
    void msDiagnoseConnectionUILess();
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(72)</p>
     */
    @ComMethod(name = "msLaunchNetworkClientHelp", dispId = 0x43)
    void msLaunchNetworkClientHelp();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(73)</p>
     */
    @ComMethod(name = "msChangeDefaultBrowser", dispId = 0x44)
    void msChangeDefaultBrowser(Boolean fChange);
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(74)</p>
     */
    @ComMethod(name = "msStopPeriodicTileUpdate", dispId = 0x45)
    void msStopPeriodicTileUpdate();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "msStartPeriodicTileUpdate", dispId = 0x46)
    void msStartPeriodicTileUpdate(Object pollingUris,
            Object startTime,
            Object uiUpdateRecurrence);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "msStartPeriodicTileUpdateBatch", dispId = 0x4b)
    void msStartPeriodicTileUpdateBatch(Object pollingUris,
            Object startTime,
            Object uiUpdateRecurrence);
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(77)</p>
     */
    @ComMethod(name = "msClearTile", dispId = 0x47)
    void msClearTile();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(78)</p>
     */
    @ComMethod(name = "msEnableTileNotificationQueue", dispId = 0x48)
    void msEnableTileNotificationQueue(Boolean fChange);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(79)</p>
     */
    @ComMethod(name = "msPinnedSiteState", dispId = 0x49)
    Object msPinnedSiteState();
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(80)</p>
     */
    @ComMethod(name = "msEnableTileNotificationQueueForSquare150x150", dispId = 0x4c)
    void msEnableTileNotificationQueueForSquare150x150(Boolean fChange);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(81)</p>
     */
    @ComMethod(name = "msEnableTileNotificationQueueForWide310x150", dispId = 0x4d)
    void msEnableTileNotificationQueueForWide310x150(Boolean fChange);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(82)</p>
     */
    @ComMethod(name = "msEnableTileNotificationQueueForSquare310x310", dispId = 0x4e)
    void msEnableTileNotificationQueueForSquare310x310(Boolean fChange);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(83)</p>
     */
    @ComMethod(name = "msScheduledTileNotification", dispId = 0x4f)
    void msScheduledTileNotification(String bstrNotificationXml,
            String bstrNotificationId,
            String bstrNotificationTag,
            Object startTime,
            Object expirationTime);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(84)</p>
     */
    @ComMethod(name = "msRemoveScheduledTileNotification", dispId = 0x50)
    void msRemoveScheduledTileNotification(String bstrNotificationId);
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(85)</p>
     */
    @ComMethod(name = "msStartPeriodicBadgeUpdate", dispId = 0x51)
    void msStartPeriodicBadgeUpdate(String pollingUri,
            Object startTime,
            Object uiUpdateRecurrence);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(86)</p>
     */
    @ComMethod(name = "msStopPeriodicBadgeUpdate", dispId = 0x52)
    void msStopPeriodicBadgeUpdate();
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(87)</p>
     */
    @ComMethod(name = "msLaunchInternetOptions", dispId = 0x4a)
    void msLaunchInternetOptions();
            
    
}