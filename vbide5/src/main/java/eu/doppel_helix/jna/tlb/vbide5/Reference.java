
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E17E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E17E-0000-0000-C000-000000000046}")
public interface Reference extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x60020000)
    References getCollection();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x60020001)
    VBE getVBE();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020002)
    String getName();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Guid", dispId = 0x60020003)
    String getGuid();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "Major", dispId = 0x60020004)
    Integer getMajor();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Minor", dispId = 0x60020005)
    Integer getMinor();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "FullPath", dispId = 0x60020006)
    String getFullPath();
            
    /**
     * <p>id(0x60020007)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x60020007)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "IsBroken", dispId = 0x60020008)
    Boolean getIsBroken();
            
    /**
     * <p>id(0x60020009)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020009)
    vbext_RefKind getType();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "Description", dispId = 0x6002000a)
    String getDescription();
            
    
}