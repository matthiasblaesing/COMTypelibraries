
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DFF99AC2-CD2A-43AD-91B1-A2BE40BC7146})</p>
 */
@ComInterface(iid="{DFF99AC2-CD2A-43AD-91B1-A2BE40BC7146}")
public interface CoAuthLocks {
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
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    CoAuthLock Item(Integer Index);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Add", dispId = 0x2)
    CoAuthLock Add(Object Range,
            WdLockType Type);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "RemoveEphemeralLocks", dispId = 0x3)
    void RemoveEphemeralLocks();
            
    
}