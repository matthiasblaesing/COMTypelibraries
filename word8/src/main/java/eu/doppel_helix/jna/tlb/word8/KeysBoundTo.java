
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020997-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020997-0000-0000-C000-000000000046}")
public interface KeysBoundTo {
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
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "KeyCategory", dispId = 0x3)
    WdKeyCategory getKeyCategory();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Command", dispId = 0x4)
    String getCommand();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "CommandParameter", dispId = 0x5)
    String getCommandParameter();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Context", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch getContext();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    KeyBinding Item(Integer Index);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Key", dispId = 0x1)
    KeyBinding Key(Integer KeyCode,
            Object KeyCode2);
            
    
}