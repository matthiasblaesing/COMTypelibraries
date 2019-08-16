
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E166-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E166-0000-0000-C000-000000000046}")
public interface VBE extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Version", dispId = 0x64)
    String getVersion();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "VBProjects", dispId = 0x6b)
    VBProjects getVBProjects();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "CodePanes", dispId = 0x6d)
    CodePanes getCodePanes();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x6e)
    Windows getWindows();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Events", dispId = 0x6f)
    Events getEvents();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActiveVBProject", dispId = 0xc9)
    VBProject getActiveVBProject();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SelectedVBComponent", dispId = 0xca)
    VBComponent getSelectedVBComponent();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MainWindow", dispId = 0xcc)
    Window getMainWindow();
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0xcd)
    Window getActiveWindow();
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ActiveCodePane", dispId = 0xce)
    CodePane getActiveCodePane();
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Addins", dispId = 0xd1)
    Addins getAddins();
            
    
}