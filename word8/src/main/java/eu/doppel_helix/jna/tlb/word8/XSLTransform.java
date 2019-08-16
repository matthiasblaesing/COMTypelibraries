
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E3124493-7D6A-410F-9A48-CC822C033CEC})</p>
 */
@ComInterface(iid="{E3124493-7D6A-410F-9A48-CC822C033CEC}")
public interface XSLTransform extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param AllUsers [in, optional] {@code Boolean}
     */
    @ComProperty(name = "Alias", dispId = 0x2)
    String getAlias(Boolean AllUsers);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param AllUsers [in, optional] {@code Boolean}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "Alias", dispId = 0x2)
    void setAlias(Boolean AllUsers,
            String param1);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param AllUsers [in, optional] {@code Boolean}
     */
    @ComProperty(name = "Location", dispId = 0x3)
    String getLocation(Boolean AllUsers);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param AllUsers [in, optional] {@code Boolean}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "Location", dispId = 0x3)
    void setLocation(Boolean AllUsers,
            String param1);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ID", dispId = 0x66)
    String getID();
            
    
}