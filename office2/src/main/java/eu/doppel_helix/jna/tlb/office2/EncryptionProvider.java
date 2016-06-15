
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD809-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD809-0000-0000-C000-000000000046}")
public interface EncryptionProvider extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComMethod(name = "GetProviderDetail", dispId = 0x60020000)
    Object GetProviderDetail(EncryptionProviderDetail encprovdet);
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComMethod(name = "NewSession", dispId = 0x60020001)
    Integer NewSession(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComMethod(name = "Authenticate", dispId = 0x60020002)
    Integer Authenticate(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow,
            com.sun.jna.platform.win32.COM.util.IUnknown EncryptionData,
            VARIANT PermissionsMask);
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComMethod(name = "CloneSession", dispId = 0x60020003)
    Integer CloneSession(Integer SessionHandle);
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComMethod(name = "EndSession", dispId = 0x60020004)
    void EndSession(Integer SessionHandle);
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComMethod(name = "Save", dispId = 0x60020005)
    Integer Save(Integer SessionHandle,
            com.sun.jna.platform.win32.COM.util.IUnknown EncryptionData);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComMethod(name = "EncryptStream", dispId = 0x60020006)
    void EncryptStream(Integer SessionHandle,
            String StreamName,
            com.sun.jna.platform.win32.COM.util.IUnknown UnencryptedStream,
            com.sun.jna.platform.win32.COM.util.IUnknown EncryptedStream);
            
    /**
     * <p>id(0x60020007)</p>
     */
    @ComMethod(name = "DecryptStream", dispId = 0x60020007)
    void DecryptStream(Integer SessionHandle,
            String StreamName,
            com.sun.jna.platform.win32.COM.util.IUnknown EncryptedStream,
            com.sun.jna.platform.win32.COM.util.IUnknown UnencryptedStream);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComMethod(name = "ShowSettings", dispId = 0x60020008)
    void ShowSettings(Integer SessionHandle,
            com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow,
            Boolean ReadOnly,
            VARIANT Remove);
            
    
}