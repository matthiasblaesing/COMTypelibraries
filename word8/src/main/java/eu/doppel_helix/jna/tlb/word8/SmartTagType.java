
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({5E9A888C-E5DC-4DCB-8308-3C91FB61E6F4})</p>
 */
@ComInterface(iid="{5E9A888C-E5DC-4DCB-8308-3C91FB61E6F4}")
public interface SmartTagType {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
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
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "SmartTagActions", dispId = 0x3eb)
    SmartTagActions getSmartTagActions();
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "SmartTagRecognizers", dispId = 0x3ec)
    SmartTagRecognizers getSmartTagRecognizers();
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "FriendlyName", dispId = 0x3ed)
    String getFriendlyName();
            
    
}