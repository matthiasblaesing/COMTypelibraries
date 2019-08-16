
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C033A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C033A-0000-0000-C000-000000000046}")
public interface COMAddIn extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Description", dispId = 0x0)
    String getDescription();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x0)
    void setDescription(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ProgId", dispId = 0x3)
    String getProgId();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Guid", dispId = 0x4)
    String getGuid();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Connect", dispId = 0x6)
    Boolean getConnect();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Connect", dispId = 0x6)
    void setConnect(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Object", dispId = 0x7)
    com.sun.jna.platform.win32.COM.util.IDispatch getObject();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Object", dispId = 0x7)
    void setObject(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}