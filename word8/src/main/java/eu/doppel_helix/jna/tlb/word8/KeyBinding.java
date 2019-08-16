
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020998-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020998-0000-0000-C000-000000000046}")
public interface KeyBinding extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Command", dispId = 0x1)
    String getCommand();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "KeyString", dispId = 0x2)
    String getKeyString();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Protected", dispId = 0x3)
    Boolean getProtected();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "KeyCategory", dispId = 0x4)
    WdKeyCategory getKeyCategory();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "KeyCode", dispId = 0x6)
    Integer getKeyCode();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "KeyCode2", dispId = 0x7)
    Integer getKeyCode2();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CommandParameter", dispId = 0x8)
    String getCommandParameter();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Context", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch getContext();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x65)
    void Clear();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Disable", dispId = 0x66)
    void Disable();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x67)
    void Execute();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(21)</p>
     * @param KeyCategory [in] {@code WdKeyCategory}
     * @param Command [in] {@code String}
     * @param CommandParameter [in, optional] {@code Object}
     */
    @ComMethod(name = "Rebind", dispId = 0x68)
    void Rebind(WdKeyCategory KeyCategory,
            String Command,
            Object CommandParameter);
            
    
}