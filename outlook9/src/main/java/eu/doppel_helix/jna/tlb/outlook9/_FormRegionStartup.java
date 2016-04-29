
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063059-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063059-0000-0000-C000-000000000046}")
public interface _FormRegionStartup {
    /**
     * <p>id(0xfb36)</p>
     */
    @ComMethod(name = "GetFormRegionStorage", dispId = 0xfb36)
    Object GetFormRegionStorage(String FormRegionName,
            com.sun.jna.platform.win32.COM.util.IDispatch Item,
            Integer LCID,
            OlFormRegionMode FormRegionMode,
            OlFormRegionSize FormRegionSize);
            
    /**
     * <p>id(0xfb3d)</p>
     */
    @ComMethod(name = "BeforeFormRegionShow", dispId = 0xfb3d)
    void BeforeFormRegionShow(FormRegion FormRegion);
            
    /**
     * <p>id(0xfc33)</p>
     */
    @ComMethod(name = "GetFormRegionManifest", dispId = 0xfc33)
    Object GetFormRegionManifest(String FormRegionName,
            Integer LCID);
            
    /**
     * <p>id(0xfc34)</p>
     */
    @ComMethod(name = "GetFormRegionIcon", dispId = 0xfc34)
    Object GetFormRegionIcon(String FormRegionName,
            Integer LCID,
            OlFormRegionIcon Icon);
            
    
}