
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Window Interface
 *
 * <p>uuid({8E8304B8-CBD1-44F8-B0E8-89C625B2002E})</p>
 */
@ComInterface(iid="{8E8304B8-CBD1-44F8-B0E8-89C625B2002E}")
public interface Window extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "WindowHandle", dispId = 0x0)
    Long getWindowHandle();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "CurrentPageId", dispId = 0x1)
    String getCurrentPageId();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "CurrentSectionId", dispId = 0x2)
    String getCurrentSectionId();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "CurrentSectionGroupId", dispId = 0x3)
    String getCurrentSectionGroupId();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CurrentNotebookId", dispId = 0x4)
    String getCurrentNotebookId();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(12)</p>
     * @param bstrHierarchyObjectID [in] {@code String}
     * @param bstrObjectID [in, optional] {@code String}
     */
    @ComMethod(name = "NavigateTo", dispId = 0x9)
    void NavigateTo(String bstrHierarchyObjectID,
            String bstrObjectID);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FullPageView", dispId = 0xa)
    Boolean getFullPageView();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(14)</p>
     * @param param0 [] {@code Boolean}
     */
    @ComProperty(name = "FullPageView", dispId = 0xa)
    void setFullPageView(Boolean param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Active", dispId = 0xb)
    Boolean getActive();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(16)</p>
     * @param param0 [] {@code Boolean}
     */
    @ComProperty(name = "Active", dispId = 0xb)
    void setActive(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DockedLocation", dispId = 0xd)
    DockLocation getDockedLocation();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(18)</p>
     * @param param0 [] {@code DockLocation}
     */
    @ComProperty(name = "DockedLocation", dispId = 0xd)
    void setDockedLocation(DockLocation param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Application", dispId = 0xe)
    IApplication getApplication();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "SideNote", dispId = 0xf)
    Boolean getSideNote();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(21)</p>
     * @param bstrUrl [in] {@code String}
     */
    @ComMethod(name = "NavigateToUrl", dispId = 0x10)
    void NavigateToUrl(String bstrUrl);
}