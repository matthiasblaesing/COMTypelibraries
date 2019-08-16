
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063059-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063059-0000-0000-C000-000000000046}")
public interface _FormRegionStartup extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfb36)</p>
     * <p>vtableId(7)</p>
     * @param FormRegionName [in] {@code String}
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param LCID [in] {@code Integer}
     * @param FormRegionMode [in] {@code OlFormRegionMode}
     * @param FormRegionSize [in] {@code OlFormRegionSize}
     */
    @ComMethod(name = "GetFormRegionStorage", dispId = 0xfb36)
    Object GetFormRegionStorage(String FormRegionName,
            com.sun.jna.platform.win32.COM.util.IDispatch Item,
            Integer LCID,
            OlFormRegionMode FormRegionMode,
            OlFormRegionSize FormRegionSize);
            
    /**
     * <p>id(0xfb3d)</p>
     * <p>vtableId(8)</p>
     * @param FormRegion [in] {@code FormRegion}
     */
    @ComMethod(name = "BeforeFormRegionShow", dispId = 0xfb3d)
    void BeforeFormRegionShow(FormRegion FormRegion);
            
    /**
     * <p>id(0xfc33)</p>
     * <p>vtableId(9)</p>
     * @param FormRegionName [in] {@code String}
     * @param LCID [in] {@code Integer}
     */
    @ComMethod(name = "GetFormRegionManifest", dispId = 0xfc33)
    Object GetFormRegionManifest(String FormRegionName,
            Integer LCID);
            
    /**
     * <p>id(0xfc34)</p>
     * <p>vtableId(10)</p>
     * @param FormRegionName [in] {@code String}
     * @param LCID [in] {@code Integer}
     * @param Icon [in] {@code OlFormRegionIcon}
     */
    @ComMethod(name = "GetFormRegionIcon", dispId = 0xfc34)
    Object GetFormRegionIcon(String FormRegionName,
            Integer LCID,
            OlFormRegionIcon Icon);
            
    
}