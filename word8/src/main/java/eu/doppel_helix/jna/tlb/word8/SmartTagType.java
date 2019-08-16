
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({5E9A888C-E5DC-4DCB-8308-3C91FB61E6F4})</p>
 */
@ComInterface(iid="{5E9A888C-E5DC-4DCB-8308-3C91FB61E6F4}")
public interface SmartTagType extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "SmartTagActions", dispId = 0x3eb)
    SmartTagActions getSmartTagActions();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SmartTagRecognizers", dispId = 0x3ec)
    SmartTagRecognizers getSmartTagRecognizers();
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FriendlyName", dispId = 0x3ed)
    String getFriendlyName();
            
    
}