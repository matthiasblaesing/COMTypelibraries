
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E59544D5-C299-46A0-84C1-C51AB38F9759})</p>
 */
@ComInterface(iid="{E59544D5-C299-46A0-84C1-C51AB38F9759}")
public interface CoAuthor extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ID", dispId = 0x1)
    String getID();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IsMe", dispId = 0x3)
    Boolean getIsMe();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Locks", dispId = 0x4)
    CoAuthLocks getLocks();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "EmailAddress", dispId = 0x5)
    String getEmailAddress();
            
    
}