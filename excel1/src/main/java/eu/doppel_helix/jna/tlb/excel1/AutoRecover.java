
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002445A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002445A-0000-0000-C000-000000000046}")
public interface AutoRecover extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x18a)</p>
     */
    @ComProperty(name = "Time", dispId = 0x18a)
    Integer getTime();
            
    /**
     * <p>id(0x18a)</p>
     */
    @ComProperty(name = "Time", dispId = 0x18a)
    void setTime(Integer param0);
            
    /**
     * <p>id(0x123)</p>
     */
    @ComProperty(name = "Path", dispId = 0x123)
    String getPath();
            
    /**
     * <p>id(0x123)</p>
     */
    @ComProperty(name = "Path", dispId = 0x123)
    void setPath(String param0);
            
    
}