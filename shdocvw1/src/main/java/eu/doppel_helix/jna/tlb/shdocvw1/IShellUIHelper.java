
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Shell UI Helper Control Interface
 *
 * <p>uuid({729FE2F8-1EA8-11D1-8F85-00C04FC2FBE1})</p>
 */
@ComInterface(iid="{729FE2F8-1EA8-11D1-8F85-00C04FC2FBE1}")
public interface IShellUIHelper extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "ResetFirstBootMode", dispId = 0x1)
    void ResetFirstBootMode();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "ResetSafeMode", dispId = 0x2)
    void ResetSafeMode();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "RefreshOfflineDesktop", dispId = 0x3)
    void RefreshOfflineDesktop();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "AddFavorite", dispId = 0x4)
    void AddFavorite(String URL,
            Object Title);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "AddChannel", dispId = 0x5)
    void AddChannel(String URL);
            
    /**
     * <p>id(0x6)</p>
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
     */
    @ComMethod(name = "IsSubscribed", dispId = 0x7)
    Boolean IsSubscribed(String URL);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "NavigateAndFind", dispId = 0x8)
    void NavigateAndFind(String URL,
            String strQuery,
            Object varTargetFrame);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "ImportExportFavorites", dispId = 0x9)
    void ImportExportFavorites(Boolean fImport,
            String strImpExpPath);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "AutoCompleteSaveForm", dispId = 0xa)
    void AutoCompleteSaveForm(Object Form);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "AutoScan", dispId = 0xb)
    void AutoScan(String strSearch,
            String strFailureUrl,
            Object pvarTargetFrame);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "AutoCompleteAttach", dispId = 0xc)
    void AutoCompleteAttach(Object Reserved);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "ShowBrowserUI", dispId = 0xd)
    Object ShowBrowserUI(String bstrName,
            Object pvarIn);
            
    
}