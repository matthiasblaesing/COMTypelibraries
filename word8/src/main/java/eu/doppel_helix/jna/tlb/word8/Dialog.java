
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B8-0000-0000-C000-000000000046}")
public interface Dialog extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d03)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d03)
    Application getApplication();
            
    /**
     * <p>id(0x7d04)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x7d04)
    Integer getCreator();
            
    /**
     * <p>id(0x7d05)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x7d05)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x7d02)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "DefaultTab", dispId = 0x7d02)
    WdWordDialogTab getDefaultTab();
            
    /**
     * <p>id(0x7d02)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code WdWordDialogTab}
     */
    @ComProperty(name = "DefaultTab", dispId = 0x7d02)
    void setDefaultTab(WdWordDialogTab param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdWordDialog getType();
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(13)</p>
     * @param TimeOut [in, optional] {@code Object}
     */
    @ComMethod(name = "Show", dispId = 0x150)
    Integer Show(Object TimeOut);
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(14)</p>
     * @param TimeOut [in, optional] {@code Object}
     */
    @ComMethod(name = "Display", dispId = 0x152)
    Integer Display(Object TimeOut);
            
    /**
     * <p>id(0x7d01)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x7d01)
    void Execute();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Update", dispId = 0x12e)
    void Update();
            
    /**
     * <p>id(0x7d06)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "CommandName", dispId = 0x7d06)
    String getCommandName();
            
    /**
     * <p>id(0x7d07)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "CommandBarId", dispId = 0x7d07)
    Integer getCommandBarId();
            
    
}