
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03C5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03C5-0000-0000-C000-000000000046}")
public interface IBlogPictureExtensibility extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "BlogPictureProviderProperties", dispId = 0x1)
    void BlogPictureProviderProperties(VARIANT BlogPictureProvider,
            VARIANT FriendlyName);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "CreatePictureAccount", dispId = 0x2)
    void CreatePictureAccount(String Account,
            String BlogProvider,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "PublishPicture", dispId = 0x3)
    void PublishPicture(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            com.sun.jna.platform.win32.COM.util.IUnknown Image,
            VARIANT PictureURI,
            Integer ImageType);
            
    
}